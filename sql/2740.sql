-- DATABASE
/*
create table league (
	position integer not null,
	team varchar(50) not null,
	constraint PK_league
		primary key (position)
);
*/

-- INSERTS
/*
insert into league (position, team)
values (1, 'The Quack Bats'),
(2, 'The Responsible Hornets'),
(3, 'The Bawdy Dolphins'),
(4, 'The Abstracted Sharks'),
(5, 'The Nervous Zebras'),
(6, 'The Oafish Owls'),
(7, 'The Unequaled Bison'),
(8, 'The Keen Kangaroos'),
(9, 'The Left Nightingales'),
(10, 'The Terrific Elks'),
(11, 'The Lumpy Frogs'),
(12, 'The Swift Buffalo'),
(13, 'The Big Chargers'),
(14, 'The Rough Robins'),
(15, 'The Silver Crocs');
*/

-- select * from league;

-- EXERCÍCIO
/* A Liga Internacional de Escavação Subterrânea já é um sucesso entre 
   os esportes alternativos, porém todos que trabalham na organização 
   do evento trabalham com escavação e não computação. Então você foi 
   contratado para solucionar o problema da Liga.
   Selecione os três primeiros colocados da lista com a frase inicial 
   Podium: e também, os dois últimos times que serão rebaixados para 
   série B com a frase inicial Demoted. */

-- SOLUÇÃO
select name 
from 
(
  (
    select position, 'Podium: ' || team as name
	from league 
	limit 3
  )
  union
  (
    select * 
    from (
	  select position, 'Demoted: ' || team as name
	  from league 
	  order by position desc 
	  limit 2
    ) as d
    order by position asc
  )
) as teams
order by position asc;
