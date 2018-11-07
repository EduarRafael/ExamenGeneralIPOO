public class Cuadro extends Rectangulo {

    //public int base, altura;

    public Cuadro(int base, int altura, int Color, String Nombre, int PosX, int PosY){
        super(color, altura, Color, Nombre, PosX, PosY);
        this.color = Color;
        this.nombre = Nombre;
        this.posX = PosX;
        this.posY = PosY;
        this.base = base;
        this.altura = altura;
    }

    @Override
    public float getArea() {
        return super.getArea();
    }

    @Override
    public int getPerimetro(int b, int h) {
        return super.getPerimetro(b, h);
    }

    @Override
    public int getAltura() {
        return super.getAltura();
    }

    @Override
    public int getBase() {
        return super.getBase();
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
    public void setAltura(int altura) {
        super.setAltura(altura);
    }

    @Override
    public void setBase(int base) {
        super.setBase(base);
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
