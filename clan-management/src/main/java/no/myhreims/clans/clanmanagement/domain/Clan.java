package no.myhreims.clans.clanmanagement.domain;

import javax.persistence.Entity;
import javax.persistence.GeneratedValue;
import javax.persistence.GenerationType;
import javax.persistence.Id;
import java.util.Set;

/**
 * The top-level clan. This is the entity where the persons are members and that spans all the game-specific clans
 */
@Entity
public class Clan {

    @Id
    @GeneratedValue(strategy= GenerationType.AUTO)
    private Long id;

    private String name;
    private Set<Person> members;
    private Set<GameClan> gameClans;

    public Long getId() {
        return id;
    }

    public void setId(Long id) {
        this.id = id;
    }

    public String getName() {
        return name;
    }

    public void setName(String name) {
        this.name = name;
    }

    public Set<Person> getMembers() {
        return members;
    }

    public void setMembers(Set<Person> members) {
        this.members = members;
    }

    public Set<GameClan> getGameClans() {
        return gameClans;
    }

    public void setGameClans(Set<GameClan> gameClans) {
        this.gameClans = gameClans;
    }
}
