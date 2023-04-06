public class CalculoFolha {
    public static void main(String []args){
        Pessoa pessoa = new Pessoa("Mariana", "123.456.789-00", "Rua 1, Bairro 2, Cidade 3", "48 99999-9999");
        Funcionario funcionario = new Funcionario(123456, 3500.0, pessoa);
        Folha folha = new Folha(funcionario, 15);
        folha.calculando();

        System.out.println(pessoa.getNome() + " possui salário bruto de " + funcionario.getSalarioBruto() + ", salário líquido de " +
                folha.getSalarioLiq() + " e deve receber no dia " + folha.getDataPag() + " todos os meses");

    }
}
