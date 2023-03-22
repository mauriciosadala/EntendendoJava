public class ContaCorrente extends Conta{

    private double limite;

    //construtor dessa classe que está herdando os atributos da classe mãe
    public ContaCorrente(int numero, double saldo, double limite) {
        super(numero, saldo);
        this.limite = limite;
    }
    //getter
    public double getLimite() {
        return limite;
    }
    //setter
    public void setLimite(double limite) {
        this.limite = limite;
    }

    //metodo para retornar o saldo + o cheque especial.
    public double consultaSaldoTotal(){
        return getSaldo() + getLimite();

    }
}
