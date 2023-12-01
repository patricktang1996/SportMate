module com.example.demo {
    requires javafx.controls;
    requires javafx.fxml;

    requires com.dlsc.formsfx;

    opens com.example.demo to javafx.fxml;
    exports com.example.demo;
    exports com.example.demo.add;
    opens com.example.demo.add to javafx.fxml;
    exports com.example.demo.controller;
    opens com.example.demo.controller to javafx.fxml;
    exports com.example.demo.edit;
    opens com.example.demo.edit to javafx.fxml;
    exports com.example.demo.Util;
    opens com.example.demo.Util to javafx.fxml;
}