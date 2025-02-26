package dev.java10x.CadastroDeNinja.ninja;

import dev.java10x.CadastroDeNinja.mission.MissionModel;
import jakarta.persistence.*;
import lombok.AllArgsConstructor;
import lombok.Data;
import lombok.NoArgsConstructor;
import lombok.ToString;

@Entity
@Table(name = "tb_cadastro")
@Data
@NoArgsConstructor
@AllArgsConstructor
@ToString(exclude = "missoes")
public class NinjaModel {

    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)
    @Column (name = "id")
    private long id;

    @Column (name = "nome")
    private String nome;

    @Column(unique = true)
    private String email;

    @Column (name = "img_url")
    private String imgUrl;

    @Column (name = "rank")
    private String rank;

    @Column (name = "idade")
    private int idade;

    @ManyToOne
    @JoinColumn(name = "missoes_id")
    private MissionModel missoes;

}
