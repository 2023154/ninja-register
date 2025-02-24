package Ninja;

import jakarta.persistence.*;
import mission.MissionModel;

//this transform a class to entity
@Entity//this is a anotation entity
@Table(name = "tb_Cadastro")// this is anotation table
public class NinjaModel {


    @Id// the id will be gerated altomaticly with the generate value
    @GeneratedValue(strategy = GenerationType.IDENTITY)//this is going to generate a id value number.

    @Column(name = "id_ninja")
    private Long id;

    @Column(name = "name")
    private String name;

    @Column(unique = true)
    private String email;

    @Column(name = "img_url")
    private String imgUrl;

    @Column(name = "age")
    private String age;


    //@ a ninja has only one mission
    @ManyToOne
    @JoinColumn(name = "missons_id")
    private MissionModel misson;
}