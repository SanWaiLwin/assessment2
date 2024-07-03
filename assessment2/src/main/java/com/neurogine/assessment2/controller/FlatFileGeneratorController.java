/**
 * 
 */
package com.neurogine.assessment2.controller;

import java.io.IOException;

import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.RestController;

import com.neurogine.assessment2.service.FlatFileService;

@RestController
public class FlatFileGeneratorController {

    private final FlatFileService flatFileService;

    @Autowired
    public FlatFileGeneratorController(FlatFileService flatFileService) {
        this.flatFileService = flatFileService;
    }

    @GetMapping("/generateFlatFile")
    public String generateFlatFile() {
        try {
            String outputFile = flatFileService.generateFlatFile();
            return "Flat file generated successfully: " + outputFile;
        } catch (IOException e) {
            e.printStackTrace();
            return "Failed to generate flat file: " + e.getMessage();
        } 
    }
}
