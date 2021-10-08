SUMMARY = "Snapcast - Synchronous audio player"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=7702f203b58979ebbc31bfaeb44f219c"
HOMEPAGE = "https://github.com/badaix/snapcast"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "\
    git://github.com/badaix/snapcast;branch=master \
    file://snapclient.service \
    file://snapserver.service \
"
SRCREV = "2af5292f9df9e8f5a54114ed0ef96ca25cd32135"
S = "${WORKDIR}/git"

PR = "1"

inherit cmake systemd

DEPENDS += "\
    boost \
"

PACKAGECONFIG ??= "server client flac alsa avahi soxr"

PACKAGECONFIG[server] = "-DBUILD_SERVER=ON,-DBUILD_SERVER=OFF"
PACKAGECONFIG[client] = "-DBUILD_CLIENT=ON,-DBUILD_CLIENT=OFF"
PACKAGECONFIG[flac] = "-DBUILD_WITH_FLAC=ON,-DBUILD_WITH_FLAC=OFF,flac"
PACKAGECONFIG[vorbis] = "-DBUILD_WITH_VORBIS=ON,-DBUILD_WITH_VORBIS=OFF,libvorbis libogg"
PACKAGECONFIG[tremor] = "-DBUILD_WITH_TREMOR=ON,-DBUILD_WITH_TREMOR=OFF,tremor"
PACKAGECONFIG[opus] = "-DBUILD_WITH_OPUS=ON,-DBUILD_WITH_OPUS=OFF,libopus"
PACKAGECONFIG[avahi] = "-DBUILD_WITH_AVAHI=ON,-DBUILD_WITH_AVAHI=OFF,avahi"
PACKAGECONFIG[expat] = "-DBUILD_WITH_EXPAT=ON,-DBUILD_WITH_EXPAT=OFF,expat"
PACKAGECONFIG[pulseaudio] = "-DBUILD_WITH_PULSE=ON,-DBUILD_WITH_PULSE=OFF,pulseaudio"
PACKAGECONFIG[alsa] = ",,alsa-lib"
PACKAGECONFIG[soxr] = ",,soxr"

do_install_append() {
    install -d ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/snapclient.service ${D}/${systemd_unitdir}/system
    install -m 0644 ${WORKDIR}/snapserver.service ${D}/${systemd_unitdir}/system
}

SYSTEMD_SERVICE_${PN} = "snapclient.service snapserver.service"
