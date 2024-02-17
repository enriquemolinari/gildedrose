# Gilded Rose: Ejercicio sobre Refactoring

Nos dedicamos a comprar y vender sólo los mejores artículos. Desafortunadamente, la `calidad` de nuestros productos se
degrada constantemente a medida que se acerca su fecha de caducidad. Contamos con un sistema que actualiza nuestro
inventario por nosotros. Fue desarrollado por un programador llamado Leeroy, pero ya no se encuentra en la empresa.

- Todos los artículos (`items`) tienen un valor `expiraEn` que indica, en días, cuanto falta para que caduque.
- Todos los artículos (`items`) tienen un valor de `calidad` que indica qué tan valioso es el artículo.
- Al final de cada día, nuestro sistema reduce ambos valores para cada artículo.

Fácil no? ahora es cuando se pone un poquito mas complicado todo:

- Una vez pasada la fecha de caducidad, la `calidad` se degrada dos veces más rápido.
- La `calidad` de un artículo nunca es negativa.
- El artículo __"Aged Brie"__ en realidad aumenta su `calidad` a medida que se acerca la fecha de expiración (`expiraEn`
  se acerca a cero).
- La `calidad` de un artículo nunca es superior a 50.
- __"Sulfuras"__, al ser un artículo legendario, nunca tiene que venderse ni disminuye su `calidad`.
- __"Backstage passes"__, al igual que el artículo Aged Brie, aumenta en `calidad` a medida que `expiraEn` se acerca más
  a cero, pero además:
    - La `calidad` aumenta en 2 cuando hay 10 días o menos y en 3 cuando hay 5 días o menos
    - La `calidad` baja a 0 después del concierto.

__Nuevo requerimiento__: Necesitamos agregar un nuevo artículo que se comporta de la siguiente forma:

- El artículo nuevo es __"Conjured"__ el cual degrada su `calidad` el doble de rápido que los demás.

Solo para aclarar, un artículo nunca puede tener su `calidad` mayor a 50, sin embargo, __"Sulfuras"__ es un artículo
legendario y, como tal, su `calidad` es 80 y nunca cambia.

## Fuente Original

- https://github.com/emilybache/GildedRose-Refactoring-Kata
