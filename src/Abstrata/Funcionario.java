package Abstrata;

public abstract class Funcionario{
    
    private String nome;
    private int matricula;
    private float valorH;
    private int horasTra;

    
    public Funcionario(){
    }
    public Funcionario(String nome, int matricula, float valorH, int horasTra) {
        this.nome = nome;
        this.matricula = matricula;
        this.valorH = valorH;
        this.horasTra = horasTra;
    }

    public String getNome() {
        return nome;
    }
    public void setNome(String nome) {
        this.nome = nome;
    }
    public int getMatricula() {
        return matricula;
    }
    public void setMatricula(int matricula) {
        this.matricula = matricula;
    }
    public float getValorH() {
        return valorH;
    }
    public void setValorH(float valorHora) {
        this.valorH = valorHora;
    }
    public int getHorasTra() {
        return horasTra;
    }
    public void setHorasTra(int horasTrabalhadas) {
        this.horasTra = horasTrabalhadas;
    }
    @Override
    public String toString() {
        return "\nNome: " + nome + "\nMatricula: " + matricula;
    }
    public abstract float calcularSalario();
}