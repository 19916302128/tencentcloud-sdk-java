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
package com.tencentcloudapi.smh.v20210712.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeUserLifecycleResponse extends AbstractModel {

    /**
    * 用户 ID。
    */
    @SerializedName("UserId")
    @Expose
    private String UserId;

    /**
    * 设置的隔离时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("IsolateTime")
    @Expose
    private String IsolateTime;

    /**
    * 设置的销毁时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DestroyTime")
    @Expose
    private String DestroyTime;

    /**
    * 唯一请求 ID，由服务端生成，每次请求都会返回（若请求因其他原因未能抵达服务端，则该次请求不会获得 RequestId）。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 用户 ID。 
     * @return UserId 用户 ID。
     */
    public String getUserId() {
        return this.UserId;
    }

    /**
     * Set 用户 ID。
     * @param UserId 用户 ID。
     */
    public void setUserId(String UserId) {
        this.UserId = UserId;
    }

    /**
     * Get 设置的隔离时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return IsolateTime 设置的隔离时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getIsolateTime() {
        return this.IsolateTime;
    }

    /**
     * Set 设置的隔离时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param IsolateTime 设置的隔离时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setIsolateTime(String IsolateTime) {
        this.IsolateTime = IsolateTime;
    }

    /**
     * Get 设置的销毁时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DestroyTime 设置的销毁时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDestroyTime() {
        return this.DestroyTime;
    }

    /**
     * Set 设置的销毁时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param DestroyTime 设置的销毁时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDestroyTime(String DestroyTime) {
        this.DestroyTime = DestroyTime;
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

    public DescribeUserLifecycleResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeUserLifecycleResponse(DescribeUserLifecycleResponse source) {
        if (source.UserId != null) {
            this.UserId = new String(source.UserId);
        }
        if (source.IsolateTime != null) {
            this.IsolateTime = new String(source.IsolateTime);
        }
        if (source.DestroyTime != null) {
            this.DestroyTime = new String(source.DestroyTime);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UserId", this.UserId);
        this.setParamSimple(map, prefix + "IsolateTime", this.IsolateTime);
        this.setParamSimple(map, prefix + "DestroyTime", this.DestroyTime);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

