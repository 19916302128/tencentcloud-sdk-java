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
package com.tencentcloudapi.emr.v20190103.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class LoadAutoScaleStrategy extends AbstractModel {

    /**
    * 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyId")
    @Expose
    private Long StrategyId;

    /**
    * 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyName")
    @Expose
    private String StrategyName;

    /**
    * 规则生效冷却时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CalmDownTime")
    @Expose
    private Long CalmDownTime;

    /**
    * 扩缩容动作，1表示扩容，2表示缩容。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleAction")
    @Expose
    private Long ScaleAction;

    /**
    * 每次规则生效时的扩缩容数量。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ScaleNum")
    @Expose
    private Long ScaleNum;

    /**
    * 扩缩容负载指标。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadMetrics")
    @Expose
    private String LoadMetrics;

    /**
    * 规则元数据记录ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MetricId")
    @Expose
    private Long MetricId;

    /**
    * 规则统计周期，提供300s,600s,900s
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StatisticPeriod")
    @Expose
    private Long StatisticPeriod;

    /**
    * 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ProcessMethod")
    @Expose
    private Long ProcessMethod;

    /**
    * 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
    */
    @SerializedName("TriggerThreshold")
    @Expose
    private Long TriggerThreshold;

    /**
    * 条件触发数组。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TriggerConditions")
    @Expose
    private TriggerConditions TriggerConditions;

    /**
    * 规则优先级，添加时无效，默认为自增。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Priority")
    @Expose
    private Long Priority;

    /**
    * 规则状态，1表示启动，3表示禁用。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("StrategyStatus")
    @Expose
    private Long StrategyStatus;

    /**
    * 规则扩容指定 yarn node label
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("YarnNodeLabel")
    @Expose
    private String YarnNodeLabel;

    /**
    * 规则生效的有效时间
    */
    @SerializedName("PeriodValid")
    @Expose
    private String PeriodValid;

    /**
    * 优雅缩容开关
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
    * 优雅缩容等待时间
    */
    @SerializedName("GraceDownTime")
    @Expose
    private Long GraceDownTime;

    /**
    * 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Tags")
    @Expose
    private Tag [] Tags;

    /**
    * 预设配置组
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ConfigGroupAssigned")
    @Expose
    private String ConfigGroupAssigned;

    /**
    * 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("MeasureMethod")
    @Expose
    private String MeasureMethod;

    /**
    * 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LoadMetricsConditions")
    @Expose
    private LoadMetricsConditions LoadMetricsConditions;

    /**
     * Get 规则ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyId 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyId() {
        return this.StrategyId;
    }

    /**
     * Set 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyId 规则ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyId(Long StrategyId) {
        this.StrategyId = StrategyId;
    }

    /**
     * Get 规则名称。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyName 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStrategyName() {
        return this.StrategyName;
    }

    /**
     * Set 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyName 规则名称。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyName(String StrategyName) {
        this.StrategyName = StrategyName;
    }

    /**
     * Get 规则生效冷却时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CalmDownTime 规则生效冷却时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCalmDownTime() {
        return this.CalmDownTime;
    }

    /**
     * Set 规则生效冷却时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param CalmDownTime 规则生效冷却时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCalmDownTime(Long CalmDownTime) {
        this.CalmDownTime = CalmDownTime;
    }

    /**
     * Get 扩缩容动作，1表示扩容，2表示缩容。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleAction 扩缩容动作，1表示扩容，2表示缩容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleAction() {
        return this.ScaleAction;
    }

    /**
     * Set 扩缩容动作，1表示扩容，2表示缩容。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleAction 扩缩容动作，1表示扩容，2表示缩容。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleAction(Long ScaleAction) {
        this.ScaleAction = ScaleAction;
    }

    /**
     * Get 每次规则生效时的扩缩容数量。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ScaleNum 每次规则生效时的扩缩容数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getScaleNum() {
        return this.ScaleNum;
    }

    /**
     * Set 每次规则生效时的扩缩容数量。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ScaleNum 每次规则生效时的扩缩容数量。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setScaleNum(Long ScaleNum) {
        this.ScaleNum = ScaleNum;
    }

    /**
     * Get 扩缩容负载指标。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadMetrics 扩缩容负载指标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLoadMetrics() {
        return this.LoadMetrics;
    }

    /**
     * Set 扩缩容负载指标。
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadMetrics 扩缩容负载指标。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadMetrics(String LoadMetrics) {
        this.LoadMetrics = LoadMetrics;
    }

    /**
     * Get 规则元数据记录ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MetricId 规则元数据记录ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getMetricId() {
        return this.MetricId;
    }

    /**
     * Set 规则元数据记录ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MetricId 规则元数据记录ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMetricId(Long MetricId) {
        this.MetricId = MetricId;
    }

    /**
     * Get 规则统计周期，提供300s,600s,900s
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StatisticPeriod 规则统计周期，提供300s,600s,900s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStatisticPeriod() {
        return this.StatisticPeriod;
    }

    /**
     * Set 规则统计周期，提供300s,600s,900s
注意：此字段可能返回 null，表示取不到有效值。
     * @param StatisticPeriod 规则统计周期，提供300s,600s,900s
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStatisticPeriod(Long StatisticPeriod) {
        this.StatisticPeriod = StatisticPeriod;
    }

    /**
     * Get 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ProcessMethod 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getProcessMethod() {
        return this.ProcessMethod;
    }

    /**
     * Set 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ProcessMethod 指标处理方法，1表示MAX，2表示MIN，3表示AVG。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setProcessMethod(Long ProcessMethod) {
        this.ProcessMethod = ProcessMethod;
    }

    /**
     * Get 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。 
     * @return TriggerThreshold 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
     */
    public Long getTriggerThreshold() {
        return this.TriggerThreshold;
    }

    /**
     * Set 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
     * @param TriggerThreshold 触发次数，当连续触发超过TriggerThreshold次后才开始扩缩容。
     */
    public void setTriggerThreshold(Long TriggerThreshold) {
        this.TriggerThreshold = TriggerThreshold;
    }

    /**
     * Get 条件触发数组。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TriggerConditions 条件触发数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public TriggerConditions getTriggerConditions() {
        return this.TriggerConditions;
    }

    /**
     * Set 条件触发数组。
注意：此字段可能返回 null，表示取不到有效值。
     * @param TriggerConditions 条件触发数组。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTriggerConditions(TriggerConditions TriggerConditions) {
        this.TriggerConditions = TriggerConditions;
    }

    /**
     * Get 规则优先级，添加时无效，默认为自增。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Priority 规则优先级，添加时无效，默认为自增。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getPriority() {
        return this.Priority;
    }

    /**
     * Set 规则优先级，添加时无效，默认为自增。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Priority 规则优先级，添加时无效，默认为自增。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setPriority(Long Priority) {
        this.Priority = Priority;
    }

    /**
     * Get 规则状态，1表示启动，3表示禁用。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return StrategyStatus 规则状态，1表示启动，3表示禁用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getStrategyStatus() {
        return this.StrategyStatus;
    }

    /**
     * Set 规则状态，1表示启动，3表示禁用。
注意：此字段可能返回 null，表示取不到有效值。
     * @param StrategyStatus 规则状态，1表示启动，3表示禁用。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStrategyStatus(Long StrategyStatus) {
        this.StrategyStatus = StrategyStatus;
    }

    /**
     * Get 规则扩容指定 yarn node label
注意：此字段可能返回 null，表示取不到有效值。 
     * @return YarnNodeLabel 规则扩容指定 yarn node label
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getYarnNodeLabel() {
        return this.YarnNodeLabel;
    }

    /**
     * Set 规则扩容指定 yarn node label
注意：此字段可能返回 null，表示取不到有效值。
     * @param YarnNodeLabel 规则扩容指定 yarn node label
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setYarnNodeLabel(String YarnNodeLabel) {
        this.YarnNodeLabel = YarnNodeLabel;
    }

    /**
     * Get 规则生效的有效时间 
     * @return PeriodValid 规则生效的有效时间
     */
    public String getPeriodValid() {
        return this.PeriodValid;
    }

    /**
     * Set 规则生效的有效时间
     * @param PeriodValid 规则生效的有效时间
     */
    public void setPeriodValid(String PeriodValid) {
        this.PeriodValid = PeriodValid;
    }

    /**
     * Get 优雅缩容开关 
     * @return GraceDownFlag 优雅缩容开关
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set 优雅缩容开关
     * @param GraceDownFlag 优雅缩容开关
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    /**
     * Get 优雅缩容等待时间 
     * @return GraceDownTime 优雅缩容等待时间
     */
    public Long getGraceDownTime() {
        return this.GraceDownTime;
    }

    /**
     * Set 优雅缩容等待时间
     * @param GraceDownTime 优雅缩容等待时间
     */
    public void setGraceDownTime(Long GraceDownTime) {
        this.GraceDownTime = GraceDownTime;
    }

    /**
     * Get 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Tags 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Tag [] getTags() {
        return this.Tags;
    }

    /**
     * Set 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
     * @param Tags 绑定标签列表
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTags(Tag [] Tags) {
        this.Tags = Tags;
    }

    /**
     * Get 预设配置组
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ConfigGroupAssigned 预设配置组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getConfigGroupAssigned() {
        return this.ConfigGroupAssigned;
    }

    /**
     * Set 预设配置组
注意：此字段可能返回 null，表示取不到有效值。
     * @param ConfigGroupAssigned 预设配置组
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setConfigGroupAssigned(String ConfigGroupAssigned) {
        this.ConfigGroupAssigned = ConfigGroupAssigned;
    }

    /**
     * Get 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return MeasureMethod 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getMeasureMethod() {
        return this.MeasureMethod;
    }

    /**
     * Set 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
注意：此字段可能返回 null，表示取不到有效值。
     * @param MeasureMethod 扩容资源计算方法，"DEFAULT","INSTANCE", "CPU", "MEMORYGB"。
"DEFAULT"表示默认方式，与"INSTANCE"意义相同。
"INSTANCE"表示按照节点计算，默认方式。
"CPU"表示按照机器的核数计算。
"MEMORYGB"表示按照机器内存数计算。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setMeasureMethod(String MeasureMethod) {
        this.MeasureMethod = MeasureMethod;
    }

    /**
     * Get 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LoadMetricsConditions 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public LoadMetricsConditions getLoadMetricsConditions() {
        return this.LoadMetricsConditions;
    }

    /**
     * Set 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     * @param LoadMetricsConditions 多指标触发条件
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLoadMetricsConditions(LoadMetricsConditions LoadMetricsConditions) {
        this.LoadMetricsConditions = LoadMetricsConditions;
    }

    public LoadAutoScaleStrategy() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public LoadAutoScaleStrategy(LoadAutoScaleStrategy source) {
        if (source.StrategyId != null) {
            this.StrategyId = new Long(source.StrategyId);
        }
        if (source.StrategyName != null) {
            this.StrategyName = new String(source.StrategyName);
        }
        if (source.CalmDownTime != null) {
            this.CalmDownTime = new Long(source.CalmDownTime);
        }
        if (source.ScaleAction != null) {
            this.ScaleAction = new Long(source.ScaleAction);
        }
        if (source.ScaleNum != null) {
            this.ScaleNum = new Long(source.ScaleNum);
        }
        if (source.LoadMetrics != null) {
            this.LoadMetrics = new String(source.LoadMetrics);
        }
        if (source.MetricId != null) {
            this.MetricId = new Long(source.MetricId);
        }
        if (source.StatisticPeriod != null) {
            this.StatisticPeriod = new Long(source.StatisticPeriod);
        }
        if (source.ProcessMethod != null) {
            this.ProcessMethod = new Long(source.ProcessMethod);
        }
        if (source.TriggerThreshold != null) {
            this.TriggerThreshold = new Long(source.TriggerThreshold);
        }
        if (source.TriggerConditions != null) {
            this.TriggerConditions = new TriggerConditions(source.TriggerConditions);
        }
        if (source.Priority != null) {
            this.Priority = new Long(source.Priority);
        }
        if (source.StrategyStatus != null) {
            this.StrategyStatus = new Long(source.StrategyStatus);
        }
        if (source.YarnNodeLabel != null) {
            this.YarnNodeLabel = new String(source.YarnNodeLabel);
        }
        if (source.PeriodValid != null) {
            this.PeriodValid = new String(source.PeriodValid);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
        if (source.GraceDownTime != null) {
            this.GraceDownTime = new Long(source.GraceDownTime);
        }
        if (source.Tags != null) {
            this.Tags = new Tag[source.Tags.length];
            for (int i = 0; i < source.Tags.length; i++) {
                this.Tags[i] = new Tag(source.Tags[i]);
            }
        }
        if (source.ConfigGroupAssigned != null) {
            this.ConfigGroupAssigned = new String(source.ConfigGroupAssigned);
        }
        if (source.MeasureMethod != null) {
            this.MeasureMethod = new String(source.MeasureMethod);
        }
        if (source.LoadMetricsConditions != null) {
            this.LoadMetricsConditions = new LoadMetricsConditions(source.LoadMetricsConditions);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "StrategyId", this.StrategyId);
        this.setParamSimple(map, prefix + "StrategyName", this.StrategyName);
        this.setParamSimple(map, prefix + "CalmDownTime", this.CalmDownTime);
        this.setParamSimple(map, prefix + "ScaleAction", this.ScaleAction);
        this.setParamSimple(map, prefix + "ScaleNum", this.ScaleNum);
        this.setParamSimple(map, prefix + "LoadMetrics", this.LoadMetrics);
        this.setParamSimple(map, prefix + "MetricId", this.MetricId);
        this.setParamSimple(map, prefix + "StatisticPeriod", this.StatisticPeriod);
        this.setParamSimple(map, prefix + "ProcessMethod", this.ProcessMethod);
        this.setParamSimple(map, prefix + "TriggerThreshold", this.TriggerThreshold);
        this.setParamObj(map, prefix + "TriggerConditions.", this.TriggerConditions);
        this.setParamSimple(map, prefix + "Priority", this.Priority);
        this.setParamSimple(map, prefix + "StrategyStatus", this.StrategyStatus);
        this.setParamSimple(map, prefix + "YarnNodeLabel", this.YarnNodeLabel);
        this.setParamSimple(map, prefix + "PeriodValid", this.PeriodValid);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);
        this.setParamSimple(map, prefix + "GraceDownTime", this.GraceDownTime);
        this.setParamArrayObj(map, prefix + "Tags.", this.Tags);
        this.setParamSimple(map, prefix + "ConfigGroupAssigned", this.ConfigGroupAssigned);
        this.setParamSimple(map, prefix + "MeasureMethod", this.MeasureMethod);
        this.setParamObj(map, prefix + "LoadMetricsConditions.", this.LoadMetricsConditions);

    }
}

