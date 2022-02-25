SUMMARY = "BruteFIR - Generif FIR filter convolution engine"
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://LICENSE;md5=069a8f5df3a055a9424baacbaefbcb52"
HOMEPAGE = "https://torger.se/anders/brutefir.html"

FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI = "\
    https://torger.se/anders/files/brutefir-1.0o.tar.gz \
    file://0001-Remove-platform-conditionals.patch \
    file://0002-Remove-unnecessary-lib-include-path-changes.patch \
    file://0003-Specify-whether-to-build-alsa-oss-jack-via-Make-opti.patch \
"
SRC_URI[sha256sum] = "caae4a933b53b55b29d6cb7e2803e20819f31def6d0e4e12f9a48351e6dbbe9f"

DEPENDS += "fftw"

PACKAGECONFIG ??= "alsa oss"

PACKAGECONFIG[alsa] = "BRUTEFIR_ALSA=yes,,alsa-lib"
PACKAGECONFIG[jack] = "BRUTEFIR_JACK=yes,,jack"
PACKAGECONFIG[oss] = "BRUTEFIR_OSS=yes,,"

EXTRA_OEMAKE:x86 = "ARCH=x86"
EXTRA_OEMAKE:x86-64 = "ARCH=x86"
EXTRA_OEMAKE:append = "CC='${CC}' LD='${CC}' ${PACKAGECONFIG_CONFARGS}"

do_install() {
    make install INSTALL_PREFIX=${D}${exec_prefix} ${PACKAGECONFIG_CONFARGS}
}
