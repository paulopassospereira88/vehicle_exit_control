CREATE TABLE tb_vehicle (
    id SERIAL PRIMARY KEY,
    license_plate VARCHAR(7) NOT NULL UNIQUE,
    model VARCHAR(50) NOT NULL,
    car_brand VARCHAR(50) NOT NULL
);
