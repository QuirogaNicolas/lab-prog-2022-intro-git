# Patron State / Libreria

State es un patrón de diseño de comportamiento que permite a un objeto alterar su comportamiento cuando su estado interno cambia. Parece como si el objeto cambiara su clase.

La idea principal es que, en cualquier momento dado, un programa puede encontrarse en un número finito de estados. Dentro de cada estado único, el programa se comporta de forma diferente y puede cambiar de un estado a otro instantáneamente. Sin embargo, dependiendo de un estado actual, el programa puede cambiar o no a otros estados. Estas normas de cambio llamadas transiciones también son finitas y predeterminadas.

## Problema 

Necesitamos identificar y controlar los estados de los libros que estan dentro de nuestra biblioteca. Un libro puede estar en los siguientes estado:
- ingresado: es el estado inicial
- revision: se revisa si tiene que ser reparado o puede pasar a estar diponible
- diponible: el libro esta disponible para venderlo o para alquilarlo
- reparacion: el libro necesita ser reparado y puede ser dado de baja o puede estar disponible
- baja: el libro no puede ser reparado y es dado de baja
- alquilado: el libro puede ser prestado por un tiempo x 
- vendido: un libro puede ser vendido 

el siguiente diagrama indica como se pasa de un estado a otro:

![diagrama de estados](DominioLaboratorio%201.jpg)

## Solucion
en el codigo podra encontrar la implementacion del patron state sobre este caso. La clase App es la que ejecuta los cambios de estado sobre un objeto `Libro` y de forma aleatoria cambia la accion la cual define a que estado pasa en la siguiente iteracion.

## Getting Started

Welcome to the VS Code Java world. Here is a guideline to help you get started to write Java code in Visual Studio Code.

## Folder Structure

The workspace contains two folders by default, where:

- `src`: the folder to maintain sources
- `lib`: the folder to maintain dependencies

Meanwhile, the compiled output files will be generated in the `bin` folder by default.

> If you want to customize the folder structure, open `.vscode/settings.json` and update the related settings there.

## Dependency Management

The `JAVA PROJECTS` view allows you to manage your dependencies. More details can be found [here](https://github.com/microsoft/vscode-java-dependency#manage-dependencies).
