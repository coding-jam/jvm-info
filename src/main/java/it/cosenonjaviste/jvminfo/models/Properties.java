package it.cosenonjaviste.jvminfo.models;

import java.lang.management.ManagementFactory;
import java.lang.management.RuntimeMXBean;
import java.util.List;
import java.util.Map;

public class Properties {

    private List<String> arguments;

    private Map<String, String> systemProperties;

    private Map<String, String> environment;

    public Properties() {
        RuntimeMXBean runtimeMXBean = ManagementFactory.getRuntimeMXBean();
        arguments = runtimeMXBean.getInputArguments();
        systemProperties = runtimeMXBean.getSystemProperties();
        environment = System.getenv();
    }

    public List<String> getArguments() {
        return arguments;
    }

    public Map<String, String> getSystemProperties() {
        return systemProperties;
    }

    public Map<String, String> getEnvironment() {
        return environment;
    }
}
