
import javax.swing.JOptionPane
/*
 * Masaxista extiende de Plantilla y para las variables predeterminadas no usa la palabra reservada var
 */
class Masaxista(nome: String, apelidos: String, id: Int, edad: Int, var anosExperiencia: Int, var titulacion: String?) :
    Plantilla(nome, apelidos, id, edad) {
    /*
     * viaxar: funcion sobre escrita que remplaza los datos de Plantilla.vixar
     */
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxa o masaxista:" + super.nome!!)
    }
    /*
     * darMasaxes: funcion privada sin codigo
     */
    fun darMasaxes() {}

    override fun toString(): String {
        return "O masaxistata é:\n" + super.toString() + "\nAnosExperiencia=" + anosExperiencia + "\nTitulacion=" + titulacion
    }


}