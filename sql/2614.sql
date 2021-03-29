-- DATABASE
/*
create table customers (
	id numeric not null,
	name varchar not null,
	street varchar not null,
	city varchar not null,
	constraint PK_customers
		primary key (id)
);

create table rentals (
	id numeric not null,
	rentals_date date not null,
	id_customers numeric not null,
	constraint PK_rentals
		primary key (id),
	constraint FK_rentals_customers
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

insert into rentals (id, rentals_date, id_customers)
values (1, '2016-10-09', 3),
(2, '2016-09-02', 1),
(3, '2016-08-02', 4),
(4, '2016-08-02', 2),
(5, '2016-03-02', 6),
(6, '2016-04-04', 4);
*/

-- select * from customers;
-- select * from rentals;
-- select * from customers as c, rentals as r where c.id = r.id_customers;
-- select * from customers as c inner join rentals as r on c.id = r.id_customers;

-- EXERCÍCIO
/* A vídeo locadora está fazendo seu relatório semestral e precisa da sua ajuda. 
   Basta você selecionar o nome dos clientes e a data de locação, das locações realizadas no mês de setembro de 2016. */

-- SOLUÇÃO
select c.name, r.rentals_date
from customers as c, rentals as r
where c.id = r.id_customers
	and extract(month from r.rentals_date) = 9
	and extract(year from r.rentals_date) = 2016;

