package view;

import model.Move;
import model.UserException;

public interface GameView {

    Move inputMove();

    void reportError(UserException e);
}
