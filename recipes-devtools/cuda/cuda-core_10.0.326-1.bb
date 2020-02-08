CUDA_PKG = "cuda-nvcc cuda-cuobjdump cuda-nvprune"
require cuda-shared-binaries-${PV}.inc

inherit container-runtime-csv

CONTAINER_CSV_DIRS = "${prefix}/local"
CONTAINER_CSV_BASENAME = "cuda"

FILES_${PN} += "${prefix}/local/cuda-10.0/nvvm/lib*/*${SOLIBS}"

FILES_${PN}-dev += "${prefix}/local/cuda-10.0/bin ${prefix}/local/cuda-10.0/nvvm/bin \
                    ${prefix}/local/cuda-10.0/nvvm/include ${prefix}/local/cuda-10.0/nvvm/lib*/*${SOLIBSDEV} \
                    ${prefix}/local/cuda-10.0/nvvm/libnvvm-samples ${prefix}/local/cuda-10.0/nvvm/libdevice"
