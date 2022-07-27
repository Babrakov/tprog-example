@ECHO OFF
docker run -d -p 2345:5432 --name db -e POSTGRES_USER=tproguser -e POSTGRES_PASSWORD=tprogpass -e POSTGRES_DB=tprogdb postgres:12-alpine