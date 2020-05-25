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

After Cassandra installation, create a new keyspace and create a new table in Cassandra with following commands.

```
CREATE KEYSPACE isom_key_space WITH REPLICATION = { 'class' : 'SimpleStrategy', 'replication_factor' : 1 };
```
- Use above crated keyspace in our application by change 'keyspace' property in  application.properties to the value 'isom_key_space'.

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

##### Build and deploy the docker image for application.
Refer below commands to build and deploy the docker image for the application as in some cases we might have to build the image locally and deploy the same to the specific environment's docker registry based on the profiles.

- Build the image with specific profile.

```
    mvn package -P <active-profile>
    e.g. mvn package -P dev-local
```

- Deploy/Push the image to the registry with specific profile.

```
    mvn dockerfile:push -P <active-profile>
    e.g. mvn dockerfile:push -P dev-local
```


##### Build and deploy the docker image in same docker network.
  
docker run  -d \
    --name cassandra-db \
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
    
Create key space isom_key_space 

mvn clean install

docker build -t isom-service .
	
docker run  -d \
    --name isom-service \
    --hostname isom-service \
    --rm \
    --network=isom \
	-e CASSANDRA_HOST=cassandra-db \
    -p 8080:8080 \
  isom-service:latest 

##### Build and deploy application in minikube.
  
mvn clean install

docker build -t isom-service .

docker tag isom-service pushparajdhole23/isom-service:1.0.0

docker push pushparajdhole23/isom-service

kubectl apply -f kube/cassandra-service.yaml
kubectl apply -f kube/cassandra-statefulset.yaml
kubectl apply -f kube/isom-service.yaml