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
package com.tencentcloudapi.cls.v20201016.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DescribeLogContextRequest extends AbstractModel {

    /**
    * 要查询的日志主题ID
    */
    @SerializedName("TopicId")
    @Expose
    private String TopicId;

    /**
    * 日志时间,  需按照 UTC+8 时区将日志中的Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。
    */
    @SerializedName("BTime")
    @Expose
    private String BTime;

    /**
    * 日志包序号。SearchLog接口返回信息中Results结构体中的PkgId。
    */
    @SerializedName("PkgId")
    @Expose
    private String PkgId;

    /**
    * 日志包内一条日志的序号。
SearchLog接口返回信息中Results结构中的PkgLogId。
    */
    @SerializedName("PkgLogId")
    @Expose
    private Long PkgLogId;

    /**
    * 前${PrevLogs}条日志，默认值10。
    */
    @SerializedName("PrevLogs")
    @Expose
    private Long PrevLogs;

    /**
    * 后${NextLogs}条日志，默认值10。
    */
    @SerializedName("NextLogs")
    @Expose
    private Long NextLogs;

    /**
     * Get 要查询的日志主题ID 
     * @return TopicId 要查询的日志主题ID
     */
    public String getTopicId() {
        return this.TopicId;
    }

    /**
     * Set 要查询的日志主题ID
     * @param TopicId 要查询的日志主题ID
     */
    public void setTopicId(String TopicId) {
        this.TopicId = TopicId;
    }

    /**
     * Get 日志时间,  需按照 UTC+8 时区将日志中的Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。 
     * @return BTime 日志时间,  需按照 UTC+8 时区将日志中的Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。
     */
    public String getBTime() {
        return this.BTime;
    }

    /**
     * Set 日志时间,  需按照 UTC+8 时区将日志中的Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。
     * @param BTime 日志时间,  需按照 UTC+8 时区将日志中的Unix时间戳转换为 YYYY-mm-dd HH:MM:SS.FFF 格式的字符串。
     */
    public void setBTime(String BTime) {
        this.BTime = BTime;
    }

    /**
     * Get 日志包序号。SearchLog接口返回信息中Results结构体中的PkgId。 
     * @return PkgId 日志包序号。SearchLog接口返回信息中Results结构体中的PkgId。
     */
    public String getPkgId() {
        return this.PkgId;
    }

    /**
     * Set 日志包序号。SearchLog接口返回信息中Results结构体中的PkgId。
     * @param PkgId 日志包序号。SearchLog接口返回信息中Results结构体中的PkgId。
     */
    public void setPkgId(String PkgId) {
        this.PkgId = PkgId;
    }

    /**
     * Get 日志包内一条日志的序号。
SearchLog接口返回信息中Results结构中的PkgLogId。 
     * @return PkgLogId 日志包内一条日志的序号。
SearchLog接口返回信息中Results结构中的PkgLogId。
     */
    public Long getPkgLogId() {
        return this.PkgLogId;
    }

    /**
     * Set 日志包内一条日志的序号。
SearchLog接口返回信息中Results结构中的PkgLogId。
     * @param PkgLogId 日志包内一条日志的序号。
SearchLog接口返回信息中Results结构中的PkgLogId。
     */
    public void setPkgLogId(Long PkgLogId) {
        this.PkgLogId = PkgLogId;
    }

    /**
     * Get 前${PrevLogs}条日志，默认值10。 
     * @return PrevLogs 前${PrevLogs}条日志，默认值10。
     */
    public Long getPrevLogs() {
        return this.PrevLogs;
    }

    /**
     * Set 前${PrevLogs}条日志，默认值10。
     * @param PrevLogs 前${PrevLogs}条日志，默认值10。
     */
    public void setPrevLogs(Long PrevLogs) {
        this.PrevLogs = PrevLogs;
    }

    /**
     * Get 后${NextLogs}条日志，默认值10。 
     * @return NextLogs 后${NextLogs}条日志，默认值10。
     */
    public Long getNextLogs() {
        return this.NextLogs;
    }

    /**
     * Set 后${NextLogs}条日志，默认值10。
     * @param NextLogs 后${NextLogs}条日志，默认值10。
     */
    public void setNextLogs(Long NextLogs) {
        this.NextLogs = NextLogs;
    }

    public DescribeLogContextRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DescribeLogContextRequest(DescribeLogContextRequest source) {
        if (source.TopicId != null) {
            this.TopicId = new String(source.TopicId);
        }
        if (source.BTime != null) {
            this.BTime = new String(source.BTime);
        }
        if (source.PkgId != null) {
            this.PkgId = new String(source.PkgId);
        }
        if (source.PkgLogId != null) {
            this.PkgLogId = new Long(source.PkgLogId);
        }
        if (source.PrevLogs != null) {
            this.PrevLogs = new Long(source.PrevLogs);
        }
        if (source.NextLogs != null) {
            this.NextLogs = new Long(source.NextLogs);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "TopicId", this.TopicId);
        this.setParamSimple(map, prefix + "BTime", this.BTime);
        this.setParamSimple(map, prefix + "PkgId", this.PkgId);
        this.setParamSimple(map, prefix + "PkgLogId", this.PkgLogId);
        this.setParamSimple(map, prefix + "PrevLogs", this.PrevLogs);
        this.setParamSimple(map, prefix + "NextLogs", this.NextLogs);

    }
}

