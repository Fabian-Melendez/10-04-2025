import java.sql.SQLOutput;
import java.util.List;

public class Cliente {
    protected String nomc;
    protected String correo;
    protected List<String> compras;
    protected double ttlGasto;

    public Cliente() {
    }

    public Cliente(String nomc, String correo, List<String> compras, double ttlGasto) {
        this.nomc = nomc;
        this.correo = correo;
        this.compras = compras;
        this.ttlGasto = ttlGasto;
    }

    public String getNomc() {
        return nomc;
    }

    public void setNomc(String nomc) {
        this.nomc = nomc;
    }

    public String getCorreo() {
        return correo;
    }

    public void setCorreo(String correo) {
        this.correo = correo;
    }

    public List<String> getCompras() {
        return compras;
    }

    public void setCompras(List<String> compras) {
        this.compras = compras;
    }

    public double getTtlGasto() {
        return ttlGasto;
    }

    public void setTtlGasto(double ttlGasto) {
        this.ttlGasto = ttlGasto;
    }

    @Override
    public String toString() {
        return "Cliente{" +
                "nomc='" + nomc + '\'' +
                ", correo='" + correo + '\'' +
                ", compras=" + compras +
                ", ttlGasto=" + ttlGasto +
                '}';
    }

    public void comPrd(Producto producto, int cantidad) {
        if (producto.getStk() >= cantidad) {
            if (producto instanceof Vendible) {
                double total = ((Vendible) producto).calcprVnt(cantidad);
                producto.redStock(cantidad);
                compras.add(cantidad + " x " + producto.getNom() + " = " + total + "€");
                ttlGasto += total;
            }
        } else {
            System.out.println("No hay suficiente stock de " + producto.getNom());
        }
    }

    public void mostCmp(){
        System.out.println("Cliente "+nomc+"("+correo+")");
        for (String comp : compras){
            System.out.println("-"+ comp);
        }
        System.out.println("Total gastado $"+ttlGasto);
    }
}
