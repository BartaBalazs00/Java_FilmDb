module hu.petrik.filmdb {
    requires javafx.controls;
    requires javafx.fxml;
    requires java.sql;

    opens hu.petrik.filmdb to javafx.fxml;
    exports hu.petrik.filmdb;
    exports hu.petrik.filmdb.controller;
    opens hu.petrik.filmdb.controller to javafx.fxml;
}