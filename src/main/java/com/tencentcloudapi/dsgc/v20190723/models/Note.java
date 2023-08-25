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

public class Note extends AbstractModel{

    /**
    * 通用key，比如分类名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Key")
    @Expose
    private String Key;

    /**
    * 通用value，比如分类个数
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Value")
    @Expose
    private Long Value;

    /**
     * Get 通用key，比如分类名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Key 通用key，比如分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getKey() {
        return this.Key;
    }

    /**
     * Set 通用key，比如分类名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param Key 通用key，比如分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setKey(String Key) {
        this.Key = Key;
    }

    /**
     * Get 通用value，比如分类个数
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Value 通用value，比如分类个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getValue() {
        return this.Value;
    }

    /**
     * Set 通用value，比如分类个数
注意：此字段可能返回 null，表示取不到有效值。
     * @param Value 通用value，比如分类个数
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setValue(Long Value) {
        this.Value = Value;
    }

    public Note() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Note(Note source) {
        if (source.Key != null) {
            this.Key = new String(source.Key);
        }
        if (source.Value != null) {
            this.Value = new Long(source.Value);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Key", this.Key);
        this.setParamSimple(map, prefix + "Value", this.Value);

    }
}

