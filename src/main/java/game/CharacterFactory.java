package game;
import lotr.*;
import lotr.Character;
import java.util.Random;
import java.util.Set;
import lombok.SneakyThrows;
import org.reflections.Reflections;
import static org.reflections.scanners.Scanners.SubTypes;

public class CharacterFactory {
    @SneakyThrows
    static Character createCharacter(){

        Reflections reflections = new Reflections("lotr");
        Set<Class<?>> subTypes = reflections.get(SubTypes.of(Character.class).asClass());

        subTypes.remove(Noble.class);
        return (Character) subTypes.toArray(new Class[0])[new Random().nextInt(subTypes.size())].
                getDeclaredConstructor().newInstance();}

    public static void main(String[] args) {
        lotr.Character character1 = CharacterFactory.createCharacter();
        System.out.println(character1);
    }
}
