FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI += "file://phire-asound.conf"

do_install:append() {
    install -m 0644 ${WORKDIR}/phire-asound.conf ${D}${sysconfdir}/asound.conf
}
