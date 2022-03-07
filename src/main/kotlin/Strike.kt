class Strike : Point {
    override fun calculate(values: List<Point>, currentIndex: Int): Int {
        if(values.size == currentIndex)
            return 10

        return 10 + values[currentIndex + 1].rawValue() + values[currentIndex + 2].rawValue()
    }

    override fun rawValue()= 10
    override fun frameSpan() = 1.0
}