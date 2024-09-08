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
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class CreateOrganizationAuthUrlRequest extends AbstractModel {

    /**
    * 操作人信息
    */
    @SerializedName("Operator")
    @Expose
    private UserInfo Operator;

    /**
    * 指定授权方式 支持多选:

<ul>
<li><strong>1</strong>:上传授权书方式</li>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>3</strong>: 法人身份认证方式</li>
</ul>
    */
    @SerializedName("AuthorizationTypes")
    @Expose
    private Long [] AuthorizationTypes;

    /**
    * 认证企业名称，请确认该名称与企业营业执照中注册的名称一致。

注：

1. `如果名称中包含英文括号()，请使用中文括号（）代替。`

2. `EndPointType=“H5”或者"SHORT_H5"时，该参数必填`

    */
    @SerializedName("OrganizationName")
    @Expose
    private String OrganizationName;

    /**
    * 企业统一社会信用代码
    */
    @SerializedName("UniformSocialCreditCode")
    @Expose
    private String UniformSocialCreditCode;

    /**
    * 企业法人的姓名
    */
    @SerializedName("LegalName")
    @Expose
    private String LegalName;

    /**
    * 认证完成跳回的链接，最长500个字符
    */
    @SerializedName("AutoJumpUrl")
    @Expose
    private String AutoJumpUrl;

    /**
    * 营业执照企业地址
    */
    @SerializedName("OrganizationAddress")
    @Expose
    private String OrganizationAddress;

    /**
    * 认证人姓名
    */
    @SerializedName("AdminName")
    @Expose
    private String AdminName;

    /**
    * 认证人手机号
    */
    @SerializedName("AdminMobile")
    @Expose
    private String AdminMobile;

    /**
    * 认证人身份证号
    */
    @SerializedName("AdminIdCardNumber")
    @Expose
    private String AdminIdCardNumber;

    /**
    * 认证人证件类型， 支持以下类型
<ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li>
<li><b>HONGKONG_AND_MACAO</b>  : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 港澳台居民居住证(格式同居民身份证)</li></ul>

    */
    @SerializedName("AdminIdCardType")
    @Expose
    private String AdminIdCardType;

    /**
    * 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
    */
    @SerializedName("UniformSocialCreditCodeSame")
    @Expose
    private Boolean UniformSocialCreditCodeSame;

    /**
    * 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
    */
    @SerializedName("LegalNameSame")
    @Expose
    private Boolean LegalNameSame;

    /**
    * 对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
    */
    @SerializedName("AdminNameSame")
    @Expose
    private Boolean AdminNameSame;

    /**
    * 对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
    */
    @SerializedName("AdminIdCardNumberSame")
    @Expose
    private Boolean AdminIdCardNumberSame;

    /**
    * 对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul>
<li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li>
<li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li>
</ul>
    */
    @SerializedName("AdminMobileSame")
    @Expose
    private Boolean AdminMobileSame;

    /**
    * 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
    */
    @SerializedName("OrganizationNameSame")
    @Expose
    private Boolean OrganizationNameSame;

    /**
    * 营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。
    */
    @SerializedName("BusinessLicense")
    @Expose
    private String BusinessLicense;

    /**
    * 跳转链接类型：

<ul>
<li><b>PC</b>：适用于PC端的认证链接</li>
<li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li>
<li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li>
<li><b>H5</b>：适用于H5页面的认证链接</li>
<li><b>SHORT_H5</b>：H5认证链接的短链形式</li>
</ul>

    */
    @SerializedName("Endpoint")
    @Expose
    private String Endpoint;

    /**
     * Get 操作人信息 
     * @return Operator 操作人信息
     */
    public UserInfo getOperator() {
        return this.Operator;
    }

    /**
     * Set 操作人信息
     * @param Operator 操作人信息
     */
    public void setOperator(UserInfo Operator) {
        this.Operator = Operator;
    }

    /**
     * Get 指定授权方式 支持多选:

<ul>
<li><strong>1</strong>:上传授权书方式</li>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>3</strong>: 法人身份认证方式</li>
</ul> 
     * @return AuthorizationTypes 指定授权方式 支持多选:

<ul>
<li><strong>1</strong>:上传授权书方式</li>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>3</strong>: 法人身份认证方式</li>
</ul>
     */
    public Long [] getAuthorizationTypes() {
        return this.AuthorizationTypes;
    }

    /**
     * Set 指定授权方式 支持多选:

<ul>
<li><strong>1</strong>:上传授权书方式</li>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>3</strong>: 法人身份认证方式</li>
</ul>
     * @param AuthorizationTypes 指定授权方式 支持多选:

<ul>
<li><strong>1</strong>:上传授权书方式</li>
<li><strong>2</strong>: 法人授权方式</li>
<li><strong>3</strong>: 法人身份认证方式</li>
</ul>
     */
    public void setAuthorizationTypes(Long [] AuthorizationTypes) {
        this.AuthorizationTypes = AuthorizationTypes;
    }

    /**
     * Get 认证企业名称，请确认该名称与企业营业执照中注册的名称一致。

注：

1. `如果名称中包含英文括号()，请使用中文括号（）代替。`

2. `EndPointType=“H5”或者"SHORT_H5"时，该参数必填`
 
     * @return OrganizationName 认证企业名称，请确认该名称与企业营业执照中注册的名称一致。

注：

1. `如果名称中包含英文括号()，请使用中文括号（）代替。`

2. `EndPointType=“H5”或者"SHORT_H5"时，该参数必填`

     */
    public String getOrganizationName() {
        return this.OrganizationName;
    }

    /**
     * Set 认证企业名称，请确认该名称与企业营业执照中注册的名称一致。

注：

1. `如果名称中包含英文括号()，请使用中文括号（）代替。`

2. `EndPointType=“H5”或者"SHORT_H5"时，该参数必填`

     * @param OrganizationName 认证企业名称，请确认该名称与企业营业执照中注册的名称一致。

注：

1. `如果名称中包含英文括号()，请使用中文括号（）代替。`

2. `EndPointType=“H5”或者"SHORT_H5"时，该参数必填`

     */
    public void setOrganizationName(String OrganizationName) {
        this.OrganizationName = OrganizationName;
    }

    /**
     * Get 企业统一社会信用代码 
     * @return UniformSocialCreditCode 企业统一社会信用代码
     */
    public String getUniformSocialCreditCode() {
        return this.UniformSocialCreditCode;
    }

    /**
     * Set 企业统一社会信用代码
     * @param UniformSocialCreditCode 企业统一社会信用代码
     */
    public void setUniformSocialCreditCode(String UniformSocialCreditCode) {
        this.UniformSocialCreditCode = UniformSocialCreditCode;
    }

    /**
     * Get 企业法人的姓名 
     * @return LegalName 企业法人的姓名
     */
    public String getLegalName() {
        return this.LegalName;
    }

    /**
     * Set 企业法人的姓名
     * @param LegalName 企业法人的姓名
     */
    public void setLegalName(String LegalName) {
        this.LegalName = LegalName;
    }

    /**
     * Get 认证完成跳回的链接，最长500个字符 
     * @return AutoJumpUrl 认证完成跳回的链接，最长500个字符
     */
    public String getAutoJumpUrl() {
        return this.AutoJumpUrl;
    }

    /**
     * Set 认证完成跳回的链接，最长500个字符
     * @param AutoJumpUrl 认证完成跳回的链接，最长500个字符
     */
    public void setAutoJumpUrl(String AutoJumpUrl) {
        this.AutoJumpUrl = AutoJumpUrl;
    }

    /**
     * Get 营业执照企业地址 
     * @return OrganizationAddress 营业执照企业地址
     */
    public String getOrganizationAddress() {
        return this.OrganizationAddress;
    }

    /**
     * Set 营业执照企业地址
     * @param OrganizationAddress 营业执照企业地址
     */
    public void setOrganizationAddress(String OrganizationAddress) {
        this.OrganizationAddress = OrganizationAddress;
    }

    /**
     * Get 认证人姓名 
     * @return AdminName 认证人姓名
     */
    public String getAdminName() {
        return this.AdminName;
    }

    /**
     * Set 认证人姓名
     * @param AdminName 认证人姓名
     */
    public void setAdminName(String AdminName) {
        this.AdminName = AdminName;
    }

    /**
     * Get 认证人手机号 
     * @return AdminMobile 认证人手机号
     */
    public String getAdminMobile() {
        return this.AdminMobile;
    }

    /**
     * Set 认证人手机号
     * @param AdminMobile 认证人手机号
     */
    public void setAdminMobile(String AdminMobile) {
        this.AdminMobile = AdminMobile;
    }

    /**
     * Get 认证人身份证号 
     * @return AdminIdCardNumber 认证人身份证号
     */
    public String getAdminIdCardNumber() {
        return this.AdminIdCardNumber;
    }

    /**
     * Set 认证人身份证号
     * @param AdminIdCardNumber 认证人身份证号
     */
    public void setAdminIdCardNumber(String AdminIdCardNumber) {
        this.AdminIdCardNumber = AdminIdCardNumber;
    }

    /**
     * Get 认证人证件类型， 支持以下类型
<ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li>
<li><b>HONGKONG_AND_MACAO</b>  : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 港澳台居民居住证(格式同居民身份证)</li></ul>
 
     * @return AdminIdCardType 认证人证件类型， 支持以下类型
<ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li>
<li><b>HONGKONG_AND_MACAO</b>  : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 港澳台居民居住证(格式同居民身份证)</li></ul>

     */
    public String getAdminIdCardType() {
        return this.AdminIdCardType;
    }

    /**
     * Set 认证人证件类型， 支持以下类型
<ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li>
<li><b>HONGKONG_AND_MACAO</b>  : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 港澳台居民居住证(格式同居民身份证)</li></ul>

     * @param AdminIdCardType 认证人证件类型， 支持以下类型
<ul><li><b>ID_CARD</b> : 中国大陆居民身份证  (默认值)</li>
<li><b>HONGKONG_AND_MACAO</b>  : 港澳居民来往内地通行证</li>
<li><b>HONGKONG_MACAO_AND_TAIWAN</b>  : 港澳台居民居住证(格式同居民身份证)</li></ul>

     */
    public void setAdminIdCardType(String AdminIdCardType) {
        this.AdminIdCardType = AdminIdCardType;
    }

    /**
     * Get 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul> 
     * @return UniformSocialCreditCodeSame 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public Boolean getUniformSocialCreditCodeSame() {
        return this.UniformSocialCreditCodeSame;
    }

    /**
     * Set 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     * @param UniformSocialCreditCodeSame 对方打开链接认证时，对方填写的营业执照的社会信用代码是否与接口上传上来的要保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public void setUniformSocialCreditCodeSame(Boolean UniformSocialCreditCodeSame) {
        this.UniformSocialCreditCodeSame = UniformSocialCreditCodeSame;
    }

    /**
     * Get 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul> 
     * @return LegalNameSame 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public Boolean getLegalNameSame() {
        return this.LegalNameSame;
    }

    /**
     * Set 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     * @param LegalNameSame 对方打开链接认证时，法人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public void setLegalNameSame(Boolean LegalNameSame) {
        this.LegalNameSame = LegalNameSame;
    }

    /**
     * Get 对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul> 
     * @return AdminNameSame 对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public Boolean getAdminNameSame() {
        return this.AdminNameSame;
    }

    /**
     * Set 对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     * @param AdminNameSame 对方打开链接认证时，认证人姓名是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public void setAdminNameSame(Boolean AdminNameSame) {
        this.AdminNameSame = AdminNameSame;
    }

    /**
     * Get 对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul> 
     * @return AdminIdCardNumberSame 对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public Boolean getAdminIdCardNumberSame() {
        return this.AdminIdCardNumberSame;
    }

    /**
     * Set 对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     * @param AdminIdCardNumberSame 对方打开链接认证时，认证人居民身份证件号是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public void setAdminIdCardNumberSame(Boolean AdminIdCardNumberSame) {
        this.AdminIdCardNumberSame = AdminIdCardNumberSame;
    }

    /**
     * Get 对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul>
<li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li>
<li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li>
</ul> 
     * @return AdminMobileSame 对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul>
<li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li>
<li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li>
</ul>
     */
    public Boolean getAdminMobileSame() {
        return this.AdminMobileSame;
    }

    /**
     * Set 对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul>
<li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li>
<li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li>
</ul>
     * @param AdminMobileSame 对方打开链接认证时，认证人手机号是否要与接口传递上来的保持一致。<ul>
<li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li>
<li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li>
</ul>
     */
    public void setAdminMobileSame(Boolean AdminMobileSame) {
        this.AdminMobileSame = AdminMobileSame;
    }

    /**
     * Get 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul> 
     * @return OrganizationNameSame 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public Boolean getOrganizationNameSame() {
        return this.OrganizationNameSame;
    }

    /**
     * Set 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     * @param OrganizationNameSame 对方打开链接认证时，企业名称是否要与接口传递上来的保持一致。<ul><li><b>false（默认值）</b>：关闭状态，实际认证时允许与接口传递的信息存在不一致。</li><li><b>true</b>：启用状态，实际认证时必须与接口传递的信息完全相符。</li></ul>
     */
    public void setOrganizationNameSame(Boolean OrganizationNameSame) {
        this.OrganizationNameSame = OrganizationNameSame;
    }

    /**
     * Get 营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。 
     * @return BusinessLicense 营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。
     */
    public String getBusinessLicense() {
        return this.BusinessLicense;
    }

    /**
     * Set 营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。
     * @param BusinessLicense 营业执照正面照（支持PNG或JPG格式）需以base64格式提供，且文件大小不得超过5MB。
     */
    public void setBusinessLicense(String BusinessLicense) {
        this.BusinessLicense = BusinessLicense;
    }

    /**
     * Get 跳转链接类型：

<ul>
<li><b>PC</b>：适用于PC端的认证链接</li>
<li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li>
<li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li>
<li><b>H5</b>：适用于H5页面的认证链接</li>
<li><b>SHORT_H5</b>：H5认证链接的短链形式</li>
</ul>
 
     * @return Endpoint 跳转链接类型：

<ul>
<li><b>PC</b>：适用于PC端的认证链接</li>
<li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li>
<li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li>
<li><b>H5</b>：适用于H5页面的认证链接</li>
<li><b>SHORT_H5</b>：H5认证链接的短链形式</li>
</ul>

     */
    public String getEndpoint() {
        return this.Endpoint;
    }

    /**
     * Set 跳转链接类型：

<ul>
<li><b>PC</b>：适用于PC端的认证链接</li>
<li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li>
<li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li>
<li><b>H5</b>：适用于H5页面的认证链接</li>
<li><b>SHORT_H5</b>：H5认证链接的短链形式</li>
</ul>

     * @param Endpoint 跳转链接类型：

<ul>
<li><b>PC</b>：适用于PC端的认证链接</li>
<li><b>APP</b>：用于全屏或半屏跳转的小程序链接</li>
<li><b>SHORT_URL</b>：跳转小程序的链接的短链形式</li>
<li><b>H5</b>：适用于H5页面的认证链接</li>
<li><b>SHORT_H5</b>：H5认证链接的短链形式</li>
</ul>

     */
    public void setEndpoint(String Endpoint) {
        this.Endpoint = Endpoint;
    }

    public CreateOrganizationAuthUrlRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CreateOrganizationAuthUrlRequest(CreateOrganizationAuthUrlRequest source) {
        if (source.Operator != null) {
            this.Operator = new UserInfo(source.Operator);
        }
        if (source.AuthorizationTypes != null) {
            this.AuthorizationTypes = new Long[source.AuthorizationTypes.length];
            for (int i = 0; i < source.AuthorizationTypes.length; i++) {
                this.AuthorizationTypes[i] = new Long(source.AuthorizationTypes[i]);
            }
        }
        if (source.OrganizationName != null) {
            this.OrganizationName = new String(source.OrganizationName);
        }
        if (source.UniformSocialCreditCode != null) {
            this.UniformSocialCreditCode = new String(source.UniformSocialCreditCode);
        }
        if (source.LegalName != null) {
            this.LegalName = new String(source.LegalName);
        }
        if (source.AutoJumpUrl != null) {
            this.AutoJumpUrl = new String(source.AutoJumpUrl);
        }
        if (source.OrganizationAddress != null) {
            this.OrganizationAddress = new String(source.OrganizationAddress);
        }
        if (source.AdminName != null) {
            this.AdminName = new String(source.AdminName);
        }
        if (source.AdminMobile != null) {
            this.AdminMobile = new String(source.AdminMobile);
        }
        if (source.AdminIdCardNumber != null) {
            this.AdminIdCardNumber = new String(source.AdminIdCardNumber);
        }
        if (source.AdminIdCardType != null) {
            this.AdminIdCardType = new String(source.AdminIdCardType);
        }
        if (source.UniformSocialCreditCodeSame != null) {
            this.UniformSocialCreditCodeSame = new Boolean(source.UniformSocialCreditCodeSame);
        }
        if (source.LegalNameSame != null) {
            this.LegalNameSame = new Boolean(source.LegalNameSame);
        }
        if (source.AdminNameSame != null) {
            this.AdminNameSame = new Boolean(source.AdminNameSame);
        }
        if (source.AdminIdCardNumberSame != null) {
            this.AdminIdCardNumberSame = new Boolean(source.AdminIdCardNumberSame);
        }
        if (source.AdminMobileSame != null) {
            this.AdminMobileSame = new Boolean(source.AdminMobileSame);
        }
        if (source.OrganizationNameSame != null) {
            this.OrganizationNameSame = new Boolean(source.OrganizationNameSame);
        }
        if (source.BusinessLicense != null) {
            this.BusinessLicense = new String(source.BusinessLicense);
        }
        if (source.Endpoint != null) {
            this.Endpoint = new String(source.Endpoint);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamObj(map, prefix + "Operator.", this.Operator);
        this.setParamArraySimple(map, prefix + "AuthorizationTypes.", this.AuthorizationTypes);
        this.setParamSimple(map, prefix + "OrganizationName", this.OrganizationName);
        this.setParamSimple(map, prefix + "UniformSocialCreditCode", this.UniformSocialCreditCode);
        this.setParamSimple(map, prefix + "LegalName", this.LegalName);
        this.setParamSimple(map, prefix + "AutoJumpUrl", this.AutoJumpUrl);
        this.setParamSimple(map, prefix + "OrganizationAddress", this.OrganizationAddress);
        this.setParamSimple(map, prefix + "AdminName", this.AdminName);
        this.setParamSimple(map, prefix + "AdminMobile", this.AdminMobile);
        this.setParamSimple(map, prefix + "AdminIdCardNumber", this.AdminIdCardNumber);
        this.setParamSimple(map, prefix + "AdminIdCardType", this.AdminIdCardType);
        this.setParamSimple(map, prefix + "UniformSocialCreditCodeSame", this.UniformSocialCreditCodeSame);
        this.setParamSimple(map, prefix + "LegalNameSame", this.LegalNameSame);
        this.setParamSimple(map, prefix + "AdminNameSame", this.AdminNameSame);
        this.setParamSimple(map, prefix + "AdminIdCardNumberSame", this.AdminIdCardNumberSame);
        this.setParamSimple(map, prefix + "AdminMobileSame", this.AdminMobileSame);
        this.setParamSimple(map, prefix + "OrganizationNameSame", this.OrganizationNameSame);
        this.setParamSimple(map, prefix + "BusinessLicense", this.BusinessLicense);
        this.setParamSimple(map, prefix + "Endpoint", this.Endpoint);

    }
}

