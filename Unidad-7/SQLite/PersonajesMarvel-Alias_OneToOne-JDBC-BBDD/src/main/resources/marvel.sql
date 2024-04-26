CREATE TABLE IF NOT EXISTS Personajes (
    idSuperheroe INTEGER PRIMARY KEY AUTOINCREMENT NOT NULL,
    nombre TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Alias (
    idAlias INTEGER PRIMARY KEY AUTOINCREMENT,
    idSuperheroe INTEGER NOT NULL,
    alias TEXT NOT NULL,
    FOREIGN KEY(idSuperheroe) REFERENCES Personajes(idSuperheroe)
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
    PRIMARY KEY (idSuperheroe, idPoder)
);

INSERT INTO Personajes (nombre, genero) VALUES
    ('Iron Man', 'Masculino'),
    ('Spider-Man', 'Masculino');

INSERT INTO Alias (idSuperheroe, alias) VALUES
    ('1', 'Tony Stark'),
    ('2', 'Peter Parker');

INSERT INTO Poderes (poder) VALUES
    ('Vuelo'),
    ('Armadura tecnológica avanzada'),
    ('Rayos láser'),
    ('Agilidad sobrehumana'),
    ('Trepamuros'),
    ('Sentido arácnido');

INSERT INTO PersonajesPoderes (idSuperheroe, idPoder) VALUES
    (1,1),(1,2),(1,3),
    (2,4),(2,5),(2,6);