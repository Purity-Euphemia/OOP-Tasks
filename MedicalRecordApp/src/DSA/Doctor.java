package DSA;

public class Doctor {
        private String doctorId;
        private String name;
        private String specialization;
        private String contact;
        private String shift;

        public Doctor(String doctorId, String name, String specialization, String contact, String shift) {
            this.doctorId = doctorId;
            this.name = name;
            this.specialization = specialization.toLowerCase();
            this.contact = contact;
            this.shift = shift.toLowerCase();
        }

        public String getDoctorId() {
            return doctorId;
        }

        public String getName() {
            return name;
        }

        public String getSpecialization() {
            return specialization;
        }

        public String getContact() {
            return contact;
        }

        public String getShift() {
            return shift;
        }

        public String getDetails() {
            return String.format(
                    "Doctor ID: %s\nName: %s\nSpecialization: %s\nContact: %s\nShift: %s",
                    doctorId, name, specialization, contact, shift
            );
        }
    }


