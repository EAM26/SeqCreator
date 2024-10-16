module org.example.seqcreator {
    requires javafx.controls;
    requires javafx.fxml;
    requires javafx.web;

    requires org.controlsfx.controls;
    requires com.dlsc.formsfx;
    requires net.synedra.validatorfx;
    requires org.kordamp.ikonli.javafx;
    requires org.kordamp.bootstrapfx.core;
    requires eu.hansolo.tilesfx;
    requires com.almasb.fxgl.all;

    opens org.example.seqcreator to javafx.fxml;
    exports org.example.seqcreator;
    exports org.example.seqcreator.controller;
    opens org.example.seqcreator.controller to javafx.fxml;
}