/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techForb.challenge.Controller;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.CrossOrigin;
import org.springframework.web.bind.annotation.RequestBody;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestMethod;
import org.springframework.web.bind.annotation.RestController;
import techForb.challenge.Model.Users;
import techForb.challenge.Service.IUsuarioService;
import techForb.challenge.utils.JWTUtil;

/**
 *
 * @author Adrian
 */
@RestController
@CrossOrigin (origins = "https://challengetechforb-99eeb.web.app")
//@CrossOrigin (origins = "http://localhost:4200")
public class LoginController {
        @Autowired
    private IUsuarioService usuarioDao;  
    @Autowired
    private JWTUtil jwtUtil;
    @RequestMapping(value = "/login", method = RequestMethod.POST)
    
     public String []login(@RequestBody Users usuario) {
        Users usuarioLogueado = usuarioDao.obtenerUsuarioPorCredenciales (usuario);
        if (usuarioLogueado != null) {
      
            String tokenJwt = jwtUtil.create(String.valueOf(usuarioLogueado.getId()), usuarioLogueado.getEmail());
                
            String[ ] nombreT = {tokenJwt, usuarioLogueado.getNombre()}; 
            
            return nombreT;
        }
        return null;
    }
}
