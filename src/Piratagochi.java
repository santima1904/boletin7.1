public class Piratagochi {
    //Atributos
    private String nombre;
    private int energia;
    private boolean estaHambriento;
    private int nivelFelicidad;

    //Métodos
    public Piratagochi(String nombre){
        this.nombre = nombre;
    }

    /*
    Entrada: ninguna
    Salida: niguna
    Precondiciones: creacion objeto
    Postcondiciones: -
     */
    public void comer(){
        if (estaHambriento==true){
            estaHambriento=false;
        }else{
            nivelFelicidad--;
        }
    }
    /*
    Entrada: int horasDurmiendo
    Salida: niguna
    Precondiciones: horasDurmiendo positivas
    Postcondiciones: -
     */
    public void dormir(int horasDurmiendo){
        energia = energia+horasDurmiendo;
        int horasExtra;
        if (energia>10){
            horasExtra= energia-10;
            nivelFelicidad = nivelFelicidad-horasExtra;
        }
    }

    /*
   Entrada: int horasJugando
   Salida: niguna
   Precondiciones: horasJugando positivas
   Postcondiciones: -
    */
    public void jugar(int horasJugando){
        if (estaHambriento==false){
            nivelFelicidad = nivelFelicidad+horasJugando;
            if (nivelFelicidad>=10){
                nivelFelicidad=10;
            }
            energia= energia-horasJugando;
            estaHambriento=true;
        }else{
            nivelFelicidad = nivelFelicidad-horasJugando;
            energia= energia-horasJugando;
        }
    }
    /*
    public String getNecesidades(){

    }
     */


}
