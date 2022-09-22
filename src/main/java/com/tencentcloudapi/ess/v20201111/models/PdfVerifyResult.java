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

public class PdfVerifyResult extends AbstractModel{

    /**
    * 验签结果
    */
    @SerializedName("VerifyResult")
    @Expose
    private Long VerifyResult;

    /**
    * 签署平台
    */
    @SerializedName("SignPlatform")
    @Expose
    private String SignPlatform;

    /**
    * 签署人名称
    */
    @SerializedName("SignerName")
    @Expose
    private String SignerName;

    /**
    * 签署时间
    */
    @SerializedName("SignTime")
    @Expose
    private Long SignTime;

    /**
    * 签名算法
    */
    @SerializedName("SignAlgorithm")
    @Expose
    private String SignAlgorithm;

    /**
    * 签名证书序列号
    */
    @SerializedName("CertSn")
    @Expose
    private String CertSn;

    /**
    * 证书起始时间
    */
    @SerializedName("CertNotBefore")
    @Expose
    private Long CertNotBefore;

    /**
    * 证书过期时间
    */
    @SerializedName("CertNotAfter")
    @Expose
    private Long CertNotAfter;

    /**
    * 签名域横坐标
    */
    @SerializedName("ComponentPosX")
    @Expose
    private Float ComponentPosX;

    /**
    * 签名域纵坐标
    */
    @SerializedName("ComponentPosY")
    @Expose
    private Float ComponentPosY;

    /**
    * 签名域宽度
    */
    @SerializedName("ComponentWidth")
    @Expose
    private Float ComponentWidth;

    /**
    * 签名域高度
    */
    @SerializedName("ComponentHeight")
    @Expose
    private Float ComponentHeight;

    /**
    * 签名域所在页码
    */
    @SerializedName("ComponentPage")
    @Expose
    private Long ComponentPage;

    /**
     * Get 验签结果 
     * @return VerifyResult 验签结果
     */
    public Long getVerifyResult() {
        return this.VerifyResult;
    }

    /**
     * Set 验签结果
     * @param VerifyResult 验签结果
     */
    public void setVerifyResult(Long VerifyResult) {
        this.VerifyResult = VerifyResult;
    }

    /**
     * Get 签署平台 
     * @return SignPlatform 签署平台
     */
    public String getSignPlatform() {
        return this.SignPlatform;
    }

    /**
     * Set 签署平台
     * @param SignPlatform 签署平台
     */
    public void setSignPlatform(String SignPlatform) {
        this.SignPlatform = SignPlatform;
    }

    /**
     * Get 签署人名称 
     * @return SignerName 签署人名称
     */
    public String getSignerName() {
        return this.SignerName;
    }

    /**
     * Set 签署人名称
     * @param SignerName 签署人名称
     */
    public void setSignerName(String SignerName) {
        this.SignerName = SignerName;
    }

    /**
     * Get 签署时间 
     * @return SignTime 签署时间
     */
    public Long getSignTime() {
        return this.SignTime;
    }

    /**
     * Set 签署时间
     * @param SignTime 签署时间
     */
    public void setSignTime(Long SignTime) {
        this.SignTime = SignTime;
    }

    /**
     * Get 签名算法 
     * @return SignAlgorithm 签名算法
     */
    public String getSignAlgorithm() {
        return this.SignAlgorithm;
    }

    /**
     * Set 签名算法
     * @param SignAlgorithm 签名算法
     */
    public void setSignAlgorithm(String SignAlgorithm) {
        this.SignAlgorithm = SignAlgorithm;
    }

    /**
     * Get 签名证书序列号 
     * @return CertSn 签名证书序列号
     */
    public String getCertSn() {
        return this.CertSn;
    }

    /**
     * Set 签名证书序列号
     * @param CertSn 签名证书序列号
     */
    public void setCertSn(String CertSn) {
        this.CertSn = CertSn;
    }

    /**
     * Get 证书起始时间 
     * @return CertNotBefore 证书起始时间
     */
    public Long getCertNotBefore() {
        return this.CertNotBefore;
    }

    /**
     * Set 证书起始时间
     * @param CertNotBefore 证书起始时间
     */
    public void setCertNotBefore(Long CertNotBefore) {
        this.CertNotBefore = CertNotBefore;
    }

    /**
     * Get 证书过期时间 
     * @return CertNotAfter 证书过期时间
     */
    public Long getCertNotAfter() {
        return this.CertNotAfter;
    }

    /**
     * Set 证书过期时间
     * @param CertNotAfter 证书过期时间
     */
    public void setCertNotAfter(Long CertNotAfter) {
        this.CertNotAfter = CertNotAfter;
    }

    /**
     * Get 签名域横坐标 
     * @return ComponentPosX 签名域横坐标
     */
    public Float getComponentPosX() {
        return this.ComponentPosX;
    }

    /**
     * Set 签名域横坐标
     * @param ComponentPosX 签名域横坐标
     */
    public void setComponentPosX(Float ComponentPosX) {
        this.ComponentPosX = ComponentPosX;
    }

    /**
     * Get 签名域纵坐标 
     * @return ComponentPosY 签名域纵坐标
     */
    public Float getComponentPosY() {
        return this.ComponentPosY;
    }

    /**
     * Set 签名域纵坐标
     * @param ComponentPosY 签名域纵坐标
     */
    public void setComponentPosY(Float ComponentPosY) {
        this.ComponentPosY = ComponentPosY;
    }

    /**
     * Get 签名域宽度 
     * @return ComponentWidth 签名域宽度
     */
    public Float getComponentWidth() {
        return this.ComponentWidth;
    }

    /**
     * Set 签名域宽度
     * @param ComponentWidth 签名域宽度
     */
    public void setComponentWidth(Float ComponentWidth) {
        this.ComponentWidth = ComponentWidth;
    }

    /**
     * Get 签名域高度 
     * @return ComponentHeight 签名域高度
     */
    public Float getComponentHeight() {
        return this.ComponentHeight;
    }

    /**
     * Set 签名域高度
     * @param ComponentHeight 签名域高度
     */
    public void setComponentHeight(Float ComponentHeight) {
        this.ComponentHeight = ComponentHeight;
    }

    /**
     * Get 签名域所在页码 
     * @return ComponentPage 签名域所在页码
     */
    public Long getComponentPage() {
        return this.ComponentPage;
    }

    /**
     * Set 签名域所在页码
     * @param ComponentPage 签名域所在页码
     */
    public void setComponentPage(Long ComponentPage) {
        this.ComponentPage = ComponentPage;
    }

    public PdfVerifyResult() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public PdfVerifyResult(PdfVerifyResult source) {
        if (source.VerifyResult != null) {
            this.VerifyResult = new Long(source.VerifyResult);
        }
        if (source.SignPlatform != null) {
            this.SignPlatform = new String(source.SignPlatform);
        }
        if (source.SignerName != null) {
            this.SignerName = new String(source.SignerName);
        }
        if (source.SignTime != null) {
            this.SignTime = new Long(source.SignTime);
        }
        if (source.SignAlgorithm != null) {
            this.SignAlgorithm = new String(source.SignAlgorithm);
        }
        if (source.CertSn != null) {
            this.CertSn = new String(source.CertSn);
        }
        if (source.CertNotBefore != null) {
            this.CertNotBefore = new Long(source.CertNotBefore);
        }
        if (source.CertNotAfter != null) {
            this.CertNotAfter = new Long(source.CertNotAfter);
        }
        if (source.ComponentPosX != null) {
            this.ComponentPosX = new Float(source.ComponentPosX);
        }
        if (source.ComponentPosY != null) {
            this.ComponentPosY = new Float(source.ComponentPosY);
        }
        if (source.ComponentWidth != null) {
            this.ComponentWidth = new Float(source.ComponentWidth);
        }
        if (source.ComponentHeight != null) {
            this.ComponentHeight = new Float(source.ComponentHeight);
        }
        if (source.ComponentPage != null) {
            this.ComponentPage = new Long(source.ComponentPage);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "VerifyResult", this.VerifyResult);
        this.setParamSimple(map, prefix + "SignPlatform", this.SignPlatform);
        this.setParamSimple(map, prefix + "SignerName", this.SignerName);
        this.setParamSimple(map, prefix + "SignTime", this.SignTime);
        this.setParamSimple(map, prefix + "SignAlgorithm", this.SignAlgorithm);
        this.setParamSimple(map, prefix + "CertSn", this.CertSn);
        this.setParamSimple(map, prefix + "CertNotBefore", this.CertNotBefore);
        this.setParamSimple(map, prefix + "CertNotAfter", this.CertNotAfter);
        this.setParamSimple(map, prefix + "ComponentPosX", this.ComponentPosX);
        this.setParamSimple(map, prefix + "ComponentPosY", this.ComponentPosY);
        this.setParamSimple(map, prefix + "ComponentWidth", this.ComponentWidth);
        this.setParamSimple(map, prefix + "ComponentHeight", this.ComponentHeight);
        this.setParamSimple(map, prefix + "ComponentPage", this.ComponentPage);

    }
}

