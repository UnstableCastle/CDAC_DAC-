package com.app.controller;

import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.validation.BindingResult;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.RequestMapping;

import com.app.entity.Customer;

import jakarta.validation.Valid;

@Controller
@RequestMapping("/customer")
public class CustomerController {

	@RequestMapping("/showForm")
	public String customerForm(Model theModel) {

		Customer customer = new Customer();

		theModel.addAttribute("theCustomer", customer);

		return "customer-form";
	}

	@RequestMapping("/process")
	public String processForm(@Valid @ModelAttribute("theCustomer") Customer customer, BindingResult theBindingResult) {
		System.out.println(customer);
		if (theBindingResult.hasErrors()) {
			return "customer-form";
		} else
			return "customer-confirmation";

	}

}
