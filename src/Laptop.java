public class Laptop extends Producto{
    protected String pros;
    protected String RAM;

    public Laptop() {
    }

    public Laptop(String nom, String mar, int pre, int stk, String pros, String RAM) {
        super(nom, mar, pre, stk);
        this.pros = pros;
        this.RAM = RAM;
    }

    public String getPros() {
        return pros;
    }

    public void setPros(String pros) {
        this.pros = pros;
    }

    public String getRAM() {
        return RAM;
    }

    public void setRAM(String RAM) {
        this.RAM = RAM;
    }

    @Override
    public String toString() {
        return super.toString() +
                "pros='" + pros + '\'' +
                ", RAM='" + RAM + '\'' +
                '}';
    }

    public void mostDet(){
        System.out.println("Procesador de: "+pros);
        System.out.println("Cantidad de memoria RAM: "+RAM);
    }

    @Override
    public double calcprVnt(int cantidad){
        double total = pre * cantidad;
        if (cantidad > 7){
            total*=0.9;
        }
        return total;
    }
}
