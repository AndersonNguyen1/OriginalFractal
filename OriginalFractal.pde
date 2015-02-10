int canvasSize = 500;

void setup()
{
	background(0);
	size(canvasSize, canvasSize);
}

void draw()
{
	createCircleFractal(canvasSize/2, canvasSize/2, canvasSize, canvasSize);
}

void createCircleFractal(int x, int y, int shrinkWidth, int shrinkHeight)
{
	int r = (int)(Math.random() * 256);
	int g = (int)(Math.random() * 256);
	int b = (int)(Math.random() * 256);

	fill(r, g, b);
	ellipse(x, y, shrinkWidth, shrinkHeight);

	if(shrinkWidth > 0)
		createCircleFractal(x, y, shrinkWidth-50, shrinkHeight-50);
}