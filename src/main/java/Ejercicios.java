import java.util.*;

public class Ejercicios {

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

     public String eliminarRepatidos(String textoEliminar) {
        List<String> palabras = new ArrayList<>();

        for (int i = 0; i < textoEliminar.length(); i++) {
            char c = textoEliminar.charAt(i);

            if(!palabras.contains(String.valueOf(c))) {
                palabras.add(String.valueOf(c));
            }
        }

        StringBuilder resultado = new StringBuilder();

        for (String palabra : palabras) {
            resultado.append(palabra);
        }

        return resultado.toString();
     }
}
