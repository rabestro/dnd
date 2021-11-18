package lv.id.jc.dnd


import spock.lang.Specification
import spock.lang.Title
import spock.lang.Unroll

@Title("Create Dungeons & Dragons character")
class CharacterGeneratorSpec extends Specification {

    @Unroll("should return #expected for rolls: #rolls ")
    def 'Method generateProperty '() {
        given:
        def dice = Stub(Dice)
        dice.rolls() >> Arrays.stream(rolls as int[])

        and:
        def characterGenerator = new CharacterGenerator(dice)

        when:
        def property = characterGenerator.generateProperty()

        then:
        property == expected

        where:
        rolls        | expected
        [1, 1, 1, 1] | 3
        [1, 2, 3, 4] | 9
    }
}
