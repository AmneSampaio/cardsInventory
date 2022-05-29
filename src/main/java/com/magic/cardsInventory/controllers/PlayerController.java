package com.magic.cardsInventory.controllers;


import com.magic.cardsInventory.asssembler.PlayerAssembler;
import com.magic.cardsInventory.models.PlayerModel;
import com.magic.cardsInventory.models.PlayerModelDTO;
import com.magic.cardsInventory.repositories.PlayerRepository;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.*;

import java.util.Optional;

@RestController
@RequestMapping("/magic")
public class PlayerController {

    @Autowired
    private PlayerAssembler playerAssembler;

    @Autowired
    private PlayerRepository playerRepository;

    @PostMapping("/newPlayer")
    private ResponseEntity<PlayerModelDTO> createAPlayer(@RequestBody PlayerModel newPlayer)  {
       /* Boolean emailAlreadyHere = playerRepository.findByEmail(newPlayer.getEmail());
        if (emailAlreadyHere == true){
             throw new RuntimeException();
        }*/
        playerRepository.save(newPlayer);
        return ResponseEntity.ok(playerAssembler.toModelDTO(Optional.of(newPlayer)));
    }

    @GetMapping("/gimme-dat/{id}")
    private ResponseEntity<PlayerModelDTO> recoverAPlayer(@PathVariable Long id) {
        Optional<PlayerModel> playerIsHere = playerRepository.findById(id);
        return ResponseEntity.ok(playerAssembler.toModelDTO(playerIsHere));
    }
}
