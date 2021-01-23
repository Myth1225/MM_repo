package com.learn.appIntegrations.controller;

import com.learn.appIntegrations.entity.ApplicationIntegrationsEntity;
import com.learn.appIntegrations.service.ApplicationIntegrationsService;
import com.learn.appIntegrations.exception.ApplicationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.http.HttpStatus;
import org.springframework.http.ResponseEntity;
import org.springframework.web.bind.annotation.GetMapping;
import org.springframework.web.bind.annotation.PathVariable;
import org.springframework.web.bind.annotation.RequestMapping;
import org.springframework.web.bind.annotation.RestController;
import org.springframework.web.server.ResponseStatusException;

import java.util.List;

@RestController
@RequestMapping("AppInt")
public class ApplicationIntegrationsController {
    //@Autowired
    private ApplicationIntegrationsService applicationIntegrationsService;

   @Autowired
    public void setApplicationIntegrationsService(ApplicationIntegrationsService applicationIntegrationsService){
        this.applicationIntegrationsService=applicationIntegrationsService;
    }

    @GetMapping( "/applications")
    public ResponseEntity <List<ApplicationIntegrationsEntity>> getAllApplications() {
        List<ApplicationIntegrationsEntity> list=applicationIntegrationsService.listApplications();
        return new ResponseEntity<List<ApplicationIntegrationsEntity>> (list,HttpStatus.OK);
    }

    @GetMapping("/application/{name}")
    public ResponseEntity <ApplicationIntegrationsEntity> getApplication(@PathVariable("mame")String name){
    try{
        return new ResponseEntity<ApplicationIntegrationsEntity>(applicationIntegrationsService.findApplication(name),HttpStatus.OK);

    }
        catch (ApplicationNotFoundException exception){
            throw new ResponseStatusException( HttpStatus.NOT_FOUND, " Application not found");

        }
    }
}
