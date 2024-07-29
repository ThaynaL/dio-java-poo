package br.com.dio.desafio.dominio;
import java.time.LocalDate;

public class Mentoria extends Conteudo {
    private LocalDate data;

    public LocalDate getData() { return data; }
    public void setData(LocalDate novaData) { this.data = novaData; }
    
    public String toString() {
        return "Curso{ titulo ='" + getTitulo() + '\'' +
                ", descricao ='" + getDescricao() + '\'' +
                ", data =" + getData() + '}';
    }
    public double calcularXP() {
        return XP_PADRAO * 30;
    } 
}
