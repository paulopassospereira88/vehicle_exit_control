
INSERT INTO tb_vehicle (license_plate, model, car_brand)
SELECT
    -- Gera uma placa aleatória com 3 letras e 4 números
    UPPER(LPAD(MD5(RANDOM()::text), 2, 'A')) || '-' || LPAD(TO_CHAR(RANDOM() * 10000, '0000'), 4, '0'),
    -- Escolhe um modelo aleatório de uma lista predefinida
    (ARRAY['Gol', 'Corolla', 'Civic', 'Onix', 'HB20'])[1 + RANDOM() * 4],
    -- Escolhe uma marca aleatória de uma lista predefinida
    (ARRAY['Volkswagen', 'Toyota', 'Honda', 'Chevrolet', 'Hyundai'])[1 + RANDOM() * 4]
FROM generate_series(1, 100);