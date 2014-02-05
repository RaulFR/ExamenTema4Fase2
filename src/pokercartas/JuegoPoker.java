/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package pokercartas;

/**
 *
 * @author Raul
 */
public class JuegoPoker {

    public static final int NADA = 0;
    public static final int PAREJA = 1;
    public static final int TRIO = 2;
    public static final int POKER = 3;
    public static final int REPOKER = 4;

    public static int getCombinacion(CartaFrancesa carta1, CartaFrancesa carta2, CartaFrancesa carta3, CartaFrancesa carta4, CartaFrancesa carta5) {
        int combinacion1 = 0;
        int combinacion2 = 0;
        int combinacion3 = 0;
        int combinacion4 = 0;
        int combinacion = 0;

        // Comparacion de carta 1 con todas las demas
        if (carta1.getNumero() == carta2.getNumero() && carta1.getPalo() != 4) {
            combinacion1++;
        }
        if (carta1.getNumero() == carta3.getNumero() && carta1.getPalo() != 4) {
            combinacion1++;
        }
        if (carta1.getNumero() == carta4.getNumero() && carta1.getPalo() != 4) {
            combinacion1++;
        }
        if (carta1.getNumero() == carta5.getNumero() && carta1.getPalo() != 4) {
            combinacion1++;
        }

        // Comparacion de carta 2 con todas las demas
        if (carta2.getNumero() == carta1.getNumero() && carta2.getPalo() != 4) {
            combinacion2++;
        }
        if (carta2.getNumero() == carta3.getNumero() && carta2.getPalo() != 4) {
            combinacion2++;
        }
        if (carta2.getNumero() == carta4.getNumero() && carta2.getPalo() != 4) {
            combinacion2++;
        }
        if (carta2.getNumero() == carta5.getNumero() && carta2.getPalo() != 4) {
            combinacion2++;
        }
        
        
        // Comparacion de carta 3 con todas las demas
        if (carta3.getNumero() == carta1.getNumero() && carta3.getPalo() != 4) {
            combinacion3++;
        }
        if (carta3.getNumero() == carta2.getNumero() && carta3.getPalo() != 4) {
            combinacion3++;
        }
        if (carta3.getNumero() == carta4.getNumero() && carta3.getPalo() != 4) {
            combinacion3++;
        }
        if (carta3.getNumero() == carta5.getNumero() && carta3.getPalo() != 4) {
            combinacion3++;
        }
        
        // Comparacion de carta 4 con todas las demas
        if (carta4.getNumero() == carta1.getNumero() && carta4.getPalo() != 4) {
            combinacion4++;
        }
        if (carta4.getNumero() == carta2.getNumero() && carta4.getPalo() != 4) {
            combinacion4++;
        }
        if (carta4.getNumero() == carta3.getNumero() && carta4.getPalo() != 4) {
            combinacion4++;
        }
        if (carta4.getNumero() == carta5.getNumero() && carta4.getPalo() != 4) {
            combinacion4++;
        }

        // Comprobacion de cual de todas las comparaciones anteriores es la mas alta
        if(combinacion1 > combinacion){
            combinacion = combinacion1;
        }
        if(combinacion2 > combinacion){
            combinacion = combinacion2;
        }
        if(combinacion3 > combinacion){
            combinacion = combinacion3;
        }
        if(combinacion4 > combinacion){
            combinacion = combinacion4;
        }

        // Aumento de la combinacion por existencia de comodines
        if(carta1.getPalo() == 4){
            combinacion++;
        }
        if(carta2.getPalo() == 4){
            combinacion++;
        }
        if(carta3.getPalo() == 4){
            combinacion++;
        }
        if(carta4.getPalo() == 4){
            combinacion++;
        }
        if(carta5.getPalo() == 4){
            combinacion++;
        }
        
        
        return combinacion;
    }
}
