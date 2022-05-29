package com.magic.cardsInventory.repositories;

import com.magic.cardsInventory.models.PlayerModel;
import org.springframework.data.repository.CrudRepository;
import org.springframework.stereotype.Repository;

@Repository
public interface PlayerRepository extends CrudRepository<PlayerModel, Long> {
    Boolean findByEmail(String email);
}
