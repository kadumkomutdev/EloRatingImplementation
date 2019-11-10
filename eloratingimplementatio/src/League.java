import java.util.ArrayList;
import java.util.Scanner;

public class League{
    Player p1,p2;
    private elorating e;
    static Scanner s = new Scanner(System.in);
    private ArrayList<Player> member = new ArrayList<>();
    private String name;

    public League(String name) {
        this.name = name;
    }

    //adding member to the arraylist member
    public boolean addMember(Player p){
        if(member.contains(p)){
            System.out.println(p.getName()+" already in the league");
            return false;
        }else{
            this.member.add(p);
            System.out.println(p.getName()+" added to the league");
            return true;
        }
    }

    //making match against each other
    public void matchPermutated(){
        e = new elorating();
        for(int i=0;i<this.member.size();i++){
            for(int j=0;j<this.member.size();j++){
                if(i!=j){
                    System.out.println(this.member.get(i).getName()+" Playing against "+this.member.get(j).getName());
//                    System.out.println("Enter 1 if"+this.member.get(i).getName()+" wins\n" +
//                            "Enter 2 if"+this.member.get(j).getName()+"wins");
//                    int outcome = s.nextInt();
                    //setting the player to individual reference variable for easier recognition
                    p1 = this.member.get(i);
                    p2 = this.member.get(j);
                    //increasing the player games played
                    p1.setTotalGames();
                    p2.setTotalGames();
                    int outcome  = (int)(Math.random()*2+1);
                    //if player wins
                    switch (outcome){
                        case 1:
                            System.out.println(p1.getName()+" won");
                            e.eloCalculation(p1.getRating(),p2.getRating(),32,true,p1,p2);
                            p1.setWon();
                            p2.setLost();
                            break;
                        case 2:
                            System.out.println(p2.getName()+" won");
                            e.eloCalculation(p1.getRating(),p2.getRating(),32,false,p1,p2);
                            p1.setLost();
                            p2.setWon();
                            break;
                    }//end of switch
                }//end of if
            }//end of  second for loop
        }//end of first for loop
    }

    public void showRatingList(){
        for(Player p:this.member){
            System.out.println(p.getName()+" : "+(int)p.getRating());
            System.out.println("Games played : "+p.getTotalGames());
            System.out.println("Won : "+p.getWon());
            System.out.println("Lost : "+p.getLost());
            System.out.println("--------------------------");
        }
    }

    public int totalMember(){
        return this.member.size();
    }

}
