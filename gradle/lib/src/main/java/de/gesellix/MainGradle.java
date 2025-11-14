package de.gesellix;

import de.gesellix.docker.client.DockerClient;
import de.gesellix.docker.client.DockerClientImpl;
import de.gesellix.docker.client.EngineResponseContent;
import de.gesellix.docker.remote.api.SystemInfo;
import de.gesellix.docker.remote.api.SystemVersion;

public class MainGradle {

    public static void main(String[] args) {
        System.out.println("Hello world!");
        DockerClient client = new DockerClientImpl();
        EngineResponseContent<SystemVersion> version = client.version();
        System.out.println("version: " + version.getContent().getVersion());
        EngineResponseContent<SystemInfo> info = client.info();
        System.out.println("info: " + info.getContent().toString());
    }
}
