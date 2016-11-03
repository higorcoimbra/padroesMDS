/*
 * To change this license header, choose License Headers in Project Properties.
 * To change this template file, choose Tools | Templates
 * and open the template in the editor.
 */
package TesteState;

/**
 *
 * @author higor
 */
class Finalizada implements EstadoOS {

    public Finalizada() {
    }

    @Override
    public EstadoOS Cancelar() {
        System.out.println("Não é possível realizar transição");
        return this;
    }

    @Override
    public EstadoOS FazerDiagnostico() {
        System.out.println("Não é possível realizar transição");
        return this;
    }

    @Override
    public EstadoOS ExecutarReparo() {
        System.out.println("Não é possível realizar transição");
        return this;
    }

    @Override
    public EstadoOS Finalizar() {
        System.out.println("Não é possível realizar transição");
        return this;
    }
    
}
