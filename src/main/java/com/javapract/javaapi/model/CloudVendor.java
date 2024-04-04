package com.javapract.javaapi.model;

import jakarta.persistence.*;
import lombok.Data;
import lombok.NoArgsConstructor;

@Data
@Entity
@Table(name="cloud_vendor_info")
@NoArgsConstructor
public class CloudVendor {
    @Id
    private String vendorID;
    private String vendorAddress;
    private String vendorName;
    private String vendorPhoneNumber;


    public CloudVendor(String vendorID, String vendorAddress, String vendorName, String vendorPhoneNumber) {
        this.vendorID = vendorID;
        this.vendorAddress = vendorAddress;
        this.vendorName = vendorName;
        this.vendorPhoneNumber = vendorPhoneNumber;
    }
}
