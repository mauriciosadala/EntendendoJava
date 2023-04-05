public class Main {
    public static void main(String[] args) {
       
        Funcionario f = new Funcionario();
        f.setNome("Mauricio");
        f.setCpf("123456789");
        f.setComissao(100);
        f.setSalario(400);
        System.out.println(f.getPagamento());
    }
}
