FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append = " \
    file://common.cfg \
"

SRC_URI:append:pine-h64-model-b = " \
    file://pine-h64-model-b.cfg \
"

SRC_URI:append:phire-preamp = " \
    file://0001-arm64-dts-add-device-tree-for-preamp.patch \
    file://0002-add-line-names.patch \
    file://phire-preamp.cfg \
"
