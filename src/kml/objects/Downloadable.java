package kml.objects;

import java.io.File;
import java.net.URL;

/**
 * @author DarkLBP
 *         website https://krothium.com
 */

public class Downloadable {
    private final long size;
    private final URL url;
    private final File relPath;
    private final String hash;
    private final String fakePath;

    public Downloadable(URL url, long size, File path, String hash, String fakePath) {
        this.url = url;
        this.size = size;
        this.relPath = path;
        this.hash = hash;
        this.fakePath = fakePath;
    }

    public long getSize() {
        return this.size;
    }

    public boolean hasURL() {
        return this.url != null;
    }

    public URL getURL() {
        return this.url;
    }

    public File getRelativePath() {
        return this.relPath;
    }

    public String getHash() {
        return this.hash;
    }

    public boolean hasHash() {
        return this.hash != null;
    }

    public boolean hasSize() {
        return (this.size != -1);
    }

    public boolean hasFakePath() {
        return this.fakePath != null;
    }

    public String getFakePath() {
        return this.fakePath;
    }
}
