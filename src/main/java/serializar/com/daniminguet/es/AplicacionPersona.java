package serializar.com.daniminguet.es;

import javafx.application.Application;
import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Scene;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;
import javafx.scene.layout.GridPane;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;

import java.io.*;

public class AplicacionPersona extends Application {
    private static final File FICHERO = new File("C:\\Users\\Dani\\OneDrive\\Documentos\\AccesoADatos\\FichPersona.dat");

    @Override
    public void start(Stage stage) throws IOException {
        FXMLLoader fxmlLoader = new FXMLLoader(AplicacionPersona.class.getResource("person-list"));
        //Scene scene = new Scene(fxmlLoader.load(), 320, 240);
        stage.setTitle("Datos personas");
        //stage.setScene(scene);
        //stage.show();
    }

    @Override
    public void init() throws Exception {
        System.out.println("init() method: " + Thread.currentThread().getName());
    }

    @Override
    public void stop() throws Exception {
        System.out.println("stop() method: " + Thread.currentThread().getName());
    }
}
