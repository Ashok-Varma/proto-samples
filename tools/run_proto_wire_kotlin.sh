#!/usr/bin/env sh

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$parent_path"

java -jar wire-compiler-4.3.0-jar-with-dependencies.jar \
    --proto_path="../src/main/proto" \
    --kotlin_out="../src/main/kotlin/wire" \
    --compact \
    --android-annotations \
    test2.proto \
    test3.proto

#    --android \