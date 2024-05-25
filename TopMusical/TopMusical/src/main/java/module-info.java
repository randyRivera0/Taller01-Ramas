module espol.poo.topmusical {
    requires transitive javafx.controls;
    requires javafx.fxml;

    opens espol.poo.topmusical to javafx.fxml;

    exports espol.poo.topmusical;
}
