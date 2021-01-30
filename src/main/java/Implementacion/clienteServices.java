package Implementacion;

import java.util.List; 
import org.springframework.beans.factory.annotation.Autowired; 
import org.springframework.stereotype.Service; 
import org.springframework.transaction.annotation.Transactional; 
import dao.IUsuarioDao; 
import entities.Usuario; 
import services.IUsuarioServices; 
@Service 
public class clienteServices implements IUsuarioServices{ 
@Autowired 
private IUsuarioDao clienteDao; 
@Transactional(readOnly = true) 
public List<Usuario> findAll() { 
return (List<Usuario>) clienteDao.findAll(); 
} 
@Transactional(readOnly = false) 
public Usuario create(Usuario usuario){ 
System.out.println(usuario.getDependencia()); 
return clienteDao.save(usuario); 
} 
} 
