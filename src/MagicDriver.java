import java.sql.SQLOutput;

public class MagicDriver
{
    public static void main(String[] args)
    {
        Goblin kyle = new Goblin( 100,true, 5);
        Goblin gerome = new Goblin (100, false, 0);
        Dragon erika = new Dragon(250, true, 10);
        Dragon stuntedBird = new Dragon(250, true, -5);
        Golem issac = new Golem(300, false, Golem.Elements.air);
        Golem villageDefender = new Golem(300, false, Golem.Elements.iron);

        Player kenzu = new Player(200, 100, "kenzu");

        System.out.println(stuntedBird.checkWing());
        issac.warningCry();
        System.out.println(kenzu.toString());
        kenzu.castSpell();

        // System.out.println(kenzu.toString());
        Enemies[] myEnemies = {kyle, gerome, erika, stuntedBird, issac, villageDefender};

//        for(int i = 0; i < myEnemies.length; i++)
//        {
//            System.out.println(myEnemies[i]);
//        }

    }
}//end driver
