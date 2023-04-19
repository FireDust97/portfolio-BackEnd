package com.portfolioargprog.firedust.Interface;

import com.portfolioargprog.firedust.Entity.Persona;
import java.util.List;

public interface PersonaServiceInterface {
    public List<Persona> getPersona();
    
    public void savePersona(Persona persona);
    
    public void deletePersona(Long id);
    
    public Persona findPersona(Long id);
}
