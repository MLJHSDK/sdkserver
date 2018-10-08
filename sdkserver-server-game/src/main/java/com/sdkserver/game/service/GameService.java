package com.sdkserver.game.service;

import com.sdkserver.common.result.PageBean;
import com.sdkserver.game.model.Game;

import java.util.Map;

public interface GameService {

    Map<Integer, String> findAllGames();

    Game queryGame(Integer appID);

    void updateGame(Game m);

    Game saveGame(String name, String payCallback, String payCallbackDebug, String msdkPayCallback);

    void deleteGame(Integer id);

    PageBean<Game> findPageGames(Integer currentPage, Integer pageSize, String kind, String keyword);

    Integer queryAppIdByGameName(String gameName);
}
