package com.thinkconstructive.restdemo.service;

import com.thinkconstructive.restdemo.model.CloudVendor;

import java.util.List;
import java.util.Map;

public interface CloudVendorService {
    public String createCloudVendor(CloudVendor cloudVendor);
    public String updateCloudVendor(CloudVendor cloudVendor);
    public String deleteCloudVendor(String cloudVendorId);
    public CloudVendor getCloudVendor(String cloudVendorId);
    public List<CloudVendor> getAllCloudVendors();
    public List<CloudVendor> getByVendorName(String vendorName);


}
