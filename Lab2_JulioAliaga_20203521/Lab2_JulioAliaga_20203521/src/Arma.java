public class Arma extends Objeto{

    double poder;
    double valentia;

    public double getPoder() {
        return poder;
    }

    public void setPoder(double poder) {
        this.poder = poder;
    }

    public double getValentia() {
        return valentia;
    }

    public void setValentia(double valentia) {
        this.valentia = valentia;
    }

    public Arma(String nombre, String descripcion, double poder, double valentia) {
        super(nombre, descripcion);
        this.poder = poder;
        this.valentia = valentia;
    }
}
