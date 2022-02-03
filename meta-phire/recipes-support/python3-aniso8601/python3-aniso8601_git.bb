DESCRIPTION = "Another ISO 8601 parser for Python"
HOMEPAGE = "https://bitbucket.org/nielsenb/aniso8601"
SECTION = "devel/python"
LICENSE = "BSD"
LIC_FILES_CHKSUM = "file://LICENSE;md5=6d91d56f51a54389d95526eefe039b1c"
SRCREV = "e1ae2523623ad8bf251fce76fe15464baeb8a871"
PV = "9.0.1+git${SRCPV}"

SRC_URI = "\
    git://bitbucket.org/nielsenb/aniso8601.git;protocol=https;branch=master \
"

S = "${WORKDIR}/git"

inherit setuptools3 pkgconfig
