#This is product Service.


###Step 1 : Configure Postgres Database using docker
```bash
$ docker run --name oms_postgres -p 5432:5432 -e POSTGRES_USER=dbuser -e POSTGRES_DB=products_db -e POSTGRES_PASSWORD=password -d postgres
```
Once the DB is up and running configure its details in application.properties file

####Build
```bash
./gradlew build
```

###Run
```bash
./gradlew spring-boot:run
```