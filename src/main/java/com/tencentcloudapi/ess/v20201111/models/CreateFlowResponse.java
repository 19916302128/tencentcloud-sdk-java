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
package com.tencentcloudapi.ess.v20201111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateFlowResponse extends AbstractModel{

    /**
    * 签署流程编号，

返回的流程编号，需要在CreateDocument，StartFlow中使用，

注意：这三个接口（CreateFlow，CreateDocument，StartFlow）要一并调用，才算发起成功
    */
    @SerializedName("FlowId")
    @Expose
    private String FlowId;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 签署流程编号，

返回的流程编号，需要在CreateDocument，StartFlow中使用，

注意：这三个接口（CreateFlow，CreateDocument，StartFlow）要一并调用，才算发起成功 
     * @return FlowId 签署流程编号，

返回的流程编号，需要在CreateDocument，StartFlow中使用，

注意：这三个接口（CreateFlow，CreateDocument，StartFlow）要一并调用，才算发起成功
     */
    public String getFlowId() {
        return this.FlowId;
    }

    /**
     * Set 签署流程编号，

返回的流程编号，需要在CreateDocument，StartFlow中使用，

注意：这三个接口（CreateFlow，CreateDocument，StartFlow）要一并调用，才算发起成功
     * @param FlowId 签署流程编号，

返回的流程编号，需要在CreateDocument，StartFlow中使用，

注意：这三个接口（CreateFlow，CreateDocument，StartFlow）要一并调用，才算发起成功
     */
    public void setFlowId(String FlowId) {
        this.FlowId = FlowId;
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

    public CreateFlowResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowResponse(CreateFlowResponse source) {
        if (source.FlowId != null) {
            this.FlowId = new String(source.FlowId);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "FlowId", this.FlowId);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

