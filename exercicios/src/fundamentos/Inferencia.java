package fundamentos;

public class Inferencia {
    public static void main(String[] args) {
        double a = 4.5; // declaração e inicialização
        System.out.println(a);

        a = 12; // reatribuição
        System.out.println(a);

        // a = "..."; // Erro de compilação

        var b = 4.5;
        System.out.println(b);

        var c = "Texto";
        System.out.println(c);

        c = "Outro texto";
        System.out.println(c);

        // c = 4.5; // Erro de compilação

        double d; // variável declarada
        d = 123.65; // inicialização
        System.out.println(d); // uso

        var e = 123.65;
        System.out.println(e);

        var f = 12; // int
        // f = 12.01; Erro de compilação
        System.out.println(f);
    }
}
