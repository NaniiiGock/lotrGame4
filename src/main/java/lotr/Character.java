package lotr;
import lombok.AllArgsConstructor;
import lombok.Getter;
import lombok.Setter;

import java.util.Random;

@AllArgsConstructor
public class Character {
    public static Random random = new Random();
    @Getter @Setter
    private int power;
    @Setter
    private int hp;
    public void kick(Character defender) {}
    public int getHp(){
        return Math.max(0, this.hp);
    }
    public boolean isAlive() {
        return (getHp() >0);
    }
    @Override
    public String toString() {
        return this.getClass().getSimpleName() +"{"+"hp="+
                this.hp+", power="+this.power+'}';
    }
}
