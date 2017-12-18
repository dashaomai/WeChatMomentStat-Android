package moe.chionlab.wechatmomentstat.tasks;

import java.net.MalformedURLException;
import java.net.URL;

/**
 * Created by bob on 17/12/18.
 */

public class UploadParameter {
    public final URL url;
    public final String file;

    public UploadParameter(
            final String url,
            final String file
    ) throws MalformedURLException {
        this.url = new URL(url);
        this.file = file;
    }
}
