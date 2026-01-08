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
La clase EmptySaleExceptiondebe ser hija de Exception, y debe incluir este mensaje en su constructor.

Además, añade una prueba para generar una excepción  IndexOutOfBoundsException, por ejemplo intentando acceder a una posición inexistente de una lista, y capturarla mostrando el mensaje de error. Ésta es una excepción habitual en Java cuando se manipulan colecciones sin hacer las comprobaciones adecuadas.

Por último, cambia la clase EmptySaleException para que extienda de una excepción en tiempo de ejecución, como RuntimeException.

* Al hacer este último cambio pasa a ser una excepción no verificada y sucede que: 
	- Ya no es obligatorio usar try/catch
	- Ya no es obligatorio declarar throws
	- El error aparece en tiempo de ejecución

## 🛠️Tecnologías
-Java