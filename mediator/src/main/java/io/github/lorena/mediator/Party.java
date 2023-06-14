package io.github.lorena.mediator;

import io.github.lorena.mediator.Action;
import io.github.lorena.mediator.PartyMember;

/**
 * Party interface.
 */
public interface Party {

  void addMember(PartyMember member);

  void act(PartyMember actor, Action action);

}
