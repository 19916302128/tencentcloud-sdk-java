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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DataSearchBug extends AbstractModel{

    /**
    * 返回查询状态
    */
    @SerializedName("StateCode")
    @Expose
    private String StateCode;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataBug")
    @Expose
    private BugInfoDetail [] DataBug;

    /**
    * 无
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataAsset")
    @Expose
    private AssetInfoDetail [] DataAsset;

    /**
    * true支持扫描。false不支持扫描
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VSSScan")
    @Expose
    private Boolean VSSScan;

    /**
    * 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPScan")
    @Expose
    private String CWPScan;

    /**
    * 1支持虚拟补丁，0或空不支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CFWPatch")
    @Expose
    private String CFWPatch;

    /**
    * 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("WafPatch")
    @Expose
    private Long WafPatch;

    /**
    * 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CWPFix")
    @Expose
    private Long CWPFix;

    /**
     * Get 返回查询状态 
     * @return StateCode 返回查询状态
     */
    public String getStateCode() {
        return this.StateCode;
    }

    /**
     * Set 返回查询状态
     * @param StateCode 返回查询状态
     */
    public void setStateCode(String StateCode) {
        this.StateCode = StateCode;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataBug 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public BugInfoDetail [] getDataBug() {
        return this.DataBug;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataBug 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataBug(BugInfoDetail [] DataBug) {
        this.DataBug = DataBug;
    }

    /**
     * Get 无
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataAsset 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public AssetInfoDetail [] getDataAsset() {
        return this.DataAsset;
    }

    /**
     * Set 无
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataAsset 无
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataAsset(AssetInfoDetail [] DataAsset) {
        this.DataAsset = DataAsset;
    }

    /**
     * Get true支持扫描。false不支持扫描
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VSSScan true支持扫描。false不支持扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getVSSScan() {
        return this.VSSScan;
    }

    /**
     * Set true支持扫描。false不支持扫描
注意：此字段可能返回 null，表示取不到有效值。
     * @param VSSScan true支持扫描。false不支持扫描
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVSSScan(Boolean VSSScan) {
        this.VSSScan = VSSScan;
    }

    /**
     * Get 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPScan 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCWPScan() {
        return this.CWPScan;
    }

    /**
     * Set 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPScan 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPScan(String CWPScan) {
        this.CWPScan = CWPScan;
    }

    /**
     * Get 1支持虚拟补丁，0或空不支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CFWPatch 1支持虚拟补丁，0或空不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCFWPatch() {
        return this.CFWPatch;
    }

    /**
     * Set 1支持虚拟补丁，0或空不支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param CFWPatch 1支持虚拟补丁，0或空不支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCFWPatch(String CFWPatch) {
        this.CFWPatch = CFWPatch;
    }

    /**
     * Get 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return WafPatch 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWafPatch() {
        return this.WafPatch;
    }

    /**
     * Set 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param WafPatch 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWafPatch(Long WafPatch) {
        this.WafPatch = WafPatch;
    }

    /**
     * Get 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CWPFix 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCWPFix() {
        return this.CWPFix;
    }

    /**
     * Set 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     * @param CWPFix 0不支持，1支持
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCWPFix(Long CWPFix) {
        this.CWPFix = CWPFix;
    }

    public DataSearchBug() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DataSearchBug(DataSearchBug source) {
        if (source.StateCode != null) {
            this.StateCode = new String(source.StateCode);
        }
        if (source.DataBug != null) {
            this.DataBug = new BugInfoDetail[source.DataBug.length];
            for (int i = 0; i < source.DataBug.length; i++) {
                this.DataBug[i] = new BugInfoDetail(source.DataBug[i]);
            }
        }
        if (source.DataAsset != null) {
            this.DataAsset = new AssetInfoDetail[source.DataAsset.length];
            for (int i = 0; i < source.DataAsset.length; i++) {
                this.DataAsset[i] = new AssetInfoDetail(source.DataAsset[i]);
            }
        }
        if (source.VSSScan != null) {
            this.VSSScan = new Boolean(source.VSSScan);
        }
        if (source.CWPScan != null) {
            this.CWPScan = new String(source.CWPScan);
        }
        if (source.CFWPatch != null) {
            this.CFWPatch = new String(source.CFWPatch);
        }
        if (source.WafPatch != null) {
            this.WafPatch = new Long(source.WafPatch);
        }
        if (source.CWPFix != null) {
            this.CWPFix = new Long(source.CWPFix);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StateCode", this.StateCode);
        this.setParamArrayObj(map, prefix + "DataBug.", this.DataBug);
        this.setParamArrayObj(map, prefix + "DataAsset.", this.DataAsset);
        this.setParamSimple(map, prefix + "VSSScan", this.VSSScan);
        this.setParamSimple(map, prefix + "CWPScan", this.CWPScan);
        this.setParamSimple(map, prefix + "CFWPatch", this.CFWPatch);
        this.setParamSimple(map, prefix + "WafPatch", this.WafPatch);
        this.setParamSimple(map, prefix + "CWPFix", this.CWPFix);

    }
}

