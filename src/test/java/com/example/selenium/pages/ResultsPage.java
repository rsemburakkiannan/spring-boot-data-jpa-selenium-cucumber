package com.example.selenium.pages;

import com.example.selenium.db2.service.VersionServiceRdbms;
import com.example.selenium.helpers.VisibilityHelper;
import com.example.selenium.runners.Hook;
import org.openqa.selenium.By;
import org.slf4j.Logger;
import org.slf4j.LoggerFactory;
import org.springframework.beans.factory.annotation.Autowired;
import org.springframework.stereotype.Component;

@Component
public class ResultsPage implements BasePage {
    private static final Logger logger = LoggerFactory.getLogger(ResultsPage.class);
    private static final String LINKS_AREA_LOCATOR = "#links";

    @Autowired
    private VisibilityHelper visibilityHelper;
    @Autowired
    VersionServiceRdbms versionServiceRdbms;

    public void assertLinksArea(){
        versionServiceRdbms.saveVersion("Raghu-1.0");
        logger.info("Version information from DB:{}", versionServiceRdbms.getVersion().getVersion());
        visibilityHelper.waitForPresenceOf(By.cssSelector(LINKS_AREA_LOCATOR));
    }
}