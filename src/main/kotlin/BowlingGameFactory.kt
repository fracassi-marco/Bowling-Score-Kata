class BowlingGameFactory {
    fun create() = BowlingGame(Accumulator(FrameCounter(), listOf(
            MissBuilder(),
            SpareBuilder(),
            StrikeBuilder(),
            NumberPointBuilder()
        )))
}

