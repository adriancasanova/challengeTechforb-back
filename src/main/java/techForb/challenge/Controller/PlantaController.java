/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techForb.challenge.Controller;

import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.DeleteMapping;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.PutMapping;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.ResponseBody;
import org.springframework.web.bind.annotation.RestController;
import techForb.challenge.Model.Planta;
import techForb.challenge.Service.IPlantaService;

@RestController
@CrossOrigin (origins = "challengetechforb-99eeb.web.app")
//@CrossOrigin(origins = "http://localhost:4200")
public class PlantaController {

    @Autowired
    private IPlantaService plantaServ;

    @PostMapping("/planta")
    public void agregarPlanta(@RequestBody Planta planta) {
        plantaServ.agregarPlanta(planta);
    }

    @GetMapping("/planta")
    @ResponseBody
    public List<Planta> verPlanta() {
        return plantaServ.verPlanta();
    }

    // prueba para traer por id 
    @GetMapping("/planta/detalle/{id}")
    @ResponseBody
    public Planta verPlantaPorId(@PathVariable Long id) {
        return plantaServ.verPlantaPorId(id);

    }

    @DeleteMapping("/planta/{id}")
    public void borrarPlanta(@PathVariable Long id) {
        plantaServ.borrarPlanta(id);
    }

    @PutMapping("/planta/{id}")
    public void editarPlanta(@RequestBody Planta planta) {
        plantaServ.editarPlanta(planta);
    }

}
