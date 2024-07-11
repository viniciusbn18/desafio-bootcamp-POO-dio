import br.com.dio.desafio.dominio.Bootcamp;
import br.com.dio.desafio.dominio.Curso;
import br.com.dio.desafio.dominio.Dev;
import br.com.dio.desafio.dominio.Mentoria;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();

        curso1.setTitulo("Curso de POO com Java");
        curso1.setDescricao("Descrição curso 1");
        curso1.setCargaHoraria(20);

        Curso curso2 = new Curso();
        curso2.setTitulo("Curos C++");
        curso2.setDescricao("Descrição curso 2");
        curso2.setCargaHoraria(30);

        Mentoria mentoria = new Mentoria();

        mentoria.setTitulo("Mentoria para desenvolvimento Ágil");
        mentoria.setDescricao("Descrição da mentoria");



        Bootcamp backEndJava = new Bootcamp();
        backEndJava.setNome("Back-end Java");
        backEndJava.setDescricao("Descricao do bootcamp");
        backEndJava.getListaDeConteudos().add(curso1);
        backEndJava.getListaDeConteudos().add(curso2);
        backEndJava.getListaDeConteudos().add(mentoria);


        Dev vinicius = new Dev();

        vinicius.setNome("Vinicius");
        vinicius.inscreverBootcamp(backEndJava);
        System.out.println("Conteudos inscritos: " + vinicius.getContetudoInscrito());
        vinicius.progrecao();
        System.out.println("Conteudos inscritos: " + vinicius.getContetudoInscrito());






    }
}