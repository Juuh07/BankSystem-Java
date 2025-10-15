public class ContaBancaria {
    private int numero;
    private double saldo;
    private String titular;

    public ContaBancaria(int numero, double saldo, String titular){
        this.numero = numero;
        this.saldo = saldo;
        this.titular = titular;
    }

    public int getNumero(){
        return numero;
    }
    public double getSaldo(){
        return saldo;
    }
    public String getTitular(){
        return titular;
    }
    public void setSaldo(double saldo){
        this.saldo = saldo;
    }

    public void depositar(double valor){
        if (valor > 0){
            saldo += valor;
            System.out.println("Depósito realizado!");
        }else{
            System.out.println("Depósito inválido!");
        }
    }

    public void sacar(double valor){
        if (valor > 0 && valor <= saldo){
        saldo -= valor;
        System.out.println("Saque realizado!");
        }else{
        System.out.println("Saque inválido!");
        }
    }

    public void sacar(double valor, String motivo){
        if (valor > 0 && valor <= saldo){
        saldo -= valor;
        System.out.println("Saque realizado! Motivo: " + motivo);
        }else{
        System.out.println("Saque inválido!");
        }
    }

    public void exibirDetalhes(){
        System.out.println("Número: " + numero);
        System.out.println("Saldo: " + saldo);
        System.out.println("Titular: " + titular);
    }
}
