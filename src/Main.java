import br.com.dio.desafio.dominio.Conteudo;
import br.com.dio.desafio.dominio.Curso;

public class Main {
    public static void main(String[] args) {
        Curso curso1 = new Curso();
        curso1.setTitulo("Curso Java");
        curso1.setDescricao("Descricao curso java");
        curso1.setCargaHoraria(8);
        System.out.println(curso1);

        Conteudo curso2 = new Curso();
    }
}