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
package com.tencentcloudapi.vpc.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyVpcPeeringConnectionRequest extends AbstractModel{

    /**
    * 对等连接ID。
    */
    @SerializedName("PeeringConnectionId")
    @Expose
    private String PeeringConnectionId;

    /**
    * 对等连接名称。
    */
    @SerializedName("PeeringConnectionName")
    @Expose
    private String PeeringConnectionName;

    /**
    * 带宽上限，单位Mbps。
    */
    @SerializedName("Bandwidth")
    @Expose
    private Long Bandwidth;

    /**
    * 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95 POSTPAID_BY_MONTH_95。
    */
    @SerializedName("ChargeType")
    @Expose
    private String ChargeType;

    /**
     * Get 对等连接ID。 
     * @return PeeringConnectionId 对等连接ID。
     */
    public String getPeeringConnectionId() {
        return this.PeeringConnectionId;
    }

    /**
     * Set 对等连接ID。
     * @param PeeringConnectionId 对等连接ID。
     */
    public void setPeeringConnectionId(String PeeringConnectionId) {
        this.PeeringConnectionId = PeeringConnectionId;
    }

    /**
     * Get 对等连接名称。 
     * @return PeeringConnectionName 对等连接名称。
     */
    public String getPeeringConnectionName() {
        return this.PeeringConnectionName;
    }

    /**
     * Set 对等连接名称。
     * @param PeeringConnectionName 对等连接名称。
     */
    public void setPeeringConnectionName(String PeeringConnectionName) {
        this.PeeringConnectionName = PeeringConnectionName;
    }

    /**
     * Get 带宽上限，单位Mbps。 
     * @return Bandwidth 带宽上限，单位Mbps。
     */
    public Long getBandwidth() {
        return this.Bandwidth;
    }

    /**
     * Set 带宽上限，单位Mbps。
     * @param Bandwidth 带宽上限，单位Mbps。
     */
    public void setBandwidth(Long Bandwidth) {
        this.Bandwidth = Bandwidth;
    }

    /**
     * Get 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95 POSTPAID_BY_MONTH_95。 
     * @return ChargeType 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95 POSTPAID_BY_MONTH_95。
     */
    public String getChargeType() {
        return this.ChargeType;
    }

    /**
     * Set 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95 POSTPAID_BY_MONTH_95。
     * @param ChargeType 计费模式，日峰值POSTPAID_BY_DAY_MAX，月95 POSTPAID_BY_MONTH_95。
     */
    public void setChargeType(String ChargeType) {
        this.ChargeType = ChargeType;
    }

    public ModifyVpcPeeringConnectionRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyVpcPeeringConnectionRequest(ModifyVpcPeeringConnectionRequest source) {
        if (source.PeeringConnectionId != null) {
            this.PeeringConnectionId = new String(source.PeeringConnectionId);
        }
        if (source.PeeringConnectionName != null) {
            this.PeeringConnectionName = new String(source.PeeringConnectionName);
        }
        if (source.Bandwidth != null) {
            this.Bandwidth = new Long(source.Bandwidth);
        }
        if (source.ChargeType != null) {
            this.ChargeType = new String(source.ChargeType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PeeringConnectionId", this.PeeringConnectionId);
        this.setParamSimple(map, prefix + "PeeringConnectionName", this.PeeringConnectionName);
        this.setParamSimple(map, prefix + "Bandwidth", this.Bandwidth);
        this.setParamSimple(map, prefix + "ChargeType", this.ChargeType);

    }
}

