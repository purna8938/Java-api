package com.javapract.javaapi.controller;

import com.javapract.javaapi.model.CloudVendor;
import com.javapract.javaapi.service.CloudVendorService;
import org.springframework.web.bind.annotation.*;

import java.util.List;

@RestController
@RequestMapping("/api/service")
public class CloudVendorController {

    CloudVendorService cloudVendorService;

    public CloudVendorController(CloudVendorService cloudVendorService) {
        this.cloudVendorService = cloudVendorService;
    }

    @GetMapping("/{vendorID}")
    public CloudVendor getCloudVendor(@PathVariable("vendorID") String vendorID){
                return cloudVendorService.getCloudVendor(vendorID);
    }

    @GetMapping
    public List<CloudVendor> getCloudVendorAll(){
        return cloudVendorService.getCloudVendorAll();
    }

    @PostMapping
    public String createCloudVendor(@RequestBody CloudVendor cloudVendor) {
        cloudVendorService.CreateCloudVendor(cloudVendor);
        return "succesfully created";
    }

    @PutMapping
    public String updateCloudVendor(@RequestBody CloudVendor cloudVendor){
        cloudVendorService.UpdateCloudVendor(cloudVendor);
        return "sucuessfully update";
    }

    @DeleteMapping("{vendorID}")
    public String deleteCloudVendor(@PathVariable("vendorID")String vendorID){
       cloudVendorService.DeleteCloudVendor(vendorID);
       return "Deleted Successfully";
    }


}
