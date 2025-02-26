-- --migration to add rank column in register--
ALTER TABLE tb_cadastro
    ADD COLUMN  age VARCHAR(255);
--
--