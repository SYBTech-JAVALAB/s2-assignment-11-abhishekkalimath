import javafx.application.Application;
import javafx.geometry.Insets;
import javafx.scene.Scene;
import javafx.scene.control.RadioButton;
import javafx.scene.control.ToggleGroup;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.text.Text;
import javafx.stage.Stage;

public class TrafficLightApp extends Application {

    @Override
    public void start(Stage stage) {
        Text message = new Text();

        RadioButton red = new RadioButton("Red");
        RadioButton yellow = new RadioButton("Yellow");
        RadioButton green = new RadioButton("Green");

        ToggleGroup group = new ToggleGroup();
        red.setToggleGroup(group);
        yellow.setToggleGroup(group);
        green.setToggleGroup(group);

        red.setOnAction(e -> {
            message.setText("STOP");
            message.setFill(Color.RED);
        });

        yellow.setOnAction(e -> {
            message.setText("READY");
            message.setFill(Color.ORANGE);
        });

        green.setOnAction(e -> {
            message.setText("GO");
            message.setFill(Color.GREEN);
        });

        VBox root = new VBox(10, message, red, yellow, green);
        root.setPadding(new Insets(15));

        stage.setScene(new Scene(root, 250, 200));
        stage.setTitle("Traffic Light Simulator");
        stage.show();
    }

    public static void main(String[] args) {
        launch();
    }
}
