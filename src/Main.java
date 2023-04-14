public class Main {
    public static void main(String[] args) {

        Pessoa pessoa = new Pessoa();

        Aluno aluno01 = new Aluno();

        aluno01.setNome("Alberto");
        aluno01.setIdade(41);
        aluno01.setSexo('M');
        aluno01.setMatricula(123456);


        System.out.println("Aluno: "+aluno01.getNome());
        System.out.println("Idade: "+aluno01.getIdade());
        System.out.println("Sexo: "+aluno01.getSexo());
        System.out.println("Matricula: "+aluno01.getMatricula());
    }
}