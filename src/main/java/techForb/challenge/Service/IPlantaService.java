/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package techForb.challenge.Service;

import java.util.List;
import techForb.challenge.Model.Planta;


public interface IPlantaService {

    public List<Planta> verPlanta();

    public void agregarPlanta(Planta planta);

    public void borrarPlanta(Long id);

    public Planta buscarPlanta(Long id);

    public void editarPlanta(Planta planta);

    public Planta verPlantaPorId(Long id);
}
