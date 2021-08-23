public class Player
{
    //variables
    private int health;
    private int mp;
    private String name;
    //constructors
    public Player(int health, int mp, String name)
    {
        this.health = health;
        this.mp = mp;
        this.name = name;
    }
    //getters and setters

    public int getHealth() {
        return health;
    }

    public int getMp() {
        return mp;
    }

    public String getName() {
        return name;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setMp(int mp) {
        this.mp = mp;
    }

    public void setName(String name) {
        this.name = name;
    }
    //brain methods

    //toString

    @Override
    public String toString() {
        return "Player{" +
                "health=" + health +
                ", mp=" + mp +
                ", name='" + name + '\'' +
                '}';
    }
}//end Player
