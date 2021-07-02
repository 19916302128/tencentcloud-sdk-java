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
package com.tencentcloudapi.mrs.v20200910.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Finding extends AbstractModel{

    /**
    * 原文文本内容
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 肿瘤结节列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TuberList")
    @Expose
    private Tuber [] TuberList;

    /**
     * Get 原文文本内容
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Text 原文文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set 原文文本内容
注意：此字段可能返回 null，表示取不到有效值。
     * @param Text 原文文本内容
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 肿瘤结节列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TuberList 肿瘤结节列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tuber [] getTuberList() {
        return this.TuberList;
    }

    /**
     * Set 肿瘤结节列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param TuberList 肿瘤结节列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTuberList(Tuber [] TuberList) {
        this.TuberList = TuberList;
    }

    public Finding() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Finding(Finding source) {
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.TuberList != null) {
            this.TuberList = new Tuber[source.TuberList.length];
            for (int i = 0; i < source.TuberList.length; i++) {
                this.TuberList[i] = new Tuber(source.TuberList[i]);
            }
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamArrayObj(map, prefix + "TuberList.", this.TuberList);

    }
}

