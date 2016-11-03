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
class Aberta implements EstadoOS {

    public Aberta() {}

    @Override
    public EstadoOS Cancelar() {
        return new Cancelada();
    }

    @Override
    public EstadoOS FazerDiagnostico() {
        return new Diagnostico();
    }

    @Override
    public EstadoOS ExecutarReparo() {
        return new Reparo();
    }

    @Override
    public EstadoOS Finalizar() {
        System.out.println("Não é possível realizar transição");
        return this;
    }
    
}
