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
package com.tencentcloudapi.trocket.v20230308.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeConsumerGroupListRequest extends AbstractModel {

    /**
    * 实例ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 查询起始位置
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询结果限制数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 查询条件列表
    */
    @SerializedName("Filters")
    @Expose
    private Filter [] Filters;

    /**
    * 查询指定主题下的消费组
    */
    @SerializedName("FromTopic")
    @Expose
    private String FromTopic;

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
     * Get 查询起始位置 
     * @return Offset 查询起始位置
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 查询起始位置
     * @param Offset 查询起始位置
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询结果限制数量 
     * @return Limit 查询结果限制数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询结果限制数量
     * @param Limit 查询结果限制数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 查询条件列表 
     * @return Filters 查询条件列表
     */
    public Filter [] getFilters() {
        return this.Filters;
    }

    /**
     * Set 查询条件列表
     * @param Filters 查询条件列表
     */
    public void setFilters(Filter [] Filters) {
        this.Filters = Filters;
    }

    /**
     * Get 查询指定主题下的消费组 
     * @return FromTopic 查询指定主题下的消费组
     */
    public String getFromTopic() {
        return this.FromTopic;
    }

    /**
     * Set 查询指定主题下的消费组
     * @param FromTopic 查询指定主题下的消费组
     */
    public void setFromTopic(String FromTopic) {
        this.FromTopic = FromTopic;
    }

    public DescribeConsumerGroupListRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeConsumerGroupListRequest(DescribeConsumerGroupListRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.Filters != null) {
            this.Filters = new Filter[source.Filters.length];
            for (int i = 0; i < source.Filters.length; i++) {
                this.Filters[i] = new Filter(source.Filters[i]);
            }
        }
        if (source.FromTopic != null) {
            this.FromTopic = new String(source.FromTopic);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamArrayObj(map, prefix + "Filters.", this.Filters);
        this.setParamSimple(map, prefix + "FromTopic", this.FromTopic);

    }
}

