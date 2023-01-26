package com.chemax.project.controller;

import com.chemax.project.dto.SectionDTO;
import com.chemax.project.request.SectionRequest;
import com.chemax.project.service.SectionService;
import org.springframework.stereotype.Controller;
import org.springframework.ui.Model;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@Controller
public class SectionRequestController {
    private final SectionService service;

    public SectionRequestController(SectionService service) {
        this.service = service;
    }

    @GetMapping("/hello")
    public String showIndex() {
        return "index";
    }

    @GetMapping("/allsection")
    public String getAll (Model model) {
        List<SectionDTO> sectionDTOList = service.getAllSectionDTOs();
        model.addAttribute("sectiondtos", sectionDTOList);
        return "sectionlist";
    }

    @PostMapping("/addSection")
    public SectionDTO createSectionEntity(@RequestBody SectionRequest request) {
        return service.createSectionEntity(request);
    }

    @GetMapping("/section/{id}")
    public SectionDTO getSectionDTO(@PathVariable Integer id) {
        return service.getSectionDTO(id);
    }

    @GetMapping("/section/delete/{id}")
    public void deleteSectionEntity(@PathVariable Integer id) {
        service.deleteSectionEntity(id);
    }

    @PutMapping("/section/update/{id}")
    public SectionDTO updateSectionEntity(@RequestBody SectionRequest request, @PathVariable Integer id) {
        service.updateSectionEntity(request, id);
        return getSectionDTO(id);
    }

    @GetMapping("/section/showAll")
    public List<SectionDTO> getAllSectionDTOs() {
        return service.getAllSectionDTOs();
    }

    @GetMapping("/section/showAll/{count}")
    public List<SectionDTO> getSectionDTOsByCount(@PathVariable Integer count) {
        return service.getSectionDTOsByCount(count);
    }
}
