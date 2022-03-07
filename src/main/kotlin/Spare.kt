class Spare : Point {
    override fun calculate(values: List<Point>, currentIndex: Int): Int {
        return 10 - values[currentIndex - 1].rawValue() + values[currentIndex + 1].rawValue()
    }

    override fun rawValue() = 10
    override fun frameSpan() = 0.5
}