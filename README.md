# Actividad-Pilas-
Con este proyecto se pretendía conocer y aplicar el concepto de pila (Stack) de modo práctico mediante la creación de un simulador de deshacer y rehacer (Undo/Redo) en Java.


# Comprensión teórica: definición y estructura de pila

Una pila (stack) es una estructura de datos lineal que cumple con la regla LIFO (Last In, First Out), es decir, la historia más reciente es la que primero sale.
Las pilas se utilizan para almacenar información de transmisión temporalmente, o bien controlar los flujos de las secuencias de acciones o de estados.

Algunas de las operaciones básicas de la pila son:

push: inserta un elemento en el tope de la pila.

pop: eliminar del tope de la pila el elemento que allí está y devolvérselo.

peek: permite volver a consultar el elemento que hay en la cima de la pila, pero sin eliminarlo.

isEmpty: controla si la pila está vacía.

En este proyecto se va a utilizar la pila para simular un editor de textos a través de las operaciones de deshacer y rehacer que se realizaran para ello: la pila principal guarda todas las líneas de textos que el usuario va escribiendo.

Al realizar un Undo: la última línea escrita se elimina de la pila principal y se almacena en la pila secundaria.

Finalmente, un Redo hará recuperar el último elemento de la pila secundaria y lo añadirá a la pila principal.

De esta manera, enfatizando que las pilas permiten gestionar los estados del texto y controlar las acciones del usuario en el mismo sentido que funcionan los editores de texto como los actuales editores de texto.


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



