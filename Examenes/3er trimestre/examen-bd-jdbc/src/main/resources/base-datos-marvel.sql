CREATE TABLE IF NOT EXISTS Personaje (
    id TEXT PRIMARY KEY,
    nombre TEXT NOT NULL,
    genero TEXT
);

CREATE TABLE IF NOT EXISTS Poder (
    id TEXT PRIMARY KEY,
    nombre TEXT NOT NULL
);

CREATE TABLE IF NOT EXISTS Alias (
    id TEXT PRIMARY KEY,
    personaje_id TEXT NOT NULL,
    alias TEXT NOT NULL,
    FOREIGN KEY(personaje_id) REFERENCES Personaje(id)
);

CREATE TABLE IF NOT EXISTS Equipamiento (
    id TEXT PRIMARY KEY,
    nombre TEXT NOT NULL,
    descripcion TEXT,
    personaje_id TEXT,
    FOREIGN KEY(personaje_id) REFERENCES Personaje(id)
);

CREATE TABLE IF NOT EXISTS Personaje_Poder (
    personaje_id TEXT,
    poder_id TEXT,
    PRIMARY KEY (personaje_id, poder_id),
    FOREIGN KEY(personaje_id) REFERENCES Personaje(id),
    FOREIGN KEY(poder_id) REFERENCES Poder(id)
);

INSERT INTO Personaje (id, nombre, genero) VALUES
    ('1', 'Iron Man', 'Masculino'),
    ('2', 'Spider-Man', 'Masculino'),
    ('3', 'Captain America', 'Masculino'),
    ('4', 'Black Widow', 'Femenino');

INSERT INTO Poder (id, nombre) VALUES
    ('1', 'Vuelo'),
    ('2', 'Fuerza sobrehumana'),
    ('3', 'Agilidad sobrehumana'),
    ('4', 'Sentido arácnido'),
    ('5', 'Regeneración');

INSERT INTO Alias (id, personaje_id, alias) VALUES
    ('1', '1', 'Tony Stark'),
    ('2', '2', 'Peter Parker'),
    ('3', '3', 'Steve Rogers'),
    ('4', '4', 'Natasha Romanoff');

INSERT INTO Equipamiento (id, nombre, descripcion, personaje_id) VALUES
    ('1', 'Traje Mark XLV', 'Traje de Iron Man modelo 45 con capacidad de vuelo y armas integradas', '1'),
    ('2', 'Red de Spider-Man', 'Red lanzatelarañas utilizada por Spider-Man para balancearse entre edificios', '2'),
    ('3', 'Escudo Vibranium', 'Escudo utilizado por Captain America hecho de Vibranium', '3'),
    ('4', 'Brazales Widow', 'Brazales utilizados por Black Widow que contienen varias armas y gadgets', '4');

INSERT INTO Personaje_Poder (personaje_id, poder_id) VALUES
    ('1', '1'), -- Iron Man tiene Vuelo
    ('1', '2'), -- Iron Man tiene Fuerza sobrehumana
    ('2', '3'), -- Spider-Man tiene Agilidad sobrehumana
    ('2', '4'); -- Spider-Man tiene Sentido arácnido
