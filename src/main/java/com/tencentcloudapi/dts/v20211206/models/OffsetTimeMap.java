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
package com.tencentcloudapi.dts.v20211206.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class OffsetTimeMap extends AbstractModel {

    /**
    * kafka分区编号
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("PartitionNo")
    @Expose
    private Long PartitionNo;

    /**
    * kafka offset
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
     * Get kafka分区编号
注意：此字段可能返回 null，表示取不到有效值。 
     * @return PartitionNo kafka分区编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPartitionNo() {
        return this.PartitionNo;
    }

    /**
     * Set kafka分区编号
注意：此字段可能返回 null，表示取不到有效值。
     * @param PartitionNo kafka分区编号
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPartitionNo(Long PartitionNo) {
        this.PartitionNo = PartitionNo;
    }

    /**
     * Get kafka offset
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Offset kafka offset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set kafka offset
注意：此字段可能返回 null，表示取不到有效值。
     * @param Offset kafka offset
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    public OffsetTimeMap() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public OffsetTimeMap(OffsetTimeMap source) {
        if (source.PartitionNo != null) {
            this.PartitionNo = new Long(source.PartitionNo);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "PartitionNo", this.PartitionNo);
        this.setParamSimple(map, prefix + "Offset", this.Offset);

    }
}

