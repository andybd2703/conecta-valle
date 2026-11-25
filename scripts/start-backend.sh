#!/usr/bin/env bash

set -e

cd "$(dirname "$0")/.."

if [ ! -f .env ]; then
    echo "Error: No se encontró el archivo .env"
    exit 1
fi

set -a
source .env
set +a

: "${POSTGRES_DB:?Variable requerida}"
: "${POSTGRES_USER:?Variable requerida}"
: "${POSTGRES_PASSWORD:?Variable requerida}"

cd backend

exec bash ./mvnw spring-boot:run
