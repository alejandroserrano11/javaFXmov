package modelo;

import javafx.scene.layout.Pane;
import javafx.scene.paint.Color;
import javafx.scene.shape.Circle;

public class Movimiento extends Thread {
    private Circle circulo;
    private long velocidad;
    private Pane pane;

    public Movimiento(Circle circulo, Pane pane, long velocidad) {
        this.circulo = circulo;
        this.velocidad = velocidad;
        this.pane = pane;
    }

    public void mover() throws InterruptedException {
        double finX = pane.getPrefWidth();
        System.out.println("finX: "+finX);
        double ppioX = 0;
        double sentidoX = +1;
        double posX = circulo.getLayoutX();

        double finY = pane.getPrefHeight();
        System.out.println("finY: "+finX);
        double ppioY = 0;
        double sentidoY = +1;
        double posY = circulo.getLayoutY();


        while (true) {
            posX = posX + sentidoX;
            if ((posX >= pane.getWidth()) || (posX == ppioX)) {
                sentidoX = sentidoX * (-1);
                if (sentidoX > 0) {
                    circulo.setFill(Color.RED);
                } else {
                    circulo.setFill(Color.BLUE);
                }
                posX = posX + sentidoX;
            }
            circulo.setLayoutX(posX);

            posY = posY + sentidoY;
            if ((posY >= pane.getHeight()) || (posY == ppioY)) {
                sentidoY = sentidoY * (-1);
                if (sentidoY > 0) {
                    circulo.setFill(Color.RED);
                } else {
                    circulo.setFill(Color.BLUE);
                }
                posY = posY + sentidoY;
            }
            circulo.setLayoutY(posY);

            Thread.sleep(velocidad);
            System.out.println(pane.getWidth());
        }
    }

    public void run() {
        try {
            mover();
        } catch (InterruptedException e) {

        }

    }

}