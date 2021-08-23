public class Dragon extends Enemies
{
    //instance variables
    private int wingSpan;
    //constructor
    public Dragon(int health, boolean hasClaws, int wingSpan)
    {
        super(health, hasClaws);
        this.wingSpan = wingSpan;
    }
    //getters and setters

    public int getWings()
    {
        return wingSpan;
    }

    public void setWings(int wingSpan)
    {
        this.wingSpan = wingSpan;
    }
    //brain methods
    public boolean checkWing()
    {
        if(wingSpan <= 0)
        {
            return true;
        }
        else
        {
            return false;
        }
    }
    //toString

    @Override
    public String toString()
    {
        String output = super.toString();
            output += "\nThis Dragon's wingspan is " + wingSpan +
                    " feet long\n";
        return output;
    }
}//end Dragon
