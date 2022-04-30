#!/usr/bin/env sh

parent_path=$( cd "$(dirname "${BASH_SOURCE[0]}")" ; pwd -P )
cd "$parent_path"

./run_proto.sh
./run_proto_lite.sh
./run_proto_kotlin.sh
./run_proto_kotlin_lite.sh
./run_proto_nongrpc.sh
./run_proto_wire.sh
./run_proto_wire_kotlin.sh