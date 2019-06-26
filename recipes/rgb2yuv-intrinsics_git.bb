LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/jeosadn/rgb2yuv-intrinsics.git;protocol=https"

PV = "1.0"
SRCREV = "master"

S = "${WORKDIR}/git"

inherit autotools

do_install_append() {
   mv '${WORKDIR}/image/usr/share/doc/rgb2yuv-intrinsics' '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics'
}

EXTRA_OECONF = ""

