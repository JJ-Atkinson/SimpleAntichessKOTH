package com.ppcgse.koth.antichess.player

import com.ppcgse.koth.antichess.controller.PieceUpgradeType;

import com.ppcgse.koth.antichess.controller.Board;
import com.ppcgse.koth.antichess.controller.Player;
import com.ppcgse.koth.antichess.controller.Move
import com.ppcgse.koth.antichess.controller.ReadOnlyBoard
import groovy.transform.ToString;

public class SimplePlayer extends Player {

    {pieceUpgradeType = PieceUpgradeType.ROOK}

    @Override
    public Move getMove(ReadOnlyBoard board, Player enemy, Set<Move> moves) {
        return new ArrayList<Move>(moves).get(0);
    }

}
