POSTFIX_ROOT := $(shell pwd)

P4_ROOT ?= $(shell cd $(POSTFIX_ROOT)/../..; pwd)
MAKE ?= make
SED ?= sed
MAKEARGS ?= -j2

BUILD_PLATFORM ?= $(shell sh $(P4_ROOT)/ZimbraBuild/rpmconf/Build/get_plat_tag.sh)

ZIMBRA_HOME ?= /opt/zimbra

PATCH	:=

ifdef BETA
	include $(POSTFIX_ROOT)/../beta_versions.def
else
	include $(POSTFIX_ROOT)/../versions.def
endif

POSTFIX_TGZ_TARGET := \
	$(P4_ROOT)/ThirdPartyBuilds/$(BUILD_PLATFORM)/postfix/postfix-$(POSTFIX_VERSION).tgz

PCRE_DEF := -DHAS_PCRE
PCRE_INCLUDE := -I/usr/include/pcre
PCRE_LIB := -lpcre

MARIADB_VERSION ?= $(MARIADB_VERSION_STRING)
MARIADB_INC := /opt/zimbra/mariadb-$(MARIADB_VERSION)/include/mysql
MARIADB_CLIENT_VERSION ?= $(MARIADB_VERSION_STRING)-clientlibs

SYSTEM_LIB := /usr/lib

LD_RUN_PATH := /opt/zimbra/lib:/opt/zimbra/mariadb-$(MARIADB_VERSION)/lib:/opt/zimbra/openldap-$(LDAP_VERSION)/lib:/opt/zimbra/openssl-$(OPENSSL_VERSION)/lib:/opt/zimbra/cyrus-sasl-$(CYRUS_VERSION)/lib:/opt/zimbra/openldap-$(LDAP_VERSION)/lib
MARIADB_LIB := /opt/zimbra/mariadb-$(MARIADB_VERSION)/lib


INSTALL_PARMS := install_root=/../

files   := $(wildcard src/postfix-$(POSTFIX_RELEASE).tar.gz)

all: checksrc allclean build install tar

checksrc:
	$(if $(files), @echo "", exit 1)

build:
	tar xzf src/postfix-$(POSTFIX_RELEASE).tar.gz
	(mv postfix-$(POSTFIX_RELEASE) postfix-$(POSTFIX_VERSION); \
	cd postfix-$(POSTFIX_VERSION); \
	$(PATCH) \
	patch -g0 -p1 < ../patches/postfix-main-cf-zimbra.patch; \
	patch -g0 -p1 < ../patches/stop-warning.patch; \
	patch -g0 -p1 < ../patches/postfix-ldap.patch; \
	$(MAKE) $(MAKEARGS)  makefiles \
	OPT="-O2" \
	DEBUG="-g" \
	CCARGS='-DDEF_COMMAND_DIR=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/sbin\" \
	-DDEF_DAEMON_DIR=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/libexec\" \
	-DDEF_CONFIG_DIR=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/conf\" \
	-DDEF_QUEUE_DIR=\"/opt/zimbra/data/postfix/spool\" \
	-DDEF_SENDMAIL_PATH=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/sbin/sendmail\" \
	-DDEF_NEWALIAS_PATH=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/sbin/newaliases\" \
	-DDEF_MAILQ_PATH=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/sbin/mailq\" \
	-DDEF_MANPAGE_DIR=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/man\" \
	-DDEF_HTML_DIR=\"no\" \
	-DDEF_README_DIR=\"no\" \
	-DDEF_DB_TYPE=\"lmdb\" \
	-DDEF_SENDMAIL_PATH=\"/opt/zimbra/postfix-$(POSTFIX_VERSION)/sbin/sendmail\" \
	-DDEF_DATA_DIR=\"/opt/zimbra/data/postfix/data\" \
	-DUSE_SASL_AUTH \
	-DUSE_CYRUS_SASL \
	-DHAS_LMDB \
	-DNO_DB \
	-DHAS_LDAP -DHAS_MYSQL -DUSE_TLS $(PCRE_DEF) $(PCRE_INCLUDE) $(FD_SIZE) \
	$(URANDOM) \
	-DUSE_LDAP_SASL \
	-I/opt/zimbra/openldap-$(LDAP_VERSION)/include \
	-I$(MARIADB_INC) \
	-I/opt/zimbra/openssl-$(OPENSSL_VERSION)/include \
	-I/opt/zimbra/cyrus-sasl-$(CYRUS_VERSION)/include/sasl -I/usr/include' \
	AUXLIBS='$(EXTRALIBS) -L/opt/zimbra/cyrus-sasl-$(CYRUS_VERSION)/lib \
	-L/opt/zimbra/openldap-$(LDAP_VERSION)/lib $(PCRE_LIB) \
	-lldap -llber -llmdb\
	-L$(MARIADB_LIB) \
	-L/opt/zimbra/openssl-$(OPENSSL_VERSION)/lib \
	-lmysqlclient -lz -lm -L$(SYSTEM_LIB) -lsasl2 -lpthread -lssl -lcrypto'; \
	LD_RUN_PATH=$(LD_RUN_PATH) $(MAKE) $(MAKEARGS);)

install:
	(cd postfix-$(POSTFIX_VERSION); \
	 $(MAKE) non-interactive-package $(INSTALL_PARMS); \
	sed -e 's|postconf|/opt/zimbra/bin/postconf|' auxiliary/qshape/qshape.pl > $(ZIMBRA_HOME)/postfix-$(POSTFIX_VERSION)/sbin/qshape.pl;\
	chmod a+rx $(ZIMBRA_HOME)/postfix-$(POSTFIX_VERSION)/sbin/qshape.pl;)
	(cd $(ZIMBRA_HOME); ln -s postfix-$(POSTFIX_VERSION) postfix)

tar:
	mkdir -p $(P4_ROOT)/ThirdPartyBuilds/$(BUILD_PLATFORM)/postfix
	(cd $(ZIMBRA_HOME); tar czf $(POSTFIX_TGZ_TARGET) postfix-$(POSTFIX_VERSION))
	chmod -R a+w $(POSTFIX_TGZ_TARGET)

p4edit: $(POSTFIX_TGZ_TARGET)
	p4 add $(POSTFIX_TGZ_TARGET)
	p4 edit $(POSTFIX_TGZ_TARGET)

clean:
	rm -rf postfix-$(POSTFIX_VERSION)

allclean: clean zimclean

zimclean:
	rm -rf $(ZIMBRA_HOME)/postfix-$(POSTFIX_VERSION) $(ZIMBRA_HOME)/postfix
	rm -f $(POSTFIX_TGZ_TARGET)
