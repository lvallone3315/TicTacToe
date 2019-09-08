/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package tictactoe;

import javax.swing.*;
import java.awt.*;

/**
 *
 * @author Lee
 */
public class TicTacToe {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        // TODO code application logic here
        Player player1 = new Player("Player1");
        Player player2 = new Player();
        player2.setName("Player2");
        System.out.println(player1.getName());
        System.out.println(player2.getName());
        
        JFrame window = GUI.drawWindow();
        GUI.drawButtons(window);
    }
    
}

class GUI extends JFrame {
    final static int WINDOW_WIDTH = 200;  // window width in pixels
    final static int WINDOW_HEIGHT = 200; // window height in pixels
    
    public static JFrame drawWindow() {
        JFrame window = new JFrame();
        window.setTitle("Tic Tac Toe");
        window.setSize(WINDOW_WIDTH, WINDOW_HEIGHT);
        window.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        window.setVisible(true);
        return(window);
    }
    
    public static void drawButtons(JFrame window) {
        window.setLayout(new FlowLayout());
        JButton button1 = new JButton("     ");
        JButton button2 = new JButton("     ");
        JButton button3 = new JButton("     ");
        JButton button4 = new JButton("     ");
        JButton button5 = new JButton("     ");
        JButton button6 = new JButton("     ");
        JButton button7 = new JButton("     ");
        JButton button8 = new JButton("     ");
        JButton button9 = new JButton("     ");
        window.add(button1);
        window.add(button2);
        window.add(button3);
        window.add(button4);
        window.add(button5);
        window.add(button6);
        window.add(button7);
        window.add(button8);
        window.add(button9);
        window.setVisible(true);
        
    }
}

class Player {
    private String PlayerName;
    
    public Player(String name) {
        PlayerName = name;
    }
    
    public Player() {
        // don't initialize name
    }
    
    public void setName(String name) {
        PlayerName = name;
    }
    public String getName() {
        return(PlayerName);
    }
}

class Board {
    
}
