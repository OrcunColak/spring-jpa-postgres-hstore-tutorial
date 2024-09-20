
DROP TABLE IF EXISTS employee;

CREATE TABLE employee (
    id SERIAL PRIMARY KEY,
    name VARCHAR(255),
    properties hstore
);