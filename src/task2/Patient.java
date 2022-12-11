package task2;

public final class Patient {
    private TreatmentPlan treatmentPlan;

    public Patient(TreatmentPlan treatmentPlan) {
        this.treatmentPlan = treatmentPlan;
    }

    public Doctor getDoctor() {
        if (treatmentPlan.getCode() == 1) {
            return new Dentist();
        } else if (treatmentPlan.getCode() == 2) {
            return new Surgeon();
        } else if (treatmentPlan.getCode() == 3) {
            return new Therapist();

        }
        return new Doctor();
    }
}
