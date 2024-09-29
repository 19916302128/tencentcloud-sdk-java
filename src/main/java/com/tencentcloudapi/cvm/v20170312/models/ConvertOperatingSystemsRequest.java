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
package com.tencentcloudapi.cvm.v20170312.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ConvertOperatingSystemsRequest extends AbstractModel {

    /**
    * 执行操作系统转换的实例 ID
    */
    @SerializedName("InstanceIds")
    @Expose
    private String [] InstanceIds;

    /**
    * 是否最小规模转换
    */
    @SerializedName("MinimalConversion")
    @Expose
    private Boolean MinimalConversion;

    /**
    * 是否只预检
    */
    @SerializedName("DryRun")
    @Expose
    private Boolean DryRun;

    /**
    * 转换的目标操作系统类型。仅支持 TencentOS。
    */
    @SerializedName("TargetOSType")
    @Expose
    private String TargetOSType;

    /**
     * Get 执行操作系统转换的实例 ID 
     * @return InstanceIds 执行操作系统转换的实例 ID
     */
    public String [] getInstanceIds() {
        return this.InstanceIds;
    }

    /**
     * Set 执行操作系统转换的实例 ID
     * @param InstanceIds 执行操作系统转换的实例 ID
     */
    public void setInstanceIds(String [] InstanceIds) {
        this.InstanceIds = InstanceIds;
    }

    /**
     * Get 是否最小规模转换 
     * @return MinimalConversion 是否最小规模转换
     */
    public Boolean getMinimalConversion() {
        return this.MinimalConversion;
    }

    /**
     * Set 是否最小规模转换
     * @param MinimalConversion 是否最小规模转换
     */
    public void setMinimalConversion(Boolean MinimalConversion) {
        this.MinimalConversion = MinimalConversion;
    }

    /**
     * Get 是否只预检 
     * @return DryRun 是否只预检
     */
    public Boolean getDryRun() {
        return this.DryRun;
    }

    /**
     * Set 是否只预检
     * @param DryRun 是否只预检
     */
    public void setDryRun(Boolean DryRun) {
        this.DryRun = DryRun;
    }

    /**
     * Get 转换的目标操作系统类型。仅支持 TencentOS。 
     * @return TargetOSType 转换的目标操作系统类型。仅支持 TencentOS。
     */
    public String getTargetOSType() {
        return this.TargetOSType;
    }

    /**
     * Set 转换的目标操作系统类型。仅支持 TencentOS。
     * @param TargetOSType 转换的目标操作系统类型。仅支持 TencentOS。
     */
    public void setTargetOSType(String TargetOSType) {
        this.TargetOSType = TargetOSType;
    }

    public ConvertOperatingSystemsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ConvertOperatingSystemsRequest(ConvertOperatingSystemsRequest source) {
        if (source.InstanceIds != null) {
            this.InstanceIds = new String[source.InstanceIds.length];
            for (int i = 0; i < source.InstanceIds.length; i++) {
                this.InstanceIds[i] = new String(source.InstanceIds[i]);
            }
        }
        if (source.MinimalConversion != null) {
            this.MinimalConversion = new Boolean(source.MinimalConversion);
        }
        if (source.DryRun != null) {
            this.DryRun = new Boolean(source.DryRun);
        }
        if (source.TargetOSType != null) {
            this.TargetOSType = new String(source.TargetOSType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "InstanceIds.", this.InstanceIds);
        this.setParamSimple(map, prefix + "MinimalConversion", this.MinimalConversion);
        this.setParamSimple(map, prefix + "DryRun", this.DryRun);
        this.setParamSimple(map, prefix + "TargetOSType", this.TargetOSType);

    }
}

