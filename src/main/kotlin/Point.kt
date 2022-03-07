interface Point {
    fun calculate(values: List<Point>, currentIndex: Int) : Int
    fun rawValue(): Int
    fun frameSpan(): Double
}