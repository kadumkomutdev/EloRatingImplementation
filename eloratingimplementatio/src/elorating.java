public class elorating {
    private float probability(float rating1, float rating2){
        return 1.0f*1.0f/(1+1.0f*(float)(Math.pow(10,1.0f*(rating1-rating2)/400)));
    }
    public void eloCalculation(float Ra,float Rb,int k,boolean d,Player p1,Player p2){
        //calculating winning probability of player a
        float pa = probability(Rb,Ra);
        //calculating winning probability of player b
        float pb = probability(Ra,Rb);
        //case 1 if the player a wins
        if(d==true){
            Ra = Ra+k*(1-pa);
            Rb = Rb+k*(0-pb);
        }
        //case 2 if the player 2 wins
        else{
            Ra = Ra+k*(0-pa);
            Rb = Rb+k*(1-pb);
        }
        p1.setRating(Ra);
        p2.setRating(Rb);
        System.out.println("----------------------------");
    }
}
