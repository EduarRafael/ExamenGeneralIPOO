import javax.swing.*;
import javax.swing.JButton;
import java.util.ArrayList;

public class main {

    private JButton cerrar;


    public static void main(String[] args) {

        ArrayList<Figura> Formas = new ArrayList<Figura>();

         int equis, ye, rBase, rAlt;

        JFrame aplicacion = new JFrame();
        aplicacion.setDefaultCloseOperation(JFrame.EXIT_ON_CLOSE);
        aplicacion.setSize(350,350);

        String figura = JOptionPane.showInputDialog( "Introduzca el nombre de la figura" );
        aplicacion.setVisible(true);

        switch(figura){
            case "rectangulo":

                String posx = JOptionPane.showInputDialog( "Introduzca la posicion en X" );
                String posy = JOptionPane.showInputDialog( "Introduzca la posicion en Y" );
                String color = JOptionPane.showInputDialog( "Introduzca el color de la figura" );
                String base = JOptionPane.showInputDialog( "Introduzca la base del rectangulo" );
                String altura = JOptionPane.showInputDialog( "Introduzca la altura del rectangulo" );


                equis = Integer.parseInt(posx);
                ye = Integer.parseInt(posy);
                rAlt = Integer.parseInt(altura);
                rBase = Integer.parseInt(base);

                //Figura obj = new Figura(color,figura,equis,ye);
                Rectangulo rect = new Rectangulo(rBase, rAlt, color,figura,equis,ye);
                Formas.add(rect);
                aplicacion.add(rect);
                break;

            case "cuadrado":
                    break;

            case "ovalo":
                    break;

            case "circulo":
                    break;

            default: figura = "invalido";
                    break;
        }
    }
    public void addRec(){

    }
}
