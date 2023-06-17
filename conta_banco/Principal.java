package conta_banco;

/**
 * Principal
 */
public class Principal {

    public static void main(String[] args) {
        
        ContaTerminal conta1 = new ContaTerminal();

        System.out.println("");
        System.out.println("Óla " + conta1.getNomeCliente() + ", obrigado por criar uma conta em nosso banco, sua agência é " + conta1.getAgencia() + ", conta " + conta1.getNumConta() + " e seu saldo " + conta1.getSaldo() + " já está disponivel para saque.");
    }
}