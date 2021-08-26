public class MagicDriver
{
    private static int enemyCount;
    private static int playerCount;
    public static void main(String[] args)
    {
        //Enemies
        Goblin kyle = new Goblin( 100,true, 5);
        Goblin gerome = new Goblin (100, false, 0);
        Dragon erika = new Dragon(250, true, 10);
        Dragon stuntedBird = new Dragon(250, true, -5);
        Golem issac = new Golem(300, false, Golem.Elements.air);
        Golem villageDefender = new Golem(300, false, Golem.Elements.iron);

        //Player/sorcerer
        Player kenzu = new Player(200, 100, "kenzu");
        Player mario = new Player(1000, 500, "DMMC");

        System.out.println(kenzu.toString()+"\n");
        System.out.println(mario.toString());
        Enemies[] myEnemies = {kyle, gerome, erika, stuntedBird, issac, villageDefender};

        for(int i = 0; i < myEnemies.length; i++)
        {
            System.out.println(myEnemies[i]);
            enemyCount++;
        }
        System.out.println("The enemy count is " + enemyCount);
        System.out.println("The player count is " + playerCount);

    }
}//end driver
