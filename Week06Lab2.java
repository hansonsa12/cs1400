
import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

/*
 * A template JavaFx canvas application
 */
public class Week06Lab2 extends Application {

  public void draw(GraphicsContext gc) {
    // Your code goes here
	  final int POINT_COUNT = 500;
	  double[] x = new double [POINT_COUNT];
	  double[] y = new double [POINT_COUNT];
	  
	  Random gen = new Random();
	  for(int i = 0; i <POINT_COUNT; i++) {
		  x[i] = gen.nextInt(400);
		  y[i] = gen.nextInt(600);
	  }
	  
	  gc.setLineWidth(4);
	  for(int i = 0; i <POINT_COUNT; i++) {
		  Color c = new Color(gen.nextDouble(), gen.nextDouble(), gen.nextDouble(), 1.0);
		  gc.setStroke(c);
		  gc.strokeLine(x[i], y[i], x[i], y[i]);
	  }
	  
  }
  
	@Override
	public void start(Stage primaryStage) {
	  primaryStage.setTitle("Randomly located points");
	  Group root = new Group();
	  
	  Canvas canvas = new Canvas(400, 600);
	  draw(canvas.getGraphicsContext2D());
	  root.getChildren().add(canvas);
	  primaryStage.setScene(new Scene(root));
	  primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}