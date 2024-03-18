<div align="justify">

## Ejercicio 1

Crea un programa que calcule el daño de un ataque durante una batalla Pokémon.
- La fórmula será la siguiente: daño = 50 * (ataque / defensa) * efectividad.
- Efectividad: 2 (súper efectivo), 1 (neutral), 0.5 (no es muy efectivo)
- Sólo hay 4 tipos de Pokémon: Agua, Fuego, Planta y Eléctrico.
- Para obtener la relación de la efectividad entre pockemon´s:

  |        | Agua | Fuego | Planta | Eléctrico |
  |--------|------|-------|--------|-----------|
  | Agua   | 0.5  | 2     | 0.5    | 1         |
  | Fuego  | 2    | 0.5   | 0.5    | 1         |
  | Planta | 0.5  | 2     | 0.5    | 1         |
  | Eléctrico | 1 | 1     | 1      | 0.5       |

- El programa recibe los siguientes parámetros:
    - Tipo del Pokémon atacante.
    - Tipo del Pokémon defensor.
    - Ataque: Entre 1 y 100.
    - Defensa: Entre 1 y 100.

Ejemplos:

|        | Tipo | Tipo  | Ataque | Defensa | Resultado |
|--------|------|-------|--------|---------|-----------|
| Daño | Fuego  | Fuego | 50     | 25      | 50        |
| Daño | Fuego  | Fuego | 110    | 25      | -1        |
| Daño | Agua   | Agua  | 100    | 110     | -2        |

>__Nota__:
> - Si el valor del ataque es superior a 100, el resultado será -1.
> - Si el valor de la defensa es superior a 100, el resultado será -2.

</div>