# API C++ - DniUtils

## Descripción

Esta librería permite calcular la letra del DNI español y comprobar si un DNI es válido.

## Requisitos
- Tener el compilador **g++** instalado
- Incluir la cabecera "dni_utils.h" para hacer uso de la librería
- Para generar la documentación se requiere tener **Doxygen** instalado

## Métodos disponibles
- `calcular_letra(int numero)`: Calcula la letra de validación a partir del número del DNI.
- `validar_dni(const char* dni)`: Comprueba si un número del DNI con letra es válido.

## Ejemplo de uso
```cpp
#include  "dni_utils.h"
#include  <iostream>

int  main(int  argc, char*  argv[]) {
	int  num_prueba  =  12345678;
	char  letra_calculada  =  DniUtils::calcular_letra(num_prueba);
	std::cout  <<  "Dni calculado: "  <<  num_prueba  <<  letra_calculada  <<  std::endl;
	// Dni calculado: 12345678Z
  
  char* str = "12345678Z"
	if(DniUtils::validar_dni(str)) {
		// Se ejecutaría esta rama
		std::cout  <<  "Letra correcta"  <<  std::endl;
	}
	else  {
		std::cout  <<  "Letra incorrecta"  <<  std::endl;
	}
	return  0;
}
```

## Compilación

Desde la carpeta `libreria_cpp`, ejecutar el siguiente comando para compilar el código:

```powershell
g++ -I .\src -g .\src\dni_utils.cpp .\client\prueba.cpp -o .\client\prueba.exe
```

Se puede sustituir el archivo principal (en nuestro caso, `.\client\prueba.cpp`) al gusto.

Después, ejecutar el archivo generado (en nuestro caso, `.\client\prueba.exe`) con la terminal que se prefiera.

## Documentación

Para generar la documentación, desde la carpeta `libreria_cpp\docs` (preferentemente), ejecutar el siguiente comando:

```powershell
doxygen Doxyfile
```

Una vez hecho esto, preferentemente, abrir el archivo `index.html` generado dentro de la carpeta `libreria_cpp\docs\html` para comenzar a navegar por la documentación generada.

## Uso de la librería

Para utilizar esta librería en otro proyecto C++, es necesario:
- Agregar la carpeta `src/` a la lista de directorios incluidos.
	- Con g++, esto se hace con la opción `-I`, seguido de la ruta al directorio.
	- Con CMake, habría que añadir una orden `include_directories()` con la ruta al directorio.
- Agregar el archivo `src/dni_utils.cpp` a listado de archivos objetivo de compilación
	- Con g++, esto se hace agregando dicho archivo directamente a los argumentos (sin opción).
	- Con CMake, habría que añadir una orden `add_executable()` con la ruta al archivo.
