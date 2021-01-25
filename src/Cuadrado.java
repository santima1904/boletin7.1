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
    Postcondiciones: cuadrado pintado
     */
    public void printCuadrado(int lado){
        int i, j;
        for (i=1; i<=lado; i++){
            for (j=1; j<=lado; j++){
                System.out.println(" ");
            }
            System.out.print("*");
        }
    }
}
