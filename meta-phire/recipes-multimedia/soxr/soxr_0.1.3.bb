# Copied from https://github.com/schnitzeltony/meta-musicians/blob/master/recipes-musicians/soxr/soxr_0.1.3.bb
#
# Permission is hereby granted, free of charge, to any person obtaining a copy 
# of this software and associated documentation files (the "Software"), to deal 
# in the Software without restriction, including without limitation the rights 
# to use, copy, modify, merge, publish, distribute, sublicense, and/or sell 
# copies of the Software, and to permit persons to whom the Software is 
# furnished to do so, subject to the following conditions:
#
# The above copyright notice and this permission notice shall be included in 
# all copies or substantial portions of the Software.
#
# THE SOFTWARE IS PROVIDED "AS IS", WITHOUT WARRANTY OF ANY KIND, EXPRESS OR 
# IMPLIED, INCLUDING BUT NOT LIMITED TO THE WARRANTIES OF MERCHANTABILITY, 
# FITNESS FOR A PARTICULAR PURPOSE AND NONINFRINGEMENT. IN NO EVENT SHALL THE 
# AUTHORS OR COPYRIGHT HOLDERS BE LIABLE FOR ANY CLAIM, DAMAGES OR OTHER 
# LIABILITY, WHETHER IN AN ACTION OF CONTRACT, TORT OR OTHERWISE, ARISING FROM, 
# OUT OF OR IN CONNECTION WITH THE SOFTWARE OR THE USE OR OTHER DEALINGS IN 
# THE SOFTWARE.

SUMMARY = "The SoX Resampler library"
HOMEPAGE = "https://sourceforge.net/projects/soxr/"
LICENSE = "LGPLv2.1"
LIC_FILES_CHKSUM = "file://LICENCE;md5=1f6605fc6dfe53a780959dfef7061f77"

inherit cmake

SRC_URI = "http://downloads.sourceforge.net/${BPN}/${BPN}-${PV}-Source.tar.xz"
SRC_URI[md5sum] = "3f16f4dcb35b471682d4321eda6f6c08"
SRC_URI[sha256sum] = "b111c15fdc8c029989330ff559184198c161100a59312f5dc19ddeb9b5a15889"

S = "${WORKDIR}/${BPN}-${PV}-Source"

EXTRA_OECMAKE += " \
    -DCMAKE_BUILD_TYPE=RelWithDebInfo \
    -DLIB_SUFFIX=${@d.getVar('baselib').replace('lib', '')} \
"
