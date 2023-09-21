class Pelicula(titulo:String, precio:Double, a_publi:Int, gen:String, director:String) : Producto(titulo, precio, a_publi) {
    var generoPelicula = ""
        set(value) {
            if (value == ""){
                print("Debe introducir el genero de la película: ")
                generoPelicula = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    var directorPelicula = ""
        set(value) {
            if (value == ""){
                print("Debe introducir un nombre de director para la película: ")
                directorPelicula = readln()
            }
        }
        get() {
            return field
        }

    init {
        generoPelicula = gen
        directorPelicula = director
    }

    override fun toString(): String {
        return "Pelicula(generoPelicula='$generoPelicula', directorPelicula='$directorPelicula')"
    }


}