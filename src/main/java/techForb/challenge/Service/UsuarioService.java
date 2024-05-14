/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techForb.challenge.Service;

import de.mkammerer.argon2.Argon2;
import de.mkammerer.argon2.Argon2Factory;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import java.util.List;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import techForb.challenge.Model.Users;
import techForb.challenge.Repository.UsuarioRepository;

@Repository
@Transactional
public class UsuarioService implements IUsuarioService {

    @Autowired
    @PersistenceContext
    EntityManager entityManager;
    @Autowired
    public UsuarioRepository usuarioRepo;

    @Override
    @Transactional

    public List<Users> getUsuarios() {
        return usuarioRepo.findAll();
    }

    @Override
    public void eliminar(Long id) {
        Users usuario = entityManager.find(Users.class, id);
        entityManager.remove(usuario);
    }

    @Override
    public void registrar(Users usuario) {
        entityManager.merge(usuario);
    }

    @Transactional
    @Override
    public Users obtenerUsuarioPorCredenciales(Users usuario) {
        String query = "FROM Users WHERE email = :email";
        List<Users> lista = entityManager.createQuery(query)
                .setParameter("email", usuario.getEmail())
                .getResultList();
        if (lista.isEmpty()) {
            return null;
        }
        String passwordHashed = lista.get(0).getPassword();

        Argon2 argon2 = Argon2Factory.create(Argon2Factory.Argon2Types.ARGON2id);
        if (argon2.verify(passwordHashed, usuario.getPassword())) {
            return lista.get(0);

        }
        return null;
    }

}
