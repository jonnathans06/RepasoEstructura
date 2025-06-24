import java.util.*;

public class RevertirFrase {

    public String revertir(String texto) {

        Stack<String> stackPalabras = new Stack<>();

        String[] palabras = texto.split(" ");

        for (String palabra : palabras) {
            stackPalabras.push(palabra);
        }

        StringBuilder resultado = new StringBuilder();

        while (!stackPalabras.isEmpty()) {
            resultado.append(stackPalabras.pop()).append(" ");
        }


        return resultado.toString();
    }

    public String revertirCaracter (String texto) {
        Stack<String> stackPalabras = new Stack<>();

        for (int i = 0; i < texto.length(); i++) {
            char caracter = texto.charAt(i);
            stackPalabras.push(String.valueOf(caracter));
        }

        StringBuilder resultado = new StringBuilder();
        while (!stackPalabras.isEmpty()) {
            resultado.append(stackPalabras.pop());
        }
         return resultado.toString();
    }
}
