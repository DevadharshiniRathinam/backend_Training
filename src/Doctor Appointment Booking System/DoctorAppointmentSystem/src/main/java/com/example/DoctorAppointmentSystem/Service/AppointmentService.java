package com.example.DoctorAppointmentSystem.Service;

import com.example.DoctorAppointmentSystem.Model.Appointment;
import com.example.DoctorAppointmentSystem.Repository.AppointmentRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.data.repository.query.Param;
import org.springframework.stereotype.Service;
import org.springframework.web.bind.annotation.RequestParam;

import java.sql.Date;
import java.sql.Time;
import java.util.List;
import java.util.Optional;

@Service
public class AppointmentService {
    @Autowired
    private   AppointmentRepository appointmentRepository;
    public List<Appointment> getAllAppointment() {
        return appointmentRepository.findAll();
    }


    public void saveAppointment(Appointment appointment) {
        appointmentRepository.save(appointment);
    }

    public Appointment getAppointmentbyID(int id) {
        return appointmentRepository.findById(id).orElse(null);
    }

    public String updateAppointment(Appointment appointment, int id) {
        Optional<Appointment> existingAppointment = appointmentRepository.findById(id);

        if (existingAppointment.isPresent()) {
            appointment.setAppointId(id);
            appointmentRepository.save(appointment);
            return "Updated successfully";
        } else {
            return "There is no such ID";
        }
    }

    public String deleteAppointment(int id) {
        Optional<Appointment> existingAppointment = appointmentRepository.findById(id);

        if (existingAppointment.isPresent()) {
            appointmentRepository.deleteById(id);
            return "The appointment was canceled successfully";
        } else {
            return "There is no such ID";
        }
    }
    public String checkDoctorAvailability(String doctorName, Date appointmentDate, Time appointmentTime) {
        boolean value = appointmentRepository.findByDoctorNameAndAppointmentDateAndAppointmentTime(doctorName, appointmentDate, appointmentTime).isPresent();
        return value ? "Doctor is not available" : "Doctor is available";
    }


}
