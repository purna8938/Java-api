package com.javapract.javaapi.service;

import com.javapract.javaapi.model.CloudVendor;

import java.util.List;

public interface CloudVendorService {

    public String CreateCloudVendor(CloudVendor cloudVendor);

    public String UpdateCloudVendor(CloudVendor cloudVendor);

    public String DeleteCloudVendor(String vendorID);

    public CloudVendor getCloudVendor(String vendorID);

    public List<CloudVendor> getCloudVendorAll();
}
