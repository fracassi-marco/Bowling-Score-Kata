class StandardPoint : Rule {
    override fun canApply(value: String) = true

    override fun calculate(values: List<String>, currentIndex: Int): Int {
        return values[currentIndex].toInt()
    }
}

class Miss : Rule {
    override fun canApply(value: String) = value == "-"
    override fun calculate(values: List<String>, currentIndex: Int) = 0
}

class Spare : Rule{
    override fun canApply(value: String) = value == "/"

    override fun calculate(values: List<String>, currentIndex: Int): Int {
        return 10 - StandardPoint().calculate(values, currentIndex - 1) + StandardPoint().calculate(values, currentIndex + 1)
    }
}
