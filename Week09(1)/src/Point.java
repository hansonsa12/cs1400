
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Point {
  private double x, y;
  private double size;
  private Color color;

  
public Point(double x, double y) {
	this.x = x;
	this.y = y;
}

  public Point(double x, double y, double size, Color color) {
	this.x = x;
	this.y = y;
	this.size = size;
	this.color = color;
}
public double getX() {
    return x;
  }

  public void setX(double x) {
    this.x = x;
  }

  public double getY() {
    return y;
  }

  public void setY(double y) {
    this.y = y;
  }

  public double getSize() {
    return size;
  }

  public void setSize(double size) {
    this.size = size;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void draw(GraphicsContext gc) {
    gc.setStroke(color);
    gc.setLineWidth(size);
    gc.strokeLine(x, y, x, y);
  }
}