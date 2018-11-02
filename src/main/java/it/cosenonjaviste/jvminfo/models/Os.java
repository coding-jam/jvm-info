package it.cosenonjaviste.jvminfo.models;

import java.lang.management.ManagementFactory;
import java.lang.management.OperatingSystemMXBean;

public class Os {

    private String architecture;

    private String name;

    private String version;

    public Os() {
        OperatingSystemMXBean operatingSystemMXBean = ManagementFactory.getOperatingSystemMXBean();
        architecture = operatingSystemMXBean.getArch();
        name = operatingSystemMXBean.getName();
        version = operatingSystemMXBean.getVersion();
    }

    public String getArchitecture() {
        return architecture;
    }

    public String getName() {
        return name;
    }

    public String getVersion() {
        return version;
    }

}
