#!/usr/bin/env bash

POSTGRES_PASSWORD=$(uuidgen)

add-apt-repository ppa:openjdk-r/ppa

sh -c 'echo "deb http://apt.postgresql.org/pub/repos/apt/ $(lsb_release -cs)-pgdg main" > /etc/apt/sources.list.d/pgdg.list'
wget --quiet -O- https://www.postgresql.org/media/keys/ACCC4CF8.asc | sudo apt-key add -

apt-get update
apt-get upgrade -y

wget --quiet -O- https://toolbelt.heroku.com/install-ubuntu.sh | sh

apt-get remove -y --purge openjdk*
apt-get install -y openjdk-8-jdk postgresql-9.5

update-ca-certificates -f

sudo -u postgres psql -c "ALTER USER postgres PASSWORD '$POSTGRES_PASSWORD';"

cat >> /etc/environment <<EOF
DATABASE_URL=postgresql://postgres:${POSTGRES_PASSWORD}@localhost:5432/chili_dog_night
EOF

cd /usr/local/bin
curl -fsSLo boot https://github.com/boot-clj/boot-bin/releases/download/latest/boot.sh
chmod 755 boot
