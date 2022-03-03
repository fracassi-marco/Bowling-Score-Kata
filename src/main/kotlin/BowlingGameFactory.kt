class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(AlwaysZero())
    }
}

interface Rolls {
    fun add(value: String)
    fun sum(): Int
}

class AlwaysZero : Rolls {
    override fun add(value: String) {
    }

    override fun sum() = 0
}
