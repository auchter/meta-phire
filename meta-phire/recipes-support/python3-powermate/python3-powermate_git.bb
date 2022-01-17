DESCRIPTION = "python library for Griffin Powermate Bluetooth"
HOMEPAGE = "https://github.com/auchter/powermate"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=d551de36c243b7656c916ec652d415ea"
SRCREV = "4417851b47a061110433d63f41758c837739ba95"
PV = "0.0.2+git${SRCPV}"

SRC_URI = "\
    git://github.com/auchter/powermate.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"

inherit setuptools3 pkgconfig

RDEPENDS:${PN} = "\
    bluepy \
"

