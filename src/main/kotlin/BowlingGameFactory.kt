class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator(listOf(
            Miss(),
            Spare(),
            StandardPoint()
        )))
    }
}

interface Rolls {
    fun add(value: String)
    fun sum(): Int
}

class Accumulator(private val rules: List<Rule>): Rolls {

    private val values = arrayListOf<String>()

    override fun add(value: String) {
        values.add(value)
    }

    override fun sum(): Int {
        var sum = 0
        for (i in 0 until 20) {
            sum += rules.first { it.canApply(values[i]) }.calculate(values, i)
        }
        return sum
    }
}

interface Rule {
    fun canApply(value: String) : Boolean
    fun calculate(values: List<String>, currentIndex: Int) : Int
}
