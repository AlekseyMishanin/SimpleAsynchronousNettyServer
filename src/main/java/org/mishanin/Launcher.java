package org.mishanin;

import org.mishanin.server.NettyServer;

import static org.mishanin.server.NettyConfiguration.DEFAULT_CONFIGURATION;

public class Launcher {

    public static void main(String[] args) throws Exception {
        new NettyServer().run();
    }
}
