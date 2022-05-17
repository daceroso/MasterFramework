package com.company.config;

import com.company.config.converters.StringToBrowserTypeConverter;
import com.company.enums.BrowserType;
import org.aeonbits.owner.Config;


@Config.LoadPolicy(Config.LoadType.MERGE)
@Config.Sources({
        "system:properties",
        "system:env",
        "file:${user.dir}/src/test/resources/config.properties",

})
public interface FrameworkConfig extends Config {

    @DefaultValue("CHROME")
    @ConverterClass(StringToBrowserTypeConverter.class)
    BrowserType browser();
}
