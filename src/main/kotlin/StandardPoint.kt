class StandardPoint(private val value: Int = 0) : Rule {
    override fun canApply(value: String) = true

    override fun calculate(values: List<Rule>, currentIndex: Int) = rawValue()

    override fun rawValue() = value

    override fun build(value: String) = StandardPoint(value.toInt())
}

class Miss : Rule {
    override fun canApply(value: String) = value == "-"
    override fun calculate(values: List<Rule>, currentIndex: Int) = rawValue()
    override fun rawValue() = 0
    override fun build(value: String) = Miss()
}

class Spare : Rule{
    override fun canApply(value: String) = value == "/"

    override fun calculate(values: List<Rule>, currentIndex: Int): Int {
        return 10 - values[currentIndex - 1].rawValue() + values[currentIndex + 1].rawValue()
    }

    override fun rawValue() = 10

    override fun build(value: String) = Spare()
}
