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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class Recipient extends AbstractModel {

    /**
    * 合同参与方的角色ID
    */
    @SerializedName("RecipientId")
    @Expose
    private String RecipientId;

    /**
    * 参与者类型, 可以选择的类型如下:
<ul><li> **ENTERPRISE** :此角色为企业参与方</li>
<li> **INDIVIDUAL** :此角色为个人参与方</li>
<li> **PROMOTER** :此角色是发起方</li></ul>
    */
    @SerializedName("RecipientType")
    @Expose
    private String RecipientType;

    /**
    * 合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。
    */
    @SerializedName("RoleName")
    @Expose
    private String RoleName;

    /**
    * 是否需要校验，
true-是，
false-否
    */
    @SerializedName("RequireValidation")
    @Expose
    private Boolean RequireValidation;

    /**
    * 是否必须填写，
true-是，
false-否
    */
    @SerializedName("RequireSign")
    @Expose
    private Boolean RequireSign;

    /**
    * 内部字段，签署类型
    */
    @SerializedName("SignType")
    @Expose
    private Long SignType;

    /**
    * 签署顺序：数字越小优先级越高
    */
    @SerializedName("RoutingOrder")
    @Expose
    private Long RoutingOrder;

    /**
    * 是否是发起方，
true-是 
false-否
    */
    @SerializedName("IsPromoter")
    @Expose
    private Boolean IsPromoter;

    /**
     * Get 合同参与方的角色ID 
     * @return RecipientId 合同参与方的角色ID
     */
    public String getRecipientId() {
        return this.RecipientId;
    }

    /**
     * Set 合同参与方的角色ID
     * @param RecipientId 合同参与方的角色ID
     */
    public void setRecipientId(String RecipientId) {
        this.RecipientId = RecipientId;
    }

    /**
     * Get 参与者类型, 可以选择的类型如下:
<ul><li> **ENTERPRISE** :此角色为企业参与方</li>
<li> **INDIVIDUAL** :此角色为个人参与方</li>
<li> **PROMOTER** :此角色是发起方</li></ul> 
     * @return RecipientType 参与者类型, 可以选择的类型如下:
<ul><li> **ENTERPRISE** :此角色为企业参与方</li>
<li> **INDIVIDUAL** :此角色为个人参与方</li>
<li> **PROMOTER** :此角色是发起方</li></ul>
     */
    public String getRecipientType() {
        return this.RecipientType;
    }

    /**
     * Set 参与者类型, 可以选择的类型如下:
<ul><li> **ENTERPRISE** :此角色为企业参与方</li>
<li> **INDIVIDUAL** :此角色为个人参与方</li>
<li> **PROMOTER** :此角色是发起方</li></ul>
     * @param RecipientType 参与者类型, 可以选择的类型如下:
<ul><li> **ENTERPRISE** :此角色为企业参与方</li>
<li> **INDIVIDUAL** :此角色为个人参与方</li>
<li> **PROMOTER** :此角色是发起方</li></ul>
     */
    public void setRecipientType(String RecipientType) {
        this.RecipientType = RecipientType;
    }

    /**
     * Get 合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。 
     * @return Description 合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。
     * @param Description 合同参与方的角色描述，长度不能超过100，只能由中文、字母、数字和下划线组成。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。 
     * @return RoleName 合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。
     */
    public String getRoleName() {
        return this.RoleName;
    }

    /**
     * Set 合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。
     * @param RoleName 合同参与方的角色名字，长度不能超过20，只能由中文、字母、数字和下划线组成。
     */
    public void setRoleName(String RoleName) {
        this.RoleName = RoleName;
    }

    /**
     * Get 是否需要校验，
true-是，
false-否 
     * @return RequireValidation 是否需要校验，
true-是，
false-否
     */
    public Boolean getRequireValidation() {
        return this.RequireValidation;
    }

    /**
     * Set 是否需要校验，
true-是，
false-否
     * @param RequireValidation 是否需要校验，
true-是，
false-否
     */
    public void setRequireValidation(Boolean RequireValidation) {
        this.RequireValidation = RequireValidation;
    }

    /**
     * Get 是否必须填写，
true-是，
false-否 
     * @return RequireSign 是否必须填写，
true-是，
false-否
     */
    public Boolean getRequireSign() {
        return this.RequireSign;
    }

    /**
     * Set 是否必须填写，
true-是，
false-否
     * @param RequireSign 是否必须填写，
true-是，
false-否
     */
    public void setRequireSign(Boolean RequireSign) {
        this.RequireSign = RequireSign;
    }

    /**
     * Get 内部字段，签署类型 
     * @return SignType 内部字段，签署类型
     */
    public Long getSignType() {
        return this.SignType;
    }

    /**
     * Set 内部字段，签署类型
     * @param SignType 内部字段，签署类型
     */
    public void setSignType(Long SignType) {
        this.SignType = SignType;
    }

    /**
     * Get 签署顺序：数字越小优先级越高 
     * @return RoutingOrder 签署顺序：数字越小优先级越高
     */
    public Long getRoutingOrder() {
        return this.RoutingOrder;
    }

    /**
     * Set 签署顺序：数字越小优先级越高
     * @param RoutingOrder 签署顺序：数字越小优先级越高
     */
    public void setRoutingOrder(Long RoutingOrder) {
        this.RoutingOrder = RoutingOrder;
    }

    /**
     * Get 是否是发起方，
true-是 
false-否 
     * @return IsPromoter 是否是发起方，
true-是 
false-否
     */
    public Boolean getIsPromoter() {
        return this.IsPromoter;
    }

    /**
     * Set 是否是发起方，
true-是 
false-否
     * @param IsPromoter 是否是发起方，
true-是 
false-否
     */
    public void setIsPromoter(Boolean IsPromoter) {
        this.IsPromoter = IsPromoter;
    }

    public Recipient() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public Recipient(Recipient source) {
        if (source.RecipientId != null) {
            this.RecipientId = new String(source.RecipientId);
        }
        if (source.RecipientType != null) {
            this.RecipientType = new String(source.RecipientType);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.RoleName != null) {
            this.RoleName = new String(source.RoleName);
        }
        if (source.RequireValidation != null) {
            this.RequireValidation = new Boolean(source.RequireValidation);
        }
        if (source.RequireSign != null) {
            this.RequireSign = new Boolean(source.RequireSign);
        }
        if (source.SignType != null) {
            this.SignType = new Long(source.SignType);
        }
        if (source.RoutingOrder != null) {
            this.RoutingOrder = new Long(source.RoutingOrder);
        }
        if (source.IsPromoter != null) {
            this.IsPromoter = new Boolean(source.IsPromoter);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "RecipientId", this.RecipientId);
        this.setParamSimple(map, prefix + "RecipientType", this.RecipientType);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "RoleName", this.RoleName);
        this.setParamSimple(map, prefix + "RequireValidation", this.RequireValidation);
        this.setParamSimple(map, prefix + "RequireSign", this.RequireSign);
        this.setParamSimple(map, prefix + "SignType", this.SignType);
        this.setParamSimple(map, prefix + "RoutingOrder", this.RoutingOrder);
        this.setParamSimple(map, prefix + "IsPromoter", this.IsPromoter);

    }
}

