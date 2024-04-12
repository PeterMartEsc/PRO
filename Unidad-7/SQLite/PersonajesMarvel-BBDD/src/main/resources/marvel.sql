CREATE TABLE IF NOT EXISTS Personajes (
    idSuperheroe INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nombre TEXT NOT NULL,
    alias TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Poderes (
    idPoder INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    poder TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS PersonajesPoderes (
    idSuperheroe INTEGER NOT NULL,
    idPoder INTEGER NOT NULL,
    FOREIGN KEY (idSuperheroe) REFERENCES Personajes(idSuperheroe),
    FOREIGN KEY (idPoder) REFERENCES Poderes(idPoder)
);

INSERT INTO Personajes (nombre, alias, genero) VALUES
    ('Iron Man', 'Tony Stark', 'Masculino'),
    ('Spider-Man', 'Peter Parker', 'Masculino');

INSERT INTO Poderes (personaje_id, poder) VALUES
    ('Vuelo'),
    ('Armadura tecnológica avanzada'),
    ('Rayos láser'),
    ('Agilidad sobrehumana'),
    ('Trepamuros'),
    ('Sentido arácnido');

INSERT INTO PersonajesPoderes (idSuperheroe, idPoder) VALUES
    (1,1),(1,2),(1,3),
    (2,4),(2,5),(2,6);