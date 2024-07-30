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

public class DescribeInstanceUsedSubnetsResponse extends AbstractModel {

    /**
    * 集群使用的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("VpcId")
    @Expose
    private String VpcId;

    /**
    * 集群使用的subnet信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UsedSubnets")
    @Expose
    private String [] UsedSubnets;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 集群使用的vpc信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return VpcId 集群使用的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getVpcId() {
        return this.VpcId;
    }

    /**
     * Set 集群使用的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param VpcId 集群使用的vpc信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVpcId(String VpcId) {
        this.VpcId = VpcId;
    }

    /**
     * Get 集群使用的subnet信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UsedSubnets 集群使用的subnet信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getUsedSubnets() {
        return this.UsedSubnets;
    }

    /**
     * Set 集群使用的subnet信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param UsedSubnets 集群使用的subnet信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUsedSubnets(String [] UsedSubnets) {
        this.UsedSubnets = UsedSubnets;
    }

    /**
     * Get 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。 
     * @return RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public String getRequestId() {
        return this.RequestId;
    }

    /**
     * Set 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     * @param RequestId 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
     */
    public void setRequestId(String RequestId) {
        this.RequestId = RequestId;
    }

    public DescribeInstanceUsedSubnetsResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeInstanceUsedSubnetsResponse(DescribeInstanceUsedSubnetsResponse source) {
        if (source.VpcId != null) {
            this.VpcId = new String(source.VpcId);
        }
        if (source.UsedSubnets != null) {
            this.UsedSubnets = new String[source.UsedSubnets.length];
            for (int i = 0; i < source.UsedSubnets.length; i++) {
                this.UsedSubnets[i] = new String(source.UsedSubnets[i]);
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
        this.setParamSimple(map, prefix + "VpcId", this.VpcId);
        this.setParamArraySimple(map, prefix + "UsedSubnets.", this.UsedSubnets);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

