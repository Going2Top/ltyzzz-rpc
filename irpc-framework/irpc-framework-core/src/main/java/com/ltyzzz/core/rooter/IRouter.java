package com.ltyzzz.core.rooter;

import com.ltyzzz.core.common.ChannelFutureWrapper;
import com.ltyzzz.core.registry.URL;

public interface IRouter {

    void refreshRouteArr(Selector selector);

    ChannelFutureWrapper select(Selector selector);

    void updateWeight(URL url);
}
