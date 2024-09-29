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
package com.tencentcloudapi.mqtt.v20240516.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ModifyJWTAuthenticatorRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 算法：hmac-based，public-key
    */
    @SerializedName("Algorithm")
    @Expose
    private String Algorithm;

    /**
    * 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
    */
    @SerializedName("From")
    @Expose
    private String From;

    /**
    * 密码
    */
    @SerializedName("Secret")
    @Expose
    private String Secret;

    /**
    * 公钥
    */
    @SerializedName("PublicKey")
    @Expose
    private String PublicKey;

    /**
    * JSKS文本
    */
    @SerializedName("Text")
    @Expose
    private String Text;

    /**
    * 说明
    */
    @SerializedName("Remark")
    @Expose
    private String Remark;

    /**
     * Get 实例ID 
     * @return InstanceId 实例ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例ID
     * @param InstanceId 实例ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 算法：hmac-based，public-key 
     * @return Algorithm 算法：hmac-based，public-key
     */
    public String getAlgorithm() {
        return this.Algorithm;
    }

    /**
     * Set 算法：hmac-based，public-key
     * @param Algorithm 算法：hmac-based，public-key
     */
    public void setAlgorithm(String Algorithm) {
        this.Algorithm = Algorithm;
    }

    /**
     * Get 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递 
     * @return From 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
     */
    public String getFrom() {
        return this.From;
    }

    /**
     * Set 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
     * @param From 设备连接时传递jwt的key；username-使用用户名字段传递；password-使用密码字段传递
     */
    public void setFrom(String From) {
        this.From = From;
    }

    /**
     * Get 密码 
     * @return Secret 密码
     */
    public String getSecret() {
        return this.Secret;
    }

    /**
     * Set 密码
     * @param Secret 密码
     */
    public void setSecret(String Secret) {
        this.Secret = Secret;
    }

    /**
     * Get 公钥 
     * @return PublicKey 公钥
     */
    public String getPublicKey() {
        return this.PublicKey;
    }

    /**
     * Set 公钥
     * @param PublicKey 公钥
     */
    public void setPublicKey(String PublicKey) {
        this.PublicKey = PublicKey;
    }

    /**
     * Get JSKS文本 
     * @return Text JSKS文本
     */
    public String getText() {
        return this.Text;
    }

    /**
     * Set JSKS文本
     * @param Text JSKS文本
     */
    public void setText(String Text) {
        this.Text = Text;
    }

    /**
     * Get 说明 
     * @return Remark 说明
     */
    public String getRemark() {
        return this.Remark;
    }

    /**
     * Set 说明
     * @param Remark 说明
     */
    public void setRemark(String Remark) {
        this.Remark = Remark;
    }

    public ModifyJWTAuthenticatorRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ModifyJWTAuthenticatorRequest(ModifyJWTAuthenticatorRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Algorithm != null) {
            this.Algorithm = new String(source.Algorithm);
        }
        if (source.From != null) {
            this.From = new String(source.From);
        }
        if (source.Secret != null) {
            this.Secret = new String(source.Secret);
        }
        if (source.PublicKey != null) {
            this.PublicKey = new String(source.PublicKey);
        }
        if (source.Text != null) {
            this.Text = new String(source.Text);
        }
        if (source.Remark != null) {
            this.Remark = new String(source.Remark);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Algorithm", this.Algorithm);
        this.setParamSimple(map, prefix + "From", this.From);
        this.setParamSimple(map, prefix + "Secret", this.Secret);
        this.setParamSimple(map, prefix + "PublicKey", this.PublicKey);
        this.setParamSimple(map, prefix + "Text", this.Text);
        this.setParamSimple(map, prefix + "Remark", this.Remark);

    }
}

