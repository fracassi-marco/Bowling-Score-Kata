class MissBuilder : PointBuilder {
    override fun canApply(value: String) = value == "-"
    override fun build(value: String) = Miss()
}