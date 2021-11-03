require phire-image.bb

SUMMARY = "Music server image"

IMAGE_INSTALL_append = "\
    brutefir \
    librespot \
    snapcast \
"
