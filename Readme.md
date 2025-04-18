## Cambios Realizados

1. **Renombrar Variables y Métodos**:
  - `m_score1` y `m_score2` cambiados a `puntuacionJugador1` y `puntuacionJugador2` para mejorar la claridad.
  - Los métodos fueron renombrados para describir mejor su funcionalidad.

2. **División de la Función `getScore()`**:
  - La función `getScore()` fue dividida en varias funciones más pequeñas y específicas.

## Estructura del Código

### 1. `getScore(int puntuacionJugador1, int puntuacionJugador2)`
Esta función principal decide qué tipo de puntuación mostrar según las condiciones del juego:
- Si las puntuaciones son iguales, llama a `getEmpate()`.
- Si alguna puntuación es mayor o igual a 4, llama a `advantageWin()`.
- En otros casos, llama a `getMarcadorNormal()`.

### 2. `getTieScores(int puntuacion)`
Maneja los casos en los que ambos jugadores tienen la misma puntuación:
- Devuelve cadenas como `"Love-All"`, `"Fifteen-All"`, etc.
- Si la puntuación es mayor o igual a 3, devuelve `"Deuce"`.

### 3. `advantageOrWin(int jugador1, int jugador2)`
Maneja los casos de ventaja o victoria:
- Calcula la diferencia entre las puntuaciones.
- Devuelve mensajes como `"Advantage player1"`, `"Advantage player2"`, `"Win for player1"` o `"Win for player2"`.

### 4. `getRegularScore(int jugador1, int jugador2)`
Maneja los casos intermedios en los que no hay empate, ventaja ni victoria:
- Devuelve el marcador en formato `"Fifteen-Thirty"`, `"Thirty-Forty"`, etc.

### 5. `getPuntuationName(int puntos)`
Traduce los valores numéricos de la puntuación a palabras:
- `0` → `"Love"`, `1` → `"Fifteen"`, `2` → `"Thirty"`, `3` → `"Forty"`.
- Devuelve `"Invalid"` si el valor no es válido.

### 6. Renombrar mas variables y traducir los nombres a Ingles

### 7. Cambiar el switch por un array para hacer el código mas compacto
Duda, por qué es mejor?


