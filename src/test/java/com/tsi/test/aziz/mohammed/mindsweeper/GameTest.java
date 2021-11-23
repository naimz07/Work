package com.tsi.test.aziz.mohammed.mindsweeper;

import com.tsi.training.aziz.mohammed.minesweeper.Board;
import com.tsi.training.aziz.mohammed.minesweeper.Game;
import com.tsi.training.aziz.mohammed.minesweeper.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class GameTest {

    @Test
    public void testIsPositionInputValid() {
        Game testGame = new Game();
        Position position = new Position(11, 9);
        boolean isValidPosition = testGame.isPositionInputValid(position);
        Position position2 = new Position(5, 9);
        boolean isValidPosition2 = testGame.isPositionInputValid(position2);
        //boolean cellRevealed = position.isCellRevealed(position);

        assertEquals(false, isValidPosition, "False");
        assertEquals(true, isValidPosition2, "True");
        //assertEquals(false, cellRevealed, "already revealed");
        System.out.println("isPositionInputValid test complete, test Passed");
    }



}
