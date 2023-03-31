public class ContaCorrente {

    public double saldo;

    Cliente cliente;

    public void deposita(double valorDeposito){
        saldo = saldo + valorDeposito;
    }
    public double getSaldo(){
        return saldo;
    }

    public void setSaldo(double saldo) {
        this.saldo = saldo;
    }
}
