CREATE TABLE TB_TELEFONE(
ID_TELEFONE INT AUTO_INCREMENT PRIMARY key,
CELULAR_TELEFONE INT,
TELEFONE_TELEFONE INT,
ID_USUARIO INT,
CONSTRAINT fk_teluser FOREIGN KEY (ID_USUARIO) REFERENCES TB_USUARIO (ID_USUARIO));