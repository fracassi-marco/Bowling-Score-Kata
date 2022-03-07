class SpareBuilder : PointBuilder {
    override fun canApply(value: String) = value == "/"
    override fun build(value: String) = Spare()
}