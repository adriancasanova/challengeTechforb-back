/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package techForb.challenge.Service;

import java.util.List;
import techForb.challenge.Model.Users;

/**
 *
 * @author Adrian
 */
public interface IUsuarioService {
   public  List<Users> getUsuarios();
   public void eliminar(Long id);
   public void registrar(Users usuario);
   public Users obtenerUsuarioPorCredenciales(Users usuario);  
}
