/*
 * Copyright (c) 2017-2018 THL A29 Limited, a Tencent company. All Rights Reserved.
 *
 * Licensed under the Apache License, Version 2.0 (the "License");
 * you may not use this file except in compliance with the License.
 * You may obtain a copy of the License at
 *
 *    http://www.apache.org/licenses/LICENSE-2.0
 *
 * Unless required by applicable law or agreed to in writing, software
 * distributed under the License is distributed on an "AS IS" BASIS,
 * WITHOUT WARRANTIES OR CONDITIONS OF ANY KIND, either express or implied.
 * See the License for the specific language governing permissions and
 * limitations under the License.
 */
package com.tencentcloudapi.redis.v20180412.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class EnableReplicaReadonlyRequest extends AbstractModel {

    /**
    * 实例序号ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 账号路由策略：填写master或者replication，表示路由主节点，从节点；不填路由策略默认为写主节点，读从节点
    */
    @SerializedName("ReadonlyPolicy")
    @Expose
    private String [] ReadonlyPolicy;

    /**
     * Get 实例序号ID 
     * @return InstanceId 实例序号ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例序号ID
     * @param InstanceId 实例序号ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 账号路由策略：填写master或者replication，表示路由主节点，从节点；不填路由策略默认为写主节点，读从节点 
     * @return ReadonlyPolicy 账号路由策略：填写master或者replication，表示路由主节点，从节点；不填路由策略默认为写主节点，读从节点
     */
    public String [] getReadonlyPolicy() {
        return this.ReadonlyPolicy;
    }

    /**
     * Set 账号路由策略：填写master或者replication，表示路由主节点，从节点；不填路由策略默认为写主节点，读从节点
     * @param ReadonlyPolicy 账号路由策略：填写master或者replication，表示路由主节点，从节点；不填路由策略默认为写主节点，读从节点
     */
    public void setReadonlyPolicy(String [] ReadonlyPolicy) {
        this.ReadonlyPolicy = ReadonlyPolicy;
    }

    public EnableReplicaReadonlyRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public EnableReplicaReadonlyRequest(EnableReplicaReadonlyRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.ReadonlyPolicy != null) {
            this.ReadonlyPolicy = new String[source.ReadonlyPolicy.length];
            for (int i = 0; i < source.ReadonlyPolicy.length; i++) {
                this.ReadonlyPolicy[i] = new String(source.ReadonlyPolicy[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamArraySimple(map, prefix + "ReadonlyPolicy.", this.ReadonlyPolicy);

    }
}

