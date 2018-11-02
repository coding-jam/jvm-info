package it.cosenonjaviste.jvminfo.models;

public class JvmInfo {

    private int cores;

    private String version;

    private String name;

    private Os os;

    private Memory memory;

    private Properties inputArguments;

    public JvmInfo() {
        this.cores = Runtime.getRuntime().availableProcessors();
        this.version = System.getProperty("java.version");
        this.name = System.getProperty("java.vm.name");

        this.os = new Os();
        this.memory = new Memory();
        this.inputArguments = new Properties();
    }

    public int getCores() {
        return cores;
    }

    public String getVersion() {
        return version;
    }

    public String getName() {
        return name;
    }

    public Memory getMemory() {
        return memory;
    }

    public Properties getInputArguments() {
        return inputArguments;
    }

    public Os getOs() {
        return os;
    }
}
