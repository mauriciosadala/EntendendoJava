import javax.swing.*;

public class Principal {
    public static void main(String[] args) {

        int numero;
        double saldo,limite,rendimento;


            //Usando o JOptionPane porem passando a váriavél para String pois é o único atributo usavél.
            int opcao = Integer.parseInt(JOptionPane.showInputDialog("Banco:\n1-Conta Corrente\n2-Conta Poupança\n3-Sair"));

            //estrutura de condição switch
            switch (opcao) {
                case 1: // case da conta corrente
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                    limite = Double.parseDouble(JOptionPane.showInputDialog("Limite"));
                    ContaCorrente cc1 = new ContaCorrente(numero, saldo, limite);
                    JOptionPane.showMessageDialog(null, "Saldo: " + cc1.getSaldo() +
                            "\nSaldo total: " + cc1.consultaSaldoTotal(), "Conta Corrente", JOptionPane.INFORMATION_MESSAGE);
                    break;
                case 2: //case da conta poupança
                    numero = Integer.parseInt(JOptionPane.showInputDialog("Numero da conta:"));
                    saldo = Double.parseDouble(JOptionPane.showInputDialog("Saldo:"));
                    rendimento = Double.parseDouble(JOptionPane.showInputDialog("Rendimento"));
                    ContaPoupanca cp1 = new ContaPoupanca(numero, saldo, rendimento);
                    cp1.atualizaRendimento();
                    JOptionPane.showMessageDialog(null, "Saldo " + cp1.getSaldo() +
                            "\nRendimento: " + cp1.getRendimento()+"%", "Conta Poupança", JOptionPane.INFORMATION_MESSAGE);

                    break;
                case 3:
                    break;
                //se a pessoa digitar algo que não está dentro das opções
                default:
                    //parametros do showMenssageDialog, null, a mensagem, o titulo da janela, e o icone
                    JOptionPane.showMessageDialog(null, "Opção Inesistente", "ERROR", JOptionPane.ERROR);
                    break;
            }
    }
}
