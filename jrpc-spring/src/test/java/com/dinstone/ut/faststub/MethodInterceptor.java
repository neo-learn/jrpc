/*
 * Copyright (C) 2014~2016 dinstone<dinstone@163.com>
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
package com.dinstone.ut.faststub;

import java.lang.reflect.Method;

/**
 * Method interceptor to intercept method calls.
 * 
 * @author dinstone
 * 
 */
public interface MethodInterceptor {

    /**
     * Intercept the target method call, add some custom actions.
     * 
     * @param invocation
     * @param method
     * @param args
     * @return
     * @throws Throwable
     */
    public Object invoke(MethodInvocation invocation, Method method, Object[] args) throws Throwable;

}
