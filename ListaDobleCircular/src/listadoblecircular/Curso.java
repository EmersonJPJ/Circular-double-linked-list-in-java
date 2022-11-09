package listadoblecircular;

/**
 *
 * @author EMERSON
 */
public class Curso {

    private String nomCurso;
    private int canCreditos;
    private double costo;

    public Curso() {
        this.nomCurso = "";
        this.canCreditos = 0;
        this.costo = 0.00;
    }

    /**
     * @return the nomCurso
     */
    public String getNomCurso() {
        return nomCurso;
    }

    /**
     * @param nomCurso the nomCurso to set
     */
    public void setNomCurso(String nomCurso) {
        this.nomCurso = nomCurso;
    }

    /**
     * @return the canCreditos
     */
    public int getCanCreditos() {
        return canCreditos;
    }

    /**
     * @param canCreditos the canCreditos to set
     */
    public void setCanCreditos(int canCreditos) {
        this.canCreditos = canCreditos;
    }

    /**
     * @return the costo
     */
    public double getCosto() {
        return costo;
    }

    /**
     * @param costo the costo to set
     */
    public void setCosto(double costo) {
        this.costo = costo;
    }

}
