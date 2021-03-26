-- DATABASE
/*
create table customers (
	id numeric not null,
	name varchar not null,
	street varchar not null,
	city varchar not null,
	constraint PK_customer
		primary key (id)
);

create table locations (
	id numeric not null,
	locations_date date not null,
	id_customers numeric not null,
	constraint PK_location
		primary key (id),
	constraint FK_location_customer
		foreign key (id_customers)
		references customers(id)
);
*/

-- INSERTS
/*
insert into customers (id, name, street, city)
values (1, 'Giovanna Goncalves Oliveira', 'Rua Mato Grosso', 'Canoas'), 
(2, 'Kauã Azevedo Ribeiro', 'Travessa Ibiá', 'Uberlândia'),
(3, 'Rebeca Barbosa Santos', 'Rua Observatório Meteorológico', 'Salvador'),
(4, 'Sarah Carvalho Correia', 'Rua Antônio Carlos da Silva', 'Apucarana'),
(5, 'João Almeida Lima', 'Rua Rio Taiuva', 'Ponta Grossa'),
(6, 'Diogo Melo Dias', 'Rua Duzentos e Cinqüenta', 'Várzea Grande');

insert into locations (id, locations_date, id_customers)
values (1, '2016-10-09', 3),
(2, '2016-09-02', 1),
(3, '2016-08-02', 4),
(4, '2016-09-02', 2),
(5, '2016-03-02', 6),
(6, '2016-04-04', 4);
*/

-- select * from customers;
-- select * from locations;
-- select * from customers as c, locations as l where c.id = l.id_customers;
-- select * from customers as c inner join locations as l on c.id = l.id_customers;

-- EXERCÍCIO
/* A locadora pretende fazer uma promoção para os clientes que ainda não fizeram nenhuma locação. 
   Seu trabalho é nos entregar o ID e o nome dos clientes que não realizaram nenhuma locação. */

-- SOLUÇÃO
select c.id, c.name
from customers as c
where not exists (select * from locations as l where c.id = l.id_customers);
