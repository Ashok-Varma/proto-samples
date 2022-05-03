#!/usr/bin/env sh

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$parent_path"

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--plugin=protoc-gen-grpckt="protoc-gen-grpc-kotlin.sh" \
--grpckt_out=lite:"../src/main/kotlin/lite" \
--java_out=lite:"../src/main/kotlin/lite" \
--kotlin_out=lite:"../src/main/kotlin/lite" \
../src/main/proto/test2.proto \
../src/main/proto/test3.proto
