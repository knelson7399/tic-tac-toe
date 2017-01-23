package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;

public class TicTacToeTest {
    
    TicTacToeKeywords keywords = new TicTacToeKeywords();
    TicTacToeModel grid = new TicTacToeModel();
    
    @Test
	public void testInitialBoardIsEmpty() 
        {
            grid.setNewBoard();
        }
	
	@Test
	public void testMarkXInUpperRightCorner() 
        {
            Main.xTurn = true;
            keywords.setMark(0,2);
            String newMark = keywords.getMark(0,2);
        }
	
	@Test
	public void testMarkOInBottomLeftCorner() 
        { 
           
            Main.xTurn = false;
            keywords.setMark(2,0);
            String newMark = keywords.getMark(0,2);
            
	}
	
	@Test
	public void testUnableToMarkOverExistingMark() 
        {
            TicTacToeKeywords grid = new TicTacToeKeywords();
            grid.setMark(2,0);
            String oldMark = grid.getMark(2,0);
            grid.setMark(2, 0);
            String newMark = grid.getMark(2,0);
            
	}
	
	@Test
	public void testGameIsNotOverAfterTheFirstMark() 
        {
            TicTacToeKeywords keywords = new TicTacToeKeywords();
            keywords.startNewGame();
            keywords.setMark(0,0);
            if (Main.gameOver == false )
            {
                System.out.println("we're good!");
            }
	}
	
        @Test
        public void testToStringWorksCorrectly() 
        {
            TicTacToeModel grid = new TicTacToeModel();
            if (grid.board[0][0] instanceof String)
            {
                System.out.println("We're golden");
            }
        }
    
	@Test
	public void testGameIsWonByXHorizontallyAcrossTopRow() {
            TicTacToeModel grid = new TicTacToeModel();
            TicTacToeKeywords keywords = new TicTacToeKeywords();
            Main.xTurn = true;
            String winner;
            
            grid.setMark(0, 0);
            winner = keywords.getWinner();
            if (winner == "X")
            {
               System.out.println("We are GOLDEN");
            }
            grid.setMark(0, 2);
            winner = keywords.getWinner();
            if (winner == "X")
            {
               System.out.println("We are GOLDEN");
            }
            grid.setMark(1, 0);
            winner = keywords.getWinner();
            if (winner == "X")
            {
               System.out.println("We are GOLDEN");
            }
            grid.setMark(0, 1);
            winner = keywords.getWinner();
            if (winner == "X")
            {
               System.out.println("We are GOLDEN");
            }
            grid.setMark(2, 0);
            winner = keywords.getWinner();
            if (winner == "X")
            {
               System.out.println("We are GOLDEN");
            }
            
	}
	
	@Test
	public void testGameIsOverByTieIfAllLocationsAreFilled() 
        {
            Main.xTurn = true;
            TicTacToeModel grid = new TicTacToeModel();
            TicTacToeKeywords keywords = new TicTacToeKeywords();
            String winner;
                        
            grid.setMark(0,0);//x
            winner = keywords.getWinner();
            grid.setMark(0,1);//o
            winner = keywords.getWinner();
            grid.setMark(2,0);//x
            winner = keywords.getWinner();
            grid.setMark(1,0);//o
            winner = keywords.getWinner();
            grid.setMark(1,1);//x
            winner = keywords.getWinner();
            grid.setMark(0,2);//o
            winner = keywords.getWinner();
            grid.setMark(2,1);//x
            winner = keywords.getWinner();
            grid.setMark(2,2);//o
            winner = keywords.getWinner();
            
            if (winner == "TIE")
            {
                System.out.println("LOOK AT US");
            }
	}
    
}
