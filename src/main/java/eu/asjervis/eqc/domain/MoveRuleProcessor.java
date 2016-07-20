package eu.asjervis.eqc.domain;

import eu.asjervis.eqc.domain.enumeration.MoveState;

public interface MoveRuleProcessor
{
    boolean process(MoveState moveState);
}
