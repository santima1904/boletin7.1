public class Main {
    public static void main(String[] args) {
        //clase persona
        Persona persona1 = new Persona();
        Persona persona2 = new Persona("Pepe", "Sanchez", 58, 'm');

        persona2.saludar();

        //clase horas
        Hora horaPrueba = new Hora(0, 23, 56);
        horaPrueba.sumaSegundos(6);
    }


}
