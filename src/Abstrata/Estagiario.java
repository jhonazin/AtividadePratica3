package Abstrata;

public class Estagiario extends Funcionario implements Trabalho{

    private String supervisor;

    public Estagiario() {
    }

    public Estagiario(String nome, int matricula, float valorHora, int horasTrabalhadas,
            String supervisor){
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.supervisor = supervisor;
    }
    public String getSupervisor() {
        return supervisor;
    }

    public void setSupervisor(String supervisor) {
        this.supervisor = supervisor;
    }
    @Override
    public float calcularSalario() {
        return (getHorasTra() * getValorH());
    }
    @Override
    public String toString() {
        return super.toString() +
        "\nEstagiario" + "\nGerente: " + supervisor + "\nSalario: " + calcularSalario();
    }
    @Override
    public String trabalhar() {
        return getNome() + " esta trabalhando e sendo supervisionado por " + getSupervisor();
    }
    @Override
    public String relatarProgresso() {
        return"De acordo com o " + getSupervisor() + " o estagiario " + getNome() + " esta indo bem";
    }
   
}