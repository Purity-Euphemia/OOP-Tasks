package DSA;

public class Appointment {
        private String appointmentId;
        private Patient patient;
        private Doctor doctor;
        private String datetime;
        private String purpose;

        public Appointment(String appointmentId, Patient patient, Doctor doctor, String datetime, String purpose) {
            this.appointmentId = appointmentId;
            this.patient = patient;
            this.doctor = doctor;
            this.datetime = datetime;
            this.purpose = purpose;
        }

        public String getAppointmentId() {
            return appointmentId;
        }

        public Patient getPatient() {
            return patient;
        }

        public Doctor getDoctor() {
            return doctor;
        }

        public String getDatetime() {
            return datetime;
        }

        public String getPurpose() {
            return purpose;
        }

        public String getDetails() {
            return String.format(
                    "Appointment ID: %s\nPatient: %s\nDoctor: %s\nDate and Time: %s\nPurpose: %s",
                    appointmentId,
                    patient.getName(),
                    doctor.getName(),
                    datetime,
                    purpose
            );
        }
    }


