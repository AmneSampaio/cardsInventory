package com.magic.cardsInventory.asssembler;

import com.magic.cardsInventory.models.PlayerModel;
import com.magic.cardsInventory.models.PlayerModelDTO;
import org.modelmapper.ModelMapper;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

import java.util.Optional;

@Component
public class PlayerAssembler {

    @Autowired
    private ModelMapper modelMapper;

    public PlayerModelDTO toModelDTO(Optional<PlayerModel> playerModel) {
        return modelMapper.map(playerModel, PlayerModelDTO.class);
    }



}
