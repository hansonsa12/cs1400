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
public class LabActivity03 extends Application {

	public void draw(GraphicsContext gc) {
		Random gen = new Random();
		for(int i = 0; i <100; i++) {
		Point p = new Point();
		p.setX(gen.nextInt(400));
		p.setY(gen.nextInt(600));
		p.setSize(gen.nextInt(15));
		p.setColor(new Color(gen.nextDouble(), gen.nextDouble(),gen.nextDouble(), 1));

		p.draw(gc);
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
