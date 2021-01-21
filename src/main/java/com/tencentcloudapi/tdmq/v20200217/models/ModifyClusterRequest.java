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
package com.tencentcloudapi.tdmq.v20200217.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyClusterRequest extends AbstractModel{

    /**
    * Pulsar 集群的ID，需要更新的集群Id。
    */
    @SerializedName("ClusterId")
    @Expose
    private String ClusterId;

    /**
    * 更新后的集群名称。
    */
    @SerializedName("ClusterName")
    @Expose
    private String ClusterName;

    /**
    * 说明信息。
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get Pulsar 集群的ID，需要更新的集群Id。 
     * @return ClusterId Pulsar 集群的ID，需要更新的集群Id。
     */
    public String getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set Pulsar 集群的ID，需要更新的集群Id。
     * @param ClusterId Pulsar 集群的ID，需要更新的集群Id。
     */
    public void setClusterId(String ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 更新后的集群名称。 
     * @return ClusterName 更新后的集群名称。
     */
    public String getClusterName() {
        return this.ClusterName;
    }

    /**
     * Set 更新后的集群名称。
     * @param ClusterName 更新后的集群名称。
     */
    public void setClusterName(String ClusterName) {
        this.ClusterName = ClusterName;
    }

    /**
     * Get 说明信息。 
     * @return Remark 说明信息。
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明信息。
     * @param Remark 说明信息。
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ClusterName", this.ClusterName);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

