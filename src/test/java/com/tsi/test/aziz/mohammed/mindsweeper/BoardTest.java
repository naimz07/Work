package com.tsi.test.aziz.mohammed.mindsweeper;

import com.tsi.training.aziz.mohammed.minesweeper.Board;
import com.tsi.training.aziz.mohammed.minesweeper.Position;
import org.junit.jupiter.api.Test;

import static org.junit.jupiter.api.Assertions.assertEquals;

public class BoardTest {


    @Test
    public void testPrintStatus(){
        Board testBoard = new Board();
        testBoard.printBoard();
        System.out.println("testPrintStatus has passed");
    }


}
