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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryDataRules extends AbstractModel{

    /**
    * 操作符；只能取and, or的其中一种
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Operator")
    @Expose
    private String Operator;

    /**
    * 规则
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Contents")
    @Expose
    private DspaDiscoveryDataRule [] Contents;

    /**
     * Get 操作符；只能取and, or的其中一种
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Operator 操作符；只能取and, or的其中一种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作符；只能取and, or的其中一种
注意：此字段可能返回 null，表示取不到有效值。
     * @param Operator 操作符；只能取and, or的其中一种
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOperator(String Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 规则
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Contents 规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryDataRule [] getContents() {
        return this.Contents;
    }

    /**
     * Set 规则
注意：此字段可能返回 null，表示取不到有效值。
     * @param Contents 规则
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContents(DspaDiscoveryDataRule [] Contents) {
        this.Contents = Contents;
    }

    public DspaDiscoveryDataRules() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryDataRules(DspaDiscoveryDataRules source) {
        if (source.Operator != null) {
            this.Operator = new String(source.Operator);
        }
        if (source.Contents != null) {
            this.Contents = new DspaDiscoveryDataRule[source.Contents.length];
            for (int i = 0; i < source.Contents.length; i++) {
                this.Contents[i] = new DspaDiscoveryDataRule(source.Contents[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Operator", this.Operator);
        this.setParamArrayObj(map, prefix + "Contents.", this.Contents);

    }
}

