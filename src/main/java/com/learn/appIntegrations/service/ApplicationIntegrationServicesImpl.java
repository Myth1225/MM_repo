package com.learn.appIntegrations.service;

import com.learn.appIntegrations.repository.ApplicationsIntegrationRepository;
import com.learn.appIntegrations.entity.ApplicationIntegrationsEntity;
import com.learn.appIntegrations.exception.ApplicationNotFoundException;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

import java.util.List;
import java.util.Optional;

@Service
public class ApplicationIntegrationServicesImpl implements ApplicationIntegrationsService {

    @Autowired
    private ApplicationsIntegrationRepository applicationsIntegrationRepository;

   @Override
    public List<ApplicationIntegrationsEntity>listApplications(){
        return (List<ApplicationIntegrationsEntity>)applicationsIntegrationRepository.findAll();

    }

   @Override
    public ApplicationIntegrationsEntity findApplication(String name) {
        Optional<ApplicationIntegrationsEntity> optionalApplication=applicationsIntegrationRepository.findById(name);
        if (optionalApplication.isPresent())
            return optionalApplication.get();
        else
            throw new ApplicationNotFoundException(("Application not found"));
    }
}
