
import javax.swing.JOptionPane
/*
* Plantilla: Esta es la clase de la que extienden el resto de clases y tiene los metodos esenciales al igual que las variables
*/
open class Plantilla(var nome: String?, var apelidos: String?, var id: Int, var edad: Int) {
    /*
     * concentrarse: Metodo que se puede sobre escribir desde las clases que heredan esta clase ademas tiene por defecto un JOptionPane
     */
    fun concentrarse() {
        JOptionPane.showMessageDialog(null, "Concentrase a seleccion.")
    }
    /*
     * viaxar: Metodo que se puede sobre escribir desde las clases que heredan esta clase ademas tiene por defecto un JOptionPane
     */
    open fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa a seleccion")
    }

    override fun toString(): String {
        return "Nome=$nome\nApelidos=$apelidos\nId=$id\nEdad=$edad"
    }

}