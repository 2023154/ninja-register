package dev.java10x.CadastroDeNinja.ninja;

import org.springframework.web.bind.annotation.*;


@RestController
@RequestMapping


public class NinjaController {

    @GetMapping("/boasVindas")
    public String BoasVindas() {
        return "Boas Vindas";
    }

    @PostMapping("/createUser")
    public String CreateUser() {
        return "Create a user";
    }

    @GetMapping("/listUser")
    public String listUser() {
        return "List a user";
    }

    @PutMapping("/updateUser")
    public String updateUser() {
        return "Update a user";
    }

    @DeleteMapping("/delete")
    public String deleteUser() {
        return "Delete a user";
    }



}
