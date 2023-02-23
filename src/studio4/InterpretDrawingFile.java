package studio4;

import java.io.File;
import java.awt.Color;
import java.io.FileNotFoundException;
import java.util.Scanner;

import javax.swing.JFileChooser;
import javax.swing.SwingUtilities;

import edu.princeton.cs.introcs.StdDraw;

/**
 * @author Dennis Cosgrove (http://www.cse.wustl.edu/~cosgroved/)
 */
public class InterpretDrawingFile {

	public static void main(String[] args) throws FileNotFoundException {
		JFileChooser chooser = new JFileChooser("resources");
		chooser.showOpenDialog(null);
		File f = new File(chooser.getSelectedFile().getPath());
		Scanner in = new Scanner(f); //making Scanner with a File
		
		String shape = in.next();
		
		int r = in.nextInt();
		int g = in.nextInt();
		int b = in.nextInt();
		
		boolean filled = in.nextBoolean();
		
		Color c = new Color(r, g, b);
		StdDraw.setPenColor(c); //or use a custom color here!
		
		if (shape.equals("triangle") == false)
		{
		double par1 = in.nextDouble();
		double par2 = in.nextDouble();
		double par3 = in.nextDouble();
		double par4 = in.nextDouble();

	
			if (filled && shape.equals("rectangle"))
			{
				StdDraw.filledRectangle(par1, par2, par3, par4);
			}
			else if (!filled && shape.equals("rectangle"))
			{
				StdDraw.rectangle(par1, par2, par3, par4);
				
			}
			else if (filled && shape.equals("ellipse"))
			{
				StdDraw.filledEllipse(par1, par2, par3, par4);
			}
			else if (!filled && shape.equals("ellipse"))
			{
				StdDraw.ellipse(par1, par2, par3, par4);
			}
			
		}
		else
		{
			double x1 = in.nextDouble();
			double x2 = in.nextDouble();
			double x3 = in.nextDouble();
			double y1 = in.nextDouble();
			double y2 = in.nextDouble();
			double y3 = in.nextDouble();
			
			double[] x = {x1, x2, x3};
			double[] y = {y1, y2, y3};
			
			if (filled)
			{
				StdDraw.filledPolygon(x, y);
			}
			else 
			{
				StdDraw.polygon(x, y);
			}
		}
		
		
		 
	}
}
