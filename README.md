# PARCIAL - AREP - 1

- Construir un servicio WEB (puede usar Spark o Sockets) que reciba un número y una cadena de tres caracteres. La cadena puede ser una de tres opciones: "cos", "sin", "tan". El servicio asume que el número que recibe está en radianes y retorna una estructura JSON con el valor de la función trigonométrica correspondiente.
- Construya otro servicio Web (puede usar Spark o Sockets) que sea una fachada del servicios construido en el primer punto. Es decir, este servicio recibe los mismos parámetros y regresa el mismo resultado, pero para hacer el cálculo debe invocar via http al servicio web que se constuyó en el primer punto.
- Su diseño debe soportar la composición de nuevas operaciones para modificar servicios existentes o componer nuevos servicios. Por ejemplo, piense que en el futuro podemos solicitar que se creen nuevos servicios sobre  el API web, es decir,  debe ser fácilmente extensible.
- El diseño de los servicios WEB debe tener en cuenta buenas prácticas de diseño OO.
- Despliegue los servicios en Heroku en dynos separados.
- Construya un cliente JAVA para probar los dos servicios.
- El cliente y los servicios debe entregarlos en dos proyectos estructurado con Maven. El primero con el servicio fachada y el cliente. Y el segundo con el servicio web concreto.
- El cliente debe traer "quemada" en el código fuente la url de su aplicación desplegada en Heroku.

## Prerequisitos

Conocimientos básicos sobre operaciones de tangente, coseno y seno

## Comandos
Para compilar y correr las pruebas: ```mvn package```

Para ejecutar y utilizar el programa: ```mvn exec:java -Dexec.mainClass="edu.escuelaing.arep.app.App```

Para ejecutar las pruebas: ```mvn test```

Para generar javadoc con maven: ```mvn javadoc:javadoc```

Para generar javadoc de las pruebas: ```mvn javadoc:test-javadoc```

**IMPORTANTE:** Para poder utilizar el aplicativo es necesario compilar primero el proyecto con **mvn package**.

# Integracion Continua
[![CircleCI](https://circleci.com/gh/Nikolai9906/AREP-PARCIAL-1.svg?style=svg)](https://circleci.com/gh/Nikolai9906/AREP-PARCIAL-1)
# Despliegue Heroku

https://intense-badlands-44966.herokuapp.com/operation?operation=cos&number=15

## Operaciones
Para poder ejecutar alguna operacion se tendra que colocar la operacion y el valor como en el siguiente ejemplo:
*https://intense-badlands-44966.herokuapp.com/operation?operation=cos&number=15* En este caso **operation** es la operacion y hace **cos**. Por otro lado **number** tiene el valor de **15**.
```
Coseno de 15
- https://intense-badlands-44966.herokuapp.com/operation?operation=cos&number=15
Seno de 15
- https://intense-badlands-44966.herokuapp.com/operation?operation=sin&number=15
Tangente de 15
- https://intense-badlands-44966.herokuapp.com/operation?operation=tan&number=15
```
- Media: Calcula la media de una lista de n números ingresados por consola o por medio de un archivo.
- Desviación estándar: Calcula la desviación estándar de una lista de n números ingresados por consola o por medio de un archivo.

**NOTA:** Para realizar estas operaciones se utilizo una lista encadenada propia del programa, no se utilizo ninguna implementación por defecto como ArrayList.

## Intalación
Si quieres saber como funciona el programa, tienes que seguir los siguientes pasos:
1. Descargar eclipse (última versión) o cualquier editor de JAVA.
2. Abra el proyecto en el editor.
3. Corra el programa y verifique que no tiene errores.
4. Ingrese los parámetros deseados que desea ver para visualizar las funcionalidades del sistema.

## Instalación (Proyecto Maven)
Para tener una mejor experiencia con el programa, es recomendable tener instalado maven en el sistema operativo,
de esta forma se puede visualizar de una mejor manera las pruebas y ejecutarlas desde consola.
Para instalar maven seguimos los siguientes pasos:
1. En eclipse vamos al menu que dice help.
2. Ahí le damos a install new software.
3. Nos abrirá una nueva pestaña, allí le damos donde aparece "add".
4. En "Name" escribimos lo siguiente: M2Eclipse
5. En "Location" escribimos la siguiente dirección: http://download.eclipse.org/technology/m2e/releases
6. Le damos Add, señalamos los plugins que aparecieron.
7. Aceptamos los terminos y condiciones, y se instalará automáticamente.
8. Reiniciamos eclipse y ya está instalado maven en eclipse.


## Clase de Calculadora
```java

package edu.escuelaing.arep.app.operation;

public class Calculator {
   public double number;
   public String operation;

   public Calculator(double number, String operation){
      this.number = number;
      this.operation = operation;
   }

   public double getResultOperation(){
      double res = 0;
      //System.out.println(number + "operacion");
      if(operation.equals("sin")){
         res = Math.sin(number);
      }else if (operation.equals("cos")){
         res = Math.cos(number);
      }else if (operation.equals("tan")){
         res = Math.tan(number);
      }
      //System.out.println(res + "RES CALCUL");
      return res;
   }

}
```

## ¿Cómo usar el aplicativo?
1. Copie el enlace proporcionado por el git del proyecto y clone el repositorio en el directorio de su preferencia.

    - git clone https://github.com/Nikolai9906/AREP-LAB-1.git
2. Entre a la carpeta **arep-lab-1**.
3. Compile el proyecto antes de comenzar a utilizar sus funcionalidades.

    - **NOTA:** Recuerde que el proyecto se compila con el comando **mvn package**.
4. Cree un archivo en ese directorio con la lista de números a la cuál le desea calcular la media y la desviación estándar.
5. Ejecute el programa con la lista que creo anteriormente y compare los resultados.

## Ejemplos de uso con maven
Para ello nos dirigimos a la carpeta principal del proyecto, dependiendo de lo que queramos hacer.

Si queremos compilar el proyecto y ver que no tiene fallos, utilizamos el comando **mvn package**.

Si queremos ejecutar las pruebas y ver que todo está perfecto, utilizamos el comando **mvn test**.

**NOTA:** El comando **mvn package** compila y ejecuta las pruebas al mismo tiempo.

## Construido
[IntelliJ IDEA](https://www.jetbrains.com/es-es/idea/) Editor de JAVA donde se puede compilar el proyecto.

[Spark](https://sparkjava.com) Framework Spark

## Autor
Steven Nikolai Bermudez Vega - Parcial de Programacion AREP 02/19/2021

## Licencia
Este programa es de uso libre, puede ser usado por cualquier persona.

