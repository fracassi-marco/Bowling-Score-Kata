interface PointBuilder {
    fun canApply(value: String) : Boolean
    fun build(value: String): Point
}
