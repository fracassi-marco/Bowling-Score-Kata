class PointBuilder : RuleBuilder {
    override fun canApply(value: String) = true
    override fun build(value: String) = StandardPoint(value.toInt())
}

class MissBuilder : RuleBuilder {
    override fun canApply(value: String) = value == "-"
    override fun build(value: String) = Miss()
}

class SpareBuilder : RuleBuilder {
    override fun canApply(value: String) = value == "/"
    override fun build(value: String) = Spare()
}

class StrikeBuilder : RuleBuilder {
    override fun canApply(value: String) = value == "X"
    override fun build(value: String) = Strike()
}
