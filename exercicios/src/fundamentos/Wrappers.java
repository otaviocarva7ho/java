package fundamentos;

public class Wrappers {
    public static void main(String[] args) {

        // Wrappers são as versões "objeto" dos tipos primitivos
        // Aqui, Byte e Short estão recebendo valores inteiros (autoboxing)
        Byte b = 100;
        Short s = 1000;

        // Integer representa um int como objeto
        // Long representa um long como objeto
        Integer i = 10000; 
        Long l = 100000L; // o "L" indica que é um long

        // byteValue() devolve o valor primitivo contido no objeto Byte
        System.out.println(b.byteValue());

        // toString() converte o valor para String
        System.out.println(s.toString());

        // Wrappers podem participar de operações matemáticas
        // O Java realiza "unboxing" automaticamente para usar o valor primitivo
        System.out.println(i * 3); // i vira int temporariamente
        System.out.println(l / 3); // l vira long temporariamente

        // Wrapper Float (versão objeto do float)
        Float f = 123.45F; // "F" indica float literal
        System.out.println(f);

        // Wrapper Double (versão objeto do double)
        Double d = 1234.5678;
        System.out.println(d);

        // Boolean.parseBoolean() converte uma String para valor booleano
        Boolean bo = Boolean.parseBoolean("true");
        System.out.println(bo);

        // toString() transforma o boolean em String
        // toUpperCase() deixa a String toda maiúscula
        System.out.println(bo.toString().toUpperCase());

        // Character é o wrapper do tipo primitivo char
        Character c = '#';
        System.out.println(c + "...");
    }
}
