package ec.edu.espe.examen.examensahianabadiano.model;
import java.math.BigDecimal;
import java.util.Date;

import jakarta.persistence.GeneratedValue;
import jakarta.persistence.GenerationType;
import jakarta.persistence.Column;
import jakarta.persistence.Entity;
import jakarta.persistence.Id;
import jakarta.persistence.Table;
import lombok.Data;

@Entity
@Table(name = "SEG_USUARIO")
@Data
public class Usuario {
    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column(name = "COD_USUARIO", nullable = false)
    private Integer codUsuario;

    @Column(name = "MAIL", length = 128)
    private String mail;

    @Column(name = "CLAVE", length = 64)
    private String clave;

    @Column(name = "NOMBRE", length = 100)
    private String nombre;

    @Column(name = "INTENTOS_FALLIDOS")
    private Integer intentosFallidos;

    @Column(name = "SUELDO", precision = 8, scale = 2)
    private BigDecimal sueldo;

    @Column(name = "FECHA_NACIMIENTO")
    private Date fechaNacimiento;

    @Column(name = "VERSION")
    private Integer version;
    
}