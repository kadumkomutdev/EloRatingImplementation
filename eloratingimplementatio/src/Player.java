public class Player {
    private String name;
    private float rating = 1500;
    private int totalGames = 0;
    private int lost = 0;
    private int won = 0;

    //constructors
    public Player(String name) {
        this.name = name;
    }

    //getters
    public int getTotalGames() {
        return totalGames;
    }

    public int getLost() {
        return lost;
    }

    public int getWon() {
        return won;
    }

    public String getName() {
        return name;
    }

    public float getRating() {
        return rating;
    }

    //setters
    public void setLost() {
        this.lost++;
    }

    public void setWon() {
        this.won++;
    }

    public void setRating(float rating) {
        this.rating = rating;
    }

    public void setTotalGames() {
        this.totalGames++;
    }


}
