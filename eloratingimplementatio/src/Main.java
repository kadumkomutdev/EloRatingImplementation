public class Main {
    public static void main(String[] args) {

        //creating players
        Player kadum = new Player("kadum");
        Player agam = new Player("agam");
        Player tenzing = new Player("tenzing");
        Player a = new Player("a");
        Player b = new Player("b");
        Player c = new Player("c");
        Player d = new Player("d");
        Player e = new Player("e");
        Player f = new Player("f");


//        creating a league
        League league = new League("Magnus memorial");
        //adding players to the league
        league.addMember(kadum);
        league.addMember(agam);
        league.addMember(tenzing);
        league.addMember(a);
        league.addMember(b);
        league.addMember(c);
        league.addMember(d);
        league.addMember(e);
        league.addMember(f);


        //making matches against each other
        league.matchPermutated();
        //showing the rating list after the matches are over
        league.showRatingList();

    }
}
