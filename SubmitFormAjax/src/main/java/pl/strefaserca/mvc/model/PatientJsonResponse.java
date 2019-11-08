package pl.strefaserca.mvc.model;

import java.util.Map;

public class PatientJsonResponse {

    private Patient patient;
    private boolean validated;
    private Map<String, String> errorMessages;

    public Patient getPatient() {
        return patient;
    }

    public void setPatient(Patient patient) {
        this.patient = patient;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

    public Map<String, String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(Map<String, String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    @Override
    public String toString() {
        return "PatientJsonResponse{" +
                "patient=" + patient +
                ", validated=" + validated +
                ", errorMessages=" + errorMessages +
                '}';
    }
}
