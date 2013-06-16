/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_observer;

import java.util.ArrayList;
import java.util.Iterator;

/**
 *
 * @author Guilherme Gehling
 */
public class SireneConcreta implements Sirene {
 
	private Boolean alertaSonoro = false;
	private ArrayList observadores = new ArrayList();
 
	public void alterarAlerta(){
		if(alertaSonoro)
			alertaSonoro = false;
		else
			alertaSonoro = true;
		notificarObservadores();
	}
 
	public Boolean getAlerta(){
		return alertaSonoro;
	}
 
	public void adicionarObservador(Operario o) {
		observadores.add(o);
	}
 
	public void removerObservador(Operario o) {
		observadores.remove(o);
	}
 
	private void notificarObservadores(){
		Iterator i = observadores.iterator();
		while(i.hasNext()){
			Operario o = (Operario) i.next();
			o.atualizar(this);
		}
	}
}
