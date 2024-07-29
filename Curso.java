package br.com.dio.desafio.dominio;


public class Curso extends Conteudo{
    private int cargaHoraria;

    public int getCargaHoraria() { return cargaHoraria; }
    public void setCargaHoraria(int novaCargaHoraria) { this.cargaHoraria = novaCargaHoraria; }

   
    public String toString() {
        return "Curso{ titulo ='" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", cargaHoraria =" + getCargaHoraria() + '}';
    }
    
    public double calcularXP() {
        return XP_PADRAO * getCargaHoraria();
    } 
}
