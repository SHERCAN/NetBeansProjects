
package controlador;

import clases.*;
import modelo.*;

public class Controlar {
    
    public int crear_cliente(Cliente cl)
    {
        Peticion peti=new Peticion();
        return peti.crear_cliente(cl);
    }
    public Cliente consultar_cliente(String id)
    {
        Peticion peti=new Peticion();
        return peti.buscar_cliente(id);
    }
    public boolean eliminar_cliente(Cliente cl)
    {
        Peticion peti=new Peticion();
        if (peti.crear_cliente(cl)>0)
        {return true;}else {return false;}
    }
    public boolean actualizar_cliente(Cliente cl)
    {
        Peticion peti=new Peticion();
        if (peti.crear_cliente(cl)>0)
        {return true;}else {return false;}
    }
    public int crear_mascota(Mascota mc)
    {
        Peticion peti=new Peticion();
        return peti.crear_mascota(mc);
    }
}