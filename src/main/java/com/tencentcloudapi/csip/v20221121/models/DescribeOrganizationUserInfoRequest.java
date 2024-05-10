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
package com.tencentcloudapi.csip.v20221121.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeOrganizationUserInfoRequest extends AbstractModel {

    /**
    * 集团账号的成员id
    */
    @SerializedName("MemberId")
    @Expose
    private String [] MemberId;

    /**
    * 过滤内容
    */
    @SerializedName("Filter")
    @Expose
    private Filter Filter;

    /**
    * 不支持多云
    */
    @SerializedName("NotSupportCloud")
    @Expose
    private Boolean NotSupportCloud;

    /**
     * Get 集团账号的成员id 
     * @return MemberId 集团账号的成员id
     */
    public String [] getMemberId() {
        return this.MemberId;
    }

    /**
     * Set 集团账号的成员id
     * @param MemberId 集团账号的成员id
     */
    public void setMemberId(String [] MemberId) {
        this.MemberId = MemberId;
    }

    /**
     * Get 过滤内容 
     * @return Filter 过滤内容
     */
    public Filter getFilter() {
        return this.Filter;
    }

    /**
     * Set 过滤内容
     * @param Filter 过滤内容
     */
    public void setFilter(Filter Filter) {
        this.Filter = Filter;
    }

    /**
     * Get 不支持多云 
     * @return NotSupportCloud 不支持多云
     */
    public Boolean getNotSupportCloud() {
        return this.NotSupportCloud;
    }

    /**
     * Set 不支持多云
     * @param NotSupportCloud 不支持多云
     */
    public void setNotSupportCloud(Boolean NotSupportCloud) {
        this.NotSupportCloud = NotSupportCloud;
    }

    public DescribeOrganizationUserInfoRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeOrganizationUserInfoRequest(DescribeOrganizationUserInfoRequest source) {
        if (source.MemberId != null) {
            this.MemberId = new String[source.MemberId.length];
            for (int i = 0; i < source.MemberId.length; i++) {
                this.MemberId[i] = new String(source.MemberId[i]);
            }
        }
        if (source.Filter != null) {
            this.Filter = new Filter(source.Filter);
        }
        if (source.NotSupportCloud != null) {
            this.NotSupportCloud = new Boolean(source.NotSupportCloud);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArraySimple(map, prefix + "MemberId.", this.MemberId);
        this.setParamObj(map, prefix + "Filter.", this.Filter);
        this.setParamSimple(map, prefix + "NotSupportCloud", this.NotSupportCloud);

    }
}

