package com.javapract.javaapi.service;

import com.javapract.javaapi.model.CloudVendor;
import com.javapract.javaapi.repository.CloudVendorRepository;
import org.springframework.stereotype.Service;

import java.util.List;
@Service
public class CloudVendorServiceImpl implements CloudVendorService{


    CloudVendorRepository cloudVendorRepository;

    public CloudVendorServiceImpl(CloudVendorRepository cloudVendorRepository) {
        this.cloudVendorRepository = cloudVendorRepository;
    }

    @Override
    public String CreateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String UpdateCloudVendor(CloudVendor cloudVendor) {
        cloudVendorRepository.save(cloudVendor);
        return "success";
    }

    @Override
    public String DeleteCloudVendor(String vendorID) {
        cloudVendorRepository.deleteById(vendorID);
        return "success";
    }

    @Override
    public CloudVendor getCloudVendor(String vendorID) {
        return cloudVendorRepository.findById(vendorID).get();
    }

    @Override
    public List<CloudVendor> getCloudVendorAll() {
        return cloudVendorRepository.findAll();
    }
}
