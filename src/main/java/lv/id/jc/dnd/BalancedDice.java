package lv.id.jc.dnd;

import java.util.random.RandomGenerator;
import java.util.stream.IntStream;

public class BalancedDice implements Dice {
    private static final RandomGenerator randomGenerator = RandomGenerator.of("L128X1024MixRandom");
    private final int sides;

    public BalancedDice() {
        this(6);
    }

    public BalancedDice(final int sides) {
        this.sides = sides;
    }

    @Override
    public int roll() {
        return 1 + randomGenerator.nextInt(sides);
    }

    @Override
    public IntStream rolls() {
        return randomGenerator.ints(1, sides + 1);
    }
}
