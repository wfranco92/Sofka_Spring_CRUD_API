# Sofka_Spring_CRUD_API
 
Se realiz ala implementacion de :

- Se agrega un endPoint de actualizacion de usuario
- Se incorpora una nueva entidad/modelo(UsuarioRol) que tenga
  los campos (idUsuario,idRol,Rol("vendedor","cajero","consultor",etc..))
  un usuario puede en un momento tener 1 o mas roles asociados.
  debe haber una relacion (Usuario - UsuarioRol):
        @ManyToOne Relation
        @OneToMany Relation
        @OneToOne Relation
        @ManyToMany Relation
  aplique la que usted considere mas apropiada y en README
  justifique ademas incorpore en este mismo README coloque 
  
  Para este ejercicio se elaboro una nueva tabla o entidad denominada rol, la cual tiene una realcion de muchos a muchos con la entidad usuario, lo anterior debido a que el enunciado menciona (un usuario puede en un momento tener 1 o mas roles asociados). Con lo anterior se puede analizar que un usuario puede tener muchos roles y que un rol puede tener asociados muchos usuarios. Esta relacion se rompe con una tabla intermedia que relaciona las llaves primarias de las entidades usuario y rol.
  
  Al hacer uso de @ManyToMany Relation como se observa en la imagen, se crea la tabal intermedia y las columnas
  
  ![image](https://user-images.githubusercontent.com/61658807/165659557-5dd7e8b8-e216-4cef-a89b-89b94226048b.png)
  
  - implemente algunas pruebas unitarias a esa nueva entidad/modelo 

Se implmentaron pruebas unitarias a traves de JUNIT a las entidades rol y usuario, en donde se evalua el funcionamiento del CRUD.

Eliminar Usuario por ID

![image](https://user-images.githubusercontent.com/61658807/165660004-3125affe-e60c-43c2-9643-5213eb23a916.png)

Actualizar Usuario por ID

![image](https://user-images.githubusercontent.com/61658807/165660059-fce19f14-7441-4842-91d9-a4a2401a12a5.png)

De igual manera se prueba el funcionamiento del API a traves de POSTMAN en donde se encuentra:

POST de un nuevo rol a BD

![image](https://user-images.githubusercontent.com/61658807/165660241-f7b33625-535b-4c29-95cb-25e53d7478ba.png)

POST de nuevo usuario a BD

![image](https://user-images.githubusercontent.com/61658807/165660297-751d4c27-db22-46fc-a920-3281b03e5993.png)


Actualizacion (PUT) de usuario a BD

![image](https://user-images.githubusercontent.com/61658807/165660339-812ff26e-31d9-49bf-a389-608fe64b11e8.png)

Listado de usuarios de BD

![image](https://user-images.githubusercontent.com/61658807/165660374-63b3570c-af79-44d5-a24a-3365add500ed.png)




