/*  GPU class */
/* @author Kuvykin Nikita */
CREATE TABLE GPU (
    price INT NOT NULL,
    gpu_name VARCHAR(255) NOT NULL,
    producer VARCHAR(255) NOT NULL,
    memory_size INT NOT NULL,
    memory_type VARCHAR(255) NOT NULL,
    connection_type VARCHAR(255) NOT NULL
);
