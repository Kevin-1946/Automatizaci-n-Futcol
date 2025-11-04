package co.com.AutoFacebook.models;

public class CredencialesInicioSesionSaucedemo {
    private String username;
    private String password;
    private String firstname;
    private String lastname;
    private String postalcode;

    public String getPassword() {
        return password;
    }

    public void setPassword(String password) {
        this.password = password;
    }

    public String getUsername() {
        return username;
    }

    public void setUsername(String username) {
        this.username = username;
    }

    public String getFirstName() {
        return firstname;
    }

    public void setFirstName(String firstName) {
        this.firstname = firstName;
    }

    public String getLastName() {
        return lastname;
    }

    public void setLastName(String lastName) {
        this.lastname = lastName;
    }

    public String getPostalCode() {
        return postalcode;
    }

    public void setPostalCode(String postalCode) {
        this.postalcode = postalCode;
    }

    public CredencialesInicioSesionSaucedemo(String username, String password, String firstName, String lastName, String postalCode) {
        this.username = username;
        this.password = password;
        this.firstname = firstName;
        this.lastname = lastName;
        this.postalcode = postalCode;
    }
}
