

import java.util.ArrayList;
import java.util.Arrays;
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class DrawPoints extends Application {
  public void draw(GraphicsContext gc) {
    Random gen = new Random();
    Point[] points = new Point[500], y = new Point[500];

    for(int i = 0; i < 500; i++) {
    	Point p = new Point();
    	p.x= gen.nextInt(600);
    	p.y= gen.nextInt(600);
    	points[i] = p;
    }
    
    for(Point p : points) {
    Color c = new Color(gen.nextDouble(), gen.nextDouble(), gen.nextDouble(), 1);
      gc.setStroke(c);
      gc.setLineWidth(4);
      gc.strokeLine(p.x, p.y, p.x, p.y);
    }
  }
  
	@Override
	public void start(Stage primaryStage) {
	  primaryStage.setTitle("Randomly located triangles");
	  Group root = new Group();
	  
	  Canvas canvas = new Canvas(600, 600);
	  draw(canvas.getGraphicsContext2D());
	  root.getChildren().add(canvas);
	  primaryStage.setScene(new Scene(root));
	  primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
