package com.javaedge.design.pattern.javaee.servicelocator;

/**
 * 缓存
 *
 * @author JavaEdge
 * @date 2020/8/15
 */

import com.google.common.collect.Lists;

import java.util.List;

public class Cache {

    private List<Service> services;

    public Cache() {
        services = Lists.newArrayList();
    }

    public Service getService(String serviceName) {
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(serviceName)) {
                System.out.println("Returning cached  " + serviceName + " object");
                return service;
            }
        }
        return null;
    }

    public void addService(Service newService) {
        boolean exists = false;
        for (Service service : services) {
            if (service.getName().equalsIgnoreCase(newService.getName())) {
                exists = true;
            }
        }
        if (!exists) {
            services.add(newService);
        }
    }
}
