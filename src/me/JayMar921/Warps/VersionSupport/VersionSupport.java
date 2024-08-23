package me.JayMar921.Warps.VersionSupport;

import java.util.HashMap;
import java.util.Map;

public class VersionSupport {

    private final Map<String, Boolean> supportedVersions = new HashMap<>();

    public VersionSupport(String version) {
        update(version);
    }

    private void update(String version) {
        // Add support for versions 1.17.x to 1.21.x
        for (int i = 17; i <= 21; i++) {
            supportedVersions.put("1." + i, version.contains("1." + i));
        }
    }

    public boolean isSupported(String version) {
        return supportedVersions.getOrDefault(version, false);
    }

    public boolean support_1_17() {
        return supportedVersions.get("1.17");
    }

    public boolean support_1_18() {
        return supportedVersions.get("1.18");
    }

    public boolean support_1_19() {
        return supportedVersions.get("1.19");
    }

    public boolean support_1_20() {
        return supportedVersions.get("1.20");
    }

    public boolean support_1_21() {
        return supportedVersions.get("1.21");
    }
}
