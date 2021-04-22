
public class Team {
        private int order;
        private String name;
        private int wins;
        private double averageAge;
        private int proBowlers;
        private int turnoverDifferential;
        private int fieldGoals;
        private int pointDifferential;
        private int injuries;
        
        public Team(int o, String n, int w, double a, int p, int t, int f, int pd, int i) {
            order = o;
            name = n;
            wins = w;
            averageAge = a;
            proBowlers = p;
            turnoverDifferential = t;
            fieldGoals = f;
            pointDifferential = pd;
            injuries = i;
        }

        public int getOrder() {
            return order;
        }
        
        public int getInjuries() {
            return injuries;
        }
        
        public String getName() {
            return name;
        }
        
        public int getProBowl() {
            return proBowlers;
        }
        
        public int getTurn() {
            return turnoverDifferential;
        }
        
        public int getfieldGoals() {
            return fieldGoals;
        }
        
        public int getWins() {
            return wins;
        }
        
        public double getPoint() {
            return pointDifferential;
        }
        
        public double getAge() {
            return averageAge;
        }
        
        public void teamWin() {
            wins++;
        }
        
        public void makeProBowl() {
            proBowlers++;
        }
        
        public String toString() {
            String s;
            s = "The " + order + " team " + name + " have won " + wins + " games, have an average age of " + averageAge + " have " + proBowlers + " Pro Bowlers" + 
            ", have a turnover differential of " + turnoverDifferential + "\n" + "have made " + fieldGoals + " fieldgoals" + " have a point differential of "
            + pointDifferential + " and have " + injuries + " total injuries";
            return s;
        }
            
    }

