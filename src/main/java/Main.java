public class Main {
    public static void main(String[] args) {
        Ejercicios expresion = new Ejercicios();

        String texto = "Hola mundo desde Java";
        String textEliminar = "211433";
        String resultado = expresion.revertir(texto);
        String resultadoCaracter = expresion.revertirCaracter(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto revertido: " + resultado);

        System.out.println("texto original: " + texto);
        System.out.println("Texto revertido por caracteres: " + resultadoCaracter);

        System.out.println("Texto original: " + textEliminar);
        System.out.println("Texto sin caracteres repetidos: " + expresion.eliminarRepatidos(textEliminar));
    }
}
