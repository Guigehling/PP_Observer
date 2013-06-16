/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_observer;

/**
 *
 * @author Guilherme Gehling
 */
public interface Sirene {

    public void adicionarObservador(Operario o);

    public void removerObservador(Operario o);
}
