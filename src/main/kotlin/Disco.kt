class Disco(titulo:String, precio:Double, a_publi:Int, gen:String, grupo:String, stock:Int) : Producto(titulo, precio, a_publi) {
    var generoMusical = ""
        set(value) {
            if (value == ""){
                print("Debe introducir un genero musical para el disco: ")
                generoMusical = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    var grupoMusical = ""
        set(value) {
            if (value == ""){
                print("Debe introducir un grupo musical para el disco: ")
                grupoMusical = readln()
            }
        }
        get() {
            return field
        }

    var stockDisco = 0
        set(value) {
            if (value == 0){
                print("Debe introducir un stock de discos válido: ")
                stockDisco = readln().toInt()
            }
        }
        get() {
            return field
        }

    init {
        generoMusical = gen
        grupoMusical = grupo
        stockDisco = stock
    }

    override fun toString(): String {
        return "Disco(generoMusical='$generoMusical', grupoMusical='$grupoMusical', stockDisco=$stockDisco)"
    }


}