# CDC: Streaming with Debezium, Kafka, and Docker

For more context and detailed explanations, refer to the accompanying [Medium article](https://medium.com/yazilim-vip/change-data-capture-magic-streaming-with-debezium-kafka-and-docker-fa31328ef14e).

## Prerequisites
Ensure you have the following installed on your machine:
- [Docker](https://www.docker.com/)
- [Docker Compose](https://docs.docker.com/compose/)

## Quick Start
1. **Clone this repository**:
    ```bash
    git clone https://github.com/maeworkshop/debezium-workshop.git
    cd debezium-workshop/debezium-and-kafka
    ```

2. **Start the services**:
   Run the following command to spin up Kafka, Zookeeper, and Debezium using Docker Compose:
    ```bash
    docker-compose up -d
    ```

3. **Verify services**:
   Ensure that all containers are running smoothly with:
    ```bash
    docker ps
    ```

4. **Connect to Kafka**:
   Use tools like [kafkacat](https://github.com/edenhill/kafkacat) or Kafka CLI to monitor topics and check data streaming.

## Configuration
Key configurations are available in the `docker-compose.yml` file. Adjust any necessary environment variables to fit your setup.


