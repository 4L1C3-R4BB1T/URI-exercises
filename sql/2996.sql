-- DATABASE
/*
create table users (
	id numeric not null,
	name varchar(50) not null,
	user_type char,
	address varchar(50) not null,
	constraint PK_users
		primary key (id)
);

create table packages (
	id_package numeric not null,
	id_user_sender integer not null,
	id_user_receiver integer not null,
	color varchar(50) not null,
	package_year integer not null,
	constraint PK_packages
		primary key (id_package),
	constraint FK_packages_user_sender
		foreign key (id_user_sender)
		references users(id),
	constraint FK_packages_user_receiver
		foreign key (id_user_receiver)
		references users(id)
);
*/

-- INSERTS
/*
insert into users (id, name, address)
values (1, 'Edgar Codd', 'England'),
(2, 'Peter Chen', 'Taiwan'),
(3, 'Jim Gray', 'United States'),
(4, 'Elizabeth ONeil', 'United States');

insert into packages (id_package, id_user_sender, id_user_receiver, color, package_year)
values (1, 1, 2, 'blue', 2015),
(2, 1, 3, 'blue', 2019),
(3, 2, 4, 'red', 2019),
(4, 2, 1, 'green', 2018),
(5, 3, 4, 'red', 2015),
(6, 4, 3, 'blue', 2019);
*/

-- select * from users;
-- select * from packages;

-- EXERCÍCIO
/* Você trabalha em uma transportadora e precisa mostrar com urgência o ano e 
   o nome de todos os clientes que enviaram e receberam pacotes azuis ou do ano 
   de 2015 e também que o endereço do seu remetente ou destinatário não seja de 
   Taiwan. Além disso, você deve ordenar o resultado pelo ano de maneira decrescente. */

-- SOLUÇÃO
select p.year, u1.name, u2.name
from packages as p 
	join users as u1 
	on u1.id = p.id_user_sender 
	join users as u2 
	on u2.id = p.id_user_receiver
where (p.color = 'blue' or p.year = 2015) 
	and u2.address != 'Taiwan' 
order by p.year desc;


