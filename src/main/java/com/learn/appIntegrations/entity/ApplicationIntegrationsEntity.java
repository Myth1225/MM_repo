package com.learn.appIntegrations.entity;


import javax.persistence.Column;
import javax.persistence.Entity;
import javax.persistence.Id;

@Entity
public class ApplicationIntegrationsEntity {
    @Id
    @Column(name ="APP_Name",nullable = false)
    private String name;

   @Column (name="APP_ID")
    private long id;

   @Column(length=2000) 
   private String integratedApps;

    //constructor
    public ApplicationIntegrationsEntity(){

    }
    public ApplicationIntegrationsEntity(String name, String integratedApps){
        this.name=name;
        this.integratedApps=integratedApps;
    }

    public String getName() {
        return name;
    }



    public void setName(String name) {
        this.name = name;
    }

    public long getId() {
        return id;
    }

    public void setId(long id) {
        this.id = id;
    }

    public String getIntegratedApps() {
        return integratedApps;
    }

    public void setIntegratedApps(String integratedApps) {
        this.integratedApps = integratedApps;
    }

    @Override
     public String toString() {
        return "Application{" +
             "id=" + id +
             "Name=" + name + '\'' +
             "Integrated Apps =" + integratedApps + '\'' +
             '}';
     }
 }