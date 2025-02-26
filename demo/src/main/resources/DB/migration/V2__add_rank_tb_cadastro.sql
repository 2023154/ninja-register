-- --migration to add rank column in register--
ALTER TABLE tb_cadastro
ADD COLUMN  rank VARCHAR(255);
--
--