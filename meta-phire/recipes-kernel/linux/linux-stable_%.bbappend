FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
    file://common.cfg \
"

SRC_URI_append_pine-h64-model-b = " \
    file://pine-h64-model-b.cfg \
"

SRC_URI_append_phire-preamp = " \
    file://0001-arm64-dts-add-device-tree-for-preamp.patch \
    file://phire-preamp.cfg \
"
