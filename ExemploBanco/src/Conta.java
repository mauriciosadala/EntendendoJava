public class Conta {

    private int numero;
    private double saldo;

    //metodo de saque
    public void sacar(double sacar){
       if (sacar <= saldo );
       saldo = saldo - sacar;
    }

    //metodo de deposito
    public void deposito(double depositar){
        saldo = saldo + depositar;
    }

    //construtor da classe
    public Conta(int numero, double saldo) {
        this.numero = numero;
        this.saldo = saldo;
    }

    //getter numero
    public int getNumero() {
        return numero;
    }
    //setter numero
    public void setNumero(int numero) {
        this.numero = numero;
    }

    //getter saldo
    public double getSaldo() {
        return saldo;
    }

    //setter saldo
    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
