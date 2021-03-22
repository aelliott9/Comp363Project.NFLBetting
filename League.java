package www;

public class League {
        private Team[] league;
        
        public League() {
            league = new Team[32];
            league[0] = new Team(0, "49ers", 10, 25.7, 2, 5, 13, 140, 7);
            league[1] = new Team(1, "Bears", 6, 26.2, 5, 4, 12, -5, 4);
            league[2] = new Team(2, "Bengals", 1, 25.7, 1, -11, 14, -129, 5);
            league[3] = new Team(3, "Bills", 9, 26.3, 0, 0, 11, 41, 1);
            league[4] = new Team(4, "Broncos", 4, 25.7, 2, -2, 18, -25, 4);
            league[5] = new Team(5, "Browns", 4, 25.4, 2, -4, 16, -36, 6);
            league[6] = new Team(6, "Bucs", 5, 25.4, 0, -7, 25, -6, 5);
            league[7] = new Team(7, "Cardinals", 3, 26.4, 1, 4, 26, -69, 1);
            league[8] = new Team(8, "Chargers", 4, 25.8, 7, -9, 12, 6, 0);
            league[9] = new Team(9, "Chiefs", 8, 25.9, 6, 5, 24, 52, 4);
            league[10] = new Team(10, "Colts", 6, 25.6, 2, -3, 15, 21, 5);
            league[11] = new Team(11, "Cowboys", 6, 26.3, 5, -1, 16, 89, 7);
            league[12] = new Team(12, "Dolphins", 3, 25.2, 1, -13, 15, -166, 4);
            league[13] = new Team(13, "Eagles", 5, 26.6, 3, -2, 13, 4, 1);
            league[14] = new Team(14, "Falcons", 3, 26.5, 2, -8, 14, -42, 5);
            league[15] = new Team(15, "Giants", 2, 26, 3, -12, 20, -86, 5);
            league[16] = new Team(16, "Jaguars", 4, 25.6, 1, -1, 22, -33, 5);
            league[17] = new Team(17, "Jets", 3, 26.5, 3, -6, 16, -91, 5);
            league[18] = new Team(18, "Lions", 3, 26.2, 1, 1, 17, -28, 5);
            league[19] = new Team(19, "Packers", 9, 25.5, 2, 9, 13, 34, 3);
            league[20] = new Team(20, "Panthers", 5, 26.3, 2, 0, 17, -29, 9);
            league[21] = new Team(21, "Patriots", 10, 27, 2, 18, 17, 179, 5);
            league[22] = new Team(22, "Raiders", 6, 25.6, 0, 4, 10, -25, 6);
            league[23] = new Team(23, "Rams", 7, 25.6, 4, -3, 18, 45, 3);
            league[24] = new Team(24, "Ravens", 10, 25.9, 3, 6, 19, 145, 0);
            league[25] = new Team(25, "Redskins", 3, 26.1, 2, -2, 12, -128, 5);
            league[26] = new Team(26, "Saints", 10, 26.2, 5, 8, 21, 39, 5);
            league[27] = new Team(27, "Seahawks", 9, 25.5, 2, 6, 14, 21, 7);
            league[28] = new Team(28, "Steelers", 7, 25.7, 6, 9, 18, -2, 3);
            league[29] = new Team(29, "Texans", 6, 26, 4, 1, 13, 13, 5);
            league[30] = new Team(30, "Titans", 5, 26.5, 3, 5, 14, 6, 4);
            league[31] = new Team(31, "Vikings", 8, 25.5, 4, 4, 15, 84, 7);
        }
        
        public Team getTeam(String a) {
            for (Team t: league) {
                if (t.getName().equals(a)) {
                    return t;
                }
            }
            return null;
        }
        public Team getTeam1(int b){
            for(Team t: league){
                if(t.getOrder() == b) {
                    return t;
                }
                
            }
            return null;
        }
        }
