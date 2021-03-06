/*
 * Copyright 2019 WeBank
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 *  you may not use this file except in compliance with the License.
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

package com.webank.wedatasphere.linkis.tispark.engine.configuration

import com.webank.wedatasphere.linkis.engine.execute.EngineHook
import com.webank.wedatasphere.linkis.engine.execute.hook._
import com.webank.wedatasphere.linkis.tispark.engine.hook.{TiSparkHook, UserDataBaseHook}
import org.springframework.context.annotation.{Bean, Configuration}

/**
  * Created by johnnwang on 2019/6/26.
  */
@Configuration
class TiSparkSpringConfiguration {
  @Bean(Array("engineHooks"))
  def createEngineHooks(): Array[EngineHook] = Array(new ReleaseEngineHook, new MaxExecuteNumEngineHook,
    new JarUdfEngineHook, new PyUdfEngineHook, new ScalaUdfEngineHook,
    new PyFunctionEngineHook, new ScalaFunctionEngineHook,new UserDataBaseHook,new TiSparkHook)

}
