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
package com.tencentcloudapi.cdwdoris.v20211228.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CoolDownBackend extends AbstractModel {

    /**
    * 字段：Host
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Host")
    @Expose
    private String Host;

    /**
    * 字段：DataUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataUsedCapacity")
    @Expose
    private String DataUsedCapacity;

    /**
    * 字段：TotalCapacity
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TotalCapacity")
    @Expose
    private String TotalCapacity;

    /**
    * 字段：RemoteUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RemoteUsedCapacity")
    @Expose
    private String RemoteUsedCapacity;

    /**
     * Get 字段：Host
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Host 字段：Host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getHost() {
        return this.Host;
    }

    /**
     * Set 字段：Host
注意：此字段可能返回 null，表示取不到有效值。
     * @param Host 字段：Host
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHost(String Host) {
        this.Host = Host;
    }

    /**
     * Get 字段：DataUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataUsedCapacity 字段：DataUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDataUsedCapacity() {
        return this.DataUsedCapacity;
    }

    /**
     * Set 字段：DataUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataUsedCapacity 字段：DataUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataUsedCapacity(String DataUsedCapacity) {
        this.DataUsedCapacity = DataUsedCapacity;
    }

    /**
     * Get 字段：TotalCapacity
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TotalCapacity 字段：TotalCapacity
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTotalCapacity() {
        return this.TotalCapacity;
    }

    /**
     * Set 字段：TotalCapacity
注意：此字段可能返回 null，表示取不到有效值。
     * @param TotalCapacity 字段：TotalCapacity
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTotalCapacity(String TotalCapacity) {
        this.TotalCapacity = TotalCapacity;
    }

    /**
     * Get 字段：RemoteUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RemoteUsedCapacity 字段：RemoteUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRemoteUsedCapacity() {
        return this.RemoteUsedCapacity;
    }

    /**
     * Set 字段：RemoteUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
     * @param RemoteUsedCapacity 字段：RemoteUsedCapacity
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRemoteUsedCapacity(String RemoteUsedCapacity) {
        this.RemoteUsedCapacity = RemoteUsedCapacity;
    }

    public CoolDownBackend() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CoolDownBackend(CoolDownBackend source) {
        if (source.Host != null) {
            this.Host = new String(source.Host);
        }
        if (source.DataUsedCapacity != null) {
            this.DataUsedCapacity = new String(source.DataUsedCapacity);
        }
        if (source.TotalCapacity != null) {
            this.TotalCapacity = new String(source.TotalCapacity);
        }
        if (source.RemoteUsedCapacity != null) {
            this.RemoteUsedCapacity = new String(source.RemoteUsedCapacity);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Host", this.Host);
        this.setParamSimple(map, prefix + "DataUsedCapacity", this.DataUsedCapacity);
        this.setParamSimple(map, prefix + "TotalCapacity", this.TotalCapacity);
        this.setParamSimple(map, prefix + "RemoteUsedCapacity", this.RemoteUsedCapacity);

    }
}

