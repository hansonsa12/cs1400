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
public class LabActivity02 extends Application {

	public void draw(GraphicsContext gc) {
		Point p = new Point();
		p.setX(100);
		p.setY(300);
		p.setSize(15);
		p.setColor(Color.BURLYWOOD);

		p.draw(gc);
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
