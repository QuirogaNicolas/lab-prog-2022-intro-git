# NodeJS
Primero hay que instalar el entorno de ejecucion NodeJS. (Descargar desde la pagina oficial je)

Una vez instalado,(En la terminal de vsc) pararse en la carpeta del proyecto y ejecutar en la linea de comando 
# " npm init -y" (no hace falta si ya esta creado el package-lock)
para crear un archivo "package-lock.json" en el que declararemos todas las dependencias del proyecto.

# TailWindCSS
Estaremos usando el framework de CSS, Tailwind.
Lo instalamos con los siguientes comandos de NodeJS
# npm install -D tailwindcss
# npx tailwindcss init (Creo que no hace falta, si ya estan los input/output.css)

en el archivo "tailwind.config.js" agregamos " content: ["./pagina_lab/*.{html,js}"], " 
y en el archivo input.css 
@tailwind base;
@tailwind components;
@tailwind utilities;

Luego habria que correr el siguiente comando cada vez que se quiera ejecutar el proyecto
# npx tailwindcss -i ./src/input.css -o ./pagina_lab/output.css --watch 
Pero para facilitarlo, lo agregamos en el archivo "package.json", en el apartado de Scripts  "dev": "tailwindcss -i ./src/input.css -o ./pagina_lab/output.css --watch"

y para compilarlo pondriamos "npm run dev" (ponemos dev porque asi lo definimos en el script, podria ir el nombre que quieran).