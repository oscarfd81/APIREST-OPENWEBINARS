<h1>Desarrollo de una API REST con Spring Boot</h1>

En este repositorio se encuentra un api rest que he realizado siguiendo los pasos del curso "Desarrollo de una API REST con Spring Boot" de OpenWebinars.

Este Api rest principalmente se centra en la gestión de tareas, en especifico:
* La creacion de tareas
* La edicion de tareas
* El borrado de tareas
* La vista de tareas, tanto todas tanto cada una buscadas por su ID generado automaticamente
También puedes crear nuevos usuarios.

También se centra en otros aspectos como la seguridad de esta:
* No todos los usuarios tienen acceso a las tareas a no ser que se encuentren en la bbdd como tal
* Dependiendo del usuario registrado en ese momento, las tareas aparecerán al nombre de cada usuario
* Cada usuario solo y únicamente podrá:
   * Ver las tareas creadas por este
   * Editar tareas creadas por este
   * Eliminar tareas creadas por este
     
  En caso de que el usuario intente acceder a tareas que no hayan sido creadas por él o borrar o editar estas, se lanzará una excepción.
