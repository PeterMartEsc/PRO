CREATE TABLE IF NOT EXISTS Personajes (
    idSuperheroe INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nombre TEXT NOT NULL,
    alias TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Poderes (
    idPoder INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    personaje_id INTEGER NOT NULL,
    poder TEXT NOT NULL,
    FOREIGN KEY(personaje_id) REFERENCES Personajes(id)
);

INSERT INTO Personajes (nombre, alias, genero) VALUES
    ('Iron Man', 'Tony Stark', 'Masculino'),
    ('Spider-Man', 'Peter Parker', 'Masculino');

INSERT INTO Poderes (personaje_id, poder) VALUES
    (1, 'Vuelo'),
    (1, 'Armadura tecnológica avanzada'),
    (1, 'Rayos láser'),
    (2, 'Agilidad sobrehumana'),
    (2, 'Trepamuros'),
    (2, 'Sentido arácnido');