package drivers;

import org.aeonbits.owner.Config;

@Config.Sources({"classpath:${env}.properties"})
public interface MobileDriverConfig extends Config {
    @Key("browserstack.user")
    String getUser();

    @Key("browserstack.key")
    String getKey();

    @Key("app")
    String getApp();

    @Key("device")
    String getDevice();

    @Key("baseurl")
    String getBaseUrl();

    @Key("version")
    String getVersion();

    @Key("project")
    String getProject();

    @Key("build")
    String getBuild();

    @Key("name")
    String getName();
}
