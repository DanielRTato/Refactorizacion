public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */

    public static String getScore(int puntuacionJugador1, int puntuacionJugador2) {

        if (puntuacionJugador1 == puntuacionJugador2) {
            return getTieScores(puntuacionJugador1);
        }

        if (puntuacionJugador1 >= 4 || puntuacionJugador2 >= 4) {
            return advantageOrWin(puntuacionJugador1, puntuacionJugador2);
        }



        return getRegularScore(puntuacionJugador1, puntuacionJugador2);
    }

    /**
     *
     * @param puntos
     * @return
     */
    private static String getPuntuationName(int puntos) {
        switch (puntos) {
            case 0:
                return "Love";
            case 1:
                return "Fifteen";
            case 2:
                return "Thirty";
            case 3:
                return "Forty";
            default:
                return "Invalid";
        }
    }

    public static String getTieScores(int pointPlayers){
        String[] scoreNames = {"Love-All","Fifteen-All","Thirty-All", "Forty-All" };

        return pointPlayers < scoreNames.length ? scoreNames[pointPlayers] : "Deuce";
    }

    public static String advantageOrWin(int jugador1, int jugador2){
        int diferencia = jugador1 - jugador2;

        if (diferencia == 1) return "Advantage player1";
        if (diferencia == -1) return "Advantage player2";
        if (diferencia >= 2) return "Win for player1";

        return "Win for player2";
    }

    private static String getRegularScore(int jugador1, int jugador2) {
        return getPuntuationName(jugador1) + "-" + getPuntuationName(jugador2);
    }


}