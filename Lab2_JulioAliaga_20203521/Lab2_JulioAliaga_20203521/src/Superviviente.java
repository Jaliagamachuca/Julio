import java.util.ArrayList;

public class Superviviente extends Ente{

    private ArrayList<Objeto> inventario;
    private int kills = 0;
    private int sanidad;
    private int valentia;
    private boolean trauma = false;

    public ArrayList<Objeto> getInventario() {
        return inventario;
    }

    public void setInventario(ArrayList<Objeto> inventario) {
        this.inventario = inventario;
    }

    public int getKills() {
        return kills;
    }

    public void setKills(int kills) {
        this.kills = kills;
    }

    public int getSanidad() {
        return sanidad;
    }

    public void setSanidad(int sanidad) {
        this.sanidad = sanidad;
    }

    public int getValentia() {
        return valentia;
    }

    public void setValentia(int valentia) {
        this.valentia = valentia;
    }

    public boolean isTrauma() {
        return trauma;
    }

    public void setTrauma(boolean trauma) {
        this.trauma = trauma;
    }

    public void declararVictoria(){
        //Completar
    }

    public double getPoder(){
        //completar
        return 0;
    }

    public void curarse(){
       //Completar
    }
}
