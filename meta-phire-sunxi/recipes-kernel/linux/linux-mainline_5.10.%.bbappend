FILESEXTRAPATHS_prepend := "${THISDIR}/${PN}:"

SRC_URI_append_pine64-pinecube = " file://axp20x.cfg \
                                   file://ov5640.cfg \
                                 "
