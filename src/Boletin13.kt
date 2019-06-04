
import javax.swing.JOptionPane

    fun main(args: Array<String>) {
        val obx = Plantilla("Jose", "Baz Canarias", 31, 34)
        val obxX = Xogador("pepe", "Perez Perez", 3, 21, 1, "patata")
        val obxB = Adestrador("Carlos", "Martinez Baz", 32, 35, "244h")
        val obxM = Masaxista("Marcos", "Santiago Castilla", 42, 30, 12, "alguna")

        obx.concentrarse()
        obx.viaxar()
        JOptionPane.showMessageDialog(null, obx.toString())
        obxX.viaxar()
        JOptionPane.showMessageDialog(null, obxX.toString())
        obxB.viaxar()
        JOptionPane.showMessageDialog(null, obxB.toString())
        obxM.viaxar()
        JOptionPane.showMessageDialog(null, obxM.toString())
    }

