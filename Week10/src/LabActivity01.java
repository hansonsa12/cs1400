
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
public class LabActivity01 extends Application {

  public void draw(GraphicsContext gc) {
    // TODO: Create and draw a point at (110, 100).
    //       Set size to 5 and color to RED.
	    Point p = new Point(110, 100);
	    p.setSize(5);
	    p.setColor(Color.RED);
	    p.draw(gc);

    
    // TODO: Create and draw a line between points (40, 220) and (200, 400).
    //       Set width to 2 and color to CADETBLUE.
	    Point a = new Point(40, 220);
	    Point b = new Point(200, 400);
	    Line l = new Line(a, b);
	    l.setColor(Color.CADETBLUE);
	    l.draw(gc);
	    

    
    // TODO: Create a rectangle at point(170, 420); eet width to 400, height to 150.
    //       1. Stroke it with line width of 2 and color or DARKMAGENTA.
    //       2. Fill it with the HONEYDEW color.
	    Point c = new Point(170, 420);
	    Rectangle r = new Rectangle(c, 400, 150);
	    r.fill(gc, Color.HONEYDEW);
	    
	    
	    
    
    
    // TODO: Create a square at point(30, 400); set width to 100.
    //       Fill it with the LIGHTSKYBLUE color.
	    Point d = new Point(30,400);
	    Square s = new Square(d, 100);
	    s.fill(gc, Color.LIGHTSKYBLUE);

    
    
    // Draw a rosette at point(350, 210); set radius to 200 and point count to 15.
	    Point e = new Point(350,210);
	    Rosette t = new Rosette(e, 200, 15);
	    t.draw(gc);
   

  }
  
	@Override
	public void start(Stage primaryStage) {
	  primaryStage.setTitle("Drawing shapes");
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
