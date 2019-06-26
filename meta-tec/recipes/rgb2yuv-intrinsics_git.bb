LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/jeosadn/rgb2yuv-intrinsics.git;protocol=https"

PV = "1.0"
SRCREV = "master"

S = "${WORKDIR}/git"

inherit autotools

do_install_append() {
   mkdir -p '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-intrinsics/README'                 '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-intrinsics/sample_640x480.jpg'     '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-intrinsics/sample_640x480.rgb'     '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-intrinsics/intrinsics_results.pdf' '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-intrinsics/image.rgb'              '${WORKDIR}/image/usr/share/rgb2yuv-intrinsics/'
}

EXTRA_OECONF = ""

