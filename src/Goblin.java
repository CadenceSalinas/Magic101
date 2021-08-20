public class Goblin extends Enemies
{
    //instance variables
    private int numClaws;
    //constructor
    public Goblin (int health, boolean hasClaws, int numClaws)
    {
        super(health, hasClaws);
        this.numClaws = numClaws;
    }

    //getters and setters

    public int getNumClaws()
    {
        return numClaws;
    }

    public void setNumClaws(int numClaws)
    {
        this.numClaws = numClaws;
    }
    //brain methods
    public boolean canBuild()
    {
        if(numClaws >= 3)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //toString
    public String toString()
    {
        String output = super.toString();
               output += "\nThis Goblin has " + numClaws + " claws.\n";
        return output;
    }

}//end Goblin class
