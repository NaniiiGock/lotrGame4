package game;

import lotr.Character;

public class GameManager {
    void fight(Character fighter1, Character fighter2) {
        while (fighter1.isAlive() &&fighter2.isAlive()) {
            System.out.println("fight is going on beween "+ fighter1+"and" + fighter2);

            fighter1.kick(fighter2);

            System.out.println("after first kick:");
            System.out.println("fighter 1:");
            fighter1.toString();

            fighter2.kick(fighter1);

            System.out.println("after second kick:");
            System.out.println("fighter 2:");
            fighter1.toString();
        }
    }
}
