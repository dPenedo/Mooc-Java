package collage;

import javafx.application.Application;
import static javafx.application.Application.launch;
import javafx.scene.Scene;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.image.PixelReader;
import javafx.scene.image.PixelWriter;
import javafx.scene.image.WritableImage;
import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.stage.Stage;

public class CollageApplication extends Application {

    @Override
    public void start(Stage stage) {

        // the example opens the image, creates a new image, and copies the opened image
        // into the new one, pixel by pixel
        Image sourceImage = new Image("file:monalisa.png");

        // ImageView image = new ImageView(firstTarget);
        // image.setScaleX(0.5);
        // image.setScaleY(0.5);
        // ImageView secondImage = new ImageView(secondTarget);
        // secondImage.setScaleX(0.5);
        // secondImage.setScaleY(0.5);

        Pane pane = new Pane();
        pane.getChildren().add(imageGenerator(sourceImage, 0, 0));
        // pane.getChildren().add(imageGenerator(sourceImage, 2, 2));
        // pane.getChildren().add(secondImage);

        stage.setScene(new Scene(pane));
        stage.show();
    }

    public static ImageView imageGenerator(Image sourceImage, int xCoord, int yCoord) {
        PixelReader imageReader = sourceImage.getPixelReader();

        int width = (int) sourceImage.getWidth();
        int height = (int) sourceImage.getHeight();

        WritableImage targetImage = new WritableImage(width, height);
        PixelWriter imageWriter = targetImage.getPixelWriter();

        int yCoordinate = 0;
        while (yCoordinate < height) {
            int xCoordinate = 0;
            while (xCoordinate < width) {

                Color color = imageReader.getColor(xCoordinate, yCoordinate);
                double red = color.getRed();
                double green = color.getGreen();
                double blue = color.getBlue();
                double opacity = color.getOpacity();

                Color newColor = new Color(red, green, blue, opacity);

                imageWriter.setColor((int) xCoordinate / 2, yCoordinate / 2, newColor);

                xCoordinate++;
            }

            yCoordinate++;
        }
        ImageView image = new ImageView(targetImage);
        return image;

    }

    public static void main(String[] args) {
        launch(args);
    }

}
