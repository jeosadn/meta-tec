LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/jeosadn/rgb2yuv-c.git;protocol=https"

PV = "1.0"
SRCREV = "master"

S = "${WORKDIR}/git"

inherit autotools

do_install_append() {
   mkdir -p '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/README'             '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/sample_640x480.jpg' '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/sample_640x480.rgb' '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/sample_640x480.yuv' '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/c_results.pdf'      '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/image.rgb'          '${WORKDIR}/image/usr/share/rgb2yuv-c/'
}

EXTRA_OECONF = ""

