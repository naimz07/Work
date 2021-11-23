package com.tsi.test.aziz.mohammed.mindsweeper;

import com.tsi.training.aziz.mohammed.minesweeper.Board;
import com.tsi.training.aziz.mohammed.minesweeper.Cell;
import com.tsi.training.aziz.mohammed.minesweeper.Position;
import org.junit.jupiter.api.Test;

import java.util.List;

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
        System.out.println("validPosition test complete, test Passed");
    }

    @Test
    public void testRevealCell() {
        Board testBoard = new Board(10, 10);
        Position position = new Position(9, 9);
        testBoard.revealCell(position);
        int revealedTotal = testBoard.revealedTotal;
        assertEquals(100, revealedTotal);
        System.out.println("revealCell test complete, test Passed");
    }

//    public void revealCell(Position position) {
//        if(cells[position.x][position.y].getNeighbours() != 0) {
//            revealedTotal++;
//            cells[position.x][position.y].reveal();
//        } else {
//            List<Position> revealedCells = floodFillReveal(position);
//            for(Position p : revealedCells) {
//                revealAllAroundPoint(p);
//            }
//        }
//    }

    @Test
    public void testIsCellRevealed() {
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        boolean isCellRevealed = testBoard.isCellRevealed(position);
        assertFalse(isCellRevealed, "False");
        System.out.println("isCellRevealed test complete, test Passed");
    }

    @Test
    public void testIsCellBomb(){
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        boolean isCellBomb = testBoard.isCellBomb(position);
        assertEquals(false, isCellBomb, "False");
        System.out.println("isCellBomb test complete, test Passed");

    }

    @Test
    public void testIsCellFlagged(){
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        boolean isCellFlagged = testBoard.isCellFlagged(position);
        assertEquals(false,isCellFlagged, "false");
        System.out.println("isCellFlagged test complete, test Passed");
    }

    @Test
    public void testFlagCell(){
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        testBoard.flagCell(position);
        assertEquals(position.isFlagged, testBoard.isFlagged, "is flagged");
        System.out.println("flagCell test complete, test Passed");
    }



//    public void flagCell(Position position) {
//        cells[position.x][position.y].toggleIsFlagged();
//    }
//



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




