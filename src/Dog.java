public class Dog extends Animal{

    private boolean beenWalked;
    private boolean happy;

    public Dog(String n, int a, boolean v, boolean s, boolean b, boolean h){
        super(n,a,v,s);
        beenWalked = b;
        happy = h;
    }

    public void walk(){
        beenWalked = true;
        System.out.println("Walkin da dog");
    }
    public void chaseSquirrel(){
        happy = true;
        System.out.println("Why did we do that");
    }

    public boolean hasBeenWalked(){
        return beenWalked;
    }
    public boolean isHappy() {
        return happy;
    }
}
