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
    public void printBoard() {
        Board testBoard = new Board(10, 10);
        Board.cell[][] exampleBoard = new Board.cell[10][10];
        boolean boardMatch = true;
        int height = 0;
        int width = 0;
        Object[][] cells;
        for (int y = 0; y < height; y++) {
            for (int x = 0; x < width; x++) {
                exampleBoard[x][y] = new Board.cell();
                if (exampleBoard[x][y].getClass() != testBoard.cells[x][y].getClass()) {
                    boardMatch = false;
                }
            }
        }
        // Testing if the classes of all elements match
        assertEquals(true, boardMatch, "The elements are not the same class");
        // Testing the amount of rows
        assertEquals(testBoard.cells.length, exampleBoard.length, "The arrays have a different number of rows");
        // Testing the amount of columns
        assertEquals(testBoard.cells[0].length, exampleBoard[0].length, "The arrays have a different number of columns");
    }




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
    public void testRevealAll() {
        Board testBoard = new Board(10, 10);
        testBoard.revealAll();
        boolean revealAll = testBoard.revealAll();
        assertEquals(true , revealAll,"reveal all");
        System.out.println("RevealAll test complete, test Passed");
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
        assertEquals(position.getIsFlagged(), testBoard.getIsFlagged(), "is flagged");
        System.out.println("flagCell test complete, test Passed");
    }

    @Test
    public void testAddBomb(){
        Board testBoard = new Board(10, 10);
        Position position = new Position(5, 5);
        boolean isCellBomb = testBoard.isCellBomb(position);
        assertEquals(false, isCellBomb, "false");


    }

    @Test
    public void testIsWon() {
        Board testBoard = new Board(10, 10);
        boolean isWon = testBoard.isWon();
        assertEquals(false, isWon, "true");

    }






//    public boolean isWon() {
//        return revealedTotal + bombCount == width * height;
//    }
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





