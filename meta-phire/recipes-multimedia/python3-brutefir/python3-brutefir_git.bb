DESCRIPTION = "Python library to control BruteFIR"
HOMEPAGE = "https://github.com/auchter/python-brutefir"
SECTION = "devel/python"
LICENSE = "MIT"
LIC_FILES_CHKSUM = "file://LICENSE;md5=af32f67582da19dc30e79515802fcffc"
SRCREV = "316d87c08def34cd1f610789499c91f9db9925f9"
PV = "0.0.2+git${SRCPV}"

SRC_URI = "git://github.com/auchter/python-brutefir.git;protocol=https;branch=main \
"

S = "${WORKDIR}/git"

inherit setuptools3 pkgconfig
