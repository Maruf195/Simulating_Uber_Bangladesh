module org.example.simulating_uber_bangladesh {
    requires javafx.controls;
    requires javafx.fxml;


    opens org.example.simulating_uber_bangladesh to javafx.fxml;
    exports org.example.simulating_uber_bangladesh;
}