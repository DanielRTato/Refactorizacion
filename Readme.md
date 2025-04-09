# Refactorización del Código de Puntuación de Tenis

Este proyecto implementa un sistema para calcular y mostrar la puntuación en un partido de tenis. A continuación, se detalla la estructura del código y las funciones principales, explicando su propósito y cómo se han refactorizado para mejorar la legibilidad y modularidad.

## Cambios Realizados

1. **Renombrar Variables y Métodos**:
  - `m_score1` y `m_score2` se renombraron a `puntuacionJugador1` y `puntuacionJugador2` para mejorar la claridad y consistencia en el idioma.
  - Los métodos fueron renombrados para describir mejor su funcionalidad.

2. **División de la Función `getScore()`**:
  - La función `getScore()` fue dividida en varias funciones más pequeñas y específicas, siguiendo el principio de responsabilidad única. Esto facilita el mantenimiento y la comprensión del código.

## Estructura del Código

### 1. `getScore(int puntuacionJugador1, int puntuacionJugador2)`
Esta función principal decide qué tipo de puntuación mostrar según las condiciones del juego:
- Si las puntuaciones son iguales, llama a `getEmpate()`.
- Si alguna puntuación es mayor o igual a 4, llama a `advantageWin()`.
- En otros casos, llama a `getMarcadorNormal()`.

### 2. `getEmpate(int puntuacion)`
Maneja los casos en los que ambos jugadores tienen la misma puntuación:
- Devuelve cadenas como `"Love-All"`, `"Fifteen-All"`, etc.
- Si la puntuación es mayor o igual a 3, devuelve `"Deuce"`.

### 3. `advantageWin(int jugador1, int jugador2)`
Maneja los casos de ventaja o victoria:
- Calcula la diferencia entre las puntuaciones.
- Devuelve mensajes como `"Advantage player1"`, `"Advantage player2"`, `"Win for player1"` o `"Win for player2"`.

### 4. `getMarcadorNormal(int jugador1, int jugador2)`
Maneja los casos intermedios en los que no hay empate, ventaja ni victoria:
- Devuelve el marcador en formato `"Fifteen-Thirty"`, `"Thirty-Forty"`, etc.

### 5. `getNombrePuntuacion(int puntos)`
Traduce los valores numéricos de la puntuación a palabras:
- `0` → `"Love"`, `1` → `"Fifteen"`, `2` → `"Thirty"`, `3` → `"Forty"`.
- Devuelve `"Invalid"` si el valor no es válido.

## Beneficios de la Refactorización

- **Legibilidad**: El código es más fácil de entender gracias a nombres descriptivos y funciones específicas.
- **Modularidad**: Cada función tiene una única responsabilidad, lo que facilita su prueba y mantenimiento.
- **Reutilización**: Se evita la repetición de código al encapsular lógica común en funciones auxiliares.

