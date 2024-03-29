package pokercartas;

/**
 *
 * @author Raul
 */
public class CartaFrancesa {

    private int palo;
    private int numero;
    
    /**
     * Constantes 
     */
    public static final int TREBOLES = 0;
    public static final int DIAMANTES = 1;
    public static final int CORAZONES = 2;
    public static final int PICAS = 3;
    public static final int COMODIN = 4;

    /**
     *Metodo Constructor que crea una carta
     * 
     * @param palo sera el Palo de la carta (TREBOLES, DIAMANTES, CORAZONES, PICAS, COMODIN)
     * @param numero numero de la carta comprendido entre el 0 y 12
     */
    public CartaFrancesa(int palo, int numero) {
        this.palo = palo;
        this.numero = numero;
    }

    /**
     * 
     * @return Retorna el numero correspondiente al palo de la carta
     */
    public int getPalo() {
        return palo;
    }

    /**
     *
     * @return Retorna el numero correspondiente al numero de la carta
     */
    public int getNumero() {
        return numero;
    }
    
    /**
     * Retorna el texto del nombre de la carta en el formato "(Valor) de (Palo)"
     * Ejemplo: "As de Corazones"
     * 
     * @return String del Nombre de la carta
     */
    public String toString() {
        String retorno = "";
        if(numero>0 && numero<10) {
            retorno += numero+1;
        } else {
            switch(numero) {
                case 0:
                    retorno += "As";
                    break;
                case 10:
                    retorno += "J";
                    break;
                case 11:
                    retorno += "Q";
                    break;
                case 12:
                    retorno += "K";
                    break;
            }
        }
        retorno += " de ";
        switch(palo) {
            case TREBOLES:
                retorno+="Treboles";
                break;
            case DIAMANTES:
                retorno+="Diamantes";
                break;
            case PICAS:
                retorno+="Picas";
                break;
            case CORAZONES:
                retorno+="Corazones";
                break;
            case COMODIN:
                retorno+="Comodin";
                break;
        }
        return retorno;
    }
    
    /**
     * Retorna el codigo de la carta en el formato "(InicialdelPalo)(valorNumericoDeLaCarta)"
     * Ejemplo: El As de Corazones seria C0
     * 
     * @return String del codigo de la carta
     */
    public String toCodigo() {
        String retorno = "";
        switch(palo) {
            case TREBOLES:
                retorno+="T";
                break;
            case DIAMANTES:
                retorno+="D";
                break;
            case PICAS:
                retorno+="P";
                break;
            case CORAZONES:
                retorno+="C";
                break;
            case COMODIN:
                retorno+="J";
                break;
        }
        retorno+=numero;
        return retorno;
    }        
    
}
