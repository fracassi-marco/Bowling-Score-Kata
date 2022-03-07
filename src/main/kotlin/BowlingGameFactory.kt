class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator(SimpleFrameCounter(), listOf(
            MissBuilder(),
            SpareBuilder(),
            StrikeBuilder(),
            PointBuilder()
        )))
    }
}

interface Rolls {
    fun add(value: String)
    fun sum(): Int
}

class Accumulator(private val frameCounter: SimpleFrameCounter, private val ruleBuilders: List<RuleBuilder>): Rolls {

    private val values = arrayListOf<Rule>()

    override fun add(value: String) {
        values.add(ruleBuilders.first { it.canApply(value) }.build(value))
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
    fun calculate(values: List<Rule>, currentIndex: Int) : Int
    fun rawValue(): Int
    fun frameSpan(): Double
}
