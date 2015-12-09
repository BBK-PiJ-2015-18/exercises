public class HospitalManager {
    private Patient patientList = null;

    public static void main(String[] args) {
        HospitalManager hm = new HospitalManager();
        hm.launch();
    }

    public void launch() {
        Patient patient1 = new Patient("John", 33, "Tuberculosis");
        patientList = patient1;

        Patient patient2 = new Patient("William", 22, "Cancer");
        patientList.addPatient(patient2);

        Patient patient3 = new Patient("Bobby", 42, "Flu");
        patientList.addPatient(patient3);

        patientList.printPatientList();

        patientList.deletePatient(patient2);

        patientList.printPatientList();
    }
}
