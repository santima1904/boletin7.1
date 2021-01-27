package Ejercicio7;

public class CuentaPersona {
    //Atributos
    private String nombre;
    private String apellidos;
    private int edad;
    private char sexo;
    private CuentaCorriente cuentaCorriente=null;

    //Métodos
    public CuentaPersona(){
        nombre = "";
        apellidos = "";
        edad = 0;
        sexo = 'm';

    }
    public CuentaPersona(String nombre, String apellidos, int edad, char sexo ){
        this.nombre = nombre;
        this.apellidos = apellidos;
        this.edad = edad;
        this.sexo = sexo;
    }
    public void crearCuenta(String iban, int numeroCuenta, double interesMensual){
        if (cuentaCorriente==null){
            cuentaCorriente = new CuentaCorriente(iban, numeroCuenta, interesMensual);
        }
    }
    public boolean sacarDinero(double dinero){
        return cuentaCorriente.retirar(dinero);
    }
    public void ingresarDinero(double dinero){
        cuentaCorriente.ingresar(dinero);
    }
    public boolean hacerTransferenciaA(CuentaPersona b, double cantidad){
        return cuentaCorriente.hacerTransferenciaA(b.cuentaCorriente, cantidad);
    }
    public void cerrarCuenta(){
        cuentaCorriente=null;
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

}
