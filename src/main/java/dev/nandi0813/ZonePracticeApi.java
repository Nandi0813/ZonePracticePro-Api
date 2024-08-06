package dev.nandi0813;

public class ZonePracticeApi
{

    public static IApi getApi() {
        return IApi.instance.getInstance();
    }

}
