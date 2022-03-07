class Accumulator(private val frameCounter: SimpleFrameCounter, private val ruleBuilders: List<PointBuilder>): Rolls {

    private val values = arrayListOf<Point>()

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