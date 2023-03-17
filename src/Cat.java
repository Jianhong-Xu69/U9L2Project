public class Cat extends Animal{

    private boolean playedWith;
    private boolean mischievous;

    public Cat (String n, int a, boolean v, boolean s, boolean p, boolean m){
        super(n,a,v,s);
        playedWith = p;
        mischievous = m;
    }

    public void play(){
        playedWith = true;
        int temp = (int) (Math.random()*10);
        if (temp == 1){
            System.out.println("ニャンニャン　招き猫りんりん\n鈴を鳴らして　happy!");
        } else {
            System.out.println("Meow! That was fun!");
        }
    }
    public void doSomeWackyStuff(){
        mischievous = false;
        System.out.println("Knocked something over");
    }

    public boolean hasPlayedWith(){
        return playedWith;
    }

    public boolean isMischievous() {
        return mischievous;
    }
}
