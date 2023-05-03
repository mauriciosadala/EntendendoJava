public class Exemplo1 {
    public static void main(String[] args) {
        int j = 10;
        String[] vetor = new String[1];
        vetor[0]="5";
        try {
            while (j > Integer.parseInt(vetor[0]))
            {
                System.out.println(" " + j);
                j--;
            }
        }
        catch (ArrayIndexOutOfBoundsException e) {
            System.out.println("Nao foi fornecido um argumento");
        }
        catch (java.lang.NumberFormatException e) {
            System.out.println("Argumento nao e um inteiro valido");
        }
    }
}
