# Recipe created by recipetool
# This is the basis of a recipe and may need further editing in order to be fully functional.
# (Feel free to remove these comments when editing.)

# Unable to find any files that looked like license statements. Check the accompanying
# documentation and source headers and set LICENSE and LIC_FILES_CHKSUM accordingly.
#
# NOTE: LICENSE is being set to "CLOSED" to allow you to at least start building - if
# this is not accurate with respect to the licensing of the software being built (it
# will not be in most cases) you must specify the correct value before using this
# recipe for anything other than initial testing/development!
LICENSE = "CLOSED"
LIC_FILES_CHKSUM = ""

SRC_URI = "git://github.com/jeosadn/rgb2yuv-c.git;protocol=https"

# Modify these as desired
PV = "1.0"
SRCREV = "master"

S = "${WORKDIR}/git"

# NOTE: if this software is not capable of being built in a separate build directory
# from the source, you should replace autotools with autotools-brokensep in the
# inherit line
inherit autotools

do_install_append() {
   mkdir -p '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/README'             '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/sample_640x480.jpg' '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/sample_640x480.rgb' '${WORKDIR}/image/usr/share/rgb2yuv-c/'
   install -c -m 644 '${WORKDIR}/image/usr/share/doc/rgb2yuv-c/sample_640x480.yuv' '${WORKDIR}/image/usr/share/rgb2yuv-c/'
}

# Specify any options you want to pass to the configure script using EXTRA_OECONF:
EXTRA_OECONF = ""

