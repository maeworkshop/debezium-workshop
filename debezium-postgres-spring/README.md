# CDC with Debezium, Kafka, Spring Boot 3, and Postgres

For more context and detailed explanations, refer to the accompanying [Medium article](https://medium.com/yazilim-vip/cdc-with-debezium-kafka-spring-boot-3-and-postgres-a523d5237cca).

## Prerequisites
Ensure you have the following installed on your machine:
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)
- [Java 17 or higher](https://adoptium.net/)
- [Maven](https://maven.apache.org/)

## Quick Start
1. **Clone this repository**:
    ```bash
    git clone https://github.com/maeworkshop/debezium-workshop.git
    cd debezium-workshop/debezium-postgres-spring
    ```

2. **Start the services**:
   Run the following command to spin up Kafka, Zookeeper, Debezium, and Postgres using Docker Compose:
    ```bash
    docker-compose up -d
    ```

3. **Verify services**:
   Ensure that all containers are running smoothly with:
    ```bash
    docker ps
    ```

4. **Run the Spring Boot Application**:
   Navigate to the Spring Boot project folder and run:
    ```bash
    gradle bootRun
    ```

## Configuration
Key configurations are available in the `application.yml` and `docker-compose.yml` files. Adjust any necessary environment variables to fit your setup.