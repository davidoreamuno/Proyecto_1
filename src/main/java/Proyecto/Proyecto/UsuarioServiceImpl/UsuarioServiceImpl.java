package Proyecto.Proyecto.UsuarioServiceImpl;

import Proyecto.Proyecto.Service.UsuarioService;
import Proyecto.Proyecto.dao.UsuarioDao;
import Proyecto.Proyecto.domain.Usuario;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class UsuarioServiceImpl implements UsuarioService {

    private UsuarioDao usuarioRepository;

    @Autowired
    public UsuarioServiceImpl(UsuarioDao usuarioRepository) {
        this.usuarioRepository = usuarioRepository;
    }

    @Override
    public Usuario guardarUsuario(Usuario usuario) {
        return usuarioRepository.save(usuario);
    }
}
 