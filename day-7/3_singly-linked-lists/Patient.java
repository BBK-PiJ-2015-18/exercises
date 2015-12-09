public class Patient {
    private String name;
    private int age;
    private String illness;
    private Patient nextPatient;

    public Patient(String name, int age, String illness) {
        this.name = name;
        this.age = age;
        this.illness = illness;
        this.nextPatient = null;
    }

    public void addPatient(Patient newPatient) {
        if(this.nextPatient == null) {
            this.nextPatient = newPatient;
        } else {
            this.nextPatient.addPatient(newPatient);
        }
    }

    public boolean deletePatient(Patient patient) {
        if(this.nextPatient == null) {
            return false;
        } else if(this.nextPatient.name.equals(patient.name)) {
            this.nextPatient = nextPatient.nextPatient;
            return true;
        } else {
            return this.nextPatient.deletePatient(patient);
        }
    }

    @Override public String toString() {
        return "Patient name: " + this.name + " age: " + this.age + " illness: " + this.illness;
    }

    public void printPatientList() {
        this.printPatientList(this);
    }

    public void printPatientList(Patient patient) {
        System.out.println(patient.toString());
        if(patient.nextPatient != null) {
            this.printPatientList(patient.nextPatient);
        }
    }
}
