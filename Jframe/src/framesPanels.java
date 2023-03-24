import javax.swing.*;

public class framesPanels {
    public static void main(String[] args) {

        //criando a Janela
        JFrame janela = new JFrame("Meu primeiro frame em java");
        //resolução da janela
        janela.setSize(1280,1024);

        //criando botão
        JButton botao = new JButton("Botão do swing");

        //criando texto
        JLabel texto = new JLabel("numero de clicks: 0");

        //criando painel
        JPanel painel = new JPanel();
                painel.add(botao);
                painel.add(texto);
                janela.getContentPane().add(painel);
                janela.setVisible(true);

    }
}
