package aula1;

public class Carro {

    //atributos
    String nome, marca;
    int ano, vel;

    //métodos.
    //dentro das chaves {} voce define oque o método irá fazer.
    //dentro dos parenteses () serão definidos váriaveis que farão parte do metodo.

    void acelerar(int aceleracao) { //metodo para executar a aceleração
        vel+=aceleracao;
    }
    void freiar(int freiar){ //metodo para executar a frenagem
        vel-=freiar;
    }
    void buzinar(){ //metodo para executar a buzina
        System.out.println("BIBI");
    }
}
