fun main(args: Array<String>) {
    var titanic = Pelicula("Titanic", 12.4,2000,"Drama","James Cameron")
    var avatar = Pelicula("Avatar", 15.99,2012,"Fantasía","James Cameron")
    var divide = Disco("Divide",20.40,2016,"Pop","Ed Sheeran",100)
    var thriller = Disco("Thriller",25.98,1998,"Pop","Michael Jackson",230)
    var tiendaDm = Tienda_DM()

    var situacion = true
    while (situacion == true){
        println("1.Añadir disco a la compra\n2.Añadir película a la compra\n3.Listar compra\n4.Salir")
        var opcion = readln().toInt()
        when(opcion){
            1 -> {
                println("AÑADIR DISCO A LA COMPRA\nEscriba 1) para 'Divide' o 2) para 'Thriller'")
                var discoElegido = readln().toInt()
                print("Escriba la cantidad que quiere de dicho disco:")
                var cantidad = readln().toInt()
                if (discoElegido == 1){
                    tiendaDm.compraDisco(divide,cantidad)
                }
                if (discoElegido == 2){
                    tiendaDm.compraDisco(thriller,cantidad)
                }else{
                    println("Disco no disponible")
                }
            }
            2 -> {
                println("AÑADIR PELÍCULA A LA COMPRA\nEscriba 1) para 'Titanic' o 2) para 'Avatar'")
                var peliElegida = readln().toInt()
                print("Escriba la cantidad que quiere de dicho disco:")
                var cantidad = readln().toInt()
                if (peliElegida == 1){
                    tiendaDm.compraPelicula(titanic,cantidad)
                }
                if (peliElegida == 2){
                    tiendaDm.compraPelicula(avatar,cantidad)
                }else{
                    println("Película no disponible")
                }
            }
            3 -> {
                println("LISTAR COMPRA")
                tiendaDm.listarCompra()
            }
            4 -> {
                situacion = false
            }
        }
    }
}