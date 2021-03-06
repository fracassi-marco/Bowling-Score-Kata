class StandardPoint(private val value: Int = 0) : Point {
    override fun calculate(values: List<Point>, currentIndex: Int) = rawValue()
    override fun rawValue() = value
    override fun frameSpan() = 0.5
}