package week06;

import java.util.Random;

import javafx.application.Application;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.stage.Stage;

/*
 * A template JavaFx canvas application
 */
public class CanvasApp extends Application {

  public void draw(GraphicsContext gc) {
    // Your code goes here
	  double[] x = new double [500];
	  double[] y = new double [500];
	  Random gen = new Random();
	  for(int i = 0; i <500; i++) {
		  x[i] = gen.nextInt(600);
		  y[i] = gen.nextInt(600);
	  }
	  gc.setLineWidth(4);
	  for(int i = 0; i <500; i++) {
		  gc.strokeLine(x[i], y[i], x[i], y[i]);
	  }
	  
  }
  
	@Override
	public void start(Stage primaryStage) {
	  primaryStage.setTitle("Randomly located points");
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
