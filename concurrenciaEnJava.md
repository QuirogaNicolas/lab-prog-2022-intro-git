# Concurrencia en java

## Semaforos
Los hilos necesitaran una cantidad n de permisos para poder acceder a una porcion de codigo. cuando estos permisos esten disponibles otro hilo tendra que liberarlos o se tendran que indicar cuando de estos estan disponibles a la hora de crear el semaforo.
Este mecanismo permite por ejemplo que un hilo comience su operacion que requiere dos permisos cuando otros dos lo libere. ej: el hilo decorador de pasteles comenzara a decorar el pastel cuando tenga diponible el biscocho y el relleno listo, esto pasara cuando otros dos hilos terminen de 1.armar el biscocho 2. cuando terminen el relleno.

## Monitores

Los monitores permiten definir acceso al lock de un objeto compartido y grupos de espera. de esta manera cuando un hilo no cumple con las condiciones para poder hacer uso de un recurso pasara a esperar a un conjunto de espera determinado. es reponsabilidad de otros hilos notificar a los hilos de este grupo de espera que puedne volver a comprobar si estan en condiciones de usar el recurso en cuestion. esta menera permite modelar un caso como el barbero dormilon o similares.