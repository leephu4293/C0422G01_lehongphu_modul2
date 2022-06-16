package clean_code;

public class TennisGame {

        final static int LOVE = 0;
        final static int FIFTEEN = 1;
        final static int THIRTY = 2;
        final static int FORTY = 3;

        public static String getDeucePoint(int point) {
            switch (point) {
                case LOVE:
                    return "Love-All";
                case FIFTEEN:
                    return "Fifteen-All";
                case THIRTY:
                    return "Thirty-All";

                case FORTY:
                    return "Forty-All";
                default:
                    return "Deuce";
            }
        }

        public static String getFinishPoint(String player1Name, String player2Name, int player1Point, int player2Point) {
            int minusResult = player1Point - player2Point;
            if (minusResult == 1) {
                return "Advantage " + player1Name;
            } else if (minusResult == -1) {
                return "Advantage " + player2Name;
            } else if (minusResult >= 2) {
                return "Win for " + player1Name;
            } else {
                return "Win for " + player2Name;
            }
        }

        public static String unequalPoint(int player1Point, int player2Point) {
            int tempPoint;
            StringBuilder point = new StringBuilder();
            for (int i = 1; i < 3; i++) {
                if (i == 1) tempPoint = player1Point;
                else {
                    point.append("-");
                    tempPoint = player2Point;
                }
                switch (tempPoint) {
                    case LOVE:
                        point.append("Love");
                        break;
                    case FIFTEEN:
                        point.append("Fifteen");
                        break;
                    case THIRTY:
                        point.append("Thirty");
                        break;
                    case FORTY:
                        point.append("Forty");
                        break;
                }
            }
            return point.toString();
        }

        public static String getScore(String player1Name, String player2Name, int player1Point, int player2Point) {
            String point;
            boolean isDeuce = player1Point == player2Point;
            if (isDeuce) {
                point = getDeucePoint(player1Point);
            } else if (player1Point > FORTY || player2Point > FORTY) {
                point = getFinishPoint(player1Name, player2Name, player1Point, player2Point);
            } else {
                point = unequalPoint(player1Point, player2Point);
            }
            return point;
        }




}
