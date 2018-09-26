DESCRIPTION = "A library to retrieve i.MX GPU performance data"
LICENSE = "Proprietary"
LIC_FILES_CHKSUM = "file://COPYING;md5=5ab1a30d0cd181e3408077727ea5a2db"

SRC_URI[arm-fb.md5sum] = "42f22fbc9368b7c6225e70d5549f62cc"
SRC_URI[arm-fb.sha256sum] = "b15ef58c235adcd5121214e4620bf185d7bf0ae54b96527c5a3817a869ceb70f"

SRC_URI[arm-wayland.md5sum] = "69fc7eebd0f94b492c63571f7a162eb8"
SRC_URI[arm-wayland.sha256sum] = "04fc28147a8b19d8be6df16bbaf535284f5a2bf2c18640235a6d77dbfbab2ec7"

SRC_URI[arm-x11.md5sum] = "da3fa2d9cebcebceb351059363b01fa2"
SRC_URI[arm-x11.sha256sum] = "857d3cddd1b779729b0fc85516f0314d0ad370ebc2969c96576c3506c4c42c32"

SRC_URI[aarch64-fb.md5sum] = "ed5204837aac7a1348e25a9adae01e00"
SRC_URI[aarch64-fb.sha256sum] = "851d85c135189e408d1cbe43fe56d7f44105d36df9f3656edc7121706f26b181"

SRC_URI[aarch64-wayland.md5sum] = "17ac254c250061bf5181e1363ba9097a"
SRC_URI[aarch64-wayland.sha256sum] = "92ceef417169809f7dded4c6672ab2271e21aa4133180aa790c6fdc115bcda4a"

SRC_URI[aarch64-x11.md5sum] = "db69556c94bcd40bf1f6c52a2c261a55"
SRC_URI[aarch64-x11.sha256sum] = "1a488855b167957bc705871ea487acb8123f213f07e217e62c4ddb721b1b6d47"

inherit fsl-eula-unpack2 fsl-eula-graphics

PACKAGE_ARCH = "${MACHINE_SOCARCH}"

RDEPENDS_${PN} = "imx-gpu-viv"

# Compatible only with i.MX with GPU
COMPATIBLE_MACHINE        = "(^$)"
COMPATIBLE_MACHINE_imxgpu = "${MACHINE}"