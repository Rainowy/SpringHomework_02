package pl.strefaserca.mvc.CORE;

import java.util.Map;

public class EmployeeJsonRespone {
    private Employee employee;
    private boolean validated;
    private Map<String, String> errorMessages;

    public Employee getEmployee() {
        return employee;
    }

    public void setEmployee(Employee employee) {
        this.employee = employee;
    }

    public Map<String, String> getErrorMessages() {
        return errorMessages;
    }

    public void setErrorMessages(Map<String, String> errorMessages) {
        this.errorMessages = errorMessages;
    }

    public boolean isValidated() {
        return validated;
    }

    public void setValidated(boolean validated) {
        this.validated = validated;
    }

//   @Override
//   public String toString() {
//      return "EmployeeJsonRespone{" +
//              "employee=" + employee +
//              ", validated=" + validated +
//              ", errorMessages=" + errorMessages +
//              '}';
//   }
}
