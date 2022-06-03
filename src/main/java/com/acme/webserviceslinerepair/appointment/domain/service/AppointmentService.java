package com.acme.webserviceslinerepair.appointment.domain.service;

import com.acme.webserviceslinerepair.appointment.domain.model.entity.Appointment;
import org.springframework.data.domain.Page;
import org.springframework.data.domain.Pageable;
import org.springframework.http.ResponseEntity;

import java.util.List;

public interface AppointmentService {
    List<Appointment> getAll();
    Appointment getById(Long appointmentId);
    Appointment create(Appointment appointment, Long clientId, Long applianceModelId);
    Appointment update(Long appointmentId, Appointment appointment);
    ResponseEntity<?> delete(Long appointmentId);
    List<Appointment> getByClientId(Long clientId);
    Page<Appointment> getAllByClientId(Long clientId,Pageable pageable);

}
