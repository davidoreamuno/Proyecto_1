/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Interface.java to edit this template
 */
package Proyecto.Proyecto.dao;



import org.springframework.data.jpa.repository.JpaRepository;
import Proyecto.Proyecto.domain.Usuario;

public interface UsuarioDao extends JpaRepository<Usuario, Long> {
    // Define métodos de consulta personalizados si es necesario
}
