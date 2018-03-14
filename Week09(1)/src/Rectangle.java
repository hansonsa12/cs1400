import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Rectangle {
	private Point p;
	private double width;
	private double height;
	
	public Rectangle(Point p, double width, double height) {
		this.p = p;
		this.width = width;
		this.height = height;
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
	
	public void stroke(GraphicsContext gc, double w, Color c) {
		gc.setStroke(c);
		gc.setLineWidth();
	}
	

}
