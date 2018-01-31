import javafx.application.Application;
import javafx.scene.image.PixelReader;
import javafx.scene.image.WritableImage;
import javafx.scene.paint.Color;
import javafx.scene.text.Font;
import javafx.scene.text.FontPosture;
import javafx.scene.text.FontWeight;
import javafx.scene.text.Text;
import javafx.stage.Stage;
public class TextAsciiArt extends Application{

	public static void main(String[] args) {
		launch(args);

	}

	@Override
	public void start(Stage arg0) throws Exception {
		
		Text field = new Text("Hello, world!");
		field.setFont(Font.font("Times", FontWeight.BOLD, 24.0));
		WritableImage image = field.snapshot(null, null);
		PixelReader pr = image.getPixelReader();
		
		for(int i = 0; i < image.getHeight(); i++) {
			for(int j = 0; j < image.getWidth(); j++) {
				Color c = pr.getColor(j, i);
				if (c.getRed() * c.getGreen() * c.getBlue() == 1.0) {
					System.out.print(" ");
				}else {
					System.out.print("@");
				}
			}
			
			System.out.println();
		}
	}
	

}
