CREATE TABLE Canal
  (
    codigo   NUMBER(10) NOT NULL ,
    descricao VARCHAR2 (200) NOT NULL
  ) ;
ALTER TABLE Canal ADD CONSTRAINT Canal_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Categoria
  (
    codigo           NUMBER(10) NOT NULL ,
    icone            VARCHAR2 (500) ,
    imagem           VARCHAR2 (500) ,
    descricao        VARCHAR2 (500) NOT NULL ,
    Categoria_codigo NUMBER(10)
  ) ;
ALTER TABLE Categoria ADD CONSTRAINT Categoria_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Continente
  (
    codigo NUMBER(10) NOT NULL ,
    nome   VARCHAR2 (100) ,
    sigla  VARCHAR2 (4) NOT NULL
  ) ;
ALTER TABLE Continente ADD CONSTRAINT Continente_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Marca
  (
    codigo        NUMBER(10) NOT NULL ,
    nome          VARCHAR2 (200) NOT NULL ,
    descricao     VARCHAR2 (500) ,
    logomarca     VARCHAR2 (500) ,
    data_criacao  DATE NOT NULL ,
    genero        VARCHAR2 (1) NOT NULL ,
    idade_inicial NUMBER (3) NOT NULL ,
    idade_final   NUMBER (3) NOT NULL ,
    status VARCHAR(1) NOT NULL
  ) ;
ALTER TABLE Marca ADD CONSTRAINT Marca_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Marca_canal
  (
    forma_acesso VARCHAR2 (100) ,
    observacoes  VARCHAR2 (500) ,
    Marca_codigo NUMBER(10) NOT NULL ,
    Canal_codigo NUMBER(10) NOT NULL ,
    abrangencia  VARCHAR2 (500)
  ) ;

CREATE TABLE Modelagem
  (
    codigo NUMBER(10) NOT NULL ,
    nome   VARCHAR2 (100) NOT NULL ,
    status VARCHAR(1) NOT NULL ,
    genero                   VARCHAR2 (1) ,
    descricao                VARCHAR2 (500) ,
    codigo_interno_industria VARCHAR2 (100)
  ) ;
ALTER TABLE Modelagem ADD CONSTRAINT Modelagem_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Modelagem_categoria
  (
    Modelagem_codigo NUMBER(10) NOT NULL ,
    Categoria_codigo NUMBER(10) NOT NULL
  ) ;

CREATE TABLE Modelagem_dados_tamanho
  (
    valor_medida_inicial FLOAT NOT NULL ,
    Modelagem_codigo          NUMBER(10) NOT NULL ,
    Tamanho_tipo_grade_codigo NUMBER(10) NOT NULL ,
    Padrao_medida_codigo      NUMBER(10) NOT NULL ,
    Tipo_medida_codigo        NUMBER(10) NOT NULL ,
    valor_medida_final FLOAT
  ) ;

CREATE TABLE Modelagem_marca
  (
    Modelagem_codigo NUMBER(10) NOT NULL ,
    Marca_codigo     NUMBER(10) NOT NULL
  ) ;

CREATE TABLE Padrao_medida
  (
    codigo    NUMBER(10) NOT NULL ,
    descricao VARCHAR2 (500)
  ) ;
ALTER TABLE Padrao_medida ADD CONSTRAINT Padrao_medida_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Pais
  (
    codigo            NUMBER(10) NOT NULL ,
    nome              VARCHAR2 (100) NOT NULL ,
    sigla             VARCHAR2 (4) ,
    Continente_codigo NUMBER(10) NOT NULL ,
    nacionalidade     VARCHAR2 (100) NOT NULL
  ) ;
ALTER TABLE Pais ADD CONSTRAINT Pais_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Pais_marca
  (
    Marca_codigo NUMBER(10) NOT NULL ,
    Pais_codigo  NUMBER(10) NOT NULL
  ) ;

CREATE TABLE Tamanho_tipo_grade
  (
    codigo            NUMBER(10) NOT NULL ,
    descricao         VARCHAR2 (500) NOT NULL ,
    Tipo_grade_codigo NUMBER(10) NOT NULL
  ) ;
ALTER TABLE Tamanho_tipo_grade ADD CONSTRAINT Tamanho_tipo_grade_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Tipo_grade
  (
    codigo    NUMBER(10) NOT NULL ,
    descricao VARCHAR2 (500)
  ) ;
ALTER TABLE Tipo_grade ADD CONSTRAINT Tipo_grade_PK PRIMARY KEY ( codigo ) ;

CREATE TABLE Tipo_medida
  (
    codigo              NUMBER(10) NOT NULL ,
    descricao           VARCHAR2 (500) NOT NULL ,
    abreviacao          VARCHAR2 (10) ,
    nome                VARCHAR2 (200) ,
    figura_forma_medida VARCHAR2 (500)
  ) ;
ALTER TABLE Tipo_medida ADD CONSTRAINT Tipo_medida_PK PRIMARY KEY ( codigo ) ;

ALTER TABLE Categoria ADD CONSTRAINT Categoria_Categoria_FK FOREIGN KEY ( Categoria_codigo ) REFERENCES Categoria ( codigo ) ;

ALTER TABLE Modelagem_categoria ADD CONSTRAINT Categoria_FK FOREIGN KEY ( Categoria_codigo ) REFERENCES Categoria ( codigo ) ;

ALTER TABLE Marca_canal ADD CONSTRAINT Marca_canal_Canal_FK FOREIGN KEY ( Canal_codigo ) REFERENCES Canal ( codigo ) ;

ALTER TABLE Marca_canal ADD CONSTRAINT Marca_canal_Marca_FK FOREIGN KEY ( Marca_codigo ) REFERENCES Marca ( codigo ) ;

ALTER TABLE Modelagem_dados_tamanho ADD CONSTRAINT Modelagem_FK FOREIGN KEY ( Modelagem_codigo ) REFERENCES Modelagem ( codigo ) ;

ALTER TABLE Modelagem_categoria ADD CONSTRAINT Modelagem_table_FK FOREIGN KEY ( Modelagem_codigo ) REFERENCES Modelagem ( codigo ) ;

ALTER TABLE Modelagem_marca ADD CONSTRAINT Modelagem_marca_Marca_FK FOREIGN KEY ( Marca_codigo ) REFERENCES Marca ( codigo ) ;

ALTER TABLE Modelagem_marca ADD CONSTRAINT Modelagem_marca_Modelagem_FK FOREIGN KEY ( Modelagem_codigo ) REFERENCES Modelagem ( codigo ) ;

ALTER TABLE Modelagem_dados_tamanho ADD CONSTRAINT Padrao_medida_FK FOREIGN KEY ( Padrao_medida_codigo ) REFERENCES Padrao_medida ( codigo ) ;

ALTER TABLE Pais ADD CONSTRAINT Pais_Continente_FK FOREIGN KEY ( Continente_codigo ) REFERENCES Continente ( codigo ) ;

ALTER TABLE Pais_marca ADD CONSTRAINT Pais_marca_Marca_FK FOREIGN KEY ( Marca_codigo ) REFERENCES Marca ( codigo ) ;

ALTER TABLE Pais_marca ADD CONSTRAINT Pais_marca_Pais_FK FOREIGN KEY ( Pais_codigo ) REFERENCES Pais ( codigo ) ;

ALTER TABLE Modelagem_dados_tamanho ADD CONSTRAINT Tamanho_tipo_grade_FK FOREIGN KEY ( Tamanho_tipo_grade_codigo ) REFERENCES Tamanho_tipo_grade ( codigo ) ;

ALTER TABLE Tamanho_tipo_grade ADD CONSTRAINT Tipo_grade_FK FOREIGN KEY ( Tipo_grade_codigo ) REFERENCES Tipo_grade ( codigo ) ;

ALTER TABLE Modelagem_dados_tamanho ADD CONSTRAINT Tipo_medida_FK FOREIGN KEY ( Tipo_medida_codigo ) REFERENCES Tipo_medida ( codigo ) ;

CREATE SEQUENCE Canal_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Canal_codigo_TRG BEFORE
  INSERT ON Canal FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Canal_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Categoria_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Categoria_codigo_TRG BEFORE
  INSERT ON Categoria FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Categoria_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Continente_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Continente_codigo_TRG BEFORE
  INSERT ON Continente FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Continente_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Marca_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Marca_codigo_TRG BEFORE
  INSERT ON Marca FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Marca_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Modelagem_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Modelagem_codigo_TRG BEFORE
  INSERT ON Modelagem FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Modelagem_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Padrao_medida_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Padrao_medida_codigo_TRG BEFORE
  INSERT ON Padrao_medida FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Padrao_medida_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Pais_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Pais_codigo_TRG BEFORE
  INSERT ON Pais FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Pais_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Tamanho_tipo_grade_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Tamanho_tipo_grade_codigo_TRG BEFORE
  INSERT ON Tamanho_tipo_grade FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Tamanho_tipo_grade_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Tipo_grade_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Tipo_grade_codigo_TRG BEFORE
  INSERT ON Tipo_grade FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Tipo_grade_codigo_SEQ.NEXTVAL;
END;
/

CREATE SEQUENCE Tipo_medida_codigo_SEQ START WITH 1 NOCACHE ORDER ;
CREATE OR REPLACE TRIGGER Tipo_medida_codigo_TRG BEFORE
  INSERT ON Tipo_medida FOR EACH ROW WHEN (NEW.codigo IS NULL) BEGIN :NEW.codigo := Tipo_medida_codigo_SEQ.NEXTVAL;
END;
/
