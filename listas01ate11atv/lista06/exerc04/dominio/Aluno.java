package listas01ate11atv.lista06.exerc04.dominio;

public class Aluno {
    private String nome;
    private double nota;

    public Aluno(String nome, double nota){
        this.nome=nome;
        this.nota=nota;
    }

    public boolean validarNota(double nota){
        return !(nota < 0) && !(nota > 10);
    }

    public String classificarAluno(){
        if(nota>=7){
            return "Aprovado";
        } else if(nota<=5){
            return "Recuperação";
        } else{
            return "Reprovado";
        }
    }
}
