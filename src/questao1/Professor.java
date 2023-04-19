package questao1;

public class Professor extends Pessoa{

    float salarioHora;
    int horasAula;

    public Professor(String nome, String email, String senha, float salarioHora, int horasAula) {
        super(nome, email, senha);
        this.salarioHora = salarioHora;
        this.horasAula = horasAula;
    }

    public float getSalarioHora() {
        return salarioHora;
    }

    public void setSalarioHora(float salarioHora) {
        this.salarioHora = salarioHora;
    }

    public int getHorasAula() {
        return horasAula;
    }

    public void setHorasAula(int horasAula) {
        this.horasAula = horasAula;
    }

    double CalcularSalario(){
        return getSalarioHora() * getHorasAula();
    }

    String MostrarProfessor(){
        return "Nome:" + getNome() + "\nE-mail:" + getEmail() + "\nSalario: R$" + CalcularSalario();
    }


}
