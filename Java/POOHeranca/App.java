package POOHeranca;

public class App {
    public static void main(String[] args) {
        Alunos aluno01 = new Alunos();
        Alunos aluno02 = new Alunos();
        Funcionarios funcionario01 = new Funcionarios();
        Professores professor01 = new Professores();
        aluno01.setNome("Amado Batista");
        System.out.println("Nome: "+aluno01.getNome());
        aluno01.setCpf("213.248.138-23");
        System.out.println("CPF: "+aluno01.getCpf());
        aluno01.setCurso("Economista Profissional de Pirâmides");
        System.out.println("Curso: "+aluno01.getCurso());
        aluno01.setEndereco("Rua Jalin Habei, 182");
        System.out.println("Endereço: "+aluno01.getEndereco());
        aluno01.setIdade(16);
        System.out.println("Idade: "+aluno01.getIdade());
        aluno01.setMediaSemestre(8.5);
        System.out.println("Média do semestre: "+aluno01.getMediaSemestre());
        aluno01.setTurma("Turma B");
        System.out.println("Turma: "+aluno01.getTurma());
        aluno01.setnMatricula(119348);
        System.out.println("Número de matrícula: "+aluno01.getnMatricula());;
        System.out.println(" ");
        aluno02.setNome("Francisco Abalidas");
        System.out.println("Nome: "+aluno02.getNome());
        aluno02.setCpf("149.198.182-45");
        System.out.println("CPF: "+aluno02.getCpf());
        aluno02.setCurso("Economista Profissional de Pirâmides");
        System.out.println("Curso: "+aluno02.getCurso());
        aluno02.setEndereco("Rua Kevin Mamar, 254");
        System.out.println("Endereço: "+aluno02.getEndereco());
        aluno02.setIdade(15);
        System.out.println("Idade: "+aluno02.getIdade());
        aluno02.setMediaSemestre(6.5);
        System.out.println("Média do semestre: "+aluno02.getMediaSemestre());
        aluno02.setTurma("Turma A");
        System.out.println("Turma: "+aluno02.getTurma());
        aluno02.setnMatricula(119313);
        System.out.println("Número de matrícula: "+aluno02.getnMatricula());;
        System.out.println(" ");
        funcionario01.setNome("Eduardo Costa");
        System.out.println("Nome: "+funcionario01.getNome());
        funcionario01.setIdade(35);
        System.out.println("Idade: "+funcionario01.getIdade());
        funcionario01.setFuncao("Técnico em Graxa em Pó");
        System.out.println("Função: "+funcionario01.getFuncao());
        funcionario01.setCpf("329.832.118-56");
        System.out.println("CPF: "+funcionario01.getCpf());
        funcionario01.setEndereco("Rua Carlos Jaber, 155");
        System.out.println("Endereço: "+funcionario01.getEndereco());
        funcionario01.setnCracha(12312334);
        System.out.println("Número do crachá: "+funcionario01.getnCracha());
        funcionario01.setSalario(2900);
        System.out.println("Salário: R$"+funcionario01.getSalario());
        System.out.println(" ");
        professor01.setNome("Alan Bido");
        System.out.println("Nome: "+professor01.getNome());
        professor01.setIdade(59);
        System.out.println("Idade: "+professor01.getIdade());
        professor01.setMateria("Português e Literatura");
        System.out.println("Matérias: "+professor01.getMateria());
        professor01.setEndereco("Rua Alfredo Jatobá, 157");
        System.out.println("Endereço: "+professor01.getEndereco());
        professor01.setTurmas("Turmas A, C e D");
        System.out.println("Turmas: "+professor01.getTurmas());
        professor01.setnCracha(1249841);
        System.out.println("Número do crachá: "+professor01.getnCracha());
    }
}