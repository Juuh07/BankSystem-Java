public class ContaPoupanca extends ContaBancaria{
    private double taxaJuros;

    public ContaPoupanca(ContaBancaria conta, double taxaJuros){
        super(conta.getNumero(), conta.getSaldo(), conta.getTitular());
        this.taxaJuros = taxaJuros;
    }
    
    public void calcularJuros(){
        double saldo = this.getSaldo();
        if(saldo > 0){
            setSaldo(saldo + saldo * (taxaJuros/100));
            System.out.println("Calculo de Juros realizado!");
        }else{
            System.out.println("Saldo insuficiente para calculo de juros!");
        }
    }
    @Override
    public void exibirDetalhes(){
        super.exibirDetalhes();
        System.out.println("Taxa de juros: " + taxaJuros);
    }

}