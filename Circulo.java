public class Circulo extends Ovalo {

    public Ovalo(float radioM, float radioP, int Color, String Nombre, int PosX, int PosY){
        super(radioM, radioP, Color, Nombre, PosX, PosY);
        this.color = Color;
        this.nombre = Nombre;
        this.posX = PosX;
        this.posY = PosY;
        this.radioM = radioM;
        this.radioP = radioP;
    }

    @Override
    public int getColor() {
        return super.getColor();
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public void setColor(int color) {
        super.setColor(color);
    }

    @Override
    public void setPosicion(int posY, int posX) {
        super.setPosicion(posY, posX);
    }

}
