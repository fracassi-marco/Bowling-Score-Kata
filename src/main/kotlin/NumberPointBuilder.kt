class NumberPointBuilder : PointBuilder {
    override fun canApply(value: String) = true
    override fun build(value: String) = StandardPoint(value.toInt())
}
