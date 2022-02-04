SUMMARY = "mpdscribble"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=751419260aa954499f7abaabaa882bbe"
HOMEPAGE = "https://www.musicpd.org/clients/mpdscribble/"
PV = "0.23+git${SRCPV}"

SRCREV = "b0ad02b24d914327df4197f4634393ef4f34570c"

SRC_URI = "\
    git://github.com/MusicPlayerDaemon/mpdscribble.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"

DEPENDS += "\
    libmpdclient \
    curl \
    libgcrypt \
"

inherit meson pkgconfig
