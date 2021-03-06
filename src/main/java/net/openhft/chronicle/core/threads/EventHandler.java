/*
 * Copyright 2016 higherfrequencytrading.com
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *     http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */

package net.openhft.chronicle.core.threads;

import org.jetbrains.annotations.NotNull;

/*
 * Created by peter.lawrey on 22/01/15.
 */
@FunctionalInterface
public interface EventHandler extends VanillaEventHandler {
    default void eventLoop(EventLoop eventLoop) {
    }

    /**
     * Notify handler that the eventLoop's loop has terminated and the handler's action method
     * will not be called again. This is called before the eventLoop calls close.
     */
    default void loopFinished() {
    }

    @NotNull
    default HandlerPriority priority() {
        return HandlerPriority.MEDIUM;
    }
}

