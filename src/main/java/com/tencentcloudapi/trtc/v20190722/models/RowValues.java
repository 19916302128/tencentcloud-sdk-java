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
package com.tencentcloudapi.trtc.v20190722.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class RowValues extends AbstractModel{

    /**
    * 数据值
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RowValue")
    @Expose
    private Long [] RowValue;

    /**
     * Get 数据值
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RowValue 数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long [] getRowValue() {
        return this.RowValue;
    }

    /**
     * Set 数据值
注意：此字段可能返回 null，表示取不到有效值。
     * @param RowValue 数据值
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRowValue(Long [] RowValue) {
        this.RowValue = RowValue;
    }

    public RowValues() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public RowValues(RowValues source) {
        if (source.RowValue != null) {
            this.RowValue = new Long[source.RowValue.length];
            for (int i = 0; i < source.RowValue.length; i++) {
                this.RowValue[i] = new Long(source.RowValue[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "RowValue.", this.RowValue);

    }
}

