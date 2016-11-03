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
class Cancelada implements EstadoOS {

    public Cancelada() {
    }

    @Override
    public EstadoOS Cancelar() {
        System.out.println("OS Cancelada");
        return this;
    }

    @Override
    public EstadoOS FazerDiagnostico() {
        System.out.println("OS Cancelada");
        return this;
    }

    @Override
    public EstadoOS ExecutarReparo() {
        System.out.println("OS Cancelada");
        return this;
    }

    @Override
    public EstadoOS Finalizar() {
        System.out.println("OS Cancelada");
        return this;
    }
    
}
