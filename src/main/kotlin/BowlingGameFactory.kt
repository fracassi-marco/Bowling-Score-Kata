class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator(SimpleFrameCounter(), listOf(
            MissBuilder(),
            SpareBuilder(),
            StrikeBuilder(),
            NumberPointBuilder()
        )))
    }
}

