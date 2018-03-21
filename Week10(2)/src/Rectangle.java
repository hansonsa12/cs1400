
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle{
  private Point p;
  private double width;
  private double height;
  
  public Rectangle(Point point, double w, double h) {
    this.p = point;
    this.width = w;
    this.height = h;
  }
  
  public Point getP() {
    return p;
  }
  
  public void setP(Point p) {
    this.p = p;
  }

  public double getWidth() {
    return width;
  }

  public void setWidth(double width) {
    this.width = width;
  }

  public double getHeight() {
    return height;
  }

  public void setHeight(double height) {
    this.height = height;
  }

  public void fill(GraphicsContext gc, Color c) {
    gc.setFill(c);
    gc.fillRect(this.p.getX(), this.p.getY(), this.width, this.height);
  }
  
  public void fill(GraphicsContext gc) {
    gc.fillRect(this.p.getX(), this.p.getY(), this.width, this.height);
  }
  
  public void stroke(GraphicsContext gc, double w, Color c) {
    gc.setStroke(c);
    gc.setLineWidth(w);
    gc.strokeRect(this.p.getX(), this.p.getY(), this.width, this.height);
  }
  
  public void stroke(GraphicsContext gc) {
    gc.strokeRect(this.p.getX(), this.p.getY(), this.width, this.height);
  }
}
