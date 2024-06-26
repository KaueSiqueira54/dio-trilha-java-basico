package dio.web.api.repository;

import java.util.ArrayList;
import java.util.List;

import org.springframework.stereotype.Repository;

import dio.web.api.model.Usuario;

@Repository
public class UsuarioRepository {
    public void save(Usuario usuario) {
        if(usuario.getId()==null) 
            System.out.println("SAVE - Recebendo o usuário na camada de repositório");
        else
            System.out.println("UPDATE - Recebendo o usuário na camada de repositório");
        System.out.println(usuario);
    }
    public void deletedBy(Integer id) {
        System.out.println(String.format("DELETE/id - recebendo o id: %d para excluir um usuário", id));
        System.out.println(id);
    }
    public List<Usuario> findAll() {
        System.out.println("LIST - Listando os usuários do sistema");
        List<Usuario> usuarios = new ArrayList<>();
        usuarios.add(new Usuario("Gleyson", "password"));
        usuarios.add(new Usuario("Frank", "masterpass"));
        return usuarios;
    }
    public Usuario findbyId(Integer id) {
        System.out.println(String.format("FIND/id - Recebendo o id %d para localizar um usuário", id));
        return new Usuario("Gleyson", "password");
    }
    public Usuario findByUsername(String username) {
        System.out.println(String.format("FIND/username - Recebendo o username %s para localizar um usuário", username));
        return new Usuario("gleyson", "password");
    }
}
