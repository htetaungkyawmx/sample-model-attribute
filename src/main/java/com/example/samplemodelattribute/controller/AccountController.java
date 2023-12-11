package com.example.samplemodelattribute.controller;


import com.example.samplemodelattribute.domain.Account;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RequestMapping;

import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;

@Controller
@RequestMapping("/account")
public class AccountController {
    private Map<Long, Account> accounts=new ConcurrentHashMap<>();

@GetMapping
public String getCreateForm(Model model){
        model.addAttribute("account",new Account());
        return "account/createForm";
    }

}
