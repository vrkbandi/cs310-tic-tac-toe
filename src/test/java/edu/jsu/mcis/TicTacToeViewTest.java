package edu.jsu.mcis;

import org.junit.*;
import static org.junit.Assert.*;
import java.util.Scanner;
import java.io.*;

public class TicTacToeViewTest {
	
    private TicTacToeModel model;
    private TicTacToeView view;
    private ByteArrayOutputStream output;

    @Before
    public void setup() {
        
        model = new TicTacToeModel(3);
        view = new TicTacToeView(model);
        output = new ByteArrayOutputStream();
        System.setOut(new PrintStream(output));
        
    }
	
    @After
    public void cleanup() {
        
        System.setOut(null);
        
    }
	
    @Test
    public void testViewOfBlankGrid() {
        
        view.viewModel();
        String s = "\n  012\n\n0 ---\n1 ---\n2 ---\n\n\n\n";
        assertEquals(s.length(), output.size());
        
    }
	
}