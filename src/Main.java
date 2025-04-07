public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */

    public static String getScore(int puntuacionJugador1, int puntuacionJugador2) {

        if (puntuacionJugador1 == puntuacionJugador2) {
            return getEmpate(puntuacionJugador1);
        }

        if (puntuacionJugador1 >= 4 || puntuacionJugador2 >= 4) {
            return advantageWin(puntuacionJugador1, puntuacionJugador2);
        }

        String score = "";
        int tempScore=0;






            for (int i=1; i<3; i++)
            {
                if (i==1) tempScore = puntuacionJugador1;
                else { score+="-"; tempScore = puntuacionJugador2;}
                switch(tempScore)
                {
                    case 0:
                        score+="Love";
                        break;
                    case 1:
                        score+="Fifteen";
                        break;
                    case 2:
                        score+="Thirty";
                        break;
                    case 3:
                        score+="Forty";
                        break;
                }
            }


    return score;
    }

    public static String getEmpate (int puntuacion){
        switch (puntuacion)
        {
            case 0:
                return "Love-All";
            case 1:
                return "Fifteen-All";

            case 2:
                return "Thirty-All";

            case 3:
                return "Forty-All";

            default:
                return "Deuce";


        }
    }

    public static String advantageWin (int jugador1, int jugador2){
        int diferencia = jugador1 - jugador2;

        if (diferencia == 1) return "Advantage player1";
        if (diferencia == -1) return "Advantage player2";
        if (diferencia >= 2) return "Win for player1";

        return "Win for player2";
    }



}