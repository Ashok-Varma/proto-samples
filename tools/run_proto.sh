#!/usr/bin/env sh

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$parent_path"

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--plugin=protoc-gen-grpc-java="protoc-gen-grpc-java-1.45.1-osx-aarch_64.exe" \
--grpc-java_out="../src/main/java" \
--java_out="../src/main/java" \
../src/main/proto/test2.proto \
../src/main/proto/test3.proto

protoc-3.20.1-osx-aarch_64/bin/protoc \
--proto_path="../src/main/proto" \
--java_out=lite:"../src/main/java" \
--kotlin_out=lite:"../src/main/java" \
--plugin=protoc-gen-grpckt="protoc-gen-grpc-kotlin.sh" \
--grpckt_out=lite:"../src/main/java" \
../src/main/proto/dino.proto
