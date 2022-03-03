import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Test

class BowlingGameTest {

    @Test
    fun `all rolls are miss`() {
        val game = BowlingGameFactory().create()

        repeat(20) { game.roll("-") }

        assertThat(game.score()).isEqualTo(0)
    }

    @Test
    fun `all rolls are one`() {
        val game = BowlingGameFactory().create()

        repeat(20) { game.roll("1") }

        assertThat(game.score()).isEqualTo(20)
    }
}