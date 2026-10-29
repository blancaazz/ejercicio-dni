\# API C++ - DniUtils



\## Descripción



Esta librería permite calcular la letra del DNI español y comprobar si un DNI es válido.



\## Requisitos

\- Tener el compilador \*\*g++\*\* instalado

\- Incluir la cabecera "dni\_utils.h" para hacer uso de la librería

\- Para generar la documentación se requiere tener \*\*Doxygen\*\* instalado



\## Métodos disponibles

\- `calcular\_letra(int numero)`: Calcula la letra de validación a partir del número del DNI.

\- `validar\_dni(const char\* dni)`: Comprueba si un número del DNI con letra es válido.



\## Ejemplo de uso

```cpp

\#include  "dni\_utils.h"

\#include  <iostream>



int  main(int  argc, char\*  argv\[]) {

&#x09;int  num\_prueba  =  12345678;

&#x09;char  letra\_calculada  =  DniUtils::calcular\_letra(num\_prueba);

&#x09;std::cout  <<  "Dni calculado: "  <<  num\_prueba  <<  letra\_calculada  <<  std::endl;

&#x09;// Dni calculado: 12345678Z

&#x20; 

&#x20; char\* str = "12345678Z"

&#x09;if(DniUtils::validar\_dni(str)) {

&#x09;	// Se ejecutaría esta rama

&#x09;	std::cout  <<  "Letra correcta"  <<  std::endl;

&#x09;}

&#x09;else  {

&#x09;	std::cout  <<  "Letra incorrecta"  <<  std::endl;

&#x09;}

&#x09;return  0;

}

```



\## Compilación



Desde la carpeta `libreria\_cpp`, ejecutar el siguiente comando para compilar el código:



```powershell

g++ -I .\\src -g .\\src\\dni\_utils.cpp .\\client\\prueba.cpp -o .\\client\\prueba.exe

```



Se puede sustituir el archivo principal (en nuestro caso, `.\\client\\prueba.cpp`) al gusto.



Después, ejecutar el archivo generado (en nuestro caso, `.\\client\\prueba.exe`) con la terminal que se prefiera.



\## Documentación



Para generar la documentación, desde la carpeta `libreria\_cpp\\docs` (preferentemente), ejecutar el siguiente comando:



```powershell

doxygen Doxyfile

```



Una vez hecho esto, preferentemente, abrir el archivo `index.html` generado dentro de la carpeta `libreria\_cpp\\docs\\html` para comenzar a navegar por la documentación generada.



\## Uso de la librería



Para utilizar esta librería en otro proyecto C++, es necesario:

\- Agregar la carpeta `src/` a la lista de directorios incluidos.

&#x09;- Con g++, esto se hace con la opción `-I`, seguido de la ruta al directorio.

&#x09;- Con CMake, habría que añadir una orden `include\_directories()` con la ruta al directorio.

\- Agregar el archivo `src/dni\_utils.cpp` a listado de archivos objetivo de compilación

&#x09;- Con g++, esto se hace agregando dicho archivo directamente a los argumentos (sin opción).

&#x09;- Con CMake, habría que añadir una orden `add\_executable()` con la ruta al archivo.

