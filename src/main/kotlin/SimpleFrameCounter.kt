class SimpleFrameCounter : FrameCounter {
    override fun count(rolls: List<Point>): Int {
        var sum = 0.0
        return rolls.takeWhile {
            sum += it.frameSpan()
            sum <= 10.0
        }.count()
    }
}

interface FrameCounter {
    fun count(rolls: List<Point>): Int
}
