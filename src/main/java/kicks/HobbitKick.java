package kicks;

import lotr.Character;

public class HobbitKick implements BasicKick {
    @Override
    public void kick(Character character1, Character character2) {
        System.out.println("Hobbit is afraid to fight");
    }
}
