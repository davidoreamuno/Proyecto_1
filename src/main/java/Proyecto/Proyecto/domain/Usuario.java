/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package Proyecto.Proyecto.domain;

import jakarta.persistence.*;
import java.io.Serializable;
import java.util.List;
import lombok.Data;

@Data
@Entity
@Table(name = "usuarios")
public class Usuario implements Serializable {

    private static final long serialVersionUID = 1L;

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "id_users")
    private Long idUsers;

    private String nombre;
    private String email;
    private String contraseña; // Campo contraseña en minúsculas

    public Usuario() {
    }

    public Usuario(String nombre, String email, String contraseña) {
        this.nombre = nombre;
        this.email = email;
        this.contraseña = contraseña;
    }
}
