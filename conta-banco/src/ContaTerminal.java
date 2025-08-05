import java.util.Scanner;
        //Conhece e importar a classe Scanner;
        //Exibir mensagem para o usuário;
        //Obter pela classe Scanner os valores digitados no terminal;
        //Exibir a mensagem da conta criada;

public class ContaTerminal {
    public static void main(String[] args) throws Exception {

        Scanner scanner = new Scanner(System.in);

        int numero;
        String agencia;
        String nomeCliente;
        double saldo;

        System.out.println("Por favor, digite o número da Conta:");
        numero = scanner.nextInt();
        scanner.nextLine(); // limpa quebra de linha

        System.out.println("Por favor, digite o número da Agência:");
        agencia = scanner.nextLine();

        System.out.println("Por favor, digite o nome do Cliente:");
        nomeCliente = scanner.nextLine();

        System.out.println("Por favor, digite o saldo:");
        String saldoTexto = scanner.nextLine().replace(",", ".");
        saldo = Double.parseDouble(saldoTexto);

        System.out.println("Olá " + nomeCliente + ", obrigado por criar uma conta em nosso banco. Sua agência é "
                + agencia + ", conta " + numero + " e seu saldo R$ " + saldo + " já está disponível para saque.");

        scanner.close();
    }
}
