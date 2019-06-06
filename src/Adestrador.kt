
import javax.swing.JOptionPane

/*
 * Adestrador extiende de Plantilla y para las variables predeterminadas no usa la palabra reservada var
 */
class Adestrador(nome: String, apelidos: String, id: Int, edad: Int, var idFederacion: String?) :
    Plantilla(nome, apelidos, id, edad) {
    /*
     * dirixirPartido: funcion privada sin codigo
     * dirixirAdestramento: funcion privada sin codigo
     */
    private fun dirixirPartido() {}
    private fun dirixirAdestramento() {}
    /*
     * viaxar: funcion sobre escrita que remplaza los datos de Plantilla.vixar
     */
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa o entrenador:" + super.nome!!)
    }

    override fun toString(): String {
        return "O adestrador é:\n" + super.toString() + "\nIdFederacion=" + idFederacion
    }

}