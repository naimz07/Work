package com.tsi.test.aziz.mohammed.mindsweeper;

import com.tsi.training.aziz.mohammed.minesweeper.Board;
import com.tsi.training.aziz.mohammed.minesweeper.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertFalse;

public class BoardTest {

    @Test
    public void testValidPosition() {
        Board testBoard = new Board(10,10);
        Position position = new Position(9, 9);
        boolean isValidPosition = testBoard.validPosition(position);
        assertEquals(true, isValidPosition, "True");
        Position position2 = new Position(11, 9);
        boolean isValidPosition2 = testBoard.validPosition(position2);
        assertEquals(false, isValidPosition2, "False");
    }

    @Test
    public void testRevealTotal() {
        Board testBoard = new Board(10, 10);
        Position position = new Position(9, 9);
        testBoard.revealCell(position);
        int revealedTotal = testBoard.revealedTotal;
        assertEquals(100, revealedTotal);
    }

    @Test
    public void testIsCellRevealed() {
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        boolean isCellRevealed = testBoard.isCellRevealed(position);
        assertFalse(isCellRevealed, "False");
        System.out.println("isCellRevealed test works");
    }

    @Test
    public void testIsCellBomb(){
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        boolean isCellBomb = testBoard.isCellBomb(position);
        assertEquals(false, isCellBomb, "False");
    }




//        @Test
//        void testPrintBoard(){
//            Board testBoard = new Board();
//            testBoard.printBoard();
//            assert();
//
//        }
//
//    @Test
//    void testPrintStatus(){
//        Board testBoard = new Board();
//        testBoard.printBoard();
//        assertEquals();
//    }
//
//    @Test
//    void testRevealCell(){
//        Board testBoard = new Board();
//        testBoard.revealCell(10);
//        System.out.println("testRevealAll has passed");
//    }
//
//
//
//    @Test
//    void testSpawnBomb(){
//        Board testBoard = new Board();
//        testBoard.spawnBombs(10);
//        assertEquals(10, 10,"testSpawnBomb has passed");
//    }
}




