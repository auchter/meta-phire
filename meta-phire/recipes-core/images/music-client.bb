require phire-image.bb

SUMMARY = "Music client image"

IMAGE_INSTALL_append = "\
    alsa-utils \
    brutefir \
    python3 \
    snapcast \
"
