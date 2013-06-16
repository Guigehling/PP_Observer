/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package observer_api_java;

/**
 *
 * @author Guilherme Gehling
 */
import java.util.Observable;

public class Revista extends Observable {

    private int edicao;

    public void setNovaEdicao(int novaEdicao) {
        this.edicao = novaEdicao;

        setChanged();
        notifyObservers();
    }

    public int getEdicao() {
        return this.edicao;
    }

    public static void main(String[] args) {
        //poderia receber a nova edicao atraves de um recurso externo
        int novaEdicao = 3;
        Revista revista = new Revista();
        Assinante assinante = new Assinante(revista);

        revista.setNovaEdicao(novaEdicao);
    }
}
