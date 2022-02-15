package br.com.tasktracking.infrastructure.dao;

import java.util.List;
import javax.persistence.EntityManager;
import javax.persistence.PersistenceContext;
import org.springframework.stereotype.Repository;
import org.springframework.transaction.annotation.Transactional;
import br.com.tasktracking.domain.models.Usuario;

@Repository 
@Transactional
public class UsuarioDao{

    @PersistenceContext
    private EntityManager manager;

    public void gravar(Usuario usuario) {
    	manager.persist(usuario);
    }

    public List<Usuario> listar() {
        return manager.createQuery("select usuario from Usuario usuario", Usuario.class).getResultList();
    }


    public void remover(Usuario usuario){    
        manager.createQuery("delete from Usuario usuario where email =" + usuario.getEmail()).executeUpdate();

    }

    public void alterar(Usuario usuario) {
        manager.merge(usuario);
    }

}