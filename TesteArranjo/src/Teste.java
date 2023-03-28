public class Teste {
    //metodo que é independete de um objeto, recebe o parametro de um vetor
    public static void alteraArranjo(int b[]){

        for(int i=0; i<b.length; i++){
            b[i] = i*2;
        }

        System.out.println("\n**Arranjo b**");
        for (int valor : b)// variavel chamda "valor" recebe o vetro b
            System.out.print(valor + " - ");

        //criando vetor b 3 posiões
        b = new int[3];

        System.out.println("\n**Novo arranjo b**");

        //imprime os valores do vetor b concatenando com -
        for (int valor : b)
            System.out.print(valor + " - ");
    }

    public static void main(String[] args) {
        //criando um vetor com estas posições
        int[] a = {1,2,3,4,5};


        System.out.println("\n**Arranjo a antes da chamada do método**");

        //imprime os valores do vetor a, concatenando com um traço
        for (int valor : a)
            System.out.print(valor + " - ");


        alteraArranjo(a);

        System.out.println("\n**Arranjo a após a chamada do método**");
        for (int valor : a)
            System.out.print(valor + " - ");


    }
}
