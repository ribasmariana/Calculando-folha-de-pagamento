public class Funcionario {
    private Integer matricula;
    private Double salarioBruto;
    private Pessoa pessoa;

    public Funcionario(Integer matricula, Double salarioBruto, Pessoa pessoa) {
        this.matricula = matricula;
        this.salarioBruto = salarioBruto;
        this.pessoa = pessoa;
    }

    @Override
    public String toString() {
        return "Funcionario{" +
                "matricula=" + matricula +
                ", salarioBruto=" + salarioBruto +
                ", pessoa=" + pessoa +
                '}';
    }

    public Integer getMatricula() {
        return matricula;
    }

    public Double getSalarioBruto() {
        return salarioBruto;
    }

    public Pessoa getPessoa() {
        return pessoa;

    }
}
