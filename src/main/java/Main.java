public class Main {
    public static void main(String[] args) {
        RevertirFrase expresion = new RevertirFrase();

        String texto = "Hola mundo desde Java";
        String resultado = expresion.revertir(texto);
        String resultadoCaracter = expresion.revertirCaracter(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto revertido: " + resultado);

        System.out.println("texto original: " + texto);
        System.out.println("Texto revertido por caracteres: " + resultadoCaracter);

    }
}
