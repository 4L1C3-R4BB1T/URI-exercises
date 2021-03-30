-- DATABASE
/*
create table genres (
	id numeric not null,
	description varchar not null,
	constraint PK_genres
		primary key (id)
);

create table movies (
	id numeric not null,
	name varchar not null,
	id_genres numeric not null,
	constraint PK_movies
		primary key (id),
	constraint FK_movies_genres
		foreign key (id_genres)
		references genres(id)
);
*/

-- INSERTS
/*
insert into genres (id, description)
values (1, 'Animation'), 
(2, 'Horror'),
(3, 'Action'),
(4, 'Drama'),
(5, 'Comedy');

insert into movies (id, name, id_genres)
values (1, 'Batman', 3),
(2, 'The Battle of the Dark River', 3),
(3, 'White Duck', 1),
(4, 'Breaking Barriers', 4),
(5, 'The Two Hours', 2);
*/

-- select * from movies;
-- select * from genres;
-- select * from movies as m, genres as g where m.id_genres = g.id;
-- select * from movies as m inner join genres as g on m.id_genres = g.id;

-- EXERCÍCIO
/* Uma Vídeo locadora contratou seus serviços para catalogar os filmes dela. 
   Eles precisam que você selecione o código e o nome dos filmes cuja descrição do gênero seja 'Action'. */

-- SOLUÇÃO
select m.id, m.name
from movies as m, genres as g
where m.id_genres = g.id
	and g.description = 'Action';
