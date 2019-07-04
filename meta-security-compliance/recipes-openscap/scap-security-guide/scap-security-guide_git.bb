SUMARRY = "SCAP content for various platforms, OE changes"

SRCREV = "5fdfdcb2e95afbd86ace555beca5d20cbf1043ed"
SRC_URI = "git://github.com/akuster/scap-security-guide.git;branch=oe-0.1.44;"
PV = "v0.1.44+git${SRCPV}"

require scap-security-guide.inc

do_compile_append () {
    make openembedded
}

EXTRA_OECMAKE += "-DSSG_PRODUCT_OPENEMBEDDED=ON"
