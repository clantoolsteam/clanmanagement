package no.myhreims.clans.clanmanagement.domain;

import java.util.Set;

/**
 * The top-level clan. This is the entity where the persons are members and that spans all the game-specific clans
 */
public class Clan {
    private String name;
    private Set<Person> members;
    private Set<GameClan> gameClans;

}
