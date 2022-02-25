require music-client.bb

SUMMARY = "Music server image"

IMAGE_INSTALL:append = "\
    bluepy \
    libgpiod \
    libgpiod-python \
    libgpiod-tools \
    librespot \
    mpd \
    pyhifid \
    python3 \
    python3-pip \
"
