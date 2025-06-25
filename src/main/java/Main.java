import java.util.Arrays;
import java.util.LinkedList;
import java.util.Stack;

public class Main {
    public static void main(String[] args) {
        Ejercicios expresion = new Ejercicios();

        String texto = "Hola mundo desde Java";
        String textEliminar = "211433";
        String resultado = expresion.revertir(texto);
        String resultadoCaracter = expresion.revertirCaracter(texto);

        System.out.println("Texto original: " + texto);
        System.out.println("Texto revertido: " + resultado);

        System.out.println("texto2 original: " + texto);
        System.out.println("Texto revertido por caracteres: " + resultadoCaracter);

        System.out.println("Texto original: " + textEliminar);
        System.out.println("Texto sin caracteres repetidos: " + expresion.eliminarRepatidos(textEliminar));

        EjerciciosProfe ejerciciosProfe = new EjerciciosProfe();

        // Datos a enviar
        String cadena = "Hola Mundo";
        String texto2 = "{[()]}";
        Stack<Integer> resultado2 = new Stack<Integer>();
        resultado2.push(3);
        resultado2.push(1);
        resultado2.push(4);
        LinkedList<Integer> pila = new LinkedList<>(Arrays.asList(1,2,3,4));


        // Salidas en consola
        System.out.println("Cadena original: " + cadena);
        System.out.println("Cadena invertida: " + ejerciciosProfe.invertirCadena(cadena));

        System.out.println("Texto original: " + texto2);
        System.out.println("¿Los símbolos están balanceados? " + ejerciciosProfe.validarSimbolos(texto2));

        System.out.println("Pila original: " + resultado2);
        System.out.println("Pila ordenada: " + ejerciciosProfe.ordenarPila(resultado2));

        System.out.println("Lista original: " + pila);
        System.out.println("Lista clasificada: " + ejerciciosProfe.clasificarPorPariedad(pila));

    }
}
