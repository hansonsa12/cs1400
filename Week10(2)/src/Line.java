

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Line {
  private Point a, b;
  private double width;
  private Color color;

  public Line(Point a, Point b) {
    this.a = a;
    this.b = b;
  }

  public Line(Point a, Point b, double width, Color color) {
    this.a = a;
    this.b = b;
    this.width = width;
    this.color = color;
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

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public Color getColor() {
    return color;
  }

  public void setColor(Color color) {
    this.color = color;
  }

  public void draw(GraphicsContext gc) {
    gc.setStroke(color);
    gc.setLineWidth(width);
    gc.strokeLine(a.getX(), a.getY(), b.getX(), b.getY());
  }
}
