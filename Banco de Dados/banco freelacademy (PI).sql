CREATE DATABASE db_freelacademy

USE db_freelacademy

CREATE TABLE tb_freelancer (
	id_freelancer INT IDENTITY(1,1) PRIMARY KEY,
	nome VARCHAR(255),
	email VARCHAR(255) NOT NULL UNIQUE, 
	telefone VARCHAR(30),
	descricao VARCHAR(255),
	foto_perfil TEXT,
	data_cadastro DATE,
	avaliacao_media DECIMAL(3,2)
)

CREATE TABLE tb_empresas (
	id_empresa INT IDENTITY(1,1) PRIMARY KEY,
	nome VARCHAR(255),
	email VARCHAR(255),
	telefone VARCHAR(30),
	descricao VARCHAR(255),
	data_cadastro DATE,
)

CREATE TABLE tb_projetos (
	id_projeto INT IDENTITY(1,1) PRIMARY KEY,
	titulo VARCHAR(100),
	descricao VARCHAR(250),
	data_inicio DATE,
	data_fim DATE,
	status_projeto BIT,
	valor DECIMAL(10,2),
	id_empresa INT,
	FOREIGN KEY (id_empresa) REFERENCES tb_empresas(id_empresa)
)

CREATE TABLE tb_propostas (
	id_proposta INT IDENTITY(1,1) PRIMARY KEY,
	valor DECIMAL(10,2),
	prazo VARCHAR(100),
	descricao VARCHAR(255),
	status_proposta BIT,
	id_freelancer INT,
	id_projeto INT,
	FOREIGN KEY (id_freelancer) REFERENCES tb_freelancer(id_freelancer),
	FOREIGN KEY (id_projeto) REFERENCES tb_projetos(id_projeto)
)

CREATE TABLE tb_contratos (
	id_contrato INT IDENTITY(1,1) PRIMARY KEY,
	data_assinatura DATE,
	valor_acordado DECIMAL(10,2),
	status_contrato BIT,
	data_inicio DATE,
	data_fim DATE,
	id_proposta INT,
	id_freelancer INT,
	id_empresa INT,
	FOREIGN KEY (id_proposta) REFERENCES tb_propostas(id_proposta),
	FOREIGN KEY (id_freelancer) REFERENCES tb_freelancer(id_freelancer),
	FOREIGN KEY (id_empresa) REFERENCES tb_empresas(id_empresa)
)
	
CREATE TABLE tb_pagamentos (
	id_pagamento INT IDENTITY(1,1) PRIMARY KEY,
	valor DECIMAL(10,2),
	data_pagamento DATE,
	metodo_pagamento BIT,
	status_pagamento BIT,
	id_contrato INT,
	FOREIGN KEY (id_contrato) REFERENCES tb_contratos(id_contrato)
)

CREATE TABLE tb_avaliacoes (
	id_avaliacao INT IDENTITY(1,1) PRIMARY KEY,
	nota INT,
	comentario VARCHAR(255),
	data_avaliacao DATE,
	id_freelancer INT,
	id_empresa INT,
	id_projeto INT,
	FOREIGN KEY (id_freelancer) REFERENCES tb_freelancer(id_freelancer),
	FOREIGN KEY (id_empresa) REFERENCES tb_empresas(id_empresa),
	FOREIGN KEY (id_projeto) REFERENCES tb_projetos(id_projeto)
)

SELECT * FROM tb_avaliacoes
SELECT * FROM tb_contratos
SELECT * FROM tb_empresas
SELECT * FROM tb_freelancer
SELECT * FROM tb_pagamentos
SELECT * FROM tb_projetos
SELECT * FROM tb_propostas


