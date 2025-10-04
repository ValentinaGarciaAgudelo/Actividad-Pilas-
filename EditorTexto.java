import java.util.Scanner;

/**
 * Clase que implementa la estructura de datos Pila (Stack) de forma manual.
 * Cada pila puede almacenar un número limitado de elementos (definido en el constructor).
 * Se usa un arreglo interno y un puntero "tope" para manejar las operaciones.
 */
class Pila {
    String[] elementos;  // Arreglo donde se almacenan los elementos
    int tope;            // Índice del último elemento ingresado
    int capacidad;       // Capacidad máxima de la pila

    /**
     * Constructor de la pila.
     * @param capacidad número máximo de elementos que puede almacenar
     */
    public Pila(int capacidad) {
        this.capacidad = capacidad;
        elementos = new String[capacidad];
        tope = -1; // inicialmente la pila está vacía
    }

    /**
     * Inserta un elemento en la pila (push).
     * @param dato texto a guardar
     */
    public void push(String dato) {
        if (tope < capacidad - 1) {
            elementos[++tope] = dato;
        } else {
            System.out.println("⚠️ La pila está llena, no se puede agregar más elementos.");
        }
    }

    /**
     * Extrae el último elemento agregado (pop).
     * @return el elemento eliminado o null si la pila está vacía
     */
    public String pop() {
        if (!isEmpty()) {
            return elementos[tope--];
        }
        return null;
    }

    /**
     * Consulta el último elemento agregado sin eliminarlo (peek).
     * @return el elemento en la cima o null si está vacía
     */
    public String peek() {
        if (!isEmpty()) {
            return elementos[tope];
        }
        return null;
    }

    /**
     * Verifica si la pila está vacía.
     * @return true si no tiene elementos, false si tiene al menos uno
     */
    public boolean isEmpty() {
        return tope == -1;
    }
}

/**
 * Clase principal que simula un editor de texto básico con funcionalidades de:
 * - Escribir texto
 * - Deshacer (Undo)
 * - Rehacer (Redo)
 * - Mostrar contenido actual
 * 
 * Se utilizan dos pilas:
 * 1. pilaPrincipal -> guarda el texto escrito
 * 2. pilaSecundaria -> guarda lo que se deshizo, permitiendo rehacerlo
 */
public class EditorTexto {
    public static void main(String[] args) {
        Scanner sc = new Scanner(System.in);

        // Pila principal: almacena las líneas de texto que el usuario escribe
        Pila pilaPrincipal = new Pila(100);

        // Pila secundaria: almacena las líneas eliminadas con "deshacer"
        Pila pilaSecundaria = new Pila(100);

        int opcion; // opción seleccionada del menú

        // Bucle principal del menú
        do {
            // Mostrar opciones
            System.out.println("\n===== MENÚ =====");
            System.out.println("1. Escribir texto");
            System.out.println("2. Deshacer (Undo)");
            System.out.println("3. Rehacer (Redo)");
            System.out.println("4. Mostrar texto actual");
            System.out.println("5. Salir");
            System.out.print("Elige una opción: ");
            opcion = sc.nextInt();
            sc.nextLine(); // limpiar buffer del Scanner

            switch(opcion) {
                case 1: // Opción escribir texto
                    System.out.print("Escribe el texto: ");
                    String texto = sc.nextLine();
                    pilaPrincipal.push(texto);
                    // Al escribir un nuevo texto, se limpia la pila secundaria (redo),
                    // porque ya no tendría sentido rehacer lo anterior.
                    pilaSecundaria = new Pila(100);
                    break;

                case 2: // Opción deshacer
                    if (!pilaPrincipal.isEmpty()) {
                        String deshecho = pilaPrincipal.pop(); // se quita lo último escrito
                        pilaSecundaria.push(deshecho);         // se guarda en la pila de redo
                        System.out.println("✔ Se deshizo: " + deshecho);
                    } else {
                        System.out.println("⚠️ Nada que deshacer.");
                    }
                    break;

                case 3: // Opción rehacer
                    if (!pilaSecundaria.isEmpty()) {
                        String rehecho = pilaSecundaria.pop(); // recupera lo que se deshizo
                        pilaPrincipal.push(rehecho);           // lo devuelve a la pila principal
                        System.out.println("✔ Se rehizo: " + rehecho);
                    } else {
                        System.out.println("⚠️ Nada que rehacer.");
                    }
                    break;

                case 4: // Mostrar el contenido actual del texto
                    mostrarTexto(pilaPrincipal);
                    break;

                case 5: // Salir del programa
                    System.out.println("👋 Saliendo...");
                    break;

                default:
                    System.out.println("⚠️ Opción inválida, intenta de nuevo.");
            }
        } while(opcion != 5);

        sc.close();
    }

    /**
     * Método auxiliar para imprimir en pantalla el contenido actual de la pila principal.
     * @param pila pila de la que se quiere mostrar el contenido
     */
    public static void mostrarTexto(Pila pila) {
        if (pila.isEmpty()) {
            System.out.println("(El texto está vacío)");
            return;
        }
        System.out.println("\n--- Texto actual ---");
        for (int i = 0; i <= pila.tope; i++) {
            System.out.println(pila.elementos[i]);
        }
    }
}
