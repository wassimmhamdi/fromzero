package tn.teams.fromzero.entity;
import lombok.*;
import net.bytebuddy.dynamic.loading.InjectionClassLoader;

import javax.persistence.*;


@Entity
@Getter
@Setter
@AllArgsConstructor
@NoArgsConstructor
@Builder
public class Employer {

    @Id
    @GeneratedValue (strategy = GenerationType.AUTO)
    private Long id ;

    @Column(name = "nom_prenom", nullable = false)
    private String fullName ;
    private Integer age ;

    @Column(unique = true)
    private String email ;
}
