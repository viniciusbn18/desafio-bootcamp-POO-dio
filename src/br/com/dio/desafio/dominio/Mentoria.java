package br.com.dio.desafio.dominio;

import java.time.LocalDate;

public class Mentoria extends Conteudo {

    private LocalDate dataDaMentoria;

    public LocalDate getDataDaMentoria() {
        return dataDaMentoria;
    }

    public void setDataDaMentoria(LocalDate dataDaMentoria) {
        this.dataDaMentoria = dataDaMentoria;
    }

    @Override
    public String toString() {
        return "Mentoria{" +
                "titulo='" + getTitulo() + '\'' +
                ", descricao='" + getDescricao() + '\'' +
                ", dataDaMentoria=" + dataDaMentoria +
                '}';
    }

    @Override
    public double calcularXP() {
        return 0;
    }
}
