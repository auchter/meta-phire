LICENSE = "MIT"
LIC_FILES_CHKSUM := "file://${COMMON_LICENSE_DIR}/MIT;md5=0835ade698e0bcf8506ecda2f7b4f302"
FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SUMMARY = "Set hostname from stored file"

inherit systemd

SYSTEMD_SERVICE_${PN} = "set-hostname.service"

SRC_URI = "\
    file://set-hostname.service \
    file://set-hostname \
"
FILES_${PN} = "\
    ${systemd_unitdir}/system/set-hostname.service \
    ${bindir}/set-hostname \
"

do_install_append() {
    install -d ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/set-hostname.service ${D}/${systemd_unitdir}/system
    install -d ${D}/${bindir}
    install -m 0755 ${WORKDIR}/set-hostname ${D}/${bindir}
}
