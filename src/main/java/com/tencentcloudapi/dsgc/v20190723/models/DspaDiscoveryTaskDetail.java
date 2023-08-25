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
package com.tencentcloudapi.dsgc.v20190723.models;

import com.tencentcloudapi.common.AbstractModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class DspaDiscoveryTaskDetail extends AbstractModel{

    /**
    * 任务名称
    */
    @SerializedName("Name")
    @Expose
    private String Name;

    /**
    * 任务描述
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Description")
    @Expose
    private String Description;

    /**
    * 执行周期，0单次 1每天 2每周 3每月
    */
    @SerializedName("Period")
    @Expose
    private Long Period;

    /**
    * 执行计划，0立即 1定时
    */
    @SerializedName("Plan")
    @Expose
    private Long Plan;

    /**
    * 任务开关；1 打开，0 关闭
    */
    @SerializedName("Enable")
    @Expose
    private Long Enable;

    /**
    * 元数据对象信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DataSourceInfo")
    @Expose
    private DspaDiscoveryTaskDataSource DataSourceInfo;

    /**
    * 通用规则集开关，0 关闭，1 启用
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GeneralRuleSetEnable")
    @Expose
    private Long GeneralRuleSetEnable;

    /**
    * 当创建任务时，用户打开了通用规则集开关，则该字段就会保存默认合规组信息
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("DefaultComplianceInfo")
    @Expose
    private ScanTaskComplianceInfo [] DefaultComplianceInfo;

    /**
    * 该任务中用户选择的合规组信息列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CustomComplianceInfo")
    @Expose
    private ScanTaskComplianceInfo [] CustomComplianceInfo;

    /**
    * 定时开始时间
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TimingStartTime")
    @Expose
    private String TimingStartTime;

    /**
     * Get 任务名称 
     * @return Name 任务名称
     */
    public String getName() {
        return this.Name;
    }

    /**
     * Set 任务名称
     * @param Name 任务名称
     */
    public void setName(String Name) {
        this.Name = Name;
    }

    /**
     * Get 任务描述
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getDescription() {
        return this.Description;
    }

    /**
     * Set 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     * @param Description 任务描述
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDescription(String Description) {
        this.Description = Description;
    }

    /**
     * Get 执行周期，0单次 1每天 2每周 3每月 
     * @return Period 执行周期，0单次 1每天 2每周 3每月
     */
    public Long getPeriod() {
        return this.Period;
    }

    /**
     * Set 执行周期，0单次 1每天 2每周 3每月
     * @param Period 执行周期，0单次 1每天 2每周 3每月
     */
    public void setPeriod(Long Period) {
        this.Period = Period;
    }

    /**
     * Get 执行计划，0立即 1定时 
     * @return Plan 执行计划，0立即 1定时
     */
    public Long getPlan() {
        return this.Plan;
    }

    /**
     * Set 执行计划，0立即 1定时
     * @param Plan 执行计划，0立即 1定时
     */
    public void setPlan(Long Plan) {
        this.Plan = Plan;
    }

    /**
     * Get 任务开关；1 打开，0 关闭 
     * @return Enable 任务开关；1 打开，0 关闭
     */
    public Long getEnable() {
        return this.Enable;
    }

    /**
     * Set 任务开关；1 打开，0 关闭
     * @param Enable 任务开关；1 打开，0 关闭
     */
    public void setEnable(Long Enable) {
        this.Enable = Enable;
    }

    /**
     * Get 元数据对象信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DataSourceInfo 元数据对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public DspaDiscoveryTaskDataSource getDataSourceInfo() {
        return this.DataSourceInfo;
    }

    /**
     * Set 元数据对象信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DataSourceInfo 元数据对象信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDataSourceInfo(DspaDiscoveryTaskDataSource DataSourceInfo) {
        this.DataSourceInfo = DataSourceInfo;
    }

    /**
     * Get 通用规则集开关，0 关闭，1 启用
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GeneralRuleSetEnable 通用规则集开关，0 关闭，1 启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGeneralRuleSetEnable() {
        return this.GeneralRuleSetEnable;
    }

    /**
     * Set 通用规则集开关，0 关闭，1 启用
注意：此字段可能返回 null，表示取不到有效值。
     * @param GeneralRuleSetEnable 通用规则集开关，0 关闭，1 启用
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGeneralRuleSetEnable(Long GeneralRuleSetEnable) {
        this.GeneralRuleSetEnable = GeneralRuleSetEnable;
    }

    /**
     * Get 当创建任务时，用户打开了通用规则集开关，则该字段就会保存默认合规组信息
注意：此字段可能返回 null，表示取不到有效值。 
     * @return DefaultComplianceInfo 当创建任务时，用户打开了通用规则集开关，则该字段就会保存默认合规组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScanTaskComplianceInfo [] getDefaultComplianceInfo() {
        return this.DefaultComplianceInfo;
    }

    /**
     * Set 当创建任务时，用户打开了通用规则集开关，则该字段就会保存默认合规组信息
注意：此字段可能返回 null，表示取不到有效值。
     * @param DefaultComplianceInfo 当创建任务时，用户打开了通用规则集开关，则该字段就会保存默认合规组信息
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setDefaultComplianceInfo(ScanTaskComplianceInfo [] DefaultComplianceInfo) {
        this.DefaultComplianceInfo = DefaultComplianceInfo;
    }

    /**
     * Get 该任务中用户选择的合规组信息列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CustomComplianceInfo 该任务中用户选择的合规组信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public ScanTaskComplianceInfo [] getCustomComplianceInfo() {
        return this.CustomComplianceInfo;
    }

    /**
     * Set 该任务中用户选择的合规组信息列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param CustomComplianceInfo 该任务中用户选择的合规组信息列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCustomComplianceInfo(ScanTaskComplianceInfo [] CustomComplianceInfo) {
        this.CustomComplianceInfo = CustomComplianceInfo;
    }

    /**
     * Get 定时开始时间
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TimingStartTime 定时开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getTimingStartTime() {
        return this.TimingStartTime;
    }

    /**
     * Set 定时开始时间
注意：此字段可能返回 null，表示取不到有效值。
     * @param TimingStartTime 定时开始时间
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTimingStartTime(String TimingStartTime) {
        this.TimingStartTime = TimingStartTime;
    }

    public DspaDiscoveryTaskDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public DspaDiscoveryTaskDetail(DspaDiscoveryTaskDetail source) {
        if (source.Name != null) {
            this.Name = new String(source.Name);
        }
        if (source.Description != null) {
            this.Description = new String(source.Description);
        }
        if (source.Period != null) {
            this.Period = new Long(source.Period);
        }
        if (source.Plan != null) {
            this.Plan = new Long(source.Plan);
        }
        if (source.Enable != null) {
            this.Enable = new Long(source.Enable);
        }
        if (source.DataSourceInfo != null) {
            this.DataSourceInfo = new DspaDiscoveryTaskDataSource(source.DataSourceInfo);
        }
        if (source.GeneralRuleSetEnable != null) {
            this.GeneralRuleSetEnable = new Long(source.GeneralRuleSetEnable);
        }
        if (source.DefaultComplianceInfo != null) {
            this.DefaultComplianceInfo = new ScanTaskComplianceInfo[source.DefaultComplianceInfo.length];
            for (int i = 0; i < source.DefaultComplianceInfo.length; i++) {
                this.DefaultComplianceInfo[i] = new ScanTaskComplianceInfo(source.DefaultComplianceInfo[i]);
            }
        }
        if (source.CustomComplianceInfo != null) {
            this.CustomComplianceInfo = new ScanTaskComplianceInfo[source.CustomComplianceInfo.length];
            for (int i = 0; i < source.CustomComplianceInfo.length; i++) {
                this.CustomComplianceInfo[i] = new ScanTaskComplianceInfo(source.CustomComplianceInfo[i]);
            }
        }
        if (source.TimingStartTime != null) {
            this.TimingStartTime = new String(source.TimingStartTime);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Name", this.Name);
        this.setParamSimple(map, prefix + "Description", this.Description);
        this.setParamSimple(map, prefix + "Period", this.Period);
        this.setParamSimple(map, prefix + "Plan", this.Plan);
        this.setParamSimple(map, prefix + "Enable", this.Enable);
        this.setParamObj(map, prefix + "DataSourceInfo.", this.DataSourceInfo);
        this.setParamSimple(map, prefix + "GeneralRuleSetEnable", this.GeneralRuleSetEnable);
        this.setParamArrayObj(map, prefix + "DefaultComplianceInfo.", this.DefaultComplianceInfo);
        this.setParamArrayObj(map, prefix + "CustomComplianceInfo.", this.CustomComplianceInfo);
        this.setParamSimple(map, prefix + "TimingStartTime", this.TimingStartTime);

    }
}

