package org.mishanin.server;

import lombok.Builder;
import lombok.Getter;

@Getter
@Builder
public class NettyConfiguration {

    public static final NettyConfiguration DEFAULT_CONFIGURATION = NettyConfiguration.builder().build();

    @Builder.Default
    private final int port = 8080;
}
