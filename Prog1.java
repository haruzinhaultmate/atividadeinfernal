public class Prog1 { // nome da classe com primeira letra maiúscula 
  public static void main (String[] x1) {
    System.out.print("Ola, pessoal do CTIT."); // mensagem inicial 
    System.out.println("Esse é o nosso primeiro codigo Java");
    // Primeiro codigo java da disciplina
    System.out.println(358);
    System.out.println(3 + 3); // mostrar o resultado da soma
    System.out.println(2 * 5);
    String nome = "Andre Luiz Souza" ;
    System.out.println(nome);
    int saldoConta = 1530;
    System.out.println(saldoConta);
    int idadeCliente = 42;
    idadeCliente = 56; // idadeCliente agora 56 ;
    System.out.println(idadeCliente);
    final int maiorIdade = 18; // final ou constant não pode alterar
    float umaPolegada = 2.54f;
    char umaLetra = 'D'; // com char use '
    boolean boleano = true;
    System.out.println(maiorIdade + " , " + umaPolegada);
    System.out.println(umaLetra + " , " + boleano);
  }
}