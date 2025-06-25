import java.util.*;

public class EjerciciosProfe {

    public String invertirCadena (String cadena){
        Stack<Character> stack = new Stack<>(); // Generamos un stack que sera de tipo Character
        StringBuilder resultado = new StringBuilder(); // StringBuilder para almacenar el resultado

        for(int i = 0; i < cadena.length(); i++){ // Recorremos la cadena de texto
            char c = cadena.charAt(i); // Obtenemos el carácter en la posición i
            stack.push(c); // Añadimos el carácter al stack
        }

        while(!stack.isEmpty()){ // Mientras el stack no esté vacío
            resultado.append(stack.pop()); // Sacamos el último carácter del stack y lo añadimos al resultado
        }

        return  resultado.toString();
    }

    public boolean validarSimbolos(String texto) {
        Stack<Character> stack = new Stack<>();

        for(int i = 0; i < texto.length(); i++){
            char c = texto.charAt(i);

            if (c == '(' || c == '{' || c == '['){
                stack.push(c);
            } else if (c == ')' || c == '}' || c == ']') {
                if (stack.isEmpty()) {
                    return false;
                }
                if (stack.peek() == '(' && c == ')') {
                    stack.pop();
                } else if (stack.peek() == '{' && c == '}') {
                    stack.pop();
                } else if (stack.peek() == '[' && c == ']') {
                    stack.pop();
                }
            } else {
                return false;
            }
        }
        return stack.isEmpty();
    }

    public List<Integer> ordenarPila (Stack<Integer> pila){
        Stack<Integer> stackAux = new Stack<>(); // Pila auxiliar para ordenar los elementos
        List<Integer> resultado = new ArrayList<>(); // Lista para almacenar el resultado final

        while(!pila.isEmpty()){ // Mientras la pila original no esté vacía
            int temp = pila.pop(); // Sacamos el último elemento de la pila original

            while (!stackAux.isEmpty() && stackAux.peek() > temp){ // Mientras la pila auxiliar no esté vacía y el último elemento de la pila auxiliar sea mayor que el elemento temporal
                pila.push(stackAux.pop()); // Sacamos el último elemento de la pila auxiliar y lo volvemos a añadir a la pila original
            }
            stackAux.push(temp); // Añadimos el elemento temporal a la pila auxiliar
        }

        while (!stackAux.isEmpty()){ // Mientras la pila auxiliar no esté vacía
            pila.push(stackAux.pop()); // Sacamos el último elemento de la pila auxiliar y lo añadimos a la pila original
        }

        while(!pila.isEmpty()){ // Mientras la pila original no esté vacía
            resultado.add(pila.pop()); // Sacamos el último elemento de la pila original y lo añadimos a la lista de resultados
        }
        return  resultado;
    }

    public List<Integer> clasificarPorPariedad (LinkedList<Integer> pila){
        LinkedList<Integer> resultadoPares = new LinkedList<>();
        LinkedList<Integer> resultadoImpares = new LinkedList<>();
        LinkedList<Integer> resultadoOrdenados = new LinkedList<>();

        for(Integer numeros : pila){
            if(numeros % 2 == 0){
                resultadoPares.add(numeros);
            } else {
                resultadoImpares.add(numeros);
            }
        }

        while (!resultadoPares.isEmpty()){
            resultadoOrdenados.add(resultadoPares.pop());
        }
        while (!resultadoImpares.isEmpty()){
            resultadoOrdenados.add(resultadoImpares.pop());
        }
        return resultadoOrdenados;
    }

}
