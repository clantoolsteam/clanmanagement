package no.myhreims.clans.clanmanagement.domain;

/**
 * Created by spam on 1/22/2017.
 */
public class ValueWrapper<T> {
    private T values;

    public T getValues() {
        return values;
    }

    public void setValues(T values) {
        this.values = values;
    }
}
