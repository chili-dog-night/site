#!/usr/bin/env bash

add-apt-repository ppa:openjdk-r/ppa

apt-get update
apt-get upgrade -y

wget -O- https://toolbelt.heroku.com/install-ubuntu.sh | sh

apt-get remove -y --purge openjdk*
apt-get install -y openjdk-8-jdk

cd /usr/local/bin
curl -fsSLo boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh
chmod 755 boot
