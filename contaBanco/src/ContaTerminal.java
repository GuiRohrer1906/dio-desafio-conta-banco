import java.util.Scanner;

public class ContaTerminal {

    public static void main(String[] args) throws Exception {
        //TODO: Conhecer e importar classe Scanner
        Scanner sc = new Scanner(System.in);
                
        //Exibir as mensagens para o nosso usuário
        System.out.print("Digite o seu nome completo: ");
        String nome = sc.nextLine();

        System.out.print("Informe o número que deseja cadastrar sua conta: ");
        int conta = sc.nextInt();
        sc.nextLine();

        System.out.print("Informe o número de sua agência: ");
        String agencia = sc.nextLine();

        System.out.print("Informe o valor de seu primeiro depósito: ");
        float saldo = sc.nextFloat();
                            
        System.out.println("\nOlá " + nome + ", obrigado por criar uma conta em nosso banco.");
        System.out.println("Sua agência é " + agencia + ", conta " + conta + " e seu saldo R$" + saldo + " já está disponível para saque.");

        sc.close();
        //Obter pela scanner os valores digitados no terminal

        //Exibir a mensagem conta criada
    }
}


