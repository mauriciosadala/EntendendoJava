
import javax.swing.*;
import java.util.ArrayList;
import java.util.List;

public class Banco {
    public static void main(String[] args) {


        //Clientes
        Cliente cl1 = new Cliente();
        cl1.nome = JOptionPane.showInputDialog(null,"Insira o nome do cliente");
        Cliente cl2 = new Cliente();
        cl2.nome = JOptionPane.showInputDialog(null,"Insira o nome dos clientes");

        //Contas diferenciadas pelo nome do cliente
         ContaCorrente c1 = new ContaCorrente();
         c1.deposita(100);
         c1.cliente = cl1;

         ContaCorrente c2 = new ContaCorrente();
         c2.deposita(200);
         c2.cliente = cl2;

         List contas = new ArrayList();

         contas.add(c1);
         contas.add(c2);

         //consultando o tamanho da lista
        System.out.println("O tamanho dessa lista de contas e:" + contas.size());

        for(int i = 0; i <contas.size(); i++){
            ContaCorrente contaTeste = (ContaCorrente)contas.get(i);
            //imprimindo
            System.out.println("O valor do saldo de " + contaTeste.cliente.nome + " e: " + c1.saldo);
        }
    }
}
