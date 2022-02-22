# Aproximación a Pi mediante Montecarlo.

_El propósito de este proyecto es hacer una aproximación a Pi mediante el método de Montecarlo, usando diferentes números para comprobar su correcto funcionamiento y así poder demostrar que funciona._

---
## Inicio

_Las siguientes instrucciones permitirán obtener una copia del proyecto en funcionamiento en una máquina local para propósitos de desarrollo y pruebas del mismo._

### Información
El uso del método de Monte Carlo para aproximar el valor de Pi consiste en dibujar un cuadrado y
dentro de ese cuadrado, dibujar un círculo con diámetro de igual medida que uno de los lados del
cuadrado. Luego se dibujan puntos de manera aleatoria sobre la superficie dibujada. Los puntos que
están fuera del círculo y los que están dentro, sirven como estimadores de las áreas internas y
externas del círculo.
A partir de una estimación de esta relación, se multiplica por 4 y se obtiene una estimación a pi

### Simulación
Esta es una simulación de como funcionaría el programa con una interfaz gráfica.
![Pi.gif](imagenes/Pi.gif)

### Pre-requisitos

_Estas son los siguientes requisitos que se necesitan para poder ejecutar el proyecto:_

```
Versión 11 de Open JDK 
```
```
Tener make instalado
```

### Compilación del programa

Se ejecuta el comando siguiente:

```
make jar 
```
---
## Ejecutar pruebas

_Para poder ejecutar pruebas del programa, deberá seguir las siguientes instrucciones utilizando la terminal:_

- Para poder hacer una aproximación a Pi con X número de intentos.
```
java -jar Montecarlo.jar <numero de intentos>
```
```
por ejemplo,
```
```
java -jar Montecarlo.jar 9999999
```

## Notas para los desarrolladores

---
### Generar Javadoc
Se ejecuta el siguiente comando:
```
make javadoc
```

### Visualización del Javadoc
Se ejecuta el siguiente comando (es necesario tener `firefox`):
```
firefox html/index.html
```
### Información Adicional
Al usar el comando java -jar Montecarlo.jar <número a introducir> puede que dependiendo del número introducido tarde más en aparecer el resultado de la operación.

---
## Autores ✒️

_Estos son los autores que han contribuido en el realizamiento del proyecto:_

* **[Juan Cordero Pascual](https://github.com/Jcorderop02)**
---
## Copyright
Se permite cualquier explotación de la obra, incluyendo una
finalidad comercial, así como la creación de obras derivadas, la distribución de las cuales también está permitida sin ninguna restricción.
![Copyright.png](imagenes/Copyright.png)

