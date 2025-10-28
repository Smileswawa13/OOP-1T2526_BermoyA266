package oop.mmcm.registration.controllers;

import com.mongodb.client.MongoDatabase;
import javafx.fxml.FXML;
import javafx.scene.chart.PieChart;
import javafx.scene.control.Label;
import oop.mmcm.registration.models.DatabaseHelper;

public class HelloController {
    @FXML
    private Label message;

    @FXML
    protected void connect() {
        // connect ang retrieve the database
        MongoDatabase db = DatabaseHelper.getInstance().getDatabase();

        if (db != null) {
            // connection successful and database retrieved
            message.setText("Connected to database: "
                    + db.getName() + " with collection of "
                    + db.getCollection("movies").getNamespace());


        }
    }
}
