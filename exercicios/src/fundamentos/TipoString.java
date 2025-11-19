package fundamentos;

public class TipoString {
    public static void main(String[] args) {

        // charAt(2) pega o caractere que está na posição 2 (começa do 0)
        // "Olá pessoal" -> O(0) l(1) á(2) ...
        System.out.println("Olá pessoal".charAt(2));

        String s = "Boa tarde";

        // concat() concatena (junta) outra String no final
        System.out.println(s.concat("!!!"));

        // O operador + também concatena Strings
        System.out.println(s + "!!!");

        // Verifica se a String começa com "Boa" (sensível a maiúsculas/minúsculas)
        System.out.println(s.startsWith("Boa"));

        // Converte a String para minúsculas e depois verifica se começa com "boa"
        System.out.println(s.toLowerCase().startsWith("boa"));

        // Converte a String para maiúsculas e verifica se termina com "TARDE"
        System.out.println(s.toUpperCase().endsWith("TARDE"));

        // length() retorna o tamanho da String (quantidade de caracteres)
        System.out.println(s.length());

        // Compara o conteúdo da String (após converter para minúsculas)
        System.out.println(s.toLowerCase().equals("boa tarde"));

        // Compara ignorando maiúsculas/minúsculas
        System.out.println(s.equalsIgnoreCase("boa tarde"));

        var nome = "Pedro";
        var sobrenome = "Santos";
        var idade = 33;
        var salario = 12345.987;

        String maisUmaFrase = "Nome: " + nome 
                + "\nSobrenome: " + sobrenome 
                + "\nIdade: " + idade 
                + "\nSalário: " + salario + "\n\n";

        System.out.println(maisUmaFrase);

        // printf permite formatar a saída com placeholders:
        // %s = String, %d = inteiro, %.2f = número com 2 casas decimais
        System.out.printf("O senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);

        // String.format faz a mesma formatação, mas devolve uma String em vez de imprimir direto
        String frase = String.format(
                "\nO senhor %s %s tem %d anos e ganha R$ %.2f.",
                nome, sobrenome, idade, salario);

        System.out.println(frase);

        // contains() verifica se a String contém a sequência informada
        System.out.println("Frase qualquer".contains("qual"));

        // indexOf() retorna o índice onde a substring começa
        // Se não encontrar, retorna -1
        System.out.println("Frase qualquer".indexOf("qual"));

        // substring(6) pega a String a partir do índice 6 até o final
        System.out.println("Frase qualquer".substring(6));

        // substring(6, 10) pega do índice 6 até o 10 (10 não entra)
        System.out.println("Frase qualquer".substring(6, 10));
    }
}
