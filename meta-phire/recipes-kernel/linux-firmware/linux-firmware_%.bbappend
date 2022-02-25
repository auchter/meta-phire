FILESEXTRAPATHS:prepend := "${THISDIR}/files:"

SRC_URI:append:pine-h64-model-b = " \
    https://github.com/lwfinger/rtl8723bs_bt/raw/09eb91f52a639ec5e4c5c4c98dc2afede046cf20/rtlbt_config;name=rtlbt_config \
"

SRC_URI[rtlbt_config.sha256sum] = "87ddfaff52d680eaf443316ea2875c695311c8236e9fc263057af61eb4e64f0b"

do_install:append:pine-h64-model-b() {
	cp ${WORKDIR}/rtlbt_config ${D}${nonarch_base_libdir}/firmware/rtl_bt/rtl8723bs_config.bin
}
