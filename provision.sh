#!/usr/bin/env bash

add-apt-repository ppa:openjdk-r/ppa

sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt/ $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
wget --quiet -O- https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

apt-get update
apt-get upgrade -y

wget --quiet -O- https://toolbelt.heroku.com/install-ubuntu.sh | sh

apt-get remove -y --purge openjdk*
apt-get install -y openjdk-8-jdk postgresql-9.5

update-ca-certificates -f

sudo -u postgres psql -c "ALTER USER postgres PASSWORD 'postgres';"

cd /usr/local/bin
curl -fsSLo boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh
chmod 755 boot
