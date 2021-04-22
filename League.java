
public class League {
        private Team[] league;
        
        public League() {
            league = new Team[32];
            league[0] = new Team(0, "49ers", 6, 25.7, 2, 5, 13, -10, 12);
            league[1] = new Team(1, "Bears", 8, 26.2, 3, 4, 12, 22, 4);
            league[2] = new Team(2, "Bengals", 4, 25.7, 1, -11, 14, -129, 6);
            league[3] = new Team(3, "Bills", 13, 26.3, 1, 8, 11, 60, 2);
            league[4] = new Team(4, "Broncos", 5, 25.7, 1, -2, 18, -25, 7);
            league[5] = new Team(5, "Browns", 11, 25.4, 2, 4, 16, 36, 6);
            league[6] = new Team(6, "Bucs", 11, 25.4, 5, 7, 25, 40, 3);
            league[7] = new Team(7, "Cardinals", 8, 26.4, 2, 1, 26, 5, 1);
            league[8] = new Team(8, "Chargers", 7, 25.8, 2, -2, 12, -23, 2);
            league[9] = new Team(9, "Chiefs", 14, 25.9, 6, 12, 24, 52, 1);
            league[10] = new Team(10, "Colts", 11, 25.6, 2, 3, 15, 21, 5);
            league[11] = new Team(11, "Cowboys", 6, 26.3, 4, -11, 16, -39, 7);
            league[12] = new Team(12, "Dolphins", 10, 25.2, 1, -1, 15, -16, 4);
            league[13] = new Team(13, "Eagles", 4, 26.6, 0, -12, 13, -44, 10);
            league[14] = new Team(14, "Falcons", 4, 26.5, 2, -8, 14, -42, 5);
            league[15] = new Team(15, "Giants", 6, 26, 3, -12, 20, -54, 5);
            league[16] = new Team(16, "Jaguars", 1, 25.6, 0, -11, 22, -93, 8);
            league[17] = new Team(17, "Jets", 2, 26.5, 0, -6, 16, -91, 5);
            league[18] = new Team(18, "Lions", 5, 26.2, 1, 3, 17, -28, 5);
            league[19] = new Team(19, "Packers", 13, 25.5, 2, 9, 13, 64, 3);
            league[20] = new Team(20, "Panthers", 5, 26.3, 2, 0, 17, -29, 9);
            league[21] = new Team(21, "Patriots", 7, 27, 2, 1, 17, -13, 8);
            league[22] = new Team(22, "Raiders", 8, 25.6, 2, 2, 10, 5, 6);
            league[23] = new Team(23, "Rams", 10, 25.6, 4, 6, 18, 45, 3);
            league[24] = new Team(24, "Ravens", 11, 25.9, 12, 6, 19, 105, 2);
            league[25] = new Team(25, "Redskins", 7, 26.1, 2, -7, 12, -38, 5);
            league[26] = new Team(26, "Saints", 12, 26.2, 7, 8, 21, 39, 5);
            league[27] = new Team(27, "Seahawks", 12, 25.5, 5, 6, 14, 21, 4);
            league[28] = new Team(28, "Steelers", 12, 25.7, 6, 7, 18, 24, 3);
            league[29] = new Team(29, "Texans", 4, 26, 2, -1, 13, -13, 8);
            league[30] = new Team(30, "Titans", 11, 26.5, 3, 5, 14, 46, 4);
            league[31] = new Team(31, "Vikings", 7, 25.5, 4, 3, 15, 4, 7);
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

