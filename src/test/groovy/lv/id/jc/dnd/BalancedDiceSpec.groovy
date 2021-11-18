package lv.id.jc.dnd

import spock.lang.Specification

class BalancedDiceSpec extends Specification {
    def "Roll"() {
        given:
        def dice = new BalancedDice()

        expect:
        dice.roll() in 1..6
    }

}
