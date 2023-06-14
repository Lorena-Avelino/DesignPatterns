package io.github.lorena.mediator;

import io.github.lorena.mediator.Party;
import io.github.lorena.mediator.Action;
import java.util.ArrayList;
import java.util.List;

/**
 * Party implementation.
 */
public class PartyImpl implements Party {

  private final List<PartyMember> members;

  public PartyImpl() {
    members = new ArrayList<>();
  }

  @Override
  public void act(PartyMember actor, Action action) {
    for (var member : members) {
      if (!member.equals(actor)) {
        member.partyAction(action);
      }
    }
  }

  @Override
  public void addMember(PartyMember member) {
    members.add(member);
    member.joinedParty(this);
  }
}
