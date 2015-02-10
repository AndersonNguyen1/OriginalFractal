import processing.core.*; 
import processing.data.*; 
import processing.event.*; 
import processing.opengl.*; 

import java.util.HashMap; 
import java.util.ArrayList; 
import java.io.File; 
import java.io.BufferedReader; 
import java.io.PrintWriter; 
import java.io.InputStream; 
import java.io.OutputStream; 
import java.io.IOException; 

public class OriginalFractal extends PApplet {

int canvasSize = 500;

public void setup()
{
	background(0);
	size(canvasSize, canvasSize);
}

public void draw()
{
	createCircleFractal(canvasSize/2, canvasSize/2, canvasSize, canvasSize);
}

public void createCircleFractal(int x, int y, int shrinkWidth, int shrinkHeight)
{
	int r = (int)(Math.random() * 256);
	int g = (int)(Math.random() * 256);
	int b = (int)(Math.random() * 256);

	fill(r, g, b);
	ellipse(x, y, shrinkWidth, shrinkHeight);

	if(shrinkWidth > 0)
		createCircleFractal(x, y, shrinkWidth-50, shrinkHeight-50);
}
  static public void main(String[] passedArgs) {
    String[] appletArgs = new String[] { "OriginalFractal" };
    if (passedArgs != null) {
      PApplet.main(concat(appletArgs, passedArgs));
    } else {
      PApplet.main(appletArgs);
    }
  }
}
