class BowlingGame(private val rolls: Rolls) {
    fun roll(value: String) {
        rolls.add(value)
    }

    fun score(): Int {
        return rolls.sum()
    }
}
