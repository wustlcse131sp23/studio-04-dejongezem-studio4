package studio4;

import java.awt.Color;
import java.io.File;
import java.util.Scanner;

import javax.swing.JFileChooser;

import edu.princeton.cs.introcs.StdDraw;

public class Flag {
	public static void main(String[] args) {
		
		Color c = new Color(255, 247, 90);
		StdDraw.setPenColor(c);
		StdDraw.filledRectangle(0.5, 0.5, 0.5, 0.3);
		
		c = new Color(20, 120, 200);
		StdDraw.setPenColor(c);
		double[] x = {0.5, 0.25, 0.25};
		double[] y = {0.5, 0.4, 0.6};
		StdDraw.filledPolygon(x, y);
		
		c = new Color(180, 9, 140);
		StdDraw.setPenColor(c);
		double[] x2 = {0.5, 0.75, 0.75};
		double[] y2 = {0.5, 0.4, 0.6};
		StdDraw.filledPolygon(x2, y2);
	}
}