package listadoblecircular;

import java.awt.HeadlessException;
import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class Menu {

    int op = 0;
    ListaDC lista = new ListaDC();

    public void mostrarMenu() {
        while (op != 8) {
            try{
            op = Integer.parseInt(
                    JOptionPane.showInputDialog(null, "Menu Pricipal\n"
                            + "1- Agregar nodo\n"
                            + "2- Extraer nodo\n"
                            + "3- Mostrar nodo\n"
                            + "4- Mostrar nodo a la inversa\n"
                            + "5- Modificar Nodo\n"
                            + "6- Existencia del nodo\n"
                            + "7- Eliminar nodo especifico\n"
                            + "8- Salir\n"
                            + "Digite su opción: \n", "Menu Principal", JOptionPane.QUESTION_MESSAGE));
            }catch(HeadlessException | NumberFormatException e){
                e.getMessage();
            }
            switch (op) {
                case 1:
                    lista.inserta();
                    break;
                case 2:
                    lista.extraer();
                    break;
                case 3:
                    lista.mostrarElementos();
                    break;
                case 4:
                    lista.mostarInversa();
                    break;
                case 5:
                    lista.modificar();
                    break;
                case 6:
                    lista.existe();
                    break;
                case 7:
                    lista.extraerEspecifico();
                    break;
                case 8:
                    System.exit(0);
                    break;
                default:
                    JOptionPane.showMessageDialog(null, "Error! Opción invalida");
            }

        }
    }
}
