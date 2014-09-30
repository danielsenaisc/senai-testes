select tablespace_name, file_name from dba_data_files order by tablespace_name;

ALTER USER "mateus" identified by password;


DROP TABLESPACE "TESTE123" INCLUDING CONTENTS AND DATAFILES;

create TABLESPACE mundo DATAFILE 'mundo.dbf' SIZE 100m 
AUTOEXTEND ON NEXT 10m MAXSIZE 4g;

create sequence continente_id_seq start with 1 increment by 1 nocache;

create sequence pais_id_seq start with 1 increment by 1 nocache;

create table continente
(
continente_id number(4) CONSTRAINT pk_continente_id NOT NULL PRIMARY key,
continente_nome varchar(50) not null
) TABLESPACE mundo;

alter table continente RENAME COLUMN nome TO continente_nome;

ALTER TABLE continente RENAME CONSTRAINT pk_id TO pk_continente_id;

create table pais
(
pais_id number(4) CONSTRAINT pk_pais_id PRIMARY KEY,
pais_nome varchar(50) not null,
continente_id number(4) not null CONSTRAINT fk_continente_id
  REFERENCES continente(continente_id)
) tablespace mundo;

drop table continente

insert into continente 
values (continente_id_seq.nextval, 'América do Sul');

insert into continente 
values (continente_id_seq.nextval, 'América do Norte');

insert into pais
values (pais_id_seq.nextval, 'Brasil', 1)

insert into pais
values (pais_id_seq.nextval, 'Canadá', 2)

select p.pais_nome, c.continente_nome from pais p inner join continente c on c.continente_id = p.pais_id


select * from pais

