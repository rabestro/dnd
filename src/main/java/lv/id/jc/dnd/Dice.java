package lv.id.jc.dnd;

import java.util.stream.IntStream;

public interface Dice {
    int roll();

    IntStream rolls();
}
