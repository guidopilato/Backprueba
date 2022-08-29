
package com.portfolioGP.GP.Interface;

import com.portfolioGP.GP.Entity.Persona;
import java.util.List;

public interface IPersonaService {
    //traer una lista de personas
    public List<Persona> getPersona();
    
    //Guardar un objeto de tipo persona
    public void savePersona(Persona persona);
    
    //Eliminar un pbjeto pero lo eliminamos por id
    public void deletePersona(Long id);
    
    //buscar una persona por Id
    public Persona findPersona(Long id);
    
}
