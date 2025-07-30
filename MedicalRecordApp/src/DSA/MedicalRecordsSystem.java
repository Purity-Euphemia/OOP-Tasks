package DSA;

import java.util.ArrayList;

public class MedicalRecordsSystem {
    private ArrayList<Patient> patients;
    private ArrayList<Doctor> doctors;
    private ArrayList<Appointment> appointments;

    public MedicalRecordsSystem() {
        this.patients = new ArrayList<>();
        this.doctors = new ArrayList<>();
        this.appointments = new ArrayList<>();
    }

    public void addPatient(Patient patient) {
        patients.add(patient);
    }


    public void addDoctor(Doctor doctor) {
        doctors.add(doctor);
    }

    public Doctor findDoctorForAilment(String ailment, String shift) {
        ailment = ailment.toLowerCase();
        shift = shift.toLowerCase();
        for (Doctor doctor : doctors) {
            if (doctor.getSpecialization().toLowerCase().equals(ailment) &&
                    doctor.getShift().toLowerCase().equals(shift)) {
                return doctor;
            }
        }
        return null;
    }

    public boolean isDoctorAvailable(Doctor doctor, String datetime) {
        for (Appointment appointment : appointments) {
            if (appointment.getDoctor().equals(doctor) &&
                    appointment.getDatetime().equals(datetime)) {
                return false;
            }
        }
        return true;
    }

    public Appointment scheduleAutoAppointment(String appointmentId, String patientId, String datetime, String shift) throws Exception {
        Patient patient = null;
        for (Patient patient1 : patients) {
            if (patient1.getPatientId().equals(patientId)) {
                patient = patient1;
                break;
            }
        }
        if (patient == null) {
            throw new Exception("Patient not found");
        }

        Doctor doctor = findDoctorForAilment(patient.getAilment(), shift);
        if (doctor != null && isDoctorAvailable(doctor, datetime)) {
            Appointment appointment = new Appointment(appointmentId, patient, doctor, datetime, patient.getAilment());
            appointments.add(appointment);
            return appointment;
        }

        throw new Exception("No appointment available");
    }


    public ArrayList<Patient> getPatients() {
        return patients;
    }

    public ArrayList<Doctor> getDoctors() {
        return doctors;
    }

    public ArrayList<Appointment> getAppointments() {
        return appointments;
    }
    public ArrayList<Appointment> getAppointmentsReport() {
        return new ArrayList<>(appointments);
    }

    public ArrayList<Patient> searchPatient(String nameOrId) {
        nameOrId = nameOrId.toLowerCase();
        ArrayList<Patient> result = new ArrayList<>();
        for (Patient patient : patients) {
            if (patient.getName().toLowerCase().contains(nameOrId) || patient.getPatientId().toLowerCase().equals(nameOrId)) {
                result.add(patient);
            }
        }
        return result;
    }


    public ArrayList<Doctor> searchDoctor(String nameOrId) {
        nameOrId = nameOrId.toLowerCase();
        ArrayList<Doctor> result = new ArrayList<>();
        for (Doctor doctor : doctors) {
            if (doctor.getName().toLowerCase().contains(nameOrId) || doctor.getDoctorId().toLowerCase().equals(nameOrId)) {
                result.add(doctor);
            }
        }
        return result;
    }
}
