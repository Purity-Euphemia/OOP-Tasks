package DSA;

public class Patient {
        private String patientId;
        private String name;
        private String dateOfBirth;
        private String contact;
        private String ailment;

        public Patient(String patientId, String name, String dateOfBirth, String contact, String ailment) {
            this.patientId = patientId;
            this.name = name;
            this.dateOfBirth = dateOfBirth;
            this.contact = contact;
            this.ailment = ailment;
        }

        public String getPatientId() {
            return patientId;
        }

        public String getName() {
            return name;
        }

        public String getDateOfBirth() {
            return dateOfBirth;
        }

        public String getContact() {
            return contact;
        }

        public String getAilment() {
            return ailment;
        }

        public String getPatientDetails() {
            return String.format(
                    "Patient ID: %s\nName: %s\nDate of Birth: %s\nContact: %s\nAilment: %s",
                    patientId, name, dateOfBirth, contact, ailment
            );
        }
    }


