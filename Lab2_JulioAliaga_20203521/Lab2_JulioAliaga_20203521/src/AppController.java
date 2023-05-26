import java.lang.reflect.InvocationTargetException;
import java.util.ArrayList;
import java.util.Scanner;

public class AppController {


    public void agregarObjeto(ArrayList<Objeto> lista)
    {


        Scanner sc = new Scanner(System.in);
        System.out.println("Indique el nombre del objeto: ");
        String nombre = sc.nextLine();
        System.out.println("Indique el uso del objeto: ");
        String uso = sc.nextLine();
        Objeto objeto = new Objeto(nombre,uso);
        System.out.println("Elija el tipo de objeto: ");
        System.out.println("Indique el uso del objeto: ");
        System.out.println("1. arma");
        System.out.println("2. objeto curativo");
        System.out.println("3. otor");
        String usoObjeto = sc.nextLine();

        if(usoObjeto.equals("1")){

            iterPoderArma:
            while(true) {
                System.out.println("Indique el poder del arma: ");
                String strpoderArma = sc.nextLine();
                int poderArma = Integer.parseInt(strpoderArma);
                if(poderArma >= 0 && poderArma <=100){
                    break iterPoderArma;
                }
            }

        }else if(usoObjeto.equals("2")){
            System.out.println("Indique la vida que restarura el objeto: ");
            String strVidaRestaurada = sc.nextLine();
            int vidaRestaurada = Integer.parseInt(strVidaRestaurada);

        }else if(usoObjeto.equals("3")){
            System.out.println("No es necesario añadir datos adicionales");
        }
    }

    public void agregarZombie(ArrayList<Ente> lista)
    {
        Scanner sc = new Scanner(System.in);
        Zombie zombie = new Zombie();
        System.out.println("Indique el nombre del zombie: ");
        String nombreZombie = sc.nextLine();
        zombie.setNombre(nombreZombie);


        System.out.println("Indique la fuerza del zombie: ");
        String strFuerzaZombie = sc.nextLine();
        double fuerzaZombie = Double.parseDouble(strFuerzaZombie);
        zombie.setFuerza(fuerzaZombie);


        System.out.println("Indique la defensa del zombie: ");
        String strDefensaZombie = sc.nextLine();
        double defensaZombie = Double.parseDouble(strDefensaZombie);
        zombie.setDefensa(defensaZombie);


        System.out.println("Indique la velocidad del zombie: ");
        String strVelocidadZombie = sc.nextLine();
        double velocidadZombie = Double.parseDouble(strVelocidadZombie);
        zombie.setVelocidad(velocidadZombie);


        System.out.println("Indique la vida del zombie: ");
        String strVidaZombie = sc.nextLine();
        double vidaZombie = Double.parseDouble(strVidaZombie);
        zombie.setVida(vidaZombie);


        System.out.println("Indique una frase de victoria que diria: ");
        String strZombie = sc.nextLine();
        zombie.setFraseVictoria(strZombie);

        System.out.println("Zombie añadido con nombre:" + zombie.getNombre());

        lista.add(zombie);
    }

    public void agregarSuperviviente(ArrayList<Ente> lista,ArrayList<Objeto> objetos)
    {
        Scanner sc = new Scanner(System.in);

        Superviviente superviviente = new Superviviente();
        System.out.println("Indique el nombre del superviviente: ");
        String nombreSuperviviente = sc.nextLine();
        superviviente.setNombre(nombreSuperviviente);


        System.out.println("Indique la fuerza del superviviente: ");
        String strFuerzaSuperviviente = sc.nextLine();
        double fuerzaSuperviviente = Double.parseDouble(strFuerzaSuperviviente);
        superviviente.setFuerza(fuerzaSuperviviente);


        System.out.println("Indique la defensa del superviviente: ");
        String strDefensaSuperviviente = sc.nextLine();
        double defensaSuperviviente = Double.parseDouble(strDefensaSuperviviente);
        superviviente.setDefensa(defensaSuperviviente);


        System.out.println("Indique la velocidad del superviviente: ");
        String strVelocidadSuperviviente = sc.nextLine();
        double velocidadSuperviviente = Double.parseDouble(strVelocidadSuperviviente);
        superviviente.setVelocidad(velocidadSuperviviente);


        System.out.println("Indique la vida del superviviente: ");
        String strVidaSuperviviente = sc.nextLine();
        double vidaSuperviviente = Double.parseDouble(strVidaSuperviviente);
        superviviente.setVida(vidaSuperviviente);

        System.out.println("Indique la valentia del superviviente: ");
        String strValentiaSuperviviente = sc.nextLine();
        int valentiaSuperviviente = Integer.parseInt(strValentiaSuperviviente);
        superviviente.setValentia(valentiaSuperviviente);


        System.out.println("Indique una frase de victoria que diria: ");
        String strFraseVictoria = sc.nextLine();
        superviviente.setFraseVictoria(strFraseVictoria);


        System.out.println("Ingrese la cantidad de objetos que tendra: ");
        String strCantObjetos = sc.nextLine();
        //int cantObjetos = Integer.parseInt(strCantObjetos);
        //superviviente.setInventario(valentiaSuperviviente);

        double doubleSanidad = (255-fuerzaSuperviviente-defensaSuperviviente);
        int sanidad = (int) doubleSanidad;
        superviviente.setSanidad(sanidad);

        if(sanidad < 0){
         superviviente.setTrauma(true);
        }
        lista.add(superviviente);
    }


    public int verificarListaPura(ArrayList<Ente> lista){

        if(lista.isEmpty()){
            return 0;
        }else{
            int cantZombies=0;
            int cantSupervivientes=0;
            for (Ente e : lista) {
                if (e instanceof Superviviente) {
                    cantSupervivientes=cantSupervivientes+1;
                } else if (e instanceof Zombie) {
                    cantZombies=cantZombies+1;
                }
            }
            if(cantSupervivientes==0){
                return 1;
            }else if(cantZombies==0){
                return 2;
            }else{
                return 3;
            }

        }
    }

    public Superviviente obtenerSupervivienteMasValiente(ArrayList<Ente> lista){
        //Tu vas por el 20
        return null;
    }

    public Zombie obtenerZombieMasDebil(ArrayList<Ente> lista){

        ArrayList<Zombie> listaZombies = new ArrayList<>();
        for (Ente e : lista) {
            if (e instanceof Zombie) {
                Zombie z = (Zombie) e;
                listaZombies.add(z);
            }
        }
        Zombie zDebil = new Zombie();
        double menorFuerza=100000;
        for(int i=0; i< listaZombies.size(); i=i+1){
            if(listaZombies.get(i).getFuerza() < menorFuerza){
                menorFuerza = listaZombies.get(i).getFuerza();
                zDebil = listaZombies.get(i);
            }
        }

        return zDebil;
    }

    public void atacarZombie(double poder, Zombie zombie)
    {
        //Ya falta poco
    }

    public void defenderseDeZombie(double poder, Superviviente superviviente)
    {
        //Veo un futuro 20
    }

}
