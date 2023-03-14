public class ProdutoTestar {
    public static void main(String[] args) {

        //construtor padrao: os dados foram declarados no objeto fora do construtor
        Produto p1 = new Produto();
        p1.nome = "Caneta Preta";
        p1.marca = "bic";
        p1.valor = 1.50f;

        //construtor de dois parâmetros: alguns dados já foram declarados no construtor e outro não
        Produto p2 = new Produto("Caneta Vermelha","Faber");
        p2.valor = 1.69f;

        //construtor de três parâmetros: todos os dados foram declarados já no construtor
        Produto p3 = new Produto("Borracha","mercur",1.89f);

        //imprimindo objeto p1
        System.out.println("nome: " + p1.nome + " marca: " + p1.marca + " valor: " + p1.valor);
        //imprimindo objeto p2
        System.out.println("nome: " + p2.nome + " marca: " + p2.marca + " valor: " + p2.valor);
        //imprimindo objeto p3
        System.out.println("nome: " + p3.nome + " marca: " + p3.marca + " valor: " + p3.valor);
    }
}
