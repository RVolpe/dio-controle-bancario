public class Main {

    public static void main(String[] args) {

        Cliente rodrigo = new Cliente();
        rodrigo.setNome("Rodrigo Volpe");

//        ContaCorrente cc = new ContaCorrente();
//        ContaPoupanca poupanca = new ContaPoupanca();

//        Conta cc = new ContaCorrente();
//        Conta poupanca = new ContaPoupanca();

        IConta cc = new ContaCorrente(rodrigo);
        IConta poupanca = new ContaPoupanca(rodrigo);

        cc.depositar(100.00);
        cc.transferir(50.00, poupanca);

        cc.imprimirExtrato();
        System.out.println(" ");
        poupanca.imprimirExtrato();
    }
}

/*
=== Extrato da Conta Corrente ===
Titular: Rodrigo Volpe
Agência: 1
Número: 1
Saldo: 50,00

=== Extrato da Conta Poupança ===
Titular: Rodrigo Volpe
Agência: 1
Número: 2
Saldo: 50,00
*/
