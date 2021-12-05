require music-client.bb

SUMMARY = "Music server image"

IMAGE_INSTALL_append = "\
    librespot \
"
