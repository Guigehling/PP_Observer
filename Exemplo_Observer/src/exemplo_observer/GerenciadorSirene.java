/*
 * To change this template, choose Tools | Templates
 * and open the template in the editor.
 */
package exemplo_observer;

/**
 *
 * @author Guilherme Gehling
 */
public class GerenciadorSirene {

    /**
     * @param args the command line arguments
     */
    public static void main(String[] args) {
        SireneConcreta sirene = new SireneConcreta();
        // Sirete ja começa com valor default false

        OperarioConcreto obs1 = new OperarioConcreto(sirene);
        OperarioConcreto obs2 = new OperarioConcreto(sirene);
        // Já passando a sirene como parametro

        sirene.alterarAlerta();
        // Nesse momento é chamado o método atualizar
        // das instâncias obs1 e obs2, saída:
        // [INFO] A Sirene mudou seu estado para: true
        // [INFO] A Sirene mudou seu estado para: true

        sirene.alterarAlerta();
        //[INFO] A Sirene mudou seu estado para: false
        //[INFO] A Sirene mudou seu estado para: false

        // Obs: 2 saídas porque temos 2 observadores

    }
}
