![Badge Completado](https://img.shields.io/badge/STATUS-Completado-brightgreen)
![Badge Version](https://img.shields.io/badge/VERSION-0.6.11-blue)
![Badge Deploy](https://img.shields.io/badge/WEB%20DEPLOY-Render-lightseagreen)
![Badge Deploy](https://img.shields.io/badge/WEB%20DEPLOY-Clever%20Cloud-lightcoral)
# Portfolio Web (Back-End) de Argentina Programa 4.0
![banner-ok-argentina-programa](https://github.com/FireDust97/portfolio-BackEnd/assets/120528153/29d08f4d-b07f-413b-85d7-46323d6a8908)


Referente al trabajo final integrador para el curso de Argentina Programa, este es el repositorio que contiene la base de datos de mi portfolio web. Basado en las tecnologías propuestas por la cursada para crear y correr correctamente el servidor.

## ¿Qué tecnologías utiliza este proyecto?
:coffee: Java  

:leaves: SpringBoot  

:closed_lock_with_key: JWT (JSON Web Token)

:dolphin: MySQL  

## ¿Qué características posee la base de datos?
La base de datos ha sido creada para llevar a cabo las siguientes opciones:  
- Crear, eliminar, actualizar y permitir a la página web Front-End acceder a las tablas de información.  
- Generar un token único por cada inicio de sesión.  
- Permitir generar mensajes adicionales útiles para el programador en la consola si ocurren errores de compilación en diferentes sectores del código.  
- Aumentar su seguridad aplicando el método CrossOrigin.
- Cambiar su entorno entre el servidor remoto o local para nuevas pruebas.

## Preguntas Frecuentes / Resolución de problemas

- <h3>¿En dónde se halla el deploy de la base de datos?</h3>  
El Back-End ha sido subido por medio de la página de ***Render***, para proporcionar su disponibilidad remota junto con el Front-End. Por otro lado, la base de datos (tablas de MySQL) se mantienen en ***Clever Cloud***, usando en ambos casos servicios gratuitos (los cuáles poseen determinadas limitaciones en comparación a planes pagados/profesionales).  
Clever Cloud no contiene un link público para acceder y ver la base de datos, de hecho, por cuestiones de seguridad se encuentra protegida por usuario y contraseña, las cuales sólo posee el propietario.
Render, por otra parte, proporciona el link del Back-End, el cual debe ser accedido antes de ingresar al Front-End para asegurarse de que el código y su funcionamiento se encuentran levantados. Si no es así, espere unos minutos hasta que la página devuelva el mensaje **"Whitelabel error page"**.  

Si la página de render no devuelve el mensaje de Whitelabel, generando un error 502, "the service cannot handle requests now" u otros errores o mensajes inesperados, por favor, contáctese a mi correo electrónico, <a href="mailto:lautarortiz472@gmail.com">lautarortiz472@gmail.com</a> e intentaré solucionar cualquier error lo más pronto posible para que pueda acceder.  

**Recuerde: Estos problemas son generados por Render y Clever Cloud por ser planes gratuitos y no aceptar más de 5 conexiones, o debido a problemas con la caché del servicio, y no tienen relación con la programación del Front ni el Back-End.**  

- <h3>¿Y cómo ingreso a la página del Back-End?</h3>  
Tal como se había dicho anteriormente, el link del Back-End para levantar el código es proporcionado por Render, aquí:  
https://backend-portfolioargprog.onrender.com  

- <h3>¿Porqué Github menciona que la versión actual del Back-End es 0.6.11? ¿Acaso la base de datos se encuentra incompleta?</h3>  

La base de datos se encuentra completa y funcionando. El que su versión no haya alcanzado la 1.0, implica que no se han generado cambios de importancia mayor como para tomarlos como la primera versión, y no indica el funcionamiento del programa.

## Argentina Programa 4.0, 2023.  
<h2>Readme.md modificado por última vez: 12 de mayo de 2023.</h2>
