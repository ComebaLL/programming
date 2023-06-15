module com.example.gpudb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;


    opens com.example.gpudb to javafx.fxml;
    exports com.example.gpudb;
}