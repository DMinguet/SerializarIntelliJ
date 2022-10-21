package serializar.com.daniminguet.es;

import javafx.collections.FXCollections;
import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.TableColumn;
import javafx.scene.control.TableView;
import javafx.scene.control.cell.PropertyValueFactory;

import java.io.*;
import java.net.URL;
import java.util.ResourceBundle;

public class ControladorPersona implements Initializable {
    @FXML
    public TableView<Persona> tvData;
    @FXML
    public TableColumn<Persona, String> nombrePersona;
    @FXML
    public TableColumn<Persona, Integer> edadPersona;

    @Override
    public void initialize(URL url, ResourceBundle resourceBundle) {
        File fichero = new File("C:\\Users\\Dani\\OneDrive\\Documentos\\AccesoADatos\\FichPersona.dat");
        Persona persona;
        FileInputStream filein = null;
        try {
            filein = new FileInputStream(fichero);
        } catch (FileNotFoundException e) {
            throw new RuntimeException(e);
        }
        ObjectInputStream dataIS = null;
        try {
            dataIS = new ObjectInputStream(filein);
        } catch (IOException ioe) {

        }
        try {
            while (true) {
                persona = (Persona) dataIS.readObject();
                System.out.println(persona.getEdad());
                System.out.println(persona.getNombre());
                //nombrePersona.setCellValueFactory(new PropertyValueFactory<>("nombrePersona"));
                //edadPersona.setCellValueFactory(new PropertyValueFactory<>("edadPersona"));
                //tvData.setItems(FXCollections.observableArrayList(new Persona(persona.getNombre(), persona.getEdad())));
            }
        } catch (EOFException eofe) {

        } catch (ClassNotFoundException cnfe) {

        } catch (IOException ioe) {

        }
        try {
            dataIS.close();
        } catch (IOException e) {
            throw new RuntimeException(e);
        }
    }
}
