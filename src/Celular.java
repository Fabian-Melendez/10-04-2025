public class Celular extends Producto {
    protected String btr;
    protected int cam;

    public Celular() {
    }

    public Celular(String nom, String mar, int pre, int stk, String btr, int cam) {
        super(nom, mar, pre, stk);
        this.btr = btr;
        this.cam = cam;
    }

    public String getBtr() {
        return btr;
    }

    public void setBtr(String btr) {
        this.btr = btr;
    }

    public int getCam() {
        return cam;
    }

    public void setCam(int cam) {
        this.cam = cam;
    }

    @Override
    public String toString() {
        return super.toString() +
                "btr='" + btr + '\'' +
                ", cam='" + cam + '\'' +
                '}';
    }

    public void mostDet(){
        System.out.println("Capacidad de bateria: "+btr);
        System.out.println("Cantidad de MP: "+cam);
    }

    @Override
    public double calcprVnt(int cantidad) {
        double total = pre * cantidad;
        if (cantidad > 7) {
            total *= 0.9;
        }
        return total;
    }
}
