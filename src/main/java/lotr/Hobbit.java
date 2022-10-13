package lotr;

import kicks.BasicKick;
import kicks.HobbitKick;

public class Hobbit extends Character{
    BasicKick kick = new HobbitKick();
    public Hobbit() {
        super(0,3);
    }
    @Override
    public void kick(Character whokick) {
        kick.kick(this, whokick);
        toCry();
    }
    public void toCry() {
        System.out.println("cryyy");
    }
}
