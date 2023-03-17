public class Runner {
    public static void main(String[] args) {
        Animal test = new Animal("Rabbit", 8, true, false);
        test(test);
        System.out.println();
        Cat mike = new Cat("Mike Goutokuji", 72, true, false, true,true);
        test(mike);
        mike.changeSleepStatus();
        mike.play();
        mike.doSomeWackyStuff();
        System.out.println(mike.hasPlayedWith());
        System.out.println(mike.isMischievous());
        System.out.println();

        Dog doge = new Dog("Doge", 15, true, false, true, true);
        test(doge);
        doge.changeSleepStatus();
        doge.walk();
        doge.chaseSquirrel();
        System.out.println(doge.hasBeenWalked());
        System.out.println(doge.isHappy());
    }

    public static void test(Animal a){
        System.out.println(a.getName());
        System.out.println(a.getAge());
        System.out.println(a.isVaccinated());
        a.feed();
        a.changeSleepStatus();
        a.adopt();
        System.out.println(a.isSleeping());
    }
}