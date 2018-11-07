public class Ovalo extends Figura {

    //radio plus
    static float radioP;
    //radio moins
    static float radioM;

    public Ovalo(float radioM, float radioP, int Color, String Nombre, int PosX, int PosY){
        super(color, nombre, posX, posY);
        this.color = Color;
        this.nombre = Nombre;
        this.posX = PosX;
        this.posY = PosY;
        this.radioM = radioM;
        this.radioP = radioP;
    }

    @Override
    public String getNombre() {
        return super.getNombre();
    }

    @Override
    public int getColor() {
        return super.getColor();
    }

    public static float getRadioM() {
        return radioM;
    }

    public static float getRadioP() {
        return radioP;
    }

    @Override
    public void setPosicion(int posY, int posX) {
        super.setPosicion(posY, posX);
    }

    public static void setRadioM(float radioM) {
        Ovalo.radioM = radioM;
    }

    public static void setRadioP(float radioP) {
        Ovalo.radioP = radioP;
    }

    @Override
    public void setColor(int color) {
        super.setColor(color);
    }
}
