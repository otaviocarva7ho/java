package fundamentos;

public class ConversaoTipoPrimitivoNumerico {
    public static void main(String[] args) {

        // Quando um tipo menor é convertido para um tipo maior,
        // o Java faz a conversão automaticamente (conversão implícita).
        // int -> double (double tem maior capacidade)
        double a = 1;
        System.out.println(a); // imprime 1.0

        // Aqui o valor literal 1.123456789 é um double.
        // Como float tem menor precisão, é necessário fazer um cast (conversão explícita).
        float b = (float) 1.123456789;
        System.out.println(b); // pode perder precisão

        // int -> byte exige conversão explícita porque byte tem faixa muito menor (-128 a 127).
        int c = 340;
        byte d = (byte) c; 
        System.out.println(d); 
        // Como 340 está fora do limite do byte, ocorre overflow (o valor "estoura" e se ajusta)

        // double -> int também exige cast porque int não tem parte decimal.
        double e = 1.99999;
        int f = (int) e;
        System.out.println(f); 
        // A parte decimal é descartada (não arredonda): resultado = 1
    }
}
