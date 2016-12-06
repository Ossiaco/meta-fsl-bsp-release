# Copyright (C) 2015-2016 Freescale Semiconductor

SUMMARY = "Kernel loadable module for Vivante GPU"
DESCRIPTION = "Builds the Vivante GPU kernel driver as a loadable kernel module, \
allowing flexibility to use an older kernel with a newer graphics release."
LICENSE = "GPLv2"
LIC_FILES_CHKSUM = "file://COPYING;md5=12f884d2ae1ff87c09e5b7ccc2c4ca7e"

SRC_URI = "${FSL_MIRROR}/${PN}-${PV}.tar.gz \
           file://kbuild.patch"
SRC_URI[md5sum] = "335c23e3fb90fd709f30e063b3c5b7a3"
SRC_URI[sha256sum] = "a720657faf419c9a2d49d4a22edc6f7f1493d53b6a0a62a4411899ba6e64a06d"

inherit module

KERNEL_MODULE_AUTOLOAD = "galcore"
