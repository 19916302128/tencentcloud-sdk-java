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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeResourceScheduleDiffDetailRequest extends AbstractModel {

    /**
    * emr集群的英文id
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询的变更明细对应的调度器，可选值为fair、capacity。如果不传或者传空会使用最新的调度器
    */
    @SerializedName("Scheduler")
    @Expose
    private String Scheduler;

    /**
     * Get emr集群的英文id 
     * @return InstanceId emr集群的英文id
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set emr集群的英文id
     * @param InstanceId emr集群的英文id
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 查询的变更明细对应的调度器，可选值为fair、capacity。如果不传或者传空会使用最新的调度器 
     * @return Scheduler 查询的变更明细对应的调度器，可选值为fair、capacity。如果不传或者传空会使用最新的调度器
     */
    public String getScheduler() {
        return this.Scheduler;
    }

    /**
     * Set 查询的变更明细对应的调度器，可选值为fair、capacity。如果不传或者传空会使用最新的调度器
     * @param Scheduler 查询的变更明细对应的调度器，可选值为fair、capacity。如果不传或者传空会使用最新的调度器
     */
    public void setScheduler(String Scheduler) {
        this.Scheduler = Scheduler;
    }

    public DescribeResourceScheduleDiffDetailRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeResourceScheduleDiffDetailRequest(DescribeResourceScheduleDiffDetailRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Scheduler != null) {
            this.Scheduler = new String(source.Scheduler);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Scheduler", this.Scheduler);

    }
}

