class Accumulator(private val frameCounter: FrameCounter, private val pointBuilders: List<PointBuilder>): Rolls {

    private val points = mutableListOf<Point>()

    override fun add(value: String) {
        points.add(pointBuilders.first { it.canApply(value) }.build(value))
    }

    override fun sum(): Int {
        var sum = 0
        for (i in 0 until frameCounter.count(points)) {
            sum += points[i].calculate(points, i)
        }
        return sum
    }
}