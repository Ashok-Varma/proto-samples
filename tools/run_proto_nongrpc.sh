#!/usr/bin/env sh

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$parent_path"

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--kotlin_out="../src/main/kotlin" \
--java_out="../src/main/kotlin" \
../src/main/proto/test3_nongrpc.proto

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--kotlin_out=lite:"../src/main/kotlin/lite" \
--java_out=lite:"../src/main/kotlin/lite" \
../src/main/proto/test3_nongrpc.proto

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--java_out="../src/main/java" \
../src/main/proto/test3_nongrpc.proto

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--java_out=lite:"../src/main/java/lite" \
../src/main/proto/test3_nongrpc.proto
