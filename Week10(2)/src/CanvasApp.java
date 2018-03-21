
import java.util.Random;

import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.Event;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * A template JavaFx canvas application
 */
public class CanvasApp extends Application {

	public void draw(GraphicsContext gc) {
		// Rosette r = new Rosette(new Point(400, 300), 250, 23);
		// r.draw(gc);
		

	}

	@Override
	public void start(Stage primaryStage) {
		primaryStage.setTitle("Drawing shapes");
		Group root = new Group();

		BorderPane pane = new BorderPane();
		Canvas canvas = new Canvas(800, 600);
		draw(canvas.getGraphicsContext2D());

		pane.setCenter(canvas);

		HBox bottomBar = new HBox();
		bottomBar.setSpacing(10);
		bottomBar.setPadding(new Insets(10, 5, 10, 5));
		bottomBar.setAlignment(Pos.CENTER_LEFT);
		ComboBox<Integer> lwCombo = new ComboBox<>();
		lwCombo.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);

		lwCombo.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				canvas.getGraphicsContext2D().setLineWidth(lwCombo.getValue());
				canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
				draw(canvas.getGraphicsContext2D());
			}
		});

		ColorPicker strokePicker = new ColorPicker();

		strokePicker.setOnAction(new EventHandler<ActionEvent>() {

			public void handle(ActionEvent event) {
				canvas.getGraphicsContext2D().setStroke(strokePicker.getValue());
				canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
				draw(canvas.getGraphicsContext2D());
			}
		});

		ColorPicker fillPicker = new ColorPicker();
		fillPicker.setOnAction(new EventHandler<ActionEvent>() {

			@Override
			public void handle(ActionEvent event) {
				canvas.getGraphicsContext2D().setFill(fillPicker.getValue());
				canvas.getGraphicsContext2D().clearRect(0, 0, canvas.getWidth(), canvas.getHeight());
				draw(canvas.getGraphicsContext2D());
			}
		});
		bottomBar.getChildren().addAll(new Text("Line width: "), lwCombo, new Text("Stroke color: "), strokePicker,
				new Text("Fill color: "), fillPicker);
		
		canvas.setOnMousePressed(new EventHandler<MouseEvent>() {

			@Override
			public void handle(MouseEvent event) {
				Random gen = new Random();
				
				 Rosette r = new Rosette(new Point(event.getSceneX(), event.getSceneY()), 50 + gen.nextInt(200), 5 + gen.nextInt(20));
				 r.draw(canvas.getGraphicsContext2D());
				
			}
		});

		pane.setBottom(bottomBar);
		root.getChildren().add(pane);
		primaryStage.setScene(new Scene(root));
		primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
