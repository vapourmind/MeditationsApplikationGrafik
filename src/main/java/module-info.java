module com.example.meditationsapplikationgrafik {
    requires javafx.controls;
    requires javafx.fxml;


    opens com.example.meditationsapplikationgrafik to javafx.fxml;
    exports com.example.meditationsapplikationgrafik;
}