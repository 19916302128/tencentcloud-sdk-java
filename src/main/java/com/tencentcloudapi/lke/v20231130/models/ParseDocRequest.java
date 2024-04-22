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
package com.tencentcloudapi.lke.v20231130.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ParseDocRequest extends AbstractModel {

    /**
    * 文件名称(需要包括文件后缀, 最大长度1024字节)
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 文件下载链接 (支持的文件类型: docx, txt, markdown, pdf)
    */
    @SerializedName("Url")
    @Expose
    private String Url;

    /**
    * 任务ID, 用于幂等去重, 业务自行定义(最大长度64字节)
    */
    @SerializedName("TaskId")
    @Expose
    private String TaskId;

    /**
    * 切分策略
    */
    @SerializedName("Policy")
    @Expose
    private String Policy;

    /**
    * 默认值: parse
    */
    @SerializedName("Operate")
    @Expose
    private String Operate;

    /**
     * Get 文件名称(需要包括文件后缀, 最大长度1024字节) 
     * @return Name 文件名称(需要包括文件后缀, 最大长度1024字节)
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 文件名称(需要包括文件后缀, 最大长度1024字节)
     * @param Name 文件名称(需要包括文件后缀, 最大长度1024字节)
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 文件下载链接 (支持的文件类型: docx, txt, markdown, pdf) 
     * @return Url 文件下载链接 (支持的文件类型: docx, txt, markdown, pdf)
     */
    public String getUrl() {
        return this.Url;
    }

    /**
     * Set 文件下载链接 (支持的文件类型: docx, txt, markdown, pdf)
     * @param Url 文件下载链接 (支持的文件类型: docx, txt, markdown, pdf)
     */
    public void setUrl(String Url) {
        this.Url = Url;
    }

    /**
     * Get 任务ID, 用于幂等去重, 业务自行定义(最大长度64字节) 
     * @return TaskId 任务ID, 用于幂等去重, 业务自行定义(最大长度64字节)
     */
    public String getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务ID, 用于幂等去重, 业务自行定义(最大长度64字节)
     * @param TaskId 任务ID, 用于幂等去重, 业务自行定义(最大长度64字节)
     */
    public void setTaskId(String TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 切分策略 
     * @return Policy 切分策略
     */
    public String getPolicy() {
        return this.Policy;
    }

    /**
     * Set 切分策略
     * @param Policy 切分策略
     */
    public void setPolicy(String Policy) {
        this.Policy = Policy;
    }

    /**
     * Get 默认值: parse 
     * @return Operate 默认值: parse
     * @deprecated
     */
    @Deprecated
    public String getOperate() {
        return this.Operate;
    }

    /**
     * Set 默认值: parse
     * @param Operate 默认值: parse
     * @deprecated
     */
    @Deprecated
    public void setOperate(String Operate) {
        this.Operate = Operate;
    }

    public ParseDocRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ParseDocRequest(ParseDocRequest source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Url != null) {
            this.Url = new String(source.Url);
        }
        if (source.TaskId != null) {
            this.TaskId = new String(source.TaskId);
        }
        if (source.Policy != null) {
            this.Policy = new String(source.Policy);
        }
        if (source.Operate != null) {
            this.Operate = new String(source.Operate);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Url", this.Url);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "Policy", this.Policy);
        this.setParamSimple(map, prefix + "Operate", this.Operate);

    }
}

