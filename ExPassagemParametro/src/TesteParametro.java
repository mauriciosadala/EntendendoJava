public class TesteParametro {

    /*metodo da classe TesteParametro
    Definição de static: quando é um metodo static não prescisa de um objeto
    para que ele funcione ser chamado*/
    public static void m(A obj){//como parametro recebe um objeto do tipo A

        obj.setA(10);
        obj.setB(20);
        obj = new A(35, 45, 55);
        obj.imprimeValores();
    }

    public static void main(String[] args) {

        //cria dois objetos do tipo A
        A obj1, obj2;
        //instanciando os objetos na memoria
        obj1 = new A(1,2,3);
        obj2 = new A(7,8,9);
        obj1.imprimeValores();
        obj2.imprimeValores();
        m(obj1);
        obj1.imprimeValores();

    }
}
