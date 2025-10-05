module com.example.portaria {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.portaria to javafx.fxml;
    exports com.example.portaria;
}