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
package com.tencentcloudapi.cpdp.v20190820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class UploadOpenBankSubMerchantCredentialResult extends AbstractModel{

    /**
    * 上传状态
SUCCESS：上传成功
FAILED：上传失败
PROCESSING:上传中
    */
    @SerializedName("UploadStatus")
    @Expose
    private String UploadStatus;

    /**
    * 上传描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("UploadMessage")
    @Expose
    private String UploadMessage;

    /**
    * 渠道上传流水号
    */
    @SerializedName("ChannelApplyId")
    @Expose
    private String ChannelApplyId;

    /**
     * Get 上传状态
SUCCESS：上传成功
FAILED：上传失败
PROCESSING:上传中 
     * @return UploadStatus 上传状态
SUCCESS：上传成功
FAILED：上传失败
PROCESSING:上传中
     */
    public String getUploadStatus() {
        return this.UploadStatus;
    }

    /**
     * Set 上传状态
SUCCESS：上传成功
FAILED：上传失败
PROCESSING:上传中
     * @param UploadStatus 上传状态
SUCCESS：上传成功
FAILED：上传失败
PROCESSING:上传中
     */
    public void setUploadStatus(String UploadStatus) {
        this.UploadStatus = UploadStatus;
    }

    /**
     * Get 上传描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return UploadMessage 上传描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getUploadMessage() {
        return this.UploadMessage;
    }

    /**
     * Set 上传描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param UploadMessage 上传描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setUploadMessage(String UploadMessage) {
        this.UploadMessage = UploadMessage;
    }

    /**
     * Get 渠道上传流水号 
     * @return ChannelApplyId 渠道上传流水号
     */
    public String getChannelApplyId() {
        return this.ChannelApplyId;
    }

    /**
     * Set 渠道上传流水号
     * @param ChannelApplyId 渠道上传流水号
     */
    public void setChannelApplyId(String ChannelApplyId) {
        this.ChannelApplyId = ChannelApplyId;
    }

    public UploadOpenBankSubMerchantCredentialResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public UploadOpenBankSubMerchantCredentialResult(UploadOpenBankSubMerchantCredentialResult source) {
        if (source.UploadStatus != null) {
            this.UploadStatus = new String(source.UploadStatus);
        }
        if (source.UploadMessage != null) {
            this.UploadMessage = new String(source.UploadMessage);
        }
        if (source.ChannelApplyId != null) {
            this.ChannelApplyId = new String(source.ChannelApplyId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "UploadStatus", this.UploadStatus);
        this.setParamSimple(map, prefix + "UploadMessage", this.UploadMessage);
        this.setParamSimple(map, prefix + "ChannelApplyId", this.ChannelApplyId);

    }
}

