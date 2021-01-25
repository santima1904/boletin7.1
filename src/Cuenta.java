public class Cuenta {
    //Atributos
    private String iban;
    private int numeroCuenta;
    private double saldo;
    private boolean descubierta;
    private double interesMensual;

    //Métodos
    public Cuenta(String iban, int numeroCuenta, double interesMensual){
        this.iban = iban;
        this.numeroCuenta = numeroCuenta;
        this.interesMensual = interesMensual;
    }
    public void setIban(String iban){
        this.iban = iban;
    }
    public void setNumeroCuenta(int numeroCuenta){
        this.numeroCuenta = numeroCuenta;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }
    public void setDescubierta(boolean descubierta){
        this.descubierta = descubierta;
    }
    public void setInteresMensual(double interesMensual){
        this.interesMensual = interesMensual;
    }
    public String getIban(){
        return iban;
    }
    public int getNumeroCuenta(){
        return numeroCuenta;
    }
    public double getSaldo(){
        return saldo;
    }
    public boolean getDescubierta(){
        return descubierta;
    }
    public double getInteresMensual(){
        return interesMensual;
    }

    //TODO toString
    /*
    public String toString(){
    }
     */

    public void ingresar(double dinero){
        saldo= saldo + dinero;
    }
    //TODO dos metodos boolean
    /*
    public boolean retirar(double dinero){

    }
    public boolean hacerTransferenciaA(Cuenta c, double cantidad){

    }


    public double beneficiosFuturos(int numMeses){

    }
    */
}
