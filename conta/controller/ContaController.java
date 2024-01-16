package conta.controller;

import java.util.ArrayList;
import java.util.List;
import java.util.Scanner;

import conta.model.Conta;

public class ContaController {
		    private List<Conta> contas;

		    public ContaController() {
		        this.contas = new ArrayList<>();
		    }

		    public Conta procurarPorNumero(int numero) {
		        for (Conta conta : contas) {
		            if (conta.getNumero() == numero) {
		                return conta;
		            }
		        }
		        return null; 
		    }

		    public List<Conta> listarTodas() {
		        return new ArrayList<>(contas);
		    }

		    public void cadastrar(Conta conta) {
		        contas.add(conta);
		    }

		    public void atualizar(Conta conta) {
		        for (int i = 0; i < contas.size(); i++) {
		            if (contas.get(i).getNumero() == conta.getNumero()) {
		                contas.set(i, conta);
		                break;
		            }
		        }
		    }

		    public void deletar(int numero) {
		        contas.removeIf(conta -> conta.getNumero() == numero);
		    }
		    public void sacar(int numero, float valor) {
		        Conta conta = procurarPorNumero(numero);

		        if (conta != null && conta.getSaldo() >= valor) {
		            conta.setSaldo(conta.getSaldo() - valor);
		            System.out.println("Saque realizado com sucesso. Novo saldo: " + conta.getSaldo());
		        } else {
		            System.out.println("Erro ao sacar. Verifique o número da conta e saldo disponível.");
		        }
		    }

		    public void depositar(int numero, float valor) {
		        Conta conta = procurarPorNumero(numero);

		        if (conta != null) {
		            conta.setSaldo(conta.getSaldo() + valor);
		            System.out.println("Depósito realizado com sucesso. Novo saldo: " + conta.getSaldo());
		        } else {
		            System.out.println("Erro ao depositar. Verifique o número da conta.");
		        }
		    }

		    public void transferir(int numeroOrigem, int numeroDestino, float valor) {
		        Conta origem = procurarPorNumero(numeroOrigem);
		        Conta destino = procurarPorNumero(numeroDestino);

		        if (origem != null && destino != null && origem.getSaldo() >= valor) {
		            origem.setSaldo(origem.getSaldo() - valor);
		            destino.setSaldo(destino.getSaldo() + valor);
		            System.out.println("Transferência realizada com sucesso.");
		            System.out.println("Novo saldo da conta " + numeroOrigem + ": " + origem.getSaldo());
		            System.out.println("Novo saldo da conta " + numeroDestino + ": " + destino.getSaldo());
		        } else {
		            System.out.println("Erro ao transferir. Verifique os números das contas e saldo disponível na conta de origem.");
		        }
		    }
		    private int lerNumeroConta() {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Digite o número da conta: ");
		        return in.nextInt();
		    }

		    private float lerValor() {
		        Scanner in = new Scanner(System.in);
		        System.out.print("Digite o valor: ");
		        return in.nextFloat();
		    }

	}


