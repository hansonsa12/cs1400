

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rosette {
  private Point center;
  private double radius;
  private int pointCount;
  
  public Rosette(Point center, double radius, int pointCount) {
	  if(radius < 0 || pointCount < 0) {
		  throw new RuntimeException ("radius or pointCount is negative");
	  }
    this.center = center;
    this.radius = radius;
    this.pointCount = pointCount;
  }
  
  public Point getCenter() {
    return center;
  }

  public void setCenter(Point center) {
    this.center = center;
  }

  public double getRadius() {
    return radius;
  }

  public void setRadius(double radius) {
    this.radius = radius;
  }

  public int getPointCount() {
    return pointCount;
  }

  public void setPointCount(int pointCount) {
    this.pointCount = pointCount;
  }

  public Point[] generatePoints() {
    Point[] points = new Point[pointCount];
    double arc = Math.PI * 2 / pointCount;
    for(int i = 0; i < pointCount; i++) {
      points[i] = new Point(center.getX() + radius * Math.cos(i * arc), 
          center.getY() + radius * Math.sin(i * arc));
    }
    
    return points;
  }
  
  public void draw(GraphicsContext gc) {
    Point[] points = this.generatePoints();
    for(int i = 0; i < points.length; i++) {
      for(int j = i + 1; j < points.length; j++) {
        Line l = new Line(points[i], points[j]);
        l.draw(gc);
      }
    }
  }
}
