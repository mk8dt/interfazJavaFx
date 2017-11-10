package application;

import java.io.IOException;

import javafx.fxml.FXML;
import javafx.fxml.FXMLLoader;
import javafx.scene.Cursor;
import javafx.scene.Parent;
import javafx.scene.Scene;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.image.Image;
import javafx.scene.image.ImageView;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.VBox;
import javafx.stage.Stage;
import javafx.stage.StageStyle;

public class Controller {
	
	@FXML
    private ImageView imgCenter;

    @FXML
    private VBox vBox;

    @FXML
    private Label lblSchool;

    @FXML
    private Label lblProject;

    @FXML
    private Button btnCerrar;
    @FXML
    private Button btnCerrar2;

    @FXML
    private Button btnVer;
    
    @FXML
    private ImageView imgCorazon;
    
    @FXML
    public void btnCerrar(MouseEvent event) {
    	System.exit(0);
    	
    	/*Stage thisStage = (Stage) btnCerrar.getScene().getWindow();
    	thisStage.close();*/
    }
    
    @FXML
    public void btnCerrar2(MouseEvent event) {
    	
    	Stage thisStage = (Stage) btnCerrar2.getScene().getWindow();
    	thisStage.close();
    	
    }
    
    
    @FXML
    void btnVer(MouseEvent event) {
    	cargarVentana();
    }
    
	private void cargarVentana() {
	
		// Metodo para abrir una nueva ventana desde un boton.
		
		FXMLLoader fxmlLoader= new FXMLLoader(getClass().getResource("Foto.fxml"));
		
		Parent root1;
		try {
			
			root1 = (Parent)fxmlLoader.load();
			Stage stage= new Stage();
			//Cursor image=new Image("pepe.png");
			//Y ahora dentro del Stage le metes la escena que anteriormente hemos leído y metido en root1.
			stage.setScene(new Scene(root1));
		    stage.initStyle(StageStyle.UNDECORATED);
		   // root1.cursorProperty().set(image);
			// Y ahora le digo que me muestres el stage
			stage.show();
			
		} catch (IOException e) {
			// TODO Auto-generated catch block
			e.printStackTrace();
		}
		
		
		
	}
    
}
