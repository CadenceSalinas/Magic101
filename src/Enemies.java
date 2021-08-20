public abstract class Enemies
{
    private int health;
    private boolean hasClaws;

    public Enemies(int health, boolean hasClaws)
    {
        this.health = health;
        this.hasClaws = hasClaws;
    }

    public int getHealth() {
        return health;
    }

    public void setHealth(int health) {
        this.health = health;
    }

    public void setHasClaws(boolean hasClaws) {
        this.hasClaws = hasClaws;
    }

    @Override
    public String toString() {
        String output = "Health: " + health;
        output += "\nThis bad boy has claws? " + hasClaws;
        return output;
    }
}//end Enemies
