require phire-image.bb

SUMMARY = "Music client image"

IMAGE_INSTALL:append = "\
    alsa-utils \
    brutefir \
    python3 \
    snapcast \
"
