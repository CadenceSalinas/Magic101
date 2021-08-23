public class Golem extends Enemies
{
    enum Elements
    {
        iron,
        stone,
        air,
    }
    private Elements element;
    //constructor
    public Golem(int health, boolean hasClaws, Elements element)
    {
        super(health, hasClaws);
        this.element = element;
    }
    //getters and setters

    public Elements getElement()
    {
        return element;
    }

    public void setElement(Elements element)
    {
        this.element = element;
    }
    //brain methods

    //toString

    @Override
    public String toString()
    {
        String output = super.toString();
               output += "\nThis Golem is a(n) " + element + " golem.\n";
        return output;
    }
}//end Golem
