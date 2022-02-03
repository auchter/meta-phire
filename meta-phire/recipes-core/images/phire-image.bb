SUMMARY = "image"

IMAGE_FEATURES = "\
    package-management \
    ssh-server-openssh \
    nfs-client \
"

LICENSE = "MIT"

inherit core-image

IMAGE_INSTALL_append = "\
    htop \
    linux-firmware \
    set-hostname \
    ssh-keys \
    tmux \
    vim \
"
