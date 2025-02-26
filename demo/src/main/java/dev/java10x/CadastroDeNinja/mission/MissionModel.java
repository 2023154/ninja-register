package dev.java10x.CadastroDeNinja.mission;
//
//import ninja.NinjaModel;
//import com.fasterxml.jackson.annotation.JsonIgnore;
//import jakarta.persistence.*;
//import lombok.*;
//
//import java.util.List;
//
//@Entity
//@Table(name = "tb_missions")
//@AllArgsConstructor
//@NoArgsConstructor
//@Data
//public class MissionModel {
//
//    @Id
//    @GeneratedValue(strategy = GenerationType.IDENTITY)
//    private Long id;
//
//    @Column(name = "mission_name") // ✅ Specify column names
//    private String nome;
//
//    @Column(name = "difficulty_level")
//    private String dificuldade;
//
//    // One mission can have many ninjas
//    @OneToMany(mappedBy = "mission", cascade = CascadeType.ALL)
//    @JsonIgnore
//    private List<NinjaModel> ninjas;
//}

import com.fasterxml.jackson.annotation.JsonIgnore;
import dev.java10x.CadastroDeNinja.ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

import java.util.List;

@Entity
@Table (name = "tb_missoes")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString
public class MissionModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    private Long id;

    private String nome;

    private String dificuldade;

    //@OneToMany - Uma missao pode ter varios ninjas
    @OneToMany(mappedBy = "missoes")
    @JsonIgnore
    private List<NinjaModel> ninjas;

}
