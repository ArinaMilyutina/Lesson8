package task2;

public class WriterInfo {
    public static void main(String[] args) {
        TreatmentPlan tp1 = new TreatmentPlan(1);
        TreatmentPlan tp2 = new TreatmentPlan(2);
        TreatmentPlan tp3 = new TreatmentPlan(3);
        TreatmentPlan tp4 = new TreatmentPlan(10);
        Patient patient1 = new Patient(tp1);
        Doctor doctor1 = patient1.getDoctor();
        Patient patient2 = new Patient(tp2);
        Doctor doctor2 = patient2.getDoctor();
        Patient patient3 = new Patient(tp3);
        Doctor doctor3 = patient3.getDoctor();
        Patient patient4 = new Patient(tp4);
        Doctor doctor4 = patient4.getDoctor();
        doctor1.treat();
        doctor2.treat();
        doctor3.treat();
        doctor4.treat();


    }
}
