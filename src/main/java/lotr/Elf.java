package lotr;

import kicks.BasicKick;
import kicks.ElfKick;

public class Elf extends Character{
    public BasicKick kick = new ElfKick();
    public Elf() {
        super(10, 10);
    }

    @Override
    public void kick(Character whokick) {
        kick.kick(this, whokick);
    }
}
