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
package com.tencentcloudapi.tione.v20211111.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DeleteModelServiceRequest extends AbstractModel{

    /**
    * 服务id
    */
    @SerializedName("ServiceId")
    @Expose
    private String ServiceId;

    /**
    * 服务分类
    */
    @SerializedName("ServiceCategory")
    @Expose
    private String ServiceCategory;

    /**
     * Get 服务id 
     * @return ServiceId 服务id
     */
    public String getServiceId() {
        return this.ServiceId;
    }

    /**
     * Set 服务id
     * @param ServiceId 服务id
     */
    public void setServiceId(String ServiceId) {
        this.ServiceId = ServiceId;
    }

    /**
     * Get 服务分类 
     * @return ServiceCategory 服务分类
     */
    public String getServiceCategory() {
        return this.ServiceCategory;
    }

    /**
     * Set 服务分类
     * @param ServiceCategory 服务分类
     */
    public void setServiceCategory(String ServiceCategory) {
        this.ServiceCategory = ServiceCategory;
    }

    public DeleteModelServiceRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DeleteModelServiceRequest(DeleteModelServiceRequest source) {
        if (source.ServiceId != null) {
            this.ServiceId = new String(source.ServiceId);
        }
        if (source.ServiceCategory != null) {
            this.ServiceCategory = new String(source.ServiceCategory);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ServiceId", this.ServiceId);
        this.setParamSimple(map, prefix + "ServiceCategory", this.ServiceCategory);

    }
}

