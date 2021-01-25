public class Persona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;

    //Métodos
    public Persona(){
        nombre = "";
        apellidos = "";
        edad = 0;
        sexo = 'm';
    }
    public Persona(String nombre, String apellidos, int edad, char sexo ){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void setNombre(String nombre){
        this.nombre = nombre;
    }
    public void setApellidos(String apellidos){
        this.apellidos = apellidos;
    }
    public void setEdad(int edad){
        this.edad = edad;
    }
    public void setSexo(char sexo){
        this.sexo = sexo;
    }
    public String getNombre(){
        return nombre;
    }
    public String getApellidos(){
        return apellidos;
    }
    public int getEdad(){
        return edad;
    }
    public char getSexo(){
        return sexo;
    }

    /*
    Entrada: ninguna
    Salida: niguna
    Precondiciones: creacion del objeto
    Postcondiciones: salida por pantalla
     */
    public void saludar(){
        System.out.println("Holaaaa");
    }
}
