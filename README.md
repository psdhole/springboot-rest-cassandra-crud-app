## Spring Boot Cassandra Rest API App

This is the sample project do demonstrate the use of Spring Boot, Cassandra and Rest API.

##### Pre requisites 
    
- JDK 8
- Maven
- Docker - if you want to run inside container.
- Cassandra DB instance.  

##### Run Cassandra
We can run the cassandra instance by installing it manually or  using docker with below command.

    docker run  -d \
    --restart always \
    --name cassandra-db \
    --hostname cassandra-db \
    --rm \
    --network=isom \
    -p 9042:9042 \
    -p 9160:9160 \
    -p 7199:7199 \
    -p 7001:7001 \
    -p 7000:7000 \
    -e CASSANDRA_START_RPC=true \
    -v C:/Storage/work/isom/cassandra-db:/var/lib/cassandra \
    cassandra:latest

    Note : you can change this 'C:/Storage/work/isom/cassandra-db' path as per your folder structure.

##### Cassandra Configuration

Give the name of  keyspace in our application by changing 'keyspace' property in  application.properties to the value you want.
##### Run the Project.

- Run the main class of the application OR

- Use below command to run the application locally.

```    
    mvn spring-boot:run
```    

- Once the application is up, use below endpoint to perform the CRUD operations like GET, POST, PUT and DELETE.
```
http://localhost:8080/api/v1/fo
```
