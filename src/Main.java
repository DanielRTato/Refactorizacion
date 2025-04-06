public class Main {
    /**
     * metodo para devolver la puntuacion de tenis
     */





    public static String getScore(int puntuacionJugador1, int puntuacionJugador2) {
        if (puntuacionJugador1 == puntuacionJugador2){
            return getEmpate(puntuacionJugador1);
        }

        String score = "";
        int tempScore=0;



       if (puntuacionJugador1 >=4 || puntuacionJugador2 >=4)
        {
            int minusResult = puntuacionJugador1-puntuacionJugador2;
            if (minusResult==1) score ="Advantage player1";
            else if (minusResult ==-1) score ="Advantage player2";
            else if (minusResult>=2) score = "Win for player1";
            else score ="Win for player2";
        }
        else
        {
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



}