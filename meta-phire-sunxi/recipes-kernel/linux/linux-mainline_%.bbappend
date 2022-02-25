FILESEXTRAPATHS:prepend := "${THISDIR}/${PN}:"

SRC_URI:append:pine64-pinecube = " file://axp20x.cfg \
                                   file://ov5640.cfg \
                                 "
