CREATE TABLE IF NOT EXISTS Personajes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    nombre TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Alias (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    personaje_id INTEGER NOT NULL,
    alias TEXT NOT NULL,
    FOREIGN KEY(personaje_id) REFERENCES Personajes(id)
);

CREATE TABLE IF NOT EXISTS Poderes (
    id INTEGER PRIMARY KEY AUTOINCREMENT,
    poder TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Personajes_Poderes (
    personaje_id INTEGER,
    poder_id INTEGER,
    PRIMARY KEY (personaje_id, poder_id),
    FOREIGN KEY(personaje_id) REFERENCES Personajes(id),
    FOREIGN KEY(poder_id) REFERENCES Poderes(id)
);

-- Inserción de datos
INSERT INTO Personajes (nombre, genero) VALUES
    ('Iron Man', 'Masculino'),
    ('Spider-Man', 'Masculino');

INSERT INTO Alias (personaje_id, alias) VALUES
    (1, 'Tony Stark'),
    (2, 'Peter Parker');

INSERT INTO Poderes (poder) VALUES
    ('Vuelo'),
    ('Armadura tecnológica avanzada'),
    ('Rayos láser'),
    ('Agilidad sobrehumana'),
    ('Trepamuros'),
    ('Sentido arácnido');

INSERT INTO Personajes_Poderes (personaje_id, poder_id) VALUES
    (1, 1), -- Iron Man tiene Vuelo
    (1, 2), -- Iron Man tiene Armadura tecnológica avanzada
    (1, 3), -- Iron Man tiene Rayos láser
    (2, 4), -- Spider-Man tiene Agilidad sobrehumana
    (2, 5), -- Spider-Man tiene Trepamuros
    (2, 6); -- Spider-Man tiene Sentido arácnido