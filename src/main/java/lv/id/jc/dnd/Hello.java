package lv.id.jc.dnd;

public class Hello {
    public static void main(String[] args) {
        final var generator = new CharacterGenerator(new BalancedDice());
        final var hero = generator.createCharacter();

        System.out.println(hero);
    }
}
