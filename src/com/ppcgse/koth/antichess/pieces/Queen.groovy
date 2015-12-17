package com.ppcgse.koth.antichess.pieces;

import com.ppcgse.koth.antichess.controller.Board;
import com.ppcgse.koth.antichess.controller.Color;
import com.ppcgse.koth.antichess.controller.Piece;
import com.ppcgse.koth.antichess.controller.PieceType;
import com.ppcgse.koth.antichess.controller.Location
import groovy.transform.AutoClone
import groovy.transform.AutoCloneStyle
import groovy.transform.EqualsAndHashCode
import groovy.transform.ToString
import groovy.transform.TupleConstructor;


@ToString
@EqualsAndHashCode
@TupleConstructor
@AutoClone(style = AutoCloneStyle.SIMPLE)
public class Queen extends Piece {

    public Queen(Color team, Location pos) {
        super(team, pos, PieceType.QUEEN);
    }

    @Override
    public Set<Location> getValidDestinationSet(Board board) {
        genValidDests(board, [-1..1, -1..1].combinations())
    }
}