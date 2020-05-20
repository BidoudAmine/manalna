package com.example.demo.classes;

import javax.persistence.Id;

import javax.persistence.MappedSuperclass;


@Entity
@Data
@AllArgsConstructor
@NoArgsConstructor
@ToString
@MappedSuperclass
public class Utilisateur {

    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    private String nom;
    private String prenom;
    @Id @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id ;
    @Column(unique = true)  //username unique ..
    private String username ;
    private String password ;
    private boolean actived ;
    @ManyToMany(fetch = FetchType.EAGER)
    private Collection<AppRole> roles = new ArrayList<>() ;
    

  
}
