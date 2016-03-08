#!/bin/bash

find ../sql/migrations/*.sql -exec psql $DATABASE_URL -f {} \;
