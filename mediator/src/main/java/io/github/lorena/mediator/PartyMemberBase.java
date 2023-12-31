package io.github.lorena.mediator;

import io.github.lorena.mediator.PartyMember;
import io.github.lorena.mediator.Party;
import io.github.lorena.mediator.Action;
import lombok.extern.slf4j.Slf4j;

/**
 * Abstract base class for party members.
 */
@Slf4j
public abstract class PartyMemberBase implements PartyMember {

  protected Party party;

  @Override
  public void joinedParty(Party party) {
    LOGGER.info("{} joins the party", this);
    this.party = party;
  }

  @Override
  public void partyAction(Action action) {
    LOGGER.info("{} {}", this, action.getDescription());
  }

  @Override
  public void act(Action action) {
    if (party != null) {
      LOGGER.info("{} {}", this, action);
      party.act(this, action);
    }
  }

  @Override
  public abstract String toString();

}
