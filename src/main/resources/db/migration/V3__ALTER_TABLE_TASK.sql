alter table task add column assigned varchar(100);

update task set assigned= 'Grzesiek' where description = 'walk a dog';
update task set assigned= 'Arek' where description = 'learn kotlin';