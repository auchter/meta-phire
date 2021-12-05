FILESEXTRAPATHS_prepend := "${THISDIR}/files:"

SRC_URI_append = " \
    file://common.cfg \
"

SRC_URI_append_pine-h64-model-b = " \
    file://pine-h64-model-b.cfg \
"
