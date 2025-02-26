package dev.java10x.CadastroDeNinja.ninja;

import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;


@RestController
@RequestMapping


public class NinjaController {

    @GetMapping("/boasVindas")
    public String BoasVindas() {
        return "Boas Vindas";
    }

    @GetMapping("/createUser")
    public String CreateUser() {
        return "Create a user";
    }

    @GetMapping("/listUser")
    public String listUser() {
        return "List a user";
    }

    @GetMapping("/updateUser")
    public String updateUser() {
        return "Update a user";
    }

    @GetMapping("/delete")
    public String deleteUser() {
        return "Delete a user";
    }



}
