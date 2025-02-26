package dev.java10x.CadastroDeNinja.mission;


import org.springframework.web.bind.annotation.*;

@RestController
@RequestMapping
public class missionController {


    @GetMapping("/boasVindas")
    public String BoasVindas() {
        return "Boas Vindas";
    }

    @PostMapping("/createMission")
    public String CreateMission() {
        return "Create a mission";
    }

    @GetMapping("/listMission")
    public String listMission() {
        return "List a mission";
    }

    @PutMapping("/updateMission")
    public String updateMission() {
        return "Update a mission";
    }

    @DeleteMapping("/deleteMission")
    public String deleteMission() {
        return "Delete a mission";
    }



}
