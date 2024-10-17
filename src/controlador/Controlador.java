package controlador;

import java.net.URL;
import java.util.ResourceBundle;

import javafx.fxml.FXML;
import javafx.fxml.Initializable;
import javafx.scene.control.Button;
import javafx.scene.control.Label;
import javafx.scene.input.MouseEvent;
import javafx.scene.layout.Pane;
import javafx.scene.layout.VBox;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Controlador implements Initializable {
    // atributos
    private Circle[] bolas;
    private static final int RADIO = 5;
    @FXML
    Button botonPosicion;
    @FXML
    VBox escenarioPrincipal;
    @FXML
    Pane escenarioArriba;
    @FXML
    Pane escenarioAbajo;
    @FXML
    Label etiqueta1;
    @FXML
    Label etiqueta2;
    @FXML
    Label etiqueta3;
    @FXML
    Label etiqueta4;
    @FXML
    Label etiqueta5;



    @Override
    public void initialize(URL location, ResourceBundle resources) {
        bolas = new Circle[5];
        escenarioPrincipal.setStyle("-fx-background-color:darkgreen");
        escenarioArriba.setStyle("-fx-background-color:grey");
        escenarioAbajo.setStyle("-fx-background-color:white");
    }

    public void etiquetaSeleccionada(MouseEvent evento) {
        Label etiqueta = (Label) evento.getSource();
        if (etiqueta1.getTextFill() == Color.RED) {
            etiqueta1.setTextFill(Color.BLACK);
        }
        if (etiqueta2.getTextFill() == Color.RED) {
            etiqueta2.setTextFill(Color.BLACK);
        }
        if (etiqueta3.getTextFill() == Color.RED) {
            etiqueta3.setTextFill(Color.BLACK);
        }
        if (etiqueta4.getTextFill() == Color.RED) {
            etiqueta4.setTextFill(Color.BLACK);
        }
        if (etiqueta5.getTextFill() == Color.RED) {
            etiqueta5.setTextFill(Color.BLACK);
        }

        if (etiqueta.getTextFill() != Color.BLUE) {
            etiqueta.setTextFill(Color.RED);
        }
            
        
        
    }

    public void posicionRaton(MouseEvent evento) {

        int posX = (int) evento.getX();
        int posY = (int) evento.getY();

        if (etiqueta1.getTextFill() == Color.RED) {
            etiqueta1.setText("Bola1 (" + posX + "," + posY + ")");
            iniciarBola(posX, posY, 1);
        } else if (etiqueta2.getTextFill() == Color.RED) {
            etiqueta2.setText("Bola2 (" + posX + "," + posY + ")");
            iniciarBola(posX, posY, 2);
        } else if (etiqueta3.getTextFill() == Color.RED) {
            etiqueta3.setText("Bola3 (" + posX + "," + posY + ")");
            iniciarBola(posX, posY, 3);
        } else if (etiqueta4.getTextFill() == Color.RED) {
            etiqueta4.setText("Bola4 (" + posX + "," + posY + ")");
            iniciarBola(posX, posY, 4);
        } else if (etiqueta5.getTextFill() == Color.RED) {
            etiqueta5.setText("Bola5 (" + posX + "," + posY + ")");
            iniciarBola(posX, posY, 5);
        }

    }

    public void posicionarBola() {

        if (bolas[0] != null && etiqueta1.getTextFill() == Color.RED) {
            etiqueta1.setTextFill(Color.BLUE);
            bolas[0].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[0]);
        }
        if (bolas[1] != null && etiqueta2.getTextFill() == Color.RED) {
            etiqueta2.setTextFill(Color.BLUE);
            bolas[1].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[1]);
        }
        if (bolas[2] != null && etiqueta3.getTextFill() == Color.RED) {
            etiqueta3.setTextFill(Color.BLUE);
            bolas[2].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[2]);
        }
        if (bolas[3] != null && etiqueta4.getTextFill() == Color.RED) {
            etiqueta4.setTextFill(Color.BLUE);
            bolas[3].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[3]);
        }
        if (bolas[4] != null && etiqueta5.getTextFill() == Color.RED) {
            etiqueta5.setTextFill(Color.BLUE);
            bolas[4].setFill(Color.RED);
            escenarioArriba.getChildren().add(bolas[4]);
        }
    }

    public void iniciarBola(int posX, int posY, int numBolas) {
        bolas[numBolas-1] = new Circle(posX, posY, RADIO);
    }

    public void inicioMovimiento() {
        
    }
}
