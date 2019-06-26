LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/jeosadn/rgb2yuv-c.git;protocol=https"

PV = "1.0"
SRCREV = "master"

S = "${WORKDIR}/git"

inherit autotools

do_install_append() {
   mv '${WORKDIR}/image/usr/share/doc/rgb2yuv-c' '${WORKDIR}/image/usr/share/rgb2yuv-c'
}

EXTRA_OECONF = ""

