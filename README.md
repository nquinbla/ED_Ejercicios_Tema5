# ESTRUCTURA DE DATOS: EJERCICIOS UNIDAD 5
Ejercicios de la unidad 5 de Nerea Quintanilla Blanco, AL EJECUTAR ABRIR EN VENTANA GRANDE Y VOLVER A PONERLA PEQUEÑA
LINK -> https://github.com/nquinbla/ED_Ejercicios_Tema5.git

## DESCRIPCIÓN
Un proyecto que se basa en todo lo aprendido a lo largo de la unidad 5 de la asignatura de Estructura de Datos. En este proyecto encontraremos diferentes ejercicios que hacen cosas diversas acompañados de un main que ejecuta todo y un decopanel que lo adorna:
* Main: Esta es la clase principal del proyecto. Se encarga de la creación y gestión de la interfaz gráfica de usuario (GUI). En esta clase, se crean y configuran todos los componentes de la GUI, como botones, paneles y etiquetas. También se manejan los eventos de los botones, es decir, se define qué sucede cuando se hace clic en cada botón. Cada botón abre una nueva ventana con una funcionalidad específica, como "Suma de números naturales", "Lista de números", "Cantidad de dígitos", etc.  
* DecoPanel: Esta es una subclase de JPanel que se utiliza para crear un panel personalizado con una imagen y líneas dibujadas en él. En el constructor de esta clase, se carga la imagen y se escala a un tamaño específico. En el método paintComponent, se dibujan las líneas y la imagen en el panel. Este panel se utiliza como el panel de contenido del marco principal en la clase Main.


### [EJ.1] (10 minutos) 
Construir una función recursiva que calcule la suma de los n primeros números naturales.
* GUI_SumaNumNaturales: Esta clase es una interfaz gráfica de usuario (GUI) para calcular la suma de los primeros N números naturales. Contiene un campo de texto para que el usuario introduzca un número, un botón para calcular la suma y una etiqueta para mostrar el resultado. Cuando el usuario hace clic en el botón, se llama a la función sumaRecursiva de la clase * SumaNumNaturales para calcular la suma.  
SumaNumNaturales: Esta clase contiene un método llamado sumaRecursiva que calcula la suma de los primeros N números naturales de forma recursiva. Si el número es menor o igual a cero, devuelve cero. De lo contrario, suma el número al resultado de la función sumaRecursiva llamada con el número menos uno.

### [EJ.2] (20 minutos) 
Construir una función recursiva que imprima la lista de números naturales comprendidos entre dos valores a y d dados por el usuario.
* GUI_ListaNumDosVal: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir dos números y luego imprime todos los números entre esos dos valores. Contiene dos campos de texto para que el usuario introduzca los números, un botón para imprimir los números y un área de texto para mostrar los números. Cuando el usuario hace clic en el botón, se llama a la función imprimirNumeros de la clase ListaNumDosVal para imprimir los números.  
* ListaNumDosVal: Esta clase contiene un método llamado imprimirNumeros que imprime todos los números entre dos valores dados. Si el primer número es menor o igual al segundo, imprime el primer número y luego llama a la función imprimirNumeros con el primer número incrementado en uno y el segundo número

### [EJ.3] (15 minutos) 
Escribir una función recursiva que devuelva la cantidad de dígitos de un número entero.

### [EJ.4] (15 minutos) 
Escribir una función recursiva que calcule xy mediante multiplicaciones sucesivas, siendo x e y dos números enteros.

### [EJ.5] (20 minutos) 
Calcula mediante un diseño recursivo el valor máximo de un vector de componentes numéricas.

### [EJ.6] (30 minutos) 
Escribir la función recursiva que recibiendo como parámetros una cadena de dígitos hexadecimales y su longitud devuelva el valor decimal que representa dicha cadena.

### [EJ.7] (5 minutos) 
Calcular C (n,k) siendo: C (n,k)= C (n-1,k) + C (n-1,k-1) si n>k>0, y 1 en otro caso

### [EJ.8] (20 minutos) 
Cada tres bases de una cadena de ADN codifican un aminoácido de una proteína. Existe una secuencia especial de bases de la cadena, ATG, que es una especie de “marca” del principio de un gen, esto es, una secuencia de bases que codifica una determinada proteína. También existen tres secuencias diferentes de fin de gen. Podemos a partir de una cadena de ADN contar cuántos genes tiene contando el número de veces que ocurre la tripleta ATG. Genera una cadena de ADN aleatorio, y a continuación cuenta cuántos genes contendría si se tratase de una cadena de ADN real.

### [EJ.9] (20 minutos) 
Dado un fichero de texto ordena sus líneas alfabéticamente, generando un archivo nuevo que contenga el texto ordenado.

### [EJ.10] (15 minutos) 
Dado un fichero de texto realizar un programa que permita buscar en él una palabra dada. Las palabras no tienen por qué estar ordenadas alfabéticamente y ninguna de ellas contiene la letra ñ.

### [EJ.11] (15 minutos) 
Modificar el programa anterior para que emplee una búsqueda binaria.

### [EJ.12] (20 minutos) 
Escribir un programa que permita introducir fechas al usuario. El usuario podrá introducir n fechas, y a continuación podrá listar todas las fechas ordenadas cronológicamente.

### [EJ.13] (30 minutos diseño -> 30 minutos implementación) 
Optimizar la implementación del algoritmo quicksort dada en los apuntes según las indicaciones del último apartado de este tema (ejercicio voluntario).
