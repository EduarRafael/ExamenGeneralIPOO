import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Figura extends JPanel {

    public static int color;
    public static String nombre;
    public static int posX, posY;

    public Figura(int color, String nombre, int posX, int posY){

        this.color = color;
        this.nombre = nombre;
        this.posX = posX;
        this.posY = posY;

    }

    @Override
    public void paintComponent(Graphics g){
    }

    public int getColor() {
        return color;
    }

    public String getNombre() {
        return nombre;
    }

    public void setColor(int color) {
        this.color = color;
    }

    public void setPosicion(int posY, int posX){
        this.posY = posY;
        this.posX = posX;
    }
}
