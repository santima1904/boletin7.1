/*
Ejercicio 5:  Implementa una clase Hora, la cual tendrá como atributos:
int hora
int minutos
int segundos
y como métodos:
Un constructor con parámetros
Los setter y los getter
Un método para sumar segundos a la hora.
El método toString, mostrando la hora con el formato hh:mm:ss
 */

public class Hora {
    //Atributos
    private int hora;
    private int minutos;
    private int segundos;

    //Métodos
    public Hora(int hora, int minutos, int segundos){
        this.hora = hora;
        this.minutos = minutos;
        this.segundos = segundos;
    }
    public void setHora(int hora){
        this.hora = hora;
    }
    public void setMinutos(int minutos){
        this.minutos = minutos;
    }
        public void setSegundos(int segundos){
        this.segundos = segundos;
    }
    public int getHora(){
        return hora;
    }
    public int getMinutos(){
        return minutos;
    }
    public int getSegundos(){
        return segundos;
    }

    /*
   Entrada: int segundosASumar
   Salida: niguna
   Precondiciones: segundosASumar positivo
   Postcondiciones: -
    */
    public void sumaSegundos(int segundosASumar){
        segundos=segundos+segundosASumar;
        if (segundos>=60){
            minutos= minutos+1;
            segundos=0;
                if (minutos>=60){
                    hora=hora+1;
                    minutos=0;
                        if (hora==24){
                            hora=0;
                        }
                }
        }
        //System.out.println(hora+":"+minutos+":"+segundos);
    }

    @Override
    public String toString(){
        return hora+":"+minutos+":"+segundos;
    }
}
