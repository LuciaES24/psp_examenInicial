class Cliente_registrado(nombre:String, ape:String, dni:String, telf:String, saldo:Double){
    var nombreCliente = ""
        set(value) {
            if (value == ""){
                print("Debe introducir el nombre del cliente: ")
                nombreCliente = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    var apellidosCliente = ""
        set(value) {
            if (value == ""){
                print("Debe introducir los apellidos del cliente: ")
                apellidosCliente = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    var dniCliente = ""
        set(value) {
            if (value == ""){
                print("Debe introducir el DNI del cliente: ")
                dniCliente = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    var telefonoCliente = ""
        set(value) {
            if (value == ""){
                print("Debe introducir el número de teléfono del cliente: ")
                telefonoCliente = readln()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    var saldoCliente = 0.0
        set(value) {
            if (value == 0.0){
                print("Debe introducir el DNI del cliente: ")
                saldoCliente = readln().toDouble()
            }else{
                field = value
            }
        }
        get() {
            return field
        }

    init {
        nombreCliente = nombre
        apellidosCliente = ape
        dniCliente = dni
        telefonoCliente = telf
        saldoCliente = saldo
    }

    fun validarDNI(dni: String) : Boolean{
        var validado = true
        if (dni.length == 9){
            var numerosDNI = dni.substring(0,8)
            var letraDNI = dni.substring(8,9)
            if (numerosDNI.toInt() is Int && letraDNI is String){
                validado = true
            }else{
                validado = false
            }
        }else{
            validado = false
        }
        return validado
    }

    override fun toString(): String {
        return "Cliente_registrado(nombreCliente='$nombreCliente', apellidosCliente='$apellidosCliente', dniCliente='$dniCliente', telefonoCliente='$telefonoCliente', saldoCliente=$saldoCliente)"
    }


}