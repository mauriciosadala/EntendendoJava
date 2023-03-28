public class A {

    int a,b,c;

    //objeto
    A(int a, int b, int c){
        this.a=a;
        this.b=b;
        this.c=c;
    }
    public void setA(int a) {
        this.a=a;
    }

    public void setB(int b) {
        this.b=b;
    }

    public void imprimeValores() {
        //printf, precisa de formatação
        System.out.printf("\nvalor da variavel A, B e C %d, %d, %d\n",this.a, this.b, this.c);
    }
}
