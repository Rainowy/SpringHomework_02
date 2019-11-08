package pl.strefaserca.mvc.model;

import org.hibernate.validator.constraints.NotEmpty;

public class Patient {

    @NotEmpty(message = "Wprowadź imię")
    private String firstName;

    @NotEmpty(message = "Wprowadź nazwisko")
    private String lastName;

    @NotEmpty(message = "Wprowadź email")
    private String email;

    @NotEmpty(message = "Wprowadź rodzaj wizyty")
    private String visitType;

    public String getFirstName() {
        return firstName;
    }

    public void setFirstName(String firstName) {
        this.firstName = firstName;
    }

    public String getLastName() {
        return lastName;
    }

    public void setLastName(String lastName) {
        this.lastName = lastName;
    }

    public String getEmail() {
        return email;
    }

    public void setEmail(String email) {
        this.email = email;
    }

    public String getVisitType() {
        return visitType;
    }

    public void setVisitType(String visitType) {
        this.visitType = visitType;
    }
}
