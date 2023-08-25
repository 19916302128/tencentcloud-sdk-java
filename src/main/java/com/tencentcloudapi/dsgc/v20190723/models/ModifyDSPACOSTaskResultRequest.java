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

public class ModifyDSPACOSTaskResultRequest extends AbstractModel{

    /**
    * DSPA实例ID
    */
    @SerializedName("DspaId")
    @Expose
    private String DspaId;

    /**
    * 合规组ID
    */
    @SerializedName("ComplianceId")
    @Expose
    private Long ComplianceId;

    /**
    * 文件扫描结果ID
    */
    @SerializedName("FileResultId")
    @Expose
    private Long FileResultId;

    /**
    * 是否设置为非敏感文件
    */
    @SerializedName("IsSetNonSensitiveFile")
    @Expose
    private Boolean IsSetNonSensitiveFile;

    /**
     * Get DSPA实例ID 
     * @return DspaId DSPA实例ID
     */
    public String getDspaId() {
        return this.DspaId;
    }

    /**
     * Set DSPA实例ID
     * @param DspaId DSPA实例ID
     */
    public void setDspaId(String DspaId) {
        this.DspaId = DspaId;
    }

    /**
     * Get 合规组ID 
     * @return ComplianceId 合规组ID
     */
    public Long getComplianceId() {
        return this.ComplianceId;
    }

    /**
     * Set 合规组ID
     * @param ComplianceId 合规组ID
     */
    public void setComplianceId(Long ComplianceId) {
        this.ComplianceId = ComplianceId;
    }

    /**
     * Get 文件扫描结果ID 
     * @return FileResultId 文件扫描结果ID
     */
    public Long getFileResultId() {
        return this.FileResultId;
    }

    /**
     * Set 文件扫描结果ID
     * @param FileResultId 文件扫描结果ID
     */
    public void setFileResultId(Long FileResultId) {
        this.FileResultId = FileResultId;
    }

    /**
     * Get 是否设置为非敏感文件 
     * @return IsSetNonSensitiveFile 是否设置为非敏感文件
     */
    public Boolean getIsSetNonSensitiveFile() {
        return this.IsSetNonSensitiveFile;
    }

    /**
     * Set 是否设置为非敏感文件
     * @param IsSetNonSensitiveFile 是否设置为非敏感文件
     */
    public void setIsSetNonSensitiveFile(Boolean IsSetNonSensitiveFile) {
        this.IsSetNonSensitiveFile = IsSetNonSensitiveFile;
    }

    public ModifyDSPACOSTaskResultRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyDSPACOSTaskResultRequest(ModifyDSPACOSTaskResultRequest source) {
        if (source.DspaId != null) {
            this.DspaId = new String(source.DspaId);
        }
        if (source.ComplianceId != null) {
            this.ComplianceId = new Long(source.ComplianceId);
        }
        if (source.FileResultId != null) {
            this.FileResultId = new Long(source.FileResultId);
        }
        if (source.IsSetNonSensitiveFile != null) {
            this.IsSetNonSensitiveFile = new Boolean(source.IsSetNonSensitiveFile);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "DspaId", this.DspaId);
        this.setParamSimple(map, prefix + "ComplianceId", this.ComplianceId);
        this.setParamSimple(map, prefix + "FileResultId", this.FileResultId);
        this.setParamSimple(map, prefix + "IsSetNonSensitiveFile", this.IsSetNonSensitiveFile);

    }
}

