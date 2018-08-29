package com.thoughtmechanix.organization.services;

import com.thoughtmechanix.organization.model.Organization;
import com.thoughtmechanix.organization.repository.OrganizationRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.beans.factory.annotation.Value;
import org.springframework.stereotype.Service;

import java.util.UUID;

@Service
public class OrganizationService {
  //  @Autowired
  //  private OrganizationRepository orgRepository;

   @Value("${email.id}")
    private String emailId="dummy@gmail.com";

    public Organization getOrg(String organizationId) {

        //return orgRepository.findById(organizationId);
        Organization org = new Organization();
        org.setId("1");
        org.setName("Org1");
        org.setContactName("ContactName1");
        org.setContactEmail(emailId);

        return org;
    }

    public void saveOrg(Organization org){
        org.setId( UUID.randomUUID().toString());

       // orgRepository.save(org);

    }

    public void updateOrg(Organization org){
      //  orgRepository.save(org);
    }

    public void deleteOrg(Organization org){

        //orgRepository.delete( org.getId());
    }
}
