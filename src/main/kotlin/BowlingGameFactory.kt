class BowlingGameFactory {
    fun create(): BowlingGame {
        return BowlingGame(Accumulator(FrameCounter(), listOf(
            MissBuilder(),
            SpareBuilder(),
            StrikeBuilder(),
            NumberPointBuilder()
        )))
    }
}

