package com.example.game.services.api.service;

import com.example.game.services.api.commons.entities.GameModel;

public interface GameService {
    GameModel createGame(GameModel gameRequest);
}
