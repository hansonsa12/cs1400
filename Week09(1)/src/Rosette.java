import javafx.scene.canvas.GraphicsContext;

public class Rosette {
	private double radius;
	private Point center;
	private int pointCount;
	
	
	
	public Rosette(double radius, Point center, int pointCount) {
		this.radius = radius;
		this.center = center;
		this.pointCount = pointCount;
	}
	
	public double getRadius() {
		return radius;
	}
	public void setRadius(double radius) {
		this.radius = radius;
	}
	public Point getCenter() {
		return center;
	}
	public void setCenter(Point center) {
		this.center = center;
	}
	public int getPointCount() {
		return pointCount;
	}
	public void setPointCount(int pointCount) {
		this.pointCount = pointCount;
	}
	
	public Point [] generatePoints() {
		double arc = 2 * Math.PI / pointCount;
		Point [] points = new Point [pointCount];
		for(int i = 0; i < points.length; i++) {
			double angle = arc * i;
			double x = center.getX() + radius * Math.cos(angle);
			double y = center.getY() + radius * Math.sin(angle);
			
			Point p = new Point (x,y);
			points[i] = p;
		}
		return points;
	}
	
	
	public void draw(GraphicsContext gc) {
		Point [] points = generatePoints();
		for(int i = 0; i < points.length; i++) {
			for(int j = i + 1; j < points.length; j++) {
				Line l = new Line(points[i], points[j]);
				l.draw(gc);
			}
			
		}
		
 }
	
}
