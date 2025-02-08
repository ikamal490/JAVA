package Hacker_Rank_Questions;
/*
Sample Input:
Generic Sports
Each team has n players in Generic Sports
Soccer Class
Each team has 11 players in Soccer Class
 */
public class Question03 {


    static class Sports {
        String getName() { // method
            return "Generic Sports";
        }

        void getNumberOfTeamMembers() { // 2nd method
            System.out.println("Each team has n players in " + getName());
        }
    }

    static class Soccer extends Sports {
        @Override
        String getName() {
            return "Soccer Class";
        }

        void getNumberOfTeamMembers() {
            System.out.println("Each team has 11 players in " + getName());
        }
    }


        public static void main(String[] args) {
            /* Enter your code here. Read input from STDIN. Print output to STDOUT. Your class should be named Solution. */
            Sports so = new Sports();
            System.out.println(so.getName());
            so.getNumberOfTeamMembers();
            Soccer soc = new Soccer();
            System.out.println(soc.getName());
            soc.getNumberOfTeamMembers();

        }
    }


