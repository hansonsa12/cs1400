import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line {
	
	private Point a;
	private Point b;
	private Color color;
	private double width;

public Line (Point a, Point b) {
	this.a = a;
	this.b = b;
}

public Point getA() {
	return a;
}

public void setA(Point a) {
	this.a = a;
}

public Point getB() {
	return b;
}
public void setB(Point b) {
	this.b = b;
}


public void draw(GraphicsContext gc) {
	gc.setStroke(this.color);
	gc.setLineWidth(this.width);
	gc.strokeLine(a.getX(), a.getY(), b.getX(), b.getY());
}
}



