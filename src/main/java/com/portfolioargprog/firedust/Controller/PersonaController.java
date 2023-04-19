package com.portfolioargprog.firedust.Controller;

import com.portfolioargprog.firedust.Entity.Persona;
import com.portfolioargprog.firedust.Interface.PersonaServiceInterface;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestParam;
import org.springframework.web.bind.annotation.RestController;

@RestController
@CrossOrigin(origins = "http://localhost:4200")
public class PersonaController {
    @Autowired PersonaServiceInterface PersonaServiceInterface;
    
    @GetMapping("/personas/traer")
    public List<Persona> getPersona(){
        return PersonaServiceInterface.getPersona();
    }
    
    @PostMapping("/personas/crear")
    public String createPersona(@RequestBody Persona persona){
        PersonaServiceInterface.savePersona(persona);
        return "Persona creada con éxito";
    }
    
    @DeleteMapping("/personas/borrar/{id}")
    public String deletePersona(@PathVariable Long id){
        PersonaServiceInterface.deletePersona(id);
        return "Persona eliminada con éxito";
    }
    
    @PutMapping("/personas/editar/{id}")
    public Persona editPersona(@PathVariable Long id,
                               @RequestParam("nombre") String nuevoNombre,
                               @RequestParam("apellido") String nuevoApellido,
                               @RequestParam("img") String nuevoImg){
        Persona persona = PersonaServiceInterface.findPersona(id);
        
        persona.setNombre(nuevoNombre);
        persona.setApellido(nuevoApellido);
        persona.setImg(nuevoImg);
        
        PersonaServiceInterface.savePersona(persona);
        return persona;
    }
    
    @GetMapping("/personas/traer/perfil")
    public Persona findPersona(){
        return PersonaServiceInterface.findPersona((long)1);
    }
}
