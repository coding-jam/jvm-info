package it.cosenonjaviste.jvminfo.models;

public class Memory {

    private String maxMemory;

    private String freeMemory;

    private String totalMemory;

    public Memory() {
        this.totalMemory = asMegabyte(Runtime.getRuntime().totalMemory());
        this.freeMemory = asMegabyte(Runtime.getRuntime().freeMemory());
        this.maxMemory = asMegabyte(Runtime.getRuntime().maxMemory());
    }

    public String getMaxMemory() {
        return maxMemory;
    }

    public String getFreeMemory() {
        return freeMemory;
    }

    public String getTotalMemory() {
        return totalMemory;
    }

    private String asMegabyte(long bytes) {
        return (bytes / 1024 / 1024) + "MB";
    }
}
