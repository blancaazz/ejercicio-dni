# API Java - DniUtils

## Descripción

Esta librería permite calcular la letra del DNI español y comprobar si un DNI es válido.

## Requisitos

- Tener Java JDK instalado.
- Utilizar la clase `DniUtils` del paquete `com.example`.

## Métodos disponibles

- `calcularLetra(int numero)`: calcula la letra correspondiente al número del DNI.
- `validarDni(String dni)`: comprueba si un DNI completo es válido. Devuelve `true` si es correcto y `false` si no lo es.

## Ejemplo de uso

```java
import com.example.DniUtils;

char letra = DniUtils.calcularLetra(12345678);
System.out.println(letra); // Z

boolean valido = DniUtils.validarDni("12345678Z");
System.out.println(valido); // true
```

## Compilación

Desde la carpeta `libreria_java`, ejecutar los siguientes comandos en PowerShell.

**1. Compilar la librería**

```powershell
javac -d build lib/src/main/java/com/example/DniUtils.java
```

**2. Crear el archivo JAR**

```powershell
jar cf lib/dni-utils.jar -C build .
```

**3. Generar la documentación Javadoc**

```powershell
javadoc -encoding UTF-8 -d docs/javadoc lib/src/main/java/com/example/DniUtils.java
```

La documentación se encuentra en `docs/javadoc/index.html`.

Podemos abrirla en el navegador mediante: 
```powershell
start .\docs\javadoc\index.html   
```

**Para compilar y ejecutar desde el cliente:**

```powershell
javac -cp lib/dni-utils.jar -d build client/Main.java
java -cp "lib/dni-utils.jar;build" Main
```

## Archivos generados

Durante la compilación y ejecución del proyecto se generan varios archivos y carpetas. Es importante conocer su función para saber qué se puede borrar si queremos limpiar el proyecto.

- **Carpeta `build/`**: contiene los archivos `.class` generados al compilar el código Java. También se utiliza para guardar la clase compilada del cliente `Main.java` en los comandos indicados.
- **Archivo `lib/dni-utils.jar`**: es la librería Java empaquetada en formato JAR. Contiene la clase `DniUtils` compilada y permite utilizarla desde otros proyectos.
- **Carpeta `docs/javadoc/`**: contiene la documentación HTML generada automáticamente a partir de los comentarios Javadoc del código. El archivo principal es `index.html`.
- **Archivo `Main.class`**: es el resultado de compilar `client/Main.java`. Con los comandos de este documento, se guarda dentro de `build/`.


## Uso de la librería

Para utilizar esta librería en otro proyecto Java, hay que añadir el archivo `dni-utils.jar` al classpath.

