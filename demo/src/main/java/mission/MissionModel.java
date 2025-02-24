package mission;

//here is the model of the mission and it will describe what kind mission is this and the level of difficult.

import Ninja.NinjaModel;
import jakarta.persistence.*;
import lombok.*;

import java.util.List;

// lombok is a anotation which save the time and we do not need to create constructors because it does it automaticly
@AllArgsConstructor// it will be all constructors
@NoArgsConstructor // empty constructor
@Data// get and setters
@Entity //
@Table (name ="tb_missions")
public class MissionModel {




    @Id
    @GeneratedValue(strategy = GenerationType.IDENTITY)


    private Long id;

    private String nome;

    private String dificuldade;

    // one mission can have many ninjas
    @OneToMany
    private List<NinjaModel> ninjas;


}
