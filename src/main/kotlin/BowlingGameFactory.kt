class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator(SimpleFrameCounter(), listOf(
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

class Accumulator(private val frameCounter: SimpleFrameCounter, private val rules: List<Rule>): Rolls {

    private val values = arrayListOf<Rule>()

    override fun add(value: String) {
        values.add(rules.first { it.canApply(value) }.build(value))
    }

    override fun sum(): Int {
        var sum = 0
        for (i in 0 until frameCounter.count(values)) {
            sum += values[i].calculate(values, i)
        }
        return sum
    }
}

interface Rule {
    fun canApply(value: String) : Boolean
    fun calculate(values: List<Rule>, currentIndex: Int) : Int
    fun rawValue(): Int
    fun build(value: String): Rule
    fun frameSpan(): Double
}
