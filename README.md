# ESTRUCTURA DE DATOS: EJERCICIOS UNIDAD 5
Ejercicios de la unidad 5 de Nerea Quintanilla Blanco, AL EJECUTAR ABRIR EN VENTANA GRANDE Y VOLVER A PONERLA PEQUEÑA
LINK -> https://github.com/nquinbla/ED_Ejercicios_Tema5.git

## DESCRIPCIÓN
Un proyecto que se basa en todo lo aprendido a lo largo de la unidad 5 de la asignatura de Estructura de Datos. En este proyecto encontraremos diferentes ejercicios que hacen cosas diversas acompañados de un main que ejecuta todo y un decopanel que lo adorna:
* Main: Esta es la clase principal del proyecto. Se encarga de la creación y gestión de la interfaz gráfica de usuario (GUI). En esta clase, se crean y configuran todos los componentes de la GUI, como botones, paneles y etiquetas. También se manejan los eventos de los botones, es decir, se define qué sucede cuando se hace clic en cada botón. Cada botón abre una nueva ventana con una funcionalidad específica, como "Suma de números naturales", "Lista de números", "Cantidad de dígitos", etc.  
* DecoPanel: Esta es una subclase de JPanel que se utiliza para crear un panel personalizado con una imagen y líneas dibujadas en él. En el constructor de esta clase, se carga la imagen y se escala a un tamaño específico. En el método paintComponent, se dibujan las líneas y la imagen en el panel. Este panel se utiliza como el panel de contenido del marco principal en la clase Main.


### [EJ.1] (10 minutos) 
Construir una función recursiva que calcule la suma de los n primeros números naturales.
* SumaNumNaturales: Esta clase contiene un método llamado sumaRecursiva que calcula la suma de los primeros N números naturales de forma recursiva. Si el número es menor o igual a cero, devuelve cero. De lo contrario, suma el número al resultado de la función sumaRecursiva llamada con el número menos uno.
* GUI_SumaNumNaturales: Esta clase es una interfaz gráfica de usuario (GUI) para calcular la suma de los primeros N números naturales. Contiene un campo de texto para que el usuario introduzca un número, un botón para calcular la suma y una etiqueta para mostrar el resultado. Cuando el usuario hace clic en el botón, se llama a la función sumaRecursiva de la clase * SumaNumNaturales para calcular la suma.  

### [EJ.2] (20 minutos) 
Construir una función recursiva que imprima la lista de números naturales comprendidos entre dos valores a y d dados por el usuario.
* ListaNumDosVal: Esta clase contiene un método llamado imprimirNumeros que imprime todos los números entre dos valores dados. Si el primer número es menor o igual al segundo, imprime el primer número y luego llama a la función imprimirNumeros con el primer número incrementado en uno y el segundo número
* GUI_ListaNumDosVal: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir dos números y luego imprime todos los números entre esos dos valores. Contiene dos campos de texto para que el usuario introduzca los números, un botón para imprimir los números y un área de texto para mostrar los números. Cuando el usuario hace clic en el botón, se llama a la función imprimirNumeros de la clase ListaNumDosVal para imprimir los números.  

### [EJ.3] (15 minutos) 
Escribir una función recursiva que devuelva la cantidad de dígitos de un número entero.
* CantidadDígitos: Esta clase contiene un método llamado contarDigitos que cuenta la cantidad de dígitos en un número dado. Si el número es menor que 10, devuelve 1. De lo contrario, suma 1 al resultado de la función contarDigitos llamada con el número dividido por 10.  
* GUI_CantidadDígitos: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir un número y luego muestra la cantidad de dígitos en ese número. Contiene un campo de texto para que el usuario introduzca el número, un botón para contar los dígitos y una etiqueta para mostrar el resultado. Cuando el usuario hace clic en el botón, se llama a la función contarDigitos de la clase CantidadDígitos para contar los dígitos.

### [EJ.4] (15 minutos) 
Escribir una función recursiva que calcule xy mediante multiplicaciones sucesivas, siendo x e y dos números enteros.
* Cálculoxy: Esta clase contiene un método llamado calcularPotencia que calcula la potencia de un número x elevado a y de forma recursiva. Si y es igual a 0, devuelve 1. De lo contrario, multiplica x por el resultado de la función calcularPotencia llamada con x y y - 1.  
* GUI_Cálculoxy: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir dos números x y y, y luego calcula y muestra x elevado a la potencia y. Contiene dos campos de texto para que el usuario introduzca los números, un botón para calcular la potencia y una ventana emergente para mostrar el resultado. Cuando el usuario hace clic en el botón, se llama a la función calcularPotencia de la clase Cálculoxy para calcular la potencia.

### [EJ.5] (20 minutos) 
Calcula mediante un diseño recursivo el valor máximo de un vector de componentes numéricas.
* ValMáxVector: Esta clase contiene un método llamado calcularMultiplicacion que calcula el producto de dos números x y y. Devuelve el producto de x y y.
* GUI_ValMáxVector: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir dos números x y y, y luego calcula y muestra el producto de x y y. Contiene dos campos de texto para que el usuario introduzca los números, un botón para calcular el producto y una ventana emergente para mostrar el resultado. Cuando el usuario hace clic en el botón, se llama a la función calcularMultiplicacion de la clase ValMáxVector para calcular el producto.  

### [EJ.6] (30 minutos) 
Escribir la función recursiva que recibiendo como parámetros una cadena de dígitos hexadecimales y su longitud devuelva el valor decimal que representa dicha cadena.
* CadDigHex: Esta clase contiene un método llamado CadDigHex que convierte una cadena hexadecimal en un número decimal. Si la longitud de la cadena es 1, devuelve el valor decimal del carácter. De lo contrario, convierte el último carácter a decimal y lo suma al resultado de la función CadDigHex llamada con la cadena sin el último carácter, multiplicado por 16.  
* GUI_CadDigHex: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir un número hexadecimal y luego muestra su equivalente decimal. Contiene un campo de texto para que el usuario introduzca el número, un botón para realizar la conversión y una ventana emergente para mostrar el resultado. Cuando el usuario hace clic en el botón, se convierte el texto del campo a un número decimal y se muestra en la ventana emergente. Si el texto no es un número

### [EJ.7] (5 minutos) 
Calcular C (n,k) siendo: C (n,k)= C (n-1,k) + C (n-1,k-1) si n>k>0, y 1 en otro caso
* CálcularCnk: Esta clase contiene un método llamado calcular que calcula el coeficiente binomial, también conocido como "n choose k" o "combinaciones de n en k". Este método toma dos parámetros, n y k, y calcula el coeficiente binomial utilizando un bucle for. El resultado es el número de formas en que se pueden seleccionar k elementos de un conjunto de n elementos sin tener en cuenta el orden.  
* GUI_CálcularCnk: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario introducir dos números n y k, y luego calcula y muestra el coeficiente binomial de n en k. Contiene dos campos de texto para que el usuario introduzca los números, un botón para calcular el coeficiente binomial y una ventana emergente para mostrar el resultado. Cuando el usuario hace clic en el botón, se llama a la función calcular de la clase CálcularCnk para calcular el coeficiente binomial. Si los valores introducidos no son números válidos, se muestra un mensaje de error.

### [EJ.8] (20 minutos) 
Cada tres bases de una cadena de ADN codifican un aminoácido de una proteína. Existe una secuencia especial de bases de la cadena, ATG, que es una especie de “marca” del principio de un gen, esto es, una secuencia de bases que codifica una determinada proteína. También existen tres secuencias diferentes de fin de gen. Podemos a partir de una cadena de ADN contar cuántos genes tiene contando el número de veces que ocurre la tripleta ATG. Genera una cadena de ADN aleatorio, y a continuación cuenta cuántos genes contendría si se tratase de una cadena de ADN real.
* BasesADN: Esta clase contiene dos métodos principales. El método generarADN genera una cadena de ADN de una longitud dada, seleccionando aleatoriamente entre las bases de ADN "A", "T", "G" y "C". El método contarGenes cuenta la cantidad de genes en una cadena de ADN dada. Un gen se define aquí como la aparición de la secuencia "ATG" en la cadena de ADN.  
* GUI_BasesADN: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario generar cadenas de ADN y contar la cantidad de genes en esas cadenas. Contiene dos botones, uno para generar la cadena de ADN y otro para contar los genes. También contiene una lista para mostrar las cadenas de ADN generadas. Cuando el usuario hace clic en el botón "Generar ADN", se genera una cadena de ADN de longitud 1000 y se agrega a la lista. Cuando el usuario hace clic en el botón "Contar genes", se cuenta la cantidad total de genes en todas las cadenas de ADN generadas y se muestra en una ventana emergente.

### [EJ.9] (20 minutos) 
Dado un fichero de texto ordena sus líneas alfabéticamente, generando un archivo nuevo que contenga el texto ordenado.
* OrdenarAlfabeticamente: Esta clase contiene un método llamado ordenarArchivo que toma dos parámetros, archivoEntrada y archivoSalida. Este método lee todas las líneas del archivo de entrada, las ordena alfabéticamente y luego las escribe en el archivo de salida. Si ocurre un error durante la lectura o escritura de los archivos, se lanza una excepción.  
* GUI_OrdenarAlfabeticamente: Esta clase es una interfaz gráfica de usuario (GUI) que permite al usuario seleccionar un archivo de entrada y un archivo de salida, y luego ordenar alfabéticamente las líneas del archivo de entrada y escribirlas en el archivo de salida. Contiene botones para seleccionar los archivos de entrada y salida, un botón para iniciar el proceso de ordenamiento, y etiquetas para mostrar los archivos de entrada y salida seleccionados. Cuando el usuario hace clic en el botón "Ordenar", se llama al método ordenarArchivo de la clase OrdenarAlfabeticamente para realizar el ordenamiento. Si los archivos de entrada y salida no han sido seleccionados, se muestra un mensaje de error. Si ocurre un error durante el ordenamiento, también se muestra un mensaje de error.

### [EJ.10] (15 minutos) 
Dado un fichero de texto realizar un programa que permita buscar en él una palabra dada. Las palabras no tienen por qué estar ordenadas alfabéticamente y ninguna de ellas contiene la letra ñ.

### [EJ.11] (15 minutos) 
Modificar el programa anterior para que emplee una búsqueda binaria.

### [EJ.12] (20 minutos) 
Escribir un programa que permita introducir fechas al usuario. El usuario podrá introducir n fechas, y a continuación podrá listar todas las fechas ordenadas cronológicamente.

### [EJ.13] (30 minutos diseño -> 30 minutos implementación) 
Optimizar la implementación del algoritmo quicksort dada en los apuntes según las indicaciones del último apartado de este tema (ejercicio voluntario).
