require phire-image.bb

SUMMARY = "Music client image"

IMAGE_INSTALL_append = "\
    brutefir \
    snapcast \
"
