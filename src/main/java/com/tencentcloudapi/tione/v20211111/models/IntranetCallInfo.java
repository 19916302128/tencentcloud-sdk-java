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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class IntranetCallInfo extends AbstractModel{

    /**
    * 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IngressPrivateLinkInfo")
    @Expose
    private IngressPrivateLinkInfo IngressPrivateLinkInfo;

    /**
    * 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ServiceEIPInfo")
    @Expose
    private ServiceEIPInfo [] ServiceEIPInfo;

    /**
     * Get 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IngressPrivateLinkInfo 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public IngressPrivateLinkInfo getIngressPrivateLinkInfo() {
        return this.IngressPrivateLinkInfo;
    }

    /**
     * Set 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param IngressPrivateLinkInfo 私有连接通道信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIngressPrivateLinkInfo(IngressPrivateLinkInfo IngressPrivateLinkInfo) {
        this.IngressPrivateLinkInfo = IngressPrivateLinkInfo;
    }

    /**
     * Get 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ServiceEIPInfo 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ServiceEIPInfo [] getServiceEIPInfo() {
        return this.ServiceEIPInfo;
    }

    /**
     * Set 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param ServiceEIPInfo 共享弹性网卡信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setServiceEIPInfo(ServiceEIPInfo [] ServiceEIPInfo) {
        this.ServiceEIPInfo = ServiceEIPInfo;
    }

    public IntranetCallInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public IntranetCallInfo(IntranetCallInfo source) {
        if (source.IngressPrivateLinkInfo != null) {
            this.IngressPrivateLinkInfo = new IngressPrivateLinkInfo(source.IngressPrivateLinkInfo);
        }
        if (source.ServiceEIPInfo != null) {
            this.ServiceEIPInfo = new ServiceEIPInfo[source.ServiceEIPInfo.length];
            for (int i = 0; i < source.ServiceEIPInfo.length; i++) {
                this.ServiceEIPInfo[i] = new ServiceEIPInfo(source.ServiceEIPInfo[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "IngressPrivateLinkInfo.", this.IngressPrivateLinkInfo);
        this.setParamArrayObj(map, prefix + "ServiceEIPInfo.", this.ServiceEIPInfo);

    }
}

