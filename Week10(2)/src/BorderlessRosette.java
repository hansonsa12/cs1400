

import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;

public class BorderlessRosette extends Rosette {
  public BorderlessRosette(Point center, double radius, int pointCount) {
    super(center, radius, pointCount);
  }

  @Override
  public void draw(GraphicsContext gc) {
    Point[] points = this.generatePoints();
    for(int i = 0; i < points.length; i++) {
      for(int j = i + 1; j < points.length; j++) {
        if(j - i != 1 && j - i != getPointCount() - 1) {
          Line l = new Line(points[i], points[j]);
          l.draw(gc);
        }
      }
    }
  }
}
