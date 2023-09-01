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

public class CreateFlowEvidenceReportResponse extends AbstractModel{

    /**
    * 出证报告 ID，可用于DescribeFlowEvidenceReport接口查询出证PDF的下载地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportId")
    @Expose
    private String ReportId;

    /**
    * 出证任务执行的状态, 可能会有以下状态：

<ul><li>EvidenceStatusExecuting：  出证任务在执行中</li>
<li>EvidenceStatusSuccess：  出证任务执行成功</li>
<li>EvidenceStatusFailed ： 出征任务执行失败</li></ul>
    */
    @SerializedName("Status")
    @Expose
    private String Status;

    /**
    * 此字段已经废除,不再使用.
出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ReportUrl")
    @Expose
    private String ReportUrl;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 出证报告 ID，可用于DescribeFlowEvidenceReport接口查询出证PDF的下载地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportId 出证报告 ID，可用于DescribeFlowEvidenceReport接口查询出证PDF的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getReportId() {
        return this.ReportId;
    }

    /**
     * Set 出证报告 ID，可用于DescribeFlowEvidenceReport接口查询出证PDF的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportId 出证报告 ID，可用于DescribeFlowEvidenceReport接口查询出证PDF的下载地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setReportId(String ReportId) {
        this.ReportId = ReportId;
    }

    /**
     * Get 出证任务执行的状态, 可能会有以下状态：

<ul><li>EvidenceStatusExecuting：  出证任务在执行中</li>
<li>EvidenceStatusSuccess：  出证任务执行成功</li>
<li>EvidenceStatusFailed ： 出征任务执行失败</li></ul> 
     * @return Status 出证任务执行的状态, 可能会有以下状态：

<ul><li>EvidenceStatusExecuting：  出证任务在执行中</li>
<li>EvidenceStatusSuccess：  出证任务执行成功</li>
<li>EvidenceStatusFailed ： 出征任务执行失败</li></ul>
     */
    public String getStatus() {
        return this.Status;
    }

    /**
     * Set 出证任务执行的状态, 可能会有以下状态：

<ul><li>EvidenceStatusExecuting：  出证任务在执行中</li>
<li>EvidenceStatusSuccess：  出证任务执行成功</li>
<li>EvidenceStatusFailed ： 出征任务执行失败</li></ul>
     * @param Status 出证任务执行的状态, 可能会有以下状态：

<ul><li>EvidenceStatusExecuting：  出证任务在执行中</li>
<li>EvidenceStatusSuccess：  出证任务执行成功</li>
<li>EvidenceStatusFailed ： 出征任务执行失败</li></ul>
     */
    public void setStatus(String Status) {
        this.Status = Status;
    }

    /**
     * Get 此字段已经废除,不再使用.
出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ReportUrl 此字段已经废除,不再使用.
出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public String getReportUrl() {
        return this.ReportUrl;
    }

    /**
     * Set 此字段已经废除,不再使用.
出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取
注意：此字段可能返回 null，表示取不到有效值。
     * @param ReportUrl 此字段已经废除,不再使用.
出证的PDF下载地址请调用DescribeChannelFlowEvidenceReport接口获取
注意：此字段可能返回 null，表示取不到有效值。
     * @deprecated
     */
    @Deprecated
    public void setReportUrl(String ReportUrl) {
        this.ReportUrl = ReportUrl;
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

    public CreateFlowEvidenceReportResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateFlowEvidenceReportResponse(CreateFlowEvidenceReportResponse source) {
        if (source.ReportId != null) {
            this.ReportId = new String(source.ReportId);
        }
        if (source.Status != null) {
            this.Status = new String(source.Status);
        }
        if (source.ReportUrl != null) {
            this.ReportUrl = new String(source.ReportUrl);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ReportId", this.ReportId);
        this.setParamSimple(map, prefix + "Status", this.Status);
        this.setParamSimple(map, prefix + "ReportUrl", this.ReportUrl);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}

