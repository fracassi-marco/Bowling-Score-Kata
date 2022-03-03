class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator())
    }
}

interface Rolls {
    fun add(value: String)
    fun sum(): Int
}

class Accumulator: Rolls {

    private var sum = 0

    override fun add(value: String) {
        try {
            sum += value.toInt()
        } catch (_: NumberFormatException) {
        }
    }

    override fun sum() = sum
}
