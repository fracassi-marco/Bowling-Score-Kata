import org.assertj.core.api.Assertions.assertThat
import org.junit.jupiter.api.Disabled
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

    @Test
    fun `rolls are half nine and half miss`() {
        val game = BowlingGameFactory().create()

        repeat(10) { game.roll("9"); game.roll("-") }

        assertThat(game.score()).isEqualTo(90)
    }

    @Test
    fun `manage spares`() {
        val game = BowlingGameFactory().create()

        repeat(10) { game.roll("5"); game.roll("/") }
        game.roll("5")

        assertThat(game.score()).isEqualTo(150)
    }

    @Test
    fun `all strikes`() {
        val game = BowlingGameFactory().create()

        repeat(12) { game.roll("X") }

        assertThat(game.score()).isEqualTo(300)
    }
}