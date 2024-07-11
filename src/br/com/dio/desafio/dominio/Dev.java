package br.com.dio.desafio.dominio;

import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Optional;
import java.util.Set;

public class Dev {
    private String nome;
    private Set<Conteudo> conteudosConcluidos = new LinkedHashSet<>();
    private Set<Conteudo> conteudosInscritos = new LinkedHashSet<>();

    public void inscreverBootcamp(Bootcamp bootcamp) {
        this.conteudosInscritos.addAll(bootcamp.getListaDeConteudos());
        bootcamp.getListadeAlunos().add(this);
    }

    public void progrecao(){
        Optional<Conteudo> conteudo = this.conteudosInscritos.stream().findFirst();
        if(conteudo.isPresent()){
            this.conteudosConcluidos.add(conteudo.get());
            this.conteudosInscritos.remove(conteudo.get());
        } else {
            System.err.println("Você não está matriculado em nenhum BootCamp");
        }
    }

    public double calcularTotalXP(){
      return this.conteudosConcluidos
              .stream()
              .mapToDouble(conteudo -> conteudo.calcularXP())
              .sum();
    }

    public void exibirCursos(){
        System.out.println(conteudosInscritos);
    }

    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public Set<Conteudo> getConteudoConcluido() {
        return conteudosConcluidos;
    }

    public void setConteudoConcluido(Set<Conteudo> conteudosConcluidos) {
        this.conteudosConcluidos = conteudosConcluidos;
    }

    public Set<Conteudo> getContetudoInscrito() {
        return conteudosInscritos;
    }

    public void setContetudoInscrito(Set<Conteudo> contetudoInscrito) {
        this.conteudosInscritos = contetudoInscrito;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Dev dev)) return false;
        return Objects.equals(getNome(),
                dev.getNome()) && Objects.equals(getConteudoConcluido(),
                dev.getConteudoConcluido()) && Objects.equals(getContetudoInscrito(),
                dev.getContetudoInscrito());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(), getConteudoConcluido(), getContetudoInscrito());
    }
}
