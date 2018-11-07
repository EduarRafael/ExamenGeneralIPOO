import javax.swing.*;
import java.awt.Color;
import java.awt.Graphics;
import javax.swing.JPanel;

public class Rectangulo extends Figura {

    public int base, altura;

    public Rectangulo(int base, int altura, int Color, String Nombre, int PosX, int PosY){
        super(color, nombre, posX, posY);
        this.color = Color;
        this.nombre = Nombre;
        this.posX = PosX;
        this.posY = PosY;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public void paintComponent(Graphics g){
        super.paintComponent(g);
        g.drawRect(posX, posY, base, altura);
        //g.setColor();
    }

    public void setAltura(int altura) {
        this.altura = altura;
    }

    public void setBase(int base) {
        this.base = base;
    }

    public int getAltura() {
        return altura;
    }

    public int getBase() {
        return base;
    }

    public float getArea(){
        float area = this.base * this.altura;
        return area;
    }

    public int getPerimetro(int b, int h){
         b = this.base;
         h = this.altura;
         int perimetro = (2 * b) + (2 * h);
         return perimetro;
    }

    public void modTalla(int size){
        this.altura = this.altura * size;
        this.base = this.base * size;
    }
}
