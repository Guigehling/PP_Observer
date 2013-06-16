package observer_api_java;

import java.util.Observable;
import java.util.Observer;

/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
/**
 *
 * @author Guilherme Gehling
 */
public class Assinante implements Observer {

    Observable revista;
    int edicaoNovaRevista;

    public Assinante(Observable revista) {
        this.revista = revista;
        revista.addObserver(this);
    }

    @Override
    public void update(Observable revistaInfSubject, Object arg1) {
        if (revistaInfSubject instanceof Revista) {
            Revista revista = (Revista) revistaInfSubject;
            edicaoNovaRevista = revista.getEdicao();
            System.out.println("Atenção, já chegou a mais uma edição da Revista. "
                    + "Esta é a sua edição número: " + edicaoNovaRevista);
        }
    }
}