import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.collections.ObservableList;
import javafx.scene.Scene;
import javafx.scene.control.*;
import javafx.scene.image.Image;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.Pane;
import javafx.scene.layout.StackPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.util.Scanner;

/*
 * Created by Tanel Laud on 03.10.2016.
 */
public class movietickets extends Application {
    private DatePicker checkInDatePicker;


    public void start(Stage primaryStage) throws Exception {

        VBox vbox = new VBox();
        Scene chooseMovie = new Scene(vbox, 500, 500);
        primaryStage.setScene(chooseMovie);
        primaryStage.show();

        Label title = new Label("Vali film");

        ChoiceBox movieList = new ChoiceBox(FXCollections.observableArrayList(
                "Avengers", "John wick 2", "Transformers 3")
        );

        Label dateTitle = new Label("Vali kuupäev");
        checkInDatePicker = new DatePicker();

        Label ticketAmountTitle = new Label("Mitu piletit?");
        ChoiceBox ticketAmount = new ChoiceBox(FXCollections.observableArrayList(
                "1", "2", "3")
        );

        Label seatTitle = new Label("Vali kohad");
        GridPane grid = new GridPane();

        for (int r = 0; r < 4; r++) {
            for (int c = 0; c < 4; c++) {
                int number = 4 * r + c;
                ToggleButton button = new ToggleButton(String.valueOf(number));
                grid.add(button, c, r);
            }
        }

        ScrollPane scrollPane = new ScrollPane(grid);

        vbox.getChildren().addAll(title ,movieList,dateTitle, checkInDatePicker, ticketAmountTitle, ticketAmount, seatTitle, grid);

    }
}
