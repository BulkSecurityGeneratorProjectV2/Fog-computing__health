package org.ibase4j.core.support.fastdfs;

import java.io.Serializable;

public interface Config extends Serializable {
    String FILE_DEFAULT_WIDTH = "120";
    String FILE_DEFAULT_HEIGHT = "120";
    String FILE_DEFAULT_AUTHOR = "iBase4J";

    String PROTOCOL = "http://";
    String SEPARATOR = "/";

    String TRACKER_NGNIX_PORT = "8080";
}
