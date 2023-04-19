package com.portfolioargprog.firedust.Service;

import com.portfolioargprog.firedust.Entity.Persona;
import com.portfolioargprog.firedust.Interface.PersonaServiceInterface;
import com.portfolioargprog.firedust.Repository.PersonaRepositoryInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class PersonaServiceImplementation implements PersonaServiceInterface{
    @Autowired PersonaRepositoryInterface PersonaRepositoryInterface;

    @Override
    public List<Persona> getPersona() {
        List<Persona> persona = PersonaRepositoryInterface.findAll();
        return persona;
    }

    @Override
    public void savePersona(Persona persona) {
        PersonaRepositoryInterface.save(persona);
    }

    @Override
    public void deletePersona(Long id) {
        PersonaRepositoryInterface.deleteById(id);
    }

    @Override
    public Persona findPersona(Long id) {
        Persona persona = PersonaRepositoryInterface.findById(id).orElse(null);
        return persona;
    }
    
}
