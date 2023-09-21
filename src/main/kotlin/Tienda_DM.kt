import java.util.Dictionary

class Tienda_DM {
    var listaProductos = listOf<Producto>()
    var listaClientes = listOf<Cliente_registrado>()
    var compra = HashMap<Producto,Int>()

    //descarto los métodos buscarDisco y buscarPelicula ya que por el título como producto ya se encontraría
    fun buscaProducto(nombre : String) : String{
        var cadenaDevolver = ""
        for (producto in listaProductos){
            if (producto.tituloProducto == nombre){
                cadenaDevolver = producto.toString()
            }else{
                cadenaDevolver = "No se ha encontrado el producto"
            }
        }
        return cadenaDevolver
    }

    fun buscaCliente(nombre : String) : String{
        var cadenaDevolver = ""
        for (cliente in listaClientes){
            if (cliente.nombreCliente == nombre){
                cadenaDevolver = cliente.toString()
            }else{
                cadenaDevolver = "No se ha encontrado el cliente"
            }
        }
        return cadenaDevolver
    }

    fun compraPelicula(pelicula: Pelicula, numEjemplares:Int){
        compra[pelicula] = numEjemplares
    }

    fun compraDisco(disco: Disco, numEjemplares: Int){
        compra[disco] = numEjemplares
    }

    fun listarCompra(){
        for (producto in compra){
            println(producto.toString())
        }
    }
}