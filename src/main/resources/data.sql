	
	DROP TABLE IF EXISTS salas;
	DROP TABLE IF EXISTS peliculas;
	
	CREATE TABLE peliculas (
		id int PRIMARY KEY auto_increment,
		nombre varchar(100),
		calificacionedad int
	);
	
	CREATE TABLE salas (
	    id int PRIMARY KEY auto_increment ,
	    nombre varchar(100) not null,
	    pelicula int,
	    FOREIGN KEY (pelicula) REFERENCES peliculas(id)
	    on update cascade
	    on delete cascade
	);
	
	
	INSERT INTO peliculas (nombre, calificacionedad) VALUES
	('Interstaller', 12),
	('Blade Runner 2049', 14),
	('El silencio de los corderos', 18),
	('El dragón rojo', 18),
	('Haninibal', 18);
	
	
	INSERT INTO salas (nombre, pelicula) VALUES
	('Amarilla', 1),
	('Verde', 1),
	('Roja', 3),
	('Azul', 4),
	('Violeta', 5);
	
	
	