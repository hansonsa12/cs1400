
import javafx.application.Application;
import javafx.event.ActionEvent;
import javafx.event.EventHandler;
import javafx.geometry.Insets;
import javafx.geometry.Pos;
import javafx.scene.Group;
import javafx.scene.Scene;
import javafx.scene.canvas.Canvas;
import javafx.scene.canvas.GraphicsContext;
import javafx.scene.control.Button;
import javafx.scene.control.ColorPicker;
import javafx.scene.control.ComboBox;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.BorderPane;
import javafx.scene.layout.HBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

/*
 * A template JavaFx canvas application
 */
public class Scribble extends Application {
  public void draw(GraphicsContext gc, Line l) {
      l.draw(gc);
    }
 // public void drawLine(GraphicsContext gc, Line l){
//	  l.(gc);
 // }
  
	public void start(Stage primaryStage) {
	  primaryStage.setTitle("Drawing shapes");
	  Group root = new Group();
	  
	  BorderPane pane = new BorderPane();
	  
	  Canvas canvas = new Canvas(800, 600);
	  pane.setCenter(canvas);
	  
	  HBox bottomBar = new HBox();
	  bottomBar.setSpacing(10);
	  bottomBar.setPadding(new Insets(5, 10, 5, 10));
	  bottomBar.setAlignment(Pos.CENTER_LEFT);
	  
	  Text lwText = new Text("Line Width:");
	  ComboBox<Integer> lwCombo = new ComboBox<>();
	  lwCombo.getItems().addAll(1, 2, 3, 4, 5, 6, 7, 8, 9, 10);
	  lwCombo.setValue(1);
	  
	  Text scText = new Text("Stroke Color:");
	  ColorPicker scChooser = new ColorPicker(Color.BLACK);
	  
    
    Button clearButton = new Button("Clear");
    
    lwCombo.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        canvas.getGraphicsContext2D().setLineWidth(lwCombo.getValue());
      }
    });

    scChooser.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        canvas.getGraphicsContext2D().setStroke(scChooser.getValue());      
      }
    });
    

    canvas.setOnMousePressed(new EventHandler<MouseEvent>() {
    	public void handle(MouseEvent event) {
			draw(canvas.getGraphicsContext2D(), new Line
        
        
      }
    });
    
    canvas.setOnMouseDragged(new EventHandler<MouseEvent>() {

		public void handle(MouseEvent event) {
			draw(canvas.getGraphicsContext2D(), new Line
		}
    });
    clearButton.setOnAction(new EventHandler<ActionEvent>() {
      public void handle(ActionEvent event) {
        canvas.getGraphicsContext2D().clearRect(0,  0, canvas.getWidth(), canvas.getHeight());
      }
    });
	  bottomBar.getChildren().addAll(lwText, lwCombo, scText, scChooser, clearButton);
	  
	  pane.setBottom(bottomBar);
	  	  
	  root.getChildren().add(pane);
	  primaryStage.setScene(new Scene(root));
	  
	  canvas.getGraphicsContext2D().setLineWidth(lwCombo.getValue());
	  canvas.getGraphicsContext2D().setStroke(scChooser.getValue());
	  
	  primaryStage.show();
	}

	public static void main(String[] args) {
		launch(args);
	}
}
