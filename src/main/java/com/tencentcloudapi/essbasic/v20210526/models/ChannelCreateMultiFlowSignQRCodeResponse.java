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
package com.tencentcloudapi.essbasic.v20210526.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChannelCreateMultiFlowSignQRCodeResponse extends AbstractModel{

    /**
    * 签署二维码对象
    */
    @SerializedName("QrCode")
    @Expose
    private SignQrCode QrCode;

    /**
    * 签署链接对象
    */
    @SerializedName("SignUrls")
    @Expose
    private SignUrl SignUrls;

    /**
    * 唯一请求 ID，每次请求都会返回。定位问题时需要提供该次请求的 RequestId。
    */
    @SerializedName("RequestId")
    @Expose
    private String RequestId;

    /**
     * Get 签署二维码对象 
     * @return QrCode 签署二维码对象
     */
    public SignQrCode getQrCode() {
        return this.QrCode;
    }

    /**
     * Set 签署二维码对象
     * @param QrCode 签署二维码对象
     */
    public void setQrCode(SignQrCode QrCode) {
        this.QrCode = QrCode;
    }

    /**
     * Get 签署链接对象 
     * @return SignUrls 签署链接对象
     */
    public SignUrl getSignUrls() {
        return this.SignUrls;
    }

    /**
     * Set 签署链接对象
     * @param SignUrls 签署链接对象
     */
    public void setSignUrls(SignUrl SignUrls) {
        this.SignUrls = SignUrls;
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

    public ChannelCreateMultiFlowSignQRCodeResponse() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChannelCreateMultiFlowSignQRCodeResponse(ChannelCreateMultiFlowSignQRCodeResponse source) {
        if (source.QrCode != null) {
            this.QrCode = new SignQrCode(source.QrCode);
        }
        if (source.SignUrls != null) {
            this.SignUrls = new SignUrl(source.SignUrls);
        }
        if (source.RequestId != null) {
            this.RequestId = new String(source.RequestId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "QrCode.", this.QrCode);
        this.setParamObj(map, prefix + "SignUrls.", this.SignUrls);
        this.setParamSimple(map, prefix + "RequestId", this.RequestId);

    }
}
