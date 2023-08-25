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

public class DescribeDSPAAssessmentHighRiskTop10OverviewResponse extends AbstractModel{

    /**
    * 含高风险资产TOP10的列表数据
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AssetsList")
    @Expose
    private HighRiskAssetsDetail [] AssetsList;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 含高风险资产TOP10的列表数据
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AssetsList 含高风险资产TOP10的列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public HighRiskAssetsDetail [] getAssetsList() {
        return this.AssetsList;
    }

    /**
     * Set 含高风险资产TOP10的列表数据
注意：此字段可能返回 null，表示取不到有效值。
     * @param AssetsList 含高风险资产TOP10的列表数据
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAssetsList(HighRiskAssetsDetail [] AssetsList) {
        this.AssetsList = AssetsList;
    }

    /**
     * Get 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeDSPAAssessmentHighRiskTop10OverviewResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeDSPAAssessmentHighRiskTop10OverviewResponse(DescribeDSPAAssessmentHighRiskTop10OverviewResponse source) {
        if (source.AssetsList != null) {
            this.AssetsList = new HighRiskAssetsDetail[source.AssetsList.length];
            for (int i = 0; i < source.AssetsList.length; i++) {
                this.AssetsList[i] = new HighRiskAssetsDetail(source.AssetsList[i]);
            }
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "AssetsList.", this.AssetsList);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

