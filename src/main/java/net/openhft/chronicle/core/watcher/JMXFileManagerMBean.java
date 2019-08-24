/*
 * Copyright (c) 2016-2019 Chronicle Software Ltd
 */

package net.openhft.chronicle.core.watcher;

public interface JMXFileManagerMBean {
    String getBasePath();

    String getRelativePath();
}
