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
package com.tencentcloudapi.weilingwith.v20230427.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ApplicationInfo extends AbstractModel {

    /**
    * 应用分配的appId
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationId")
    @Expose
    private String ApplicationId;

    /**
    * 应用中文名
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 应用地址
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Address")
    @Expose
    private String Address;

    /**
    * 应用logo
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ApplicationLogo")
    @Expose
    private ApplicationLogo ApplicationLogo;

    /**
    * 应用类型，0:saas应用 1:平台应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Type")
    @Expose
    private Long Type;

    /**
    * engine
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("EnglishName")
    @Expose
    private String EnglishName;

    /**
    * 能源管理应用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
     * Get 应用分配的appId
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationId 应用分配的appId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getApplicationId() {
        return this.ApplicationId;
    }

    /**
     * Set 应用分配的appId
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationId 应用分配的appId
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationId(String ApplicationId) {
        this.ApplicationId = ApplicationId;
    }

    /**
     * Get 应用中文名
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Name 应用中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 应用中文名
注意：此字段可能返回 null，表示取不到有效值。
     * @param Name 应用中文名
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 应用地址
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Address 应用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAddress() {
        return this.Address;
    }

    /**
     * Set 应用地址
注意：此字段可能返回 null，表示取不到有效值。
     * @param Address 应用地址
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAddress(String Address) {
        this.Address = Address;
    }

    /**
     * Get 应用logo
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ApplicationLogo 应用logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ApplicationLogo getApplicationLogo() {
        return this.ApplicationLogo;
    }

    /**
     * Set 应用logo
注意：此字段可能返回 null，表示取不到有效值。
     * @param ApplicationLogo 应用logo
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setApplicationLogo(ApplicationLogo ApplicationLogo) {
        this.ApplicationLogo = ApplicationLogo;
    }

    /**
     * Get 应用类型，0:saas应用 1:平台应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Type 应用类型，0:saas应用 1:平台应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getType() {
        return this.Type;
    }

    /**
     * Set 应用类型，0:saas应用 1:平台应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Type 应用类型，0:saas应用 1:平台应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setType(Long Type) {
        this.Type = Type;
    }

    /**
     * Get engine
注意：此字段可能返回 null，表示取不到有效值。 
     * @return EnglishName engine
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getEnglishName() {
        return this.EnglishName;
    }

    /**
     * Set engine
注意：此字段可能返回 null，表示取不到有效值。
     * @param EnglishName engine
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setEnglishName(String EnglishName) {
        this.EnglishName = EnglishName;
    }

    /**
     * Get 能源管理应用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 能源管理应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 能源管理应用
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 能源管理应用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    public ApplicationInfo() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ApplicationInfo(ApplicationInfo source) {
        if (source.ApplicationId != null) {
            this.ApplicationId = new String(source.ApplicationId);
        }
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Address != null) {
            this.Address = new String(source.Address);
        }
        if (source.ApplicationLogo != null) {
            this.ApplicationLogo = new ApplicationLogo(source.ApplicationLogo);
        }
        if (source.Type != null) {
            this.Type = new Long(source.Type);
        }
        if (source.EnglishName != null) {
            this.EnglishName = new String(source.EnglishName);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ApplicationId", this.ApplicationId);
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Address", this.Address);
        this.setParamObj(map, prefix + "ApplicationLogo.", this.ApplicationLogo);
        this.setParamSimple(map, prefix + "Type", this.Type);
        this.setParamSimple(map, prefix + "EnglishName", this.EnglishName);
        this.setParamSimple(map, prefix + "Description", this.Description);

    }
}

