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
package com.tencentcloudapi.monitor.v20180724.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeGrafanaNotificationChannelsRequest extends AbstractModel{

    /**
    * 实例 ID
    */
    @SerializedName("InstanceId")
    @Expose
    private String InstanceId;

    /**
    * 偏移量
    */
    @SerializedName("Offset")
    @Expose
    private Long Offset;

    /**
    * 查询数量
    */
    @SerializedName("Limit")
    @Expose
    private Long Limit;

    /**
    * 渠道名
    */
    @SerializedName("ChannelName")
    @Expose
    private String ChannelName;

    /**
    * 渠道 ID
    */
    @SerializedName("ChannelIDs")
    @Expose
    private String [] ChannelIDs;

    /**
    * 状态
    */
    @SerializedName("ChannelState")
    @Expose
    private Long ChannelState;

    /**
     * Get 实例 ID 
     * @return InstanceId 实例 ID
     */
    public String getInstanceId() {
        return this.InstanceId;
    }

    /**
     * Set 实例 ID
     * @param InstanceId 实例 ID
     */
    public void setInstanceId(String InstanceId) {
        this.InstanceId = InstanceId;
    }

    /**
     * Get 偏移量 
     * @return Offset 偏移量
     */
    public Long getOffset() {
        return this.Offset;
    }

    /**
     * Set 偏移量
     * @param Offset 偏移量
     */
    public void setOffset(Long Offset) {
        this.Offset = Offset;
    }

    /**
     * Get 查询数量 
     * @return Limit 查询数量
     */
    public Long getLimit() {
        return this.Limit;
    }

    /**
     * Set 查询数量
     * @param Limit 查询数量
     */
    public void setLimit(Long Limit) {
        this.Limit = Limit;
    }

    /**
     * Get 渠道名 
     * @return ChannelName 渠道名
     */
    public String getChannelName() {
        return this.ChannelName;
    }

    /**
     * Set 渠道名
     * @param ChannelName 渠道名
     */
    public void setChannelName(String ChannelName) {
        this.ChannelName = ChannelName;
    }

    /**
     * Get 渠道 ID 
     * @return ChannelIDs 渠道 ID
     */
    public String [] getChannelIDs() {
        return this.ChannelIDs;
    }

    /**
     * Set 渠道 ID
     * @param ChannelIDs 渠道 ID
     */
    public void setChannelIDs(String [] ChannelIDs) {
        this.ChannelIDs = ChannelIDs;
    }

    /**
     * Get 状态 
     * @return ChannelState 状态
     */
    public Long getChannelState() {
        return this.ChannelState;
    }

    /**
     * Set 状态
     * @param ChannelState 状态
     */
    public void setChannelState(Long ChannelState) {
        this.ChannelState = ChannelState;
    }

    public DescribeGrafanaNotificationChannelsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeGrafanaNotificationChannelsRequest(DescribeGrafanaNotificationChannelsRequest source) {
        if (source.InstanceId != null) {
            this.InstanceId = new String(source.InstanceId);
        }
        if (source.Offset != null) {
            this.Offset = new Long(source.Offset);
        }
        if (source.Limit != null) {
            this.Limit = new Long(source.Limit);
        }
        if (source.ChannelName != null) {
            this.ChannelName = new String(source.ChannelName);
        }
        if (source.ChannelIDs != null) {
            this.ChannelIDs = new String[source.ChannelIDs.length];
            for (int i = 0; i < source.ChannelIDs.length; i++) {
                this.ChannelIDs[i] = new String(source.ChannelIDs[i]);
            }
        }
        if (source.ChannelState != null) {
            this.ChannelState = new Long(source.ChannelState);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "InstanceId", this.InstanceId);
        this.setParamSimple(map, prefix + "Offset", this.Offset);
        this.setParamSimple(map, prefix + "Limit", this.Limit);
        this.setParamSimple(map, prefix + "ChannelName", this.ChannelName);
        this.setParamArraySimple(map, prefix + "ChannelIDs.", this.ChannelIDs);
        this.setParamSimple(map, prefix + "ChannelState", this.ChannelState);

    }
}

