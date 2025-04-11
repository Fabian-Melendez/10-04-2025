abstract class Producto {
    protected String nom;
    protected String mar;
    protected int pre;
    protected int stk;

    public Producto() {
    }

    public Producto(String nom, String mar, int pre, int stk) {
        this.nom = nom;
        this.mar = mar;
        this.pre = pre;
        this.stk = stk;
    }

    public String getNom() {
        return nom;
    }

    public void setNom(String nom) {
        this.nom = nom;
    }

    public String getMar() {
        return mar;
    }

    public void setMar(String mar) {
        this.mar = mar;
    }

    public int getPre() {
        return pre;
    }

    public void setPre(int pre) {
        this.pre = pre;
    }

    public int getStk() {
        return stk;
    }

    public void setStk(int stk) {
        this.stk = stk;
    }

    @Override
    public String toString() {
        return "Producto{" +
                "nom='" + nom + '\'' +
                ", mar='" + mar + '\'' +
                ", pre=" + pre +
                ", stk=" + stk +
                '}';
    }
    public void redStock(int cantidad) {
        this.stk -= cantidad;
    }
    public void mostDet(){
        System.out.println("Nombre del producto: "+nom);
        System.out.println("Marca del producto: "+mar);
        System.out.println("Precio del producto: "+pre);
        System.out.println("Cantidad de Stock: "+stk);
    }

    public abstract double calcprVnt(int cantidad);
}
