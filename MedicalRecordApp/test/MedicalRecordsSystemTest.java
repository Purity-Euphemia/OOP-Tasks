import DSA.Appointment;
import DSA.Doctor;
import DSA.MedicalRecordsSystem;
import DSA.Patient;
import org.junit.jupiter.api.BeforeEach;
import org.junit.jupiter.api.Test;

import java.util.List;

import static org.junit.jupiter.api.Assertions.assertEquals;
import static org.junit.jupiter.api.Assertions.assertTrue;

public class MedicalRecordsSystemTest {
        private MedicalRecordsSystem medicalRecordsSystem;

        @BeforeEach
        public void setUp() {
            medicalRecordsSystem = new MedicalRecordsSystem();
        }

        @Test
        public void testAddPatient() {
            Patient patient = new Patient("P01", "Janet", "1992-10-01", "08012345678", "toothache");
            medicalRecordsSystem.addPatient(patient);
            assertTrue(medicalRecordsSystem.getPatients().contains(patient));
        }

       @Test
       public void testAddDoctor() {
           Doctor doctor = new Doctor("D01", "Dr.Tunde", "dentist", "09012345678", "Morning");
           medicalRecordsSystem.addDoctor(doctor);
           assertTrue(medicalRecordsSystem.getDoctors().contains(doctor));
       }

       @Test
       public void testScheduleAppointment() throws Exception{
            Patient patient = new Patient("P02", "Bob", "1988-02-02", "07030123456", "Diabetes");
            Doctor doctor = new Doctor("D02", "Dr Jane", "Diabetes", "08014567893", "Morning");
            medicalRecordsSystem.addPatient(patient);
            medicalRecordsSystem.addDoctor(doctor);

            String datetime = "2025-03-20 10:00";

            Appointment appointment = medicalRecordsSystem.scheduleAutoAppointment("A02", "P02", datetime, "Morning");
            assertTrue(medicalRecordsSystem.getAppointments().contains(appointment));
        }

        @Test
        public void testSearchPatient() {
            Patient patient = new Patient("P03", "Charlie", "1993-03-03", "08099998888", "");
            medicalRecordsSystem.addPatient(patient);

            List<Patient> result = medicalRecordsSystem.searchPatient("Charlie");

            assertEquals(1, result.size());
            assertEquals("Charlie", result.get(0).getName());
        }

        @Test
        public void testSearchDoctor() {
            Doctor doctor = new Doctor("D03", "Dr.Chris", "ENT", "08088887777", "Morning");
            medicalRecordsSystem.addDoctor(doctor);

            List<Doctor> result = medicalRecordsSystem.searchDoctor("Dr.Chris");

            assertEquals(1, result.size());
            assertEquals("Dr.Chris", result.get(0).getName());
        }

        @Test
        public void testAppointmentReport() throws Exception {
            Patient patient = new Patient("P04", "Daisy", "1995-04-04", "08066667777", "Surgeon");
            Doctor doctor = new Doctor("D04", "Dr.Felix", "Surgeon", "07055556666", "Morning");

            medicalRecordsSystem.addPatient(patient);
            medicalRecordsSystem.addDoctor(doctor);

            String datetime = "2025-09-01 12:00";

            medicalRecordsSystem.scheduleAutoAppointment("A02", "P04", datetime, "Morning");

            List<Appointment> report = medicalRecordsSystem.getAppointmentsReport();

            assertEquals(1, report.size());
            assertEquals("Surgeon", report.get(0).getPurpose());
        }
   }


