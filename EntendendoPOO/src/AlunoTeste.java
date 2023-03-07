public class AlunoTeste {
    public static void main(String[] args) {

        //instanciando o objeto:
        Aluno aluno1 = new Aluno();

        //declarando valores aos atributos:
        aluno1.nome = "Mauricio Sadala";
        aluno1.idade = 21;
        aluno1.curso = "Analise e Desenvolvimento de Sistemas";

        //chamando os métodos:
        aluno1.assistirAula();
        aluno1.fazerProva();
        aluno1.calcularNota();
    }
}
