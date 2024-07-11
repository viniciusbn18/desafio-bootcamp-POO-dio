package br.com.dio.desafio.dominio;

import java.time.LocalDate;
import java.util.HashSet;
import java.util.LinkedHashSet;
import java.util.Objects;
import java.util.Set;

public class Bootcamp {
    private String nome;
    private String descricao;
    private final LocalDate dataInicial = LocalDate.now();
    private final LocalDate dataFinal = dataInicial.plusDays(45);
    private Set<Dev> listadeAlunos = new HashSet<>();
    private Set<Conteudo> listaDeConteudos = new LinkedHashSet<>();


    public String getNome() {
        return nome;
    }

    public void setNome(String nome) {
        this.nome = nome;
    }

    public String getDescricao() {
        return descricao;
    }

    public void setDescricao(String descricao) {
        this.descricao = descricao;
    }

    public LocalDate getDataInicial() {
        return dataInicial;
    }

    public LocalDate getDataFinal() {
        return dataFinal;
    }

    public Set<Dev> getListadeAlunos() {
        return listadeAlunos;
    }

    public void setListadeAlunos(Set<Dev> listadeAlunos) {
        this.listadeAlunos = listadeAlunos;
    }

    public Set<Conteudo> getListaDeConteudos() {
        return listaDeConteudos;
    }

    public void setListaDeConteudos(Set<Conteudo> listaDeConteudos) {
        this.listaDeConteudos = listaDeConteudos;
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (!(o instanceof Bootcamp bootcamp)) return false;
        return Objects.equals(getNome(),
                bootcamp.getNome()) && Objects.equals(getDescricao(),
                bootcamp.getDescricao()) && Objects.equals(getDataInicial(),
                bootcamp.getDataInicial()) && Objects.equals(getDataFinal(),
                bootcamp.getDataFinal()) && Objects.equals(getListadeAlunos(),
                bootcamp.getListadeAlunos()) && Objects.equals(getListaDeConteudos(),
                bootcamp.getListaDeConteudos());
    }

    @Override
    public int hashCode() {
        return Objects.hash(getNome(),
                getDescricao(),
                getDataInicial(),
                getDataFinal(),
                getListadeAlunos(),
                getListaDeConteudos());
    }
}
