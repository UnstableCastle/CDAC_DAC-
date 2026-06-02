package com.app.controller;

import java.util.List;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.ModelAttribute;
import org.springframework.web.bind.annotation.PostMapping;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RequestParam;

import com.app.entity.Library;
import com.app.service.LibraryService;

@Controller
@RequestMapping("/library")
public class LibraryController {

	@Autowired
	private LibraryService libraryService;

	@GetMapping("/list")
	public String listLibrary(Model theModel) {
		List<Library> thelibrary = libraryService.getLibrary();
		theModel.addAttribute("thelibrary", thelibrary);
		return "list-library";
	}
	
	@GetMapping("/list1")
	public String listLibrary1(Model theModel) {
		List<Library> thelibrary = libraryService.getLibrary();
		theModel.addAttribute("thelibrary", thelibrary);
		return "list-library1";
	}

	@GetMapping("/showForm")
	public String showFormForAdd(Model theModel) {
		Library thelibrary = new Library();
		theModel.addAttribute("thelibrary", thelibrary); 
	
		return "library-form";
	}

	@PostMapping("/saveLibrary")
	public String saveLibrary(@ModelAttribute("thelibrary") Library theLibrary) {
		libraryService.saveLibrary(theLibrary);
		return "redirect:/library/list";
	}

	@GetMapping("/showFormForUpdate")
	public String showFormForUpdate(@RequestParam("libraryId") int theId, Model model) {
		Library theLibrary = libraryService.getLibrary(theId);
		model.addAttribute("thelibrary", theLibrary);
		return "library-form";
	}
	
	@GetMapping("/delete")
	public String deleteLibrary(@RequestParam("libraryId") int theId) {
		libraryService.deleteLibrary(theId);
		return "redirect:/library/list";
	}
	
}