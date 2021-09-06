/*
package org.launchcode.Songs4Soldiers.models;

public class RegisteredAccount {
    private String username;
    private String password;
    private String pwHash;

    private static final BCryptPasswordEncoder encoder = new BCryptPasswordEncoder();

    public RegisteredAccount() {}

    public RegisteredAccount(String username, String password) {
        this.username = username;
        this.pwHash = encoder.encode(password);
    }

    public String getUsername() {
        return username;
    }

    public String getPwHash() {
        return pwHash;
    }

    public boolean isMatchingPassword(String password, String pwHash) {
        return encoder.matches(password, pwHash);
    }

    @Override
    public boolean equals(Object o) {
        if (this == o) return true;
        if (o == null || getClass() != o.getClass()) return false;
        RegisteredAccount account = (RegisteredAccount) o;
        return getUsername().equals(account.getUsername()) && pwHash.equals(account.pwHash);
    }

    @Override
    public int hashCode() {
        return Objects.hash(getUsername(), pwHash);
    }
}
*/
