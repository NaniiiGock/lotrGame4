package kicks;

import lotr.Character;

public class NobleKick implements BasicKick {
    @Override
    public void kick(Character character1, Character character2) {
        character2.setHp(Math.max(0, character2.getHp()-
                random.nextInt(character1.getPower())));
    }
}
