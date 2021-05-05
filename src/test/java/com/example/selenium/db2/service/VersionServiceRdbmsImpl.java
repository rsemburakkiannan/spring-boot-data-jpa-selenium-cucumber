package com.example.selenium.db2.service;

import com.example.selenium.db2.model.ApiVersion;
import com.example.selenium.db2.repository.VersionRdbmsRepository;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Service;

@Service
public class VersionServiceRdbmsImpl implements VersionServiceRdbms {

    @Autowired
    private VersionRdbmsRepository versionRepository;

    @Override
    public ApiVersion getVersion() {
        //Return the first and only element in the list. Value can be changed from data.sql
        return versionRepository.findAll().get(0);
    }

    public ApiVersion saveVersion(String version) {
        ApiVersion apiVersion = new ApiVersion(1L, version);
        return versionRepository.save(apiVersion);
    }
}
