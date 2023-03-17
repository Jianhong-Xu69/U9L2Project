public class Animal {

    private String name;
    private int age;
    private boolean vaccinated;
    private boolean sleeping;

    public Animal(String n, int a, boolean v, boolean s){
        name = n;
        age = a;
        vaccinated = v;
        sleeping = s;
    }

    public void adopt(){
        System.out.println("Thanks for adopting me :D");
    }

    public void feed(){
        System.out.println("Mmmm tasty");
    }

    public void changeSleepStatus(){
        sleeping = !sleeping;
        if (sleeping){
            System.out.println("Slep zzzzzz");
        } else {
            System.out.println("Woke up :D");
        }
    }

    public String getName() {
        return name;
    }
    public int getAge() {
        return age;
    }
    public boolean isVaccinated() {
        return vaccinated;
    }
    public boolean isSleeping() {
        return sleeping;
    }
}
