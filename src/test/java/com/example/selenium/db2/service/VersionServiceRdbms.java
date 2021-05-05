package com.example.selenium.db2.service;


import com.example.selenium.db2.model.ApiVersion;

public interface VersionServiceRdbms {
    public ApiVersion getVersion();

    public ApiVersion saveVersion(String version);
}
