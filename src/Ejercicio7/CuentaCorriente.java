package Ejercicio7;

public class CuentaCorriente {
    //Atributos
    private String iban;
    private int numeroCuenta;
    private double saldo=0;
    private boolean descubierta=false;
    private double interesMensual;

    //Métodos
    public CuentaCorriente(String iban, int numeroCuenta, double interesMensual){
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
        if (this.saldo<0){
            descubierta=true;
        }

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

    @Override
    public String toString(){
        return "Cuenta bancaria: "+saldo;
    }


    public void ingresar(double dinero){
        if(dinero>0){
            saldo=saldo+dinero;
        }

        if (this.saldo>0){
            descubierta=false;
        }

        System.out.println("El saldo de la cuenta es "+saldo);
    }

    public boolean retirar(double dinero){
        boolean ret=false;
        if (!descubierta) {
            saldo=saldo-dinero;
            ret=true;
            System.out.println("La operacion se ha realizado con exito");
        }
        System.out.println("El saldo de la cuenta es "+saldo);
        return ret;
    }

    public boolean hacerTransferenciaA(CuentaCorriente c, double cantidad){
        boolean transferencia=false;
        if (!descubierta) {
            saldo= saldo-cantidad;
            c.saldo=c.saldo+cantidad;
            transferencia=true;
            System.out.println("La operacion se ha realizado con exito");
        }
        System.out.println("El saldo de la cuenta es "+saldo);
        return transferencia;
    }

    public double beneficiosFuturos(int numMeses){
        double beneficios;
        if (descubierta||numMeses<=0){
            beneficios=0;
        }else{
            beneficios=numMeses;
        }
        System.out.println("El saldo de la cuenta es "+saldo);
        return beneficios;
    }

}

