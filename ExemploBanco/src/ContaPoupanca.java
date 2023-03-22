public class ContaPoupanca extends Conta{

    private double rendimento;

    //construtor dessa classe que está herdando os atributos da classe mãe
    public ContaPoupanca(int numero, double saldo, double rendimento) {
        super(numero, saldo);
        this.rendimento = rendimento;
    }

    //getter
    public double getRendimento() {
        return rendimento;
    }
    //setter
    public void setRendimento(double rendimento) {
        this.rendimento = rendimento;
    }

    //metodo que atualiza o rendimento
    public void atualizaRendimento(){
        double atual = getSaldo() + (getSaldo()*(getRendimento()/100));
        setSaldo(atual);
    }
}
