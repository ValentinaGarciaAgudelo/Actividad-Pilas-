# Actividad-Pilas-
Con este proyecto se busco comprender y aplicar el concepto de pila (Stack) en un caso práctico mediante el desarrollo de un simulador de deshacer y rehacer (Undo/Redo) en Java.


# Implementación o Ruta Metodológica

El proyecto se ejecutó de acuerdo con las siguientes fases: 
Ejecución de la estructura de pilas manualmente en Java 
•	Se declaró una clase llamada Pila, la cual explica cómo se puede modelar una estructura de datos de tipo stack.
•	Dicha clase maneja internamente un array (String[] elementos) y un índice que se llama tope, el cual permite saber cuál es la última posición ocupada.
•	No se utilizó java.util.Stack, puesto que el objetivo consiste precisamente en entender cómo se hace la implementación interna de una pila.


# Definición de las operaciones básicas de la pila

Se introdujeron los métodos básicos: se implementan los métodos básicos que permiten gestionar una pila:
•	push(String dato): inserta un nuevo elemento en la pila.
•	pop(): elimina el último elemento dado y lo retorna.
•	peek(): retorna el último elemento sin eliminarlo.
•	isEmpty(): retorna true, si la pila está vacía.


# Implementación de dos pilas para coordenar las acciones del editor de texto.

•	Pila Principal: es la pila que puede almacenar las líneas de texto que van escribiendo los usuarios. 
•	Pila Secundaria: es la pila que permite almacenar las líneas de texto que se van eliminando (para posteriormente poder recuperar esas líneas eliminadas).
Esta lógica permite modelar la lógica del comportamiento Undo y Redo del editor de texto.


# Creación de un menú en consola

Se introduce un ciclo do-while en el que se denotan las siguientes opciones las siguientes opciones que se ofrecen al usuario:
Escribir texto: agrega una línea a la pila principal.
Deshacer (Undo): destruye la última línea escrita y la almacena en la secuencia secundaria. 
Rehacer (Redo): recupera la última línea deshecha y la incorpora en la pila principal.
Mostrar texto actual: recorre la pila principal e imprime lo que se ha escrito. 
Salir: termina la ejecución del programa. 

# Documentación del código con comentarios

•	Se han añadido una serie de comentarios explicativos de la lógica en cada clase y método.
•	Los comentarios ayudan a comprender la lógica del programa y a ayudar a la realización de la exposición del trabajo en grupo.


# Contribuyentes (integrantes del grupo)

•	Valentina García Agudelo
•	Cindy Loreny Guarín 


