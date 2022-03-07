class StandardPoint(private val value: Int = 0) : Rule {
    override fun calculate(values: List<Rule>, currentIndex: Int) = rawValue()
    override fun rawValue() = value
    override fun frameSpan() = 0.5
}

class Miss : Rule {
    override fun calculate(values: List<Rule>, currentIndex: Int) = rawValue()
    override fun rawValue() = 0
    override fun frameSpan() = 0.5
}

class Spare : Rule{
    override fun calculate(values: List<Rule>, currentIndex: Int): Int {
        return 10 - values[currentIndex - 1].rawValue() + values[currentIndex + 1].rawValue()
    }

    override fun rawValue() = 10
    override fun frameSpan() = 0.5
}

class Strike : Rule{
    override fun calculate(values: List<Rule>, currentIndex: Int): Int {
        if(values.size == currentIndex)
            return 10

        return 10 + values[currentIndex + 1].rawValue() + values[currentIndex + 2].rawValue()
    }

    override fun rawValue()= 10
    override fun frameSpan() = 1.0
}
