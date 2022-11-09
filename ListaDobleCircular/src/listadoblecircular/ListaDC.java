package listadoblecircular;

import java.util.ArrayList;
import java.util.Collections;
import javax.swing.JOptionPane;

/**
 *
 * @author EMERSON
 */
public class ListaDC {

    private Nodo inicio;
    private Nodo fin;

    public ListaDC() {
        this.inicio = null;
        this.fin = null;
    }

    public boolean vacia() {
        if (inicio == null) {
            return true;
        } else {
            return false;
        }
    }

    public void inserta() {
        Curso c = new Curso();
        c.setNomCurso(JOptionPane.showInputDialog("Ingrese el nombre del curso: "));
        c.setCanCreditos(Integer.parseInt(
                JOptionPane.showInputDialog("Digite la cantidad de creditos")));
        c.setCosto(Double.parseDouble(
                JOptionPane.showInputDialog("Digite el costo del curso")));

        Nodo nuevo = new Nodo();
        nuevo.setElemento(c);

        if (vacia()) {
            inicio = nuevo;
            fin = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (c.getCosto() < inicio.getElemento().getCosto()) {
            nuevo.setSiguiente(inicio);
            inicio = nuevo;
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else if (c.getCosto() > fin.getElemento().getCosto()) {
            fin.setSiguiente(nuevo);
            fin = fin.getSiguiente();
            fin.setSiguiente(inicio);
            inicio.setAnterior(fin);
        } else {
            Nodo aux = inicio;
            while (aux.getSiguiente().getElemento().getCosto() < c.getCosto()) {
                aux = aux.getSiguiente();
            }
            nuevo.setSiguiente(aux.getSiguiente());
            nuevo.setAnterior(aux);
            aux.setSiguiente(nuevo);
            nuevo.getSiguiente().setAnterior(nuevo);
        }
    }

    public void extraer() {
        if (!vacia()) {
            inicio = inicio.getSiguiente();
            fin.setSiguiente(inicio);
            JOptionPane.showMessageDialog(null, "Elemento extraído");
        } else {
            JOptionPane.showMessageDialog(null, "No se puede extraer, lista vacía");
        }
    }
    
    public void extraerEspecifico() {
        try {
            if (!vacia()) {
                String nomCurso = JOptionPane.showInputDialog("Digite el nombre del curso a extraer: ");
                if (inicio.getElemento().getNomCurso().equals(nomCurso)) {
                    inicio = inicio.getSiguiente();
                    JOptionPane.showMessageDialog(null, "Elemento extraído");
                } else {
                    Nodo anterior;
                    Nodo aux;

                    anterior = inicio;
                    aux = inicio.getSiguiente();

                    while ((aux != inicio) && (!aux.getElemento().getNomCurso().equals(nomCurso))) {
                        anterior = anterior.getSiguiente();
                        aux = aux.getSiguiente();
                    }
                    if (aux != inicio) {
                        anterior.setSiguiente(aux.getSiguiente());
                        fin.setSiguiente(inicio);
                    }
                }
            }
        } catch (Exception e) {
            JOptionPane.showMessageDialog(null, "El vehiculo puede que no exista");
        }
    }
    

    public void mostrarElementos() {
        String s = "";
        Nodo aux = inicio;
        s += aux.getElemento().getNomCurso() + " / "
                + aux.getElemento().getCanCreditos() + " / "
                + aux.getElemento().getCosto() + "<=>";
        aux = aux.getSiguiente();
        while (aux != inicio) {
            s += aux.getElemento().getNomCurso() + " / "
                    + aux.getElemento().getCanCreditos() + " / "
                    + aux.getElemento().getCosto() + "<=>";
            aux = aux.getSiguiente();
        }
        JOptionPane.showMessageDialog(null, "La lista contiene: \n" + s);
    }

     public void modificar() {
        if (!vacia()) {
            Nodo aux = inicio;
            boolean encontrado = false;
            int buscarNodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de creditos del cuso a modificar"));
            while (aux != null && encontrado != true) {
                if (aux.getElemento().getCanCreditos() == buscarNodo) {
                    JOptionPane.showMessageDialog(null, "El curso buscado: " + aux.getElemento().getCanCreditos() + ", si existe");
                    aux.getElemento().setNomCurso((JOptionPane.showInputDialog(null, "Ingrese el nombre nuevo del curso")));
                    aux.getElemento().setCanCreditos(Integer.parseInt(JOptionPane.showInputDialog(null, "Ingrese la cantidad nueva de creditos del curso")));
                    aux.getElemento().setCosto(Double.parseDouble(JOptionPane.showInputDialog(null,"Ingrese el costo nuevo del curso")));
                    JOptionPane.showMessageDialog(null, "Se ha modificado los datos del vehiculo");
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "El vehiculoo");

            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay vehiculos, cola vacía");

        }
    }
     
    public void existe() {
        if (!vacia()) {
            Nodo aux = inicio;
            boolean encontrado = false;
            int buscarNodo = Integer.parseInt(JOptionPane.showInputDialog("Ingrese la cantidad de creditos del curso que busca"));
            while (aux != null && encontrado != true) {
                if (aux.getElemento().getCanCreditos() == buscarNodo) {
                    JOptionPane.showMessageDialog(null, "El curso buscado: " + aux.getElemento().getCanCreditos() + ", si existe");
                    encontrado = true;
                }
                aux = aux.getSiguiente();
            }
            if (!encontrado) {
                JOptionPane.showMessageDialog(null, "El curso no ha sido registrado");

            }
        } else {
            JOptionPane.showMessageDialog(null, "No hay cursos, cola vacía");

        }

    } 
    
    public void mostarInversa() {

        Nodo aux = inicio;

        ArrayList listaInvertida = new ArrayList();

        do {

            listaInvertida.add(
                    aux.getElemento().getNomCurso() + "="
                    + aux.getElemento().getCanCreditos() + "="
                    + aux.getElemento().getCosto() + "<=>");

            aux = aux.getSiguiente();

        } while (aux != inicio);

        Collections.reverse(listaInvertida);

        JOptionPane.showMessageDialog(null, "La lista contiene: \n" + listaInvertida);

    }
}
