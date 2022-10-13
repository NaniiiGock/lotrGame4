package lotr;

import kicks.BasicKick;
import kicks.NobleKick;

public abstract class Noble extends Character {
    BasicKick kick = new NobleKick();
    public Noble(int min, int max) {
        super(Character.random.nextInt(max-min+1)+min,
                Character.random.nextInt(max-min+1)+min);

    }
    @Override
    public void kick(Character kicked) {
        kick.kick(this, kicked);
    }
}
