class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator(listOf(
            StandardPoint()
        )))
    }
}

interface Rolls {
    fun add(value: String)
    fun sum(): Int
}

class Accumulator(private val rules: List<Rule>): Rolls {

    private var sum = 0
    private val values = arrayListOf<String>()

    override fun add(value: String) {
        values.add(value)
        rules.forEach { sum += it.accumulate(values) }
    }

    override fun sum() = sum
}

interface Rule {
    fun accumulate(values: List<String>): Int
}
