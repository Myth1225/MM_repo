package com.learn.appIntegrations.repository;

import com.learn.appIntegrations.entity.ApplicationIntegrationsEntity;
import org.springframework.data.repository.CrudRepository;

public interface ApplicationsIntegrationRepository  extends CrudRepository<ApplicationIntegrationsEntity, String> {
}
