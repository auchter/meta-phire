DESCRIPTION = "Daemon for HiFi systems"
HOMEPAGE = "https://github.com/auchter/pyhifid"
SECTION = "devel/python"
LICENSE = "GPLv3"
LIC_FILES_CHKSUM = "file://LICENSE;md5=1ebbd3e34237af26da5dc08a4e440464"
SRCREV = "216ab92c8d7cba1284986fe3e7b88c9d561555fd"
PV = "0.0.1+git${SRCPV}"

FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI = "\
    git://github.com/auchter/pyhifid.git;protocol=https;branch=main \
    file://pyhifid.service \
"

S = "${WORKDIR}/git"

inherit setuptools3 pkgconfig

RDEPENDS:${PN} = "python-brutefir"
