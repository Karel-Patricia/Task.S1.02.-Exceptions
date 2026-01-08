# Tarea S1.02 - Exceptiones

**Descripción**: 

Trabajar con el sistema de gestión de errores de Java mediante el uso de excepciones. 
El objetivo principal es dotar a las aplicaciones de robustez , evitando que se rompan ante errores habituales como entradas incorrectas o acceso a datos inexistentes.

## 📌 Nivel 1
Ejercicio 1 – Excepciones personalizadas y control de errores.

Define una clase Product con dos atributos: name y price.
Después, crea una clase Sale, que debe contener una colección de productos (por ejemplo, una ArrayList<Product>) y una variable para almacenar el total (totalPrice). Esta clase incluirá un método calculateTotal() que:

Compruebe si la colección está vacía.
Si está vacía, tire una excepción personalizada llamada EmptySaleException, con el mensaje: "Para hacer una venta primero debes añadir productos" .
Si hay productos, sume los precios y guarde el total en el atributo totalPrice.
La clase EmptySaleException debe ser hija de Exception, y debe incluir este mensaje en su constructor.

Además, añade una prueba para generar una excepción  IndexOutOfBoundsException, por ejemplo intentando acceder a una posición inexistente de una lista, y capturarla mostrando el mensaje de error. Ésta es una excepción habitual en Java cuando se manipulan colecciones sin hacer las comprobaciones adecuadas.

Por último, cambia la clase EmptySaleException para que extienda de una excepción en tiempo de ejecución, como RuntimeException.

* Al hacer este último cambio pasa a ser una excepción no verificada y sucede que: 
	- Ya no es obligatorio usar try/catch
	- Ya no es obligatorio declarar throws
	- El error aparece en tiempo de ejecución

## 📌 Nivel 2
Ejercicio 1 - Lectura segura desde el teclado.

Crear una clase utilitaria llamada ConsoleReader que permita leer distintos tipos de datos desde el teclado de forma segura. Esta clase debe gestionar los errores que pueden aparecer cuando el usuario introduce valores incorrectos, como por ejemplo texto en vez de números.
Para ello, crea un único objeto Scanner y define una serie de métodos estáticos para leer datos. Estos métodos deben mostrar un mensaje personalizado, leer el valor y validarlo. Si la entrada es incorrecta, se mostrará un mensaje de error (por ejemplo: “Error de formato” ) y se volverá a pedir el dato hasta que sea válido.

Métodos a implementar

Con tratamiento de InputMismatchException:

public static byte readByte(String message);
public static int readInt(String message);
public static float readFloat(String message);
public static double readDouble(String message);


Con una excepción personalizada:

public static char readChar(String message);
// Sólo acepta un único carácter. Si se introduce más de uno, lanza una excepción personalizada.

public static String readString(String message);
// Lee una cadena tal y como se recibe, pero podrías validar longitud mínima o contenido si es necesario.

public static boolean readYesNo(String message);
// Si el usuario introduce “s” (minúscula), devuelve true. Si introduce “n”, devuelve false.
// Cualquier otra entrada debería generar una excepción personalizada.


## 🛠️Tecnologías
-Java