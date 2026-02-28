module com.example.crapsgame2006 {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.crapsgame2006 to javafx.fxml;
    exports com.example.crapsgame2006;
}