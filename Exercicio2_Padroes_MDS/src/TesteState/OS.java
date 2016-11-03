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
public class OS{
    protected EstadoOS estado;
    public OS(){
        estado = new Aberta();
    }

    public void Cancelar() {
        estado = new Cancelada();
    }
    
    public void FazerDiagnostico() {
        estado = new Diagnostico();
    }

    public void ExecutarReparo() {
        estado = new Reparo();
    }
    
    public void Finalizar() {
        estado = new Finalizada();
    }
}
