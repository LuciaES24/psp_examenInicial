abstract class Producto (titulo:String, precio:Double, a_publi:Int){
    var tituloProducto = ""
        set(value) {
            if (value == ""){
                print("Debe introducir un titulo para el producto: ")
                tituloProducto = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var precioProducto = 0.0
        set(value) {
            if (value == 0.0){
                print("Debe introducir un precio válido para el producto: ")
                precioProducto = readln().toDouble()
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var a_publicacion = 0
        set(value) {
            if (value == 0){
                print("Debe introducir un año de publicación válido para el producto: ")
                a_publicacion = readln().toInt()
            }else{
                field = value
            }
        }
        get() {
            return field
        }
    var descuento = 0

    init {
        tituloProducto = titulo
        precioProducto = precio
        a_publicacion = a_publi
    }

    override fun toString(): String {
        return "Producto(tituloProducto='$tituloProducto', precioProducto=$precioProducto, a_publicacion=$a_publicacion, descuento=$descuento)"
    }


}