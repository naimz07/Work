package com.tsi.test.aziz.mohammed.mindsweeper;

import com.tsi.training.aziz.mohammed.minesweeper.Board;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

class BoardTest {

    @Test
    void testPrintBoard(){
        Board testBoard = new Board();
        testBoard.printBoard();
        System.out.println("testPrintBoard has passed");
    }

    @Test
    void testPrintStatus(){
        Board testBoard = new Board();
        testBoard.printBoard();
        System.out.println("testPrintStatus has passed");
    }

//    @Test
//    void testRevealAll(){
//        Board testBoard = new Board();
//        testBoard.revealAll();
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
