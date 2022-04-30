#!/usr/bin/env sh

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$parent_path"

java -jar wire-compiler-4.3.0-jar-with-dependencies.jar \
    --proto_path="../src/main/proto" \
    --java_out="../src/main/java/wire" \
    --compact \
    test2.proto \
    test3.proto

#    --android \