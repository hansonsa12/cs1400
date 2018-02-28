import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class Point {
	private double x;
	private double y;
	private double size;
	private Color color;
	
	public double getX (){
		return x;
	}
	
	public void setX (double x) {
		this.x = x;
	}
	public double getY() {
		return y;
	}
	
	public void setY(double y) {
		this.y = y;
	}
	public double getSize (){
		return x;
	}
	public void setSize (double size){
		this.size = size;
	}
	
	public Color getColor () {
		return color;
	}
	public void setColor(Color c) {
		this.color = c;
	}
	
	public void draw(GraphicsContext gc) {
		gc.setStroke(this.color);
		gc.setLineWidth(this.size);
		gc.strokeLine(this.x, this.y, this.x, this.y);
	}
	
	}
	

