package com.learn.appIntegrations.service;
import com.learn.appIntegrations.entity.ApplicationIntegrationsEntity;
import java.util.List;

public interface ApplicationIntegrationsService {
            List<ApplicationIntegrationsEntity>  listApplications();
            ApplicationIntegrationsEntity findApplication(String Name);

}
