import java.awt.*;
import java.awt.event.*;
import javax.swing.*;


public class BloackGame {
 
    static class MyFrame extends JFrame{
        
        //contant
        static int BALL_WIDTH=20;
        static int BALL_HEIGHT=20;
        static int BLOCK_ROWS=5;
        static int BLOCK_COLUMNS =10;
        static int BLOCK_WIDTH=40;
        static int BLOCK_HEIGHT=40;
        static int BLOCK_GAP=3;
        static int BAR_WIDTH=80;
        static int BAR_EIGHT=20;
        static int CANVAS_WIDTH =600 + (BLOCK_GAP * BLOCK_COLUMNS) - BLOCK_GAP;
        static int CANVAS_HEIGHT =600;

        //variable
        static MyPanel myPanel=null;
        static int score =0;
        static Timer time =null;
        static Block[][] blocks =new Block [BLOCK_ROWS][BLOCK_COLUMNS];

        static class Block{
            
        }

        static class MyPanel extends JPanel{

        }
        
        
        public MyFrame(String title) {
            super(title); //Jfram의 생성자 연결

        }
    }
    public static void main(String[] args) {
     
    new MyFrame("Block Game");

 }   
}
