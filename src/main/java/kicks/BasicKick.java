package kicks;

import java.util.Random;
import lotr.Character;

public interface BasicKick {
    Random random = new Random();
    void kick(Character character1, Character character2);
}
