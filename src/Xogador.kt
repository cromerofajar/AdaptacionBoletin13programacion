
import javax.swing.JOptionPane

/*
 * Xogador extiende de Plantilla y para las variables predeterminadas no usa la palabra reservada var
 */
class Xogador(nome: String, apelidos: String, id: Int, edad: Int, var dorsal: Int, var demarcacion: String?) :
    Plantilla(nome, apelidos, id, edad) {
    /*
     * xogarPartido: funcion privada sin codigo
     * etrenar: funcion privada sin codigo
     */
    private fun xogarPartido() {}
    private fun entrenar() {}
    /*
     * viaxar: funcion sobre escrita que remplaza los datos de Plantilla.vixar
     */
    override fun viaxar() {
        JOptionPane.showMessageDialog(null, "Viaxan os xogadores:" + super.nome!!)
    }

    override fun toString(): String {
        return "O xogador é:\n" + super.toString() + "\nDorsal=" + dorsal + "\nDemarcacion=" + demarcacion
    }

}