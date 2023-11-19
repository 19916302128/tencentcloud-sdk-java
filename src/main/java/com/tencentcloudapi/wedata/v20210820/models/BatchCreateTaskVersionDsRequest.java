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
package com.tencentcloudapi.wedata.v20210820.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class BatchCreateTaskVersionDsRequest extends AbstractModel {

    /**
    * 任务版本信息
    */
    @SerializedName("TaskVersionDTOs")
    @Expose
    private BatchCreateTaskVersionDsDTOLite [] TaskVersionDTOs;

    /**
    * 项目ID
    */
    @SerializedName("ProjectId")
    @Expose
    private String ProjectId;

    /**
    * 是否自动运行
    */
    @SerializedName("AutoRun")
    @Expose
    private Boolean AutoRun;

    /**
    * 告警方式:email-邮件;sms-短信;wecom-企业微信
    */
    @SerializedName("AlarmWays")
    @Expose
    private String AlarmWays;

    /**
    * 告警对象:1-项目管理员，2-任务责任人
    */
    @SerializedName("AlarmRecipientTypes")
    @Expose
    private String AlarmRecipientTypes;

    /**
     * Get 任务版本信息 
     * @return TaskVersionDTOs 任务版本信息
     */
    public BatchCreateTaskVersionDsDTOLite [] getTaskVersionDTOs() {
        return this.TaskVersionDTOs;
    }

    /**
     * Set 任务版本信息
     * @param TaskVersionDTOs 任务版本信息
     */
    public void setTaskVersionDTOs(BatchCreateTaskVersionDsDTOLite [] TaskVersionDTOs) {
        this.TaskVersionDTOs = TaskVersionDTOs;
    }

    /**
     * Get 项目ID 
     * @return ProjectId 项目ID
     */
    public String getProjectId() {
        return this.ProjectId;
    }

    /**
     * Set 项目ID
     * @param ProjectId 项目ID
     */
    public void setProjectId(String ProjectId) {
        this.ProjectId = ProjectId;
    }

    /**
     * Get 是否自动运行 
     * @return AutoRun 是否自动运行
     */
    public Boolean getAutoRun() {
        return this.AutoRun;
    }

    /**
     * Set 是否自动运行
     * @param AutoRun 是否自动运行
     */
    public void setAutoRun(Boolean AutoRun) {
        this.AutoRun = AutoRun;
    }

    /**
     * Get 告警方式:email-邮件;sms-短信;wecom-企业微信 
     * @return AlarmWays 告警方式:email-邮件;sms-短信;wecom-企业微信
     */
    public String getAlarmWays() {
        return this.AlarmWays;
    }

    /**
     * Set 告警方式:email-邮件;sms-短信;wecom-企业微信
     * @param AlarmWays 告警方式:email-邮件;sms-短信;wecom-企业微信
     */
    public void setAlarmWays(String AlarmWays) {
        this.AlarmWays = AlarmWays;
    }

    /**
     * Get 告警对象:1-项目管理员，2-任务责任人 
     * @return AlarmRecipientTypes 告警对象:1-项目管理员，2-任务责任人
     */
    public String getAlarmRecipientTypes() {
        return this.AlarmRecipientTypes;
    }

    /**
     * Set 告警对象:1-项目管理员，2-任务责任人
     * @param AlarmRecipientTypes 告警对象:1-项目管理员，2-任务责任人
     */
    public void setAlarmRecipientTypes(String AlarmRecipientTypes) {
        this.AlarmRecipientTypes = AlarmRecipientTypes;
    }

    public BatchCreateTaskVersionDsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public BatchCreateTaskVersionDsRequest(BatchCreateTaskVersionDsRequest source) {
        if (source.TaskVersionDTOs != null) {
            this.TaskVersionDTOs = new BatchCreateTaskVersionDsDTOLite[source.TaskVersionDTOs.length];
            for (int i = 0; i < source.TaskVersionDTOs.length; i++) {
                this.TaskVersionDTOs[i] = new BatchCreateTaskVersionDsDTOLite(source.TaskVersionDTOs[i]);
            }
        }
        if (source.ProjectId != null) {
            this.ProjectId = new String(source.ProjectId);
        }
        if (source.AutoRun != null) {
            this.AutoRun = new Boolean(source.AutoRun);
        }
        if (source.AlarmWays != null) {
            this.AlarmWays = new String(source.AlarmWays);
        }
        if (source.AlarmRecipientTypes != null) {
            this.AlarmRecipientTypes = new String(source.AlarmRecipientTypes);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamArrayObj(map, prefix + "TaskVersionDTOs.", this.TaskVersionDTOs);
        this.setParamSimple(map, prefix + "ProjectId", this.ProjectId);
        this.setParamSimple(map, prefix + "AutoRun", this.AutoRun);
        this.setParamSimple(map, prefix + "AlarmWays", this.AlarmWays);
        this.setParamSimple(map, prefix + "AlarmRecipientTypes", this.AlarmRecipientTypes);

    }
}

