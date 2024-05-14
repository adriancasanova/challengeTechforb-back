/*
 * Click nbfs://nbhost/SystemFileSystem/Templates/Licenses/license-default.txt to change this license
 * Click nbfs://nbhost/SystemFileSystem/Templates/Classes/Class.java to edit this template
 */
package techForb.challenge.Model;
import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import javax.persistence.Table;
import javax.validation.constraints.Email;
import javax.validation.constraints.NotBlank;
import javax.validation.constraints.NotEmpty;
import javax.validation.constraints.NotNull;
import javax.validation.constraints.Size;
import lombok.EqualsAndHashCode;
import lombok.Getter;
import lombok.Setter;
import lombok.ToString;


@Entity
@Table(name = "usuarios")
@ToString @EqualsAndHashCode
public class Users  {     
    @Id
    @GeneratedValue(strategy=GenerationType.IDENTITY)
    @Getter @Setter @Column(name = "id")
    private Long id;

    @NotNull
    @NotBlank( message = "El campo es requerido.")
    @Email(message = "El mail es invalido."/*, flags = { Flag.CASE_INSENSITIVE }*/)
    @NotEmpty(message = "El email no puede estar vacio.")
    @Size(min = 5, max = 30, message = "El email debe tener entre 5 y 20 caracteres.")
    @Getter @Setter @Column(name = "email")
    private String email;

    @NotNull
    @NotEmpty(message = "La contraseña no puede estar vacio.")
   // @Size(min = 8, max = 20, message = "La contraseña debe tener entre 5 y 20 caracteres.")
    @Getter @Setter @Column(name = "password")
    private String password;
    
    
    @NotNull
    @NotBlank(message = "El nombre campo es requerido.")
     @Getter @Setter @Column(name = "nombre")
    private String nombre; 

     
    
    @NotNull
    @NotBlank(message = "El apellido campo es requerido.")
    @Getter @Setter @Column(name = "apellido")
    private String apellido;
      
    
    @NotNull
    @NotBlank(message = "El dni campo es requerido.")
    @Getter @Setter @Column(name = "dni")
    private String dni;
    

}
