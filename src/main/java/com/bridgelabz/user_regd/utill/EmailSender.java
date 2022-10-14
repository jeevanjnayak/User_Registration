package com.bridgelabz.user_regd.utill;

import com.bridgelabz.user_regd.dto.UserDTO;
import com.bridgelabz.user_regd.services.EmailSenderService;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class EmailSender {
//    @Autowired
//    private EmailSenderService emailSenderService;
//
//    @Autowired
//    IRegistrationService iRegistrationService;
//
//    @Autowired
//    IOrderServices iOrderServices;
//
//    @Autowired
//    IOrderRepository iOrderRepository;
//
////    @EventListener(ApplicationReadyEvent.class)
//    public void sendMail(UserDTO userDTO) {
//        emailSenderService.sendEmail("" + iRegistrationService.getEmail(orderDTO.getUserId()), "Order Successful", "your order was successful" + iOrderServices.showOrder().toString());
//    }
//
//    public void sendMail(int id) {
//        emailSenderService.sendEmail("" + iRegistrationService.getEmail(id), "Order Cancelled Successful", "your order Cancelled successful" + iOrderServices.showOrder().toString());
//    }
}
