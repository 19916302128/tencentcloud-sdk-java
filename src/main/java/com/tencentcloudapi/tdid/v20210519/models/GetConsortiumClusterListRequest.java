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
package com.tencentcloudapi.tdid.v20210519.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class GetConsortiumClusterListRequest extends AbstractModel{

    /**
    * 联盟id
    */
    @SerializedName("ConsortiumId")
    @Expose
    private Long ConsortiumId;

    /**
     * Get 联盟id 
     * @return ConsortiumId 联盟id
     */
    public Long getConsortiumId() {
        return this.ConsortiumId;
    }

    /**
     * Set 联盟id
     * @param ConsortiumId 联盟id
     */
    public void setConsortiumId(Long ConsortiumId) {
        this.ConsortiumId = ConsortiumId;
    }

    public GetConsortiumClusterListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public GetConsortiumClusterListRequest(GetConsortiumClusterListRequest source) {
        if (source.ConsortiumId != null) {
            this.ConsortiumId = new Long(source.ConsortiumId);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "ConsortiumId", this.ConsortiumId);

    }
}
