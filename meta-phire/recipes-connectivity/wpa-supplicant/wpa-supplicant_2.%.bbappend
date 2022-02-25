do_install:append () {
    install -d ${D}${sysconfdir}/wpa_supplicant
    ln -s /data/wpa_supplicant/wpa_supplicant-wlan0.conf ${D}/${sysconfdir}/wpa_supplicant/

    install -d ${D}${sysconfdir}/systemd/system/multi-user.target.wants
    ln -s /lib/systemd/system/wpa_supplicant@.service ${D}${sysconfdir}/systemd/system/multi-user.target.wants/wpa_supplicant@wlan0.service
}
