public class ContaCorrente extends ContaBancaria {
    private double limiteChequeEspecial;

    public ContaCorrente(ContaBancaria conta, double limiteChequeEspecial){
        super(conta.getNumero(), conta.getSaldo(), conta.getTitular());
        this.limiteChequeEspecial = limiteChequeEspecial;
    }

    @Override
    public void sacar(double valor){
        if (valor <= getSaldo() + limiteChequeEspecial){
           setSaldo(getSaldo() - valor);
           System.out.println("Saque realizado!");
        }else{
            System.out.println("Saque inválido! Limite do cheque especial excedido.");
        }
    }
    
    @Override
    public void exibirDetalhes() {
        super.exibirDetalhes();
        System.out.println("Limite do cheque especial: " + limiteChequeEspecial);
    }
}
