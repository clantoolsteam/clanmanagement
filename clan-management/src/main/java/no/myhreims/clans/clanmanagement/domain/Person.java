package no.myhreims.clans.clanmanagement.domain;

import java.util.Map;
import java.util.Set;

/**
 * A real-life person
 */
public class Person {
    private String username;
    private Email email;
    private FacebookUser facebookUser;

    private Set<Clan> clans;
}
