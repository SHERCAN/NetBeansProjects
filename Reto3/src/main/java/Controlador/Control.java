
package Controlador;

import Clases.Plan;
import Modelo.modelPlan;

public class Control {
    private modelPlan modelPlan;

    public Control() {
        this.modelPlan = new modelPlan();
    }

    public boolean CrearPlan(Plan plan){
        try{
            return this.modelPlan.crearPlan(plan);
        }catch (Exception e){
            return false;
        }
    }
    
    public Plan buscarPlan(String nombre){
        Plan p = null;
        try{
            p = this.modelPlan.buscarPlan(nombre);
            return p;
        }catch (Exception e){
            return null;
        }
    
    }
    
    public boolean modificarPlan(Plan p){
        try{
            return this.modelPlan.modificarPlan(p);
                                
        }catch(Exception e){
            return false;}
    }
    
    public boolean borrarPlan(String nombre){
        try{
        return this.modelPlan.borrarPlan(nombre);
        }catch (Exception e){
            return false;
        }
    }
    
}
