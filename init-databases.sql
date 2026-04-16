-- Databases para cada microserviço
CREATE DATABASE saga_orders;
CREATE DATABASE saga_payments;
CREATE DATABASE saga_stock;
CREATE DATABASE saga_deliveries;

-- Garantir que o usuário tem acesso a todos
GRANT ALL PRIVILEGES ON DATABASE saga_orders TO saga;
GRANT ALL PRIVILEGES ON DATABASE saga_payments TO saga;
GRANT ALL PRIVILEGES ON DATABASE saga_stock TO saga;
GRANT ALL PRIVILEGES ON DATABASE saga_deliveries TO saga;