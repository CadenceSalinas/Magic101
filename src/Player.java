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
    public void castSpell()
    {
        if(mp>0)
        {
            System.out.println("Abracadabra alakazam!");
            mp -= 5;
        }
        else
        {
            System.out.println("You don't have enough MP!");
        }
    }
    public void loseHealth()
    {
        if(health >= 0)
        {
            System.out.println(name + " took some damage!");
            health -= 10;
        }
        else
        {
            System.out.println("You ran out of health! You died!");
        }
    }
    //toString
    @Override
    public String toString() {
        String output = "Player Name: " + name;
               output += "\nHealth: " + health +
                         "\nMagic Power: " + mp;
        return output;
    }
}//end Player
