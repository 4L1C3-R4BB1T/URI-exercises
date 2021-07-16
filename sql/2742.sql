-- DATABASE
/*
create table dimensions (
	id integer not null,
	name varchar not null,
	constraint PK_dimensions
		primary key (id)
);

create table life_registry (
	id integer not null,
	name varchar not null,
	omega numeric not null,
	dimensions_id integer not null,
	constraint PK_life_registry
		primary key (id),
	constraint FK_life_registry_dimensions
		foreign key (dimensions_id)
		references dimensions(id)
);
*/

-- INSERTS
/*
insert into dimensions (id, name)
values (1, 'C774'),
(2, 'C784'),
(3, 'C794'),
(4, 'C824'),
(5, 'C875');

insert into life_registry (id, name, omega, dimensions_id)
values (1, 'Richard Postman', 5.6, 2),
(2, 'Simple Jelly', 1.4, 1),
(3, 'Richard Gran Master', 2.5, 1),
(4, 'Richard Turing', 6.4, 4),
(5, 'Richard Strall', 1.0, 3);
*/

-- select * from dimensions as d join life_registry as l on d.id = l.dimensions_id; 

-- EXERCÍCIO
/* Richard é um cientista muito famoso por suas teorias do multiverso, onde ele descreve 
   que todo o conjunto hipotético de universos paralelos podem ser representados por meio 
   de tabelas em um banco de dados. E graças a essa teoria você tem um emprego. A sua 
   primeira tarefa é selecionar todos os possíveis Richards das dimensões C875 e C774, 
   junto a sua probabilidade de existência (o fator N) com a precisão de 3 casas decimais.
   Lembre-se que (o fator N) é calculado multiplicando o valor omega por 1,618. Os dados 
   devem ser ordenados pelo menor valor do campo omega. */

-- SOLUÇÃO
select l.name, trunc(l.omega*1.618, 3)
from dimensions as d join life_registry as l
    on d.id = l.dimensions_id 
where d.name in ('C875', 'C774')
	and l.name like 'Richard%'
order by l.omega asc;
