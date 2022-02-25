do_install:append() {
    # Store ssh keys on /data so they don't change with each Mender update
    sed -i '/HostKey/d' ${D}${sysconfdir}/ssh/sshd_config
    echo "HostKey /data/ssh/ssh_host_rsa_key" >> ${D}${sysconfdir}/ssh/sshd_config
    echo "HostKey /data/ssh/ssh_host_ecdsa_key" >> ${D}${sysconfdir}/ssh/sshd_config
    echo "HostKey /data/ssh/ssh_host_ed25519_key" >> ${D}${sysconfdir}/ssh/sshd_config
}
