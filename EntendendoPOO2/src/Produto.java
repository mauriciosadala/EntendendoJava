public class Produto {

    //ATRIBUTOS
    String nome, marca;
    float valor;


    /* CONSTRUTOR: São os métodos responsáveis por criar o objeto, instanciando a classe que
    foi definida. São diferenciados pelos seus parametros, e recebem o mesmo nome da classe
    onde foram criados */

    //Construtor sem parametros
    public Produto() {
    }
    //Construtor
    public Produto(String nome) {
        this.nome = nome; //o this. diferencia o parametro do construtor e dos atributos normais
    }

    public Produto(String nome, String marca) {
        this.nome = nome;
        this.marca = marca;
    }

    public Produto(String nome, String marca, float valor) {
        this.nome = nome;
        this.marca = marca;
        this.valor = valor;
    }
}
