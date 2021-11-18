package lv.id.jc.dnd;

public class CharacterGenerator {
    private final Dice dice;

    public CharacterGenerator(final Dice dice) {
        this.dice = dice;
    }

    private int generateProperty() {
        return dice.rolls()
                .limit(4)
                .sorted()
                .skip(1)
                .sum();
    }

    private int getModifier(final int number) {
        return number / 2 - 5;
    }

    public DndCharacter createCharacter() {
        final var strength = generateProperty();
        final var dexterity = generateProperty();
        final var constitution = generateProperty();
        final var intelligence = generateProperty();
        final var wisdom = generateProperty();
        final var charisma = generateProperty();
        final var hitPoints = 10 + getModifier(constitution);

        return new DndCharacter(strength, dexterity, constitution, intelligence, wisdom, charisma, hitPoints);
    }
}
