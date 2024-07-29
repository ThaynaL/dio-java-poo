package br.com.dio.desafio.dominio;

public abstract class Conteudo {
    protected static final double XP_PADRAO = 100;
    private String titulo, descricao;

    public String getTitulo() { return titulo; }
    public void setTitulo(String novoTitulo) { this.titulo = novoTitulo; }
    public String getDescricao() { return descricao; }
    public void setDescricao(String novaDescricao) { this.descricao = novaDescricao; }

    public abstract double calcularXP();

}
