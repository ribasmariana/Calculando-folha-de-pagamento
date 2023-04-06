public class Folha {
    private Funcionario funcionario;
    private Integer dataPag;
    private Double salarioLiq;

    public void calculando(){
        if ((funcionario.getSalarioBruto()>=3000) && funcionario.getSalarioBruto()<=6000){
            salarioLiq = funcionario.getSalarioBruto() - (funcionario.getSalarioBruto()*7.5)/100;
        }else if((funcionario.getSalarioBruto()>=6001) && funcionario.getSalarioBruto()<=9000){
            salarioLiq = funcionario.getSalarioBruto() - (funcionario.getSalarioBruto()*15)/100;
        }else if((funcionario.getSalarioBruto()>=9001) && funcionario.getSalarioBruto()<=15000){
            salarioLiq = funcionario.getSalarioBruto() - (funcionario.getSalarioBruto()*17.5)/100;
        }else if(funcionario.getSalarioBruto()>=9001){
            salarioLiq = funcionario.getSalarioBruto() - (funcionario.getSalarioBruto()*27.5)/100;
        }else {
            System.out.println("Não possui descontos!");
            salarioLiq = funcionario.getSalarioBruto();
        }

        this.salarioLiq=salarioLiq;
    }

    public Funcionario getFuncionario() {
        return funcionario;
    }

    public Integer getDataPag() {
        return dataPag;
    }

    public Double getSalarioLiq() {
        return salarioLiq;
    }

    public void setSalarioLiq(Double salarioLiq) {
        this.salarioLiq = salarioLiq;
    }

    public Folha(Funcionario funcionario, Integer dataPag) {
        this.funcionario = funcionario;
        this.dataPag = dataPag;

    }
}
