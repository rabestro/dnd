package lv.id.jc.dnd;

public record DndCharacter(
        int strength,
        int dexterity,
        int constitution,
        int intelligence,
        int wisdom,
        int charisma,
        int hitPoints) {
};