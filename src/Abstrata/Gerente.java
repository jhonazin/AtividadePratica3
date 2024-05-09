package Abstrata;

public class Gerente extends Funcionario implements Trabalho{

    private float bonusAno;
    private String equipe;

    public Gerente() {
    }
    public Gerente(String nome, int matricula, float valorH, int horasTra, float bonusAno, String equipe){
        super(nome, matricula, valorH, horasTra);
        this.bonusAno = bonusAno;
        this.equipe = equipe;
    }
    public float getBonusAno() {
        return bonusAno;
    }
    public void setBonusAno(float bonusAnual) {
        this.bonusAno = bonusAnual;
    }
    public String getEquipe() {
        return equipe;
    }
    public void setEquipe(String equipe) {
        this.equipe = equipe;
    }
    @Override
    public float calcularSalario() {
        return (getValorH() * getHorasTra()) + 2000;
    }
    @Override
    public String toString() {
        return super.toString() + 
        "\nGerente" +"\nEquipe: " + equipe + "\nSalario: " + calcularSalario();
    }
    @Override
    public String trabalhar() {
        return getNome() + " está gerenciando a equipe " + getEquipe();
    }
    @Override
    public String relatarProgresso() {
        return getNome() + " disse que a equipe " + getEquipe() + " está com o projeto em 70%";
    }
}