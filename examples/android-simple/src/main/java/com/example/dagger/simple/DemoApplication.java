/*
 * Copyright (C) 2013 Square, Inc.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 * http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.example.dagger.simple;

import android.app.Application;
import android.os.Debug;
import dagger.ObjectGraph;
import java.util.Arrays;
import java.util.List;

public class DemoApplication extends Application {
  private ObjectGraph graph;

  private static final boolean DEBUG_TRACING = false;

  @Override public void onCreate() {
    super.onCreate();

    System.out.println("pre-graph");
    if (DEBUG_TRACING) Debug.startMethodTracing("graph");
    graph = ObjectGraph.create(getModules().toArray());
    if (DEBUG_TRACING) Debug.stopMethodTracing();
    System.out.println("post-graph");
  }

  protected List<Object> getModules() {
    return Arrays.asList(
        new AndroidModule(this),
        new DemoModule(),
        new DemoModule2()
    );
  }

  public void inject(Object object) {
    System.out.println("pre-inject: " + object.getClass().getSimpleName());
    if (DEBUG_TRACING) Debug.startMethodTracing("inject");
    graph.inject(object);
    if (DEBUG_TRACING) Debug.stopMethodTracing();
    System.out.println("post-inject: " + object.getClass().getSimpleName());
  }
}
