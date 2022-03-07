class StandardPoint : Rule {
    override fun accumulate(values: List<String>): Int {
        try {
            return values.last().toInt()
        } catch (_: java.lang.NumberFormatException) {
            return 0
        }
    }
}
