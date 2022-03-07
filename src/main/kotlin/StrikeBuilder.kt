class StrikeBuilder : PointBuilder {
    override fun canApply(value: String) = value == "X"
    override fun build(value: String) = Strike()
}