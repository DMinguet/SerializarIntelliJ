module serializar.com.daniminguet.es.serializarintellij8_2 {
    requires javafx.controls;
    requires javafx.fxml;

    requires org.kordamp.bootstrapfx.core;

    opens serializar.com.daniminguet.es to javafx.fxml;
    exports serializar.com.daniminguet.es;
}