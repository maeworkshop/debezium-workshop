-- init.sql
CREATE TABLE IF NOT EXISTS person (
    id serial PRIMARY KEY,
    first_name VARCHAR(255),
    last_name VARCHAR(255)
);