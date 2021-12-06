require music-client.bb

SUMMARY = "Music server image"

IMAGE_INSTALL_append = "\
    libgpiod \
    libgpiod-python \
    libgpiod-tools \
    librespot \
    python3 \
"
