package com.swp391.teamfour.forbadsystem.service;

import org.springframework.stereotype.Service;

public interface EmailService {
    void sendPasswordResetMail(String to, String full_name, String token);
}
