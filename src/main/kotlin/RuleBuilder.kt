interface RuleBuilder {
    fun canApply(value: String) : Boolean
    fun build(value: String): Rule
}
