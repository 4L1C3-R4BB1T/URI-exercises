-- DATABASE
/*
create table categories (
	id numeric not null,
	name varchar not null,
	constraint PK_categories
		primary key (id)
);

create table products (
	id numeric not null,
	name varchar not null,
	amount numeric not null,
	price numeric not null,
	id_categories numeric not null,
	constraint PK_products
		primary key (id),
	constraint FK_products_categories
		foreign key (id_categories)
		references categories(id)
);
*/

-- INSERTS
/*
insert into categories (id, name)
values (1, 'wood'),
(2, 'luxury'),
(3, 'vintage'),
(4, 'modern'),
(5, 'super luxury');

insert into products (id, name, amount, price, id_categories)
values (1, 'Two-doors wardrobe', 100, 800, 1),
(2, 'Dining table', 1000, 560, 3),
(3, 'Towel holder', 10000, 25.50, 4),
(4, 'Computer desk', 350, 320.50, 2),
(5, 'Chair', 3000, 210.64, 4),
(6, 'Single bed', 750, 460, 1);
*/

-- select * from products;
-- select * from categories;
-- select * from products as p, categories as c where p.id_categories = c.id;
-- select * from products as p inner join categories as c on p.id_categories = c.id;

-- EXERCÍCIO
/* Como de costume o setor de vendas está fazendo uma análise de quantos produtos temos em estoque, 
   e você poderá ajudar eles.
   Então seu trabalho será exibir o nome e a quantidade de produtos de cada uma categoria. */

-- SOLUÇÃO
select c.name, sum(p.amount)
from products as p, categories as c 
where p.id_categories = c.id
group by c.name;
