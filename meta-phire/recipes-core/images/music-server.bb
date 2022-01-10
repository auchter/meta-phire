require music-client.bb

SUMMARY = "Music server image"

IMAGE_INSTALL_append = "\
    bluepy \
    libgpiod \
    libgpiod-python \
    libgpiod-tools \
    librespot \
    mpd \
    python3 \
    python3-pip \
"
