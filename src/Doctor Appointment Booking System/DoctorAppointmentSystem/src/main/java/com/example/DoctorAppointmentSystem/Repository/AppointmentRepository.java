package com.example.DoctorAppointmentSystem.Repository;

import com.example.DoctorAppointmentSystem.Model.Appointment;
import org.springframework.data.jpa.repository.JpaRepository;

import java.sql.Date;
import java.sql.Time;
import java.util.Optional;

public interface AppointmentRepository extends JpaRepository<Appointment,Integer > {
    Optional<Appointment> findByDoctorNameAndAppointmentDateAndAppointmentTime(String doctorName, Date appointmentDate, Time appointmentTime);

}
