package Abstrata;

public class Desenvolvedor extends Funcionario implements Trabalho{

    private String Domina;


    public Desenvolvedor() {
    }
    public Desenvolvedor(String nome, int matricula, float valorHora, int horasTrabalhadas,
            String Domina) {
        super(nome, matricula, valorHora, horasTrabalhadas);
        this.Domina = Domina;
    }

    public String getDomina() {
        return Domina;
    }
    public void setDomina(String Domina) {
        this.Domina = Domina;
    }
    @Override
    public String trabalhar() {
        return  getNome() + " esta trabalhando";
    }
    @Override
    public String toString() {
        
        return super.toString() + 
        "\nDesenvolvedor" + "\nDomina: " + Domina + "\nSalario: " + calcularSalario();
    }
    @Override
    public String relatarProgresso() {
        return"O desenvolvedor " + getNome() + " esta finalizando o projeto.";
    }
    
    @Override
    public float calcularSalario() {
        return (getHorasTra() * getValorH());        
    }
}