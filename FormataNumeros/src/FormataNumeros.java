import java.text.NumberFormat;
public class FormataNumeros {

    public static void main(String[] args) {


        System.out.println(NumberFormat.getCurrencyInstance().format(12345678.90));


        double n[]={523.34, 54344.23 ,95845.223 ,1084.895};

        //criando um objeto z que vai ter a função da formatação a seguir
        NumberFormat z = NumberFormat.getCurrencyInstance();

        //vetor
        for (int a = 0; a < n.length; a++) {

            /* esta estrutura de condição imprime os tracinhos quando a posição do vetor é
            diferente de 0 */
            if(a != 0)

                System.out.print(", ");

            //usando o objeto z que tem pré setado a formatação
            System.out.print(z.format(n[a]));
        }
        System.out.println();
    }
}
