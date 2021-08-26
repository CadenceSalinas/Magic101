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

        Enemies[] myEnemies = {kyle, gerome, erika, stuntedBird, issac, villageDefender};
        Player[] myPlayer = {kenzu, mario};

        System.out.println("Kyle can build?: " + kyle.canBuild() + "\n");
        System.out.println("What is Erika's wingspan?: " + erika.getWings() + "\n");
        System.out.println("What kind of golem is Issac?: " + issac.getElement() + "\n");
        kenzu.castSpell();
        System.out.println("Kenzu casts a spell! Now they have " + kenzu.getMp() + " MP!\n");
        System.out.println("Mario has " + mario.getHealth() + " HP!\n");
        kenzu.setMp(100);
        System.out.println("Now Kenzu has " + kenzu.getMp() + " MP!\n");

//        for(int i = 0; i < myEnemies.length; i++)
//        {
//            System.out.println(myEnemies[i]);
//            enemyCount++;
//        }

        for(int i = 0; i < myPlayer.length; i++)
        {
            System.out.println(myPlayer[i]);
            System.out.println();
            playerCount++;
        }

        System.out.println("The enemy count is " + enemyCount);
        System.out.println("The player count is " + playerCount);

    }
}//end driver
