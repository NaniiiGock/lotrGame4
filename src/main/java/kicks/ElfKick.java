package kicks;

import lotr.Character;

public class ElfKick implements BasicKick {
    @Override
    public void kick(Character character1, Character character2) {
        if (character2.getPower() < character1.getPower()) {
            character2.setHp(0);
        }
        else {
            character2.setHp(Math.max(0, character2.getHp()-1));
        }
    }
}
