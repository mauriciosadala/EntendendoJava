package aula1;

public class CarroTestar {
    public static void main(String[] args) {

        //instanciando, definindo um objeto.
        Carro c1 = new Carro();

        //definindo os atributos para o objeto criado.
        //usa-se aspas quando o atributo é do tipo string.
        c1.nome = "Uno";
        c1.marca = "Fiat";
        c1.ano = 2015;
        c1.vel = 60;

        //chamando os metodos para o objeto criado.
        //dentro dos parenteses está sendo definido o valor do metodo a seguir.
        c1.acelerar(10);

        //usando o Sys.out para mostrar a velocidade após usar o metodo acelerar
        System.out.println("Velocidade: " + c1.vel + "KM/H");

        //chamando o metodo freiar
        c1.freiar(30);

        //usando Sys.out para mostrar a velocidade após usar o metodo freiar
        System.out.println("Velocidade: " + c1.vel + "KM/H");
    }
}
