class Miss : Point {
    override fun calculate(values: List<Point>, currentIndex: Int) = rawValue()
    override fun rawValue() = 0
    override fun frameSpan() = 0.5
}