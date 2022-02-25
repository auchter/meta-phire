LICENSE = "MIT"
LIC_FILES_CHKSUM := "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SUMMARY = "Install ssh keys for root user"

SRC_URI = "file://authorized_keys"
FILES:${PN} = "${ROOT_HOME}/.ssh/authorized_keys"

do_install:append() { 
    install -d ${D}/${ROOT_HOME}/.ssh
    install -m 0600 ${WORKDIR}/authorized_keys ${D}/${ROOT_HOME}/.ssh
}
	
