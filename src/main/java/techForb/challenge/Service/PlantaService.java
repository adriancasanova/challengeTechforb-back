/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techForb.challenge.Service;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;
import techForb.challenge.Model.Planta;
import techForb.challenge.Repository.PlantaRepository;

 @Service
public class PlantaService implements IPlantaService{
  
    @Autowired
    public PlantaRepository plantaRepo; 
    
    @Override
    public List<Planta> verPlanta() {      
       return plantaRepo.findAll();                   
    }
    
    @Override
    public Planta verPlantaPorId(Long id) {      
      return plantaRepo.findById(id).orElse(null);
      
    }

    @Override
    public void agregarPlanta(Planta planta) {
    plantaRepo.save(planta);
    }

    @Override
    public void borrarPlanta(Long id) {
     plantaRepo.deleteById(id);
    }

    @Override
    public Planta buscarPlanta(Long id) {        
         return plantaRepo.findById(id).orElse(null);
    }

    @Override
    public void editarPlanta (Planta planta){
    plantaRepo.save(planta);
   }

}
