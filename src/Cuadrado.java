public class Cuadrado {
    //Atributos
    private int lado;

    //Métodos
    public Cuadrado(){
        lado = 0;
    }
    public void setLado(int lado){
        this.lado = lado;
    }
    public int getLado(){
        return lado;
    }
    public double getArea(){
        int area;
        area= lado*lado;
        return area;
    }
    /*
    Entrada: int lado
    Salida: niguna
    Precondiciones: lado positivo
    Postcondiciones: se pintarara un cuadrado de asteriscos con el lado indicado
     */
    public void printCuadrado(){
        for (int i=1; i<=lado; i++){
            for (int j=1; j<=lado; j++){
                System.out.print("*");
            }
            System.out.println();
        }
    }
}
