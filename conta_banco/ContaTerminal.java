package conta_banco;

import java.util.Scanner;

/**
 * ContaTerminal
 */
public class ContaTerminal {

    //atributos
    private int numConta;
    private String agencia;
    private String nomeCliente;
    private float saldo;

    Scanner teclado = new Scanner(System.in);

    //construtor
    public ContaTerminal() {

        System.out.println("");
        System.out.println("Seja bem vindo ao banco :)");
        System.out.println("");

        System.out.print("Por favor digite o número da sua conta: ");
        this.setNumConta(teclado.nextInt());

        System.out.print("Por favor digite o número da sua agência: ");
        this.setAgencia(teclado.next());

        System.out.print("Por favor digite o seu nome: ");
        this.setNomeCliente(teclado.next());

        this.saldo = 237.48f;
    }

    //metodos acessores
    public int getNumConta() {
        return numConta;
    }
    public void setNumConta(int numConta) {
        this.numConta = numConta;
    }

    public String getAgencia() {
        return agencia;
    }
    public void setAgencia(String agencia) {
        this.agencia = agencia;
    }

    public String getNomeCliente() {
        return nomeCliente;
    }
    public void setNomeCliente(String nomeCliente) {
        this.nomeCliente = nomeCliente;
    }

    public float getSaldo() {
        return saldo;
    }
    
}