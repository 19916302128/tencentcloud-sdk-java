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

public class AutoScaleResourceConf extends AbstractModel {

    /**
    * 配置ID。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 集群实例ID。
    */
    @SerializedName("ClusterId")
    @Expose
    private Long ClusterId;

    /**
    * 自动扩缩容保留最小实例数。
    */
    @SerializedName("ScaleLowerBound")
    @Expose
    private Long ScaleLowerBound;

    /**
    * 自动扩缩容最大实例数。
    */
    @SerializedName("ScaleUpperBound")
    @Expose
    private Long ScaleUpperBound;

    /**
    * 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
    */
    @SerializedName("StrategyType")
    @Expose
    private Long StrategyType;

    /**
    * 下次能可扩容时间。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("NextTimeCanScale")
    @Expose
    private Long NextTimeCanScale;

    /**
    * 优雅缩容开关
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("GraceDownFlag")
    @Expose
    private Boolean GraceDownFlag;

    /**
     * Get 配置ID。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id 配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id 配置ID。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 集群实例ID。 
     * @return ClusterId 集群实例ID。
     */
    public Long getClusterId() {
        return this.ClusterId;
    }

    /**
     * Set 集群实例ID。
     * @param ClusterId 集群实例ID。
     */
    public void setClusterId(Long ClusterId) {
        this.ClusterId = ClusterId;
    }

    /**
     * Get 自动扩缩容保留最小实例数。 
     * @return ScaleLowerBound 自动扩缩容保留最小实例数。
     */
    public Long getScaleLowerBound() {
        return this.ScaleLowerBound;
    }

    /**
     * Set 自动扩缩容保留最小实例数。
     * @param ScaleLowerBound 自动扩缩容保留最小实例数。
     */
    public void setScaleLowerBound(Long ScaleLowerBound) {
        this.ScaleLowerBound = ScaleLowerBound;
    }

    /**
     * Get 自动扩缩容最大实例数。 
     * @return ScaleUpperBound 自动扩缩容最大实例数。
     */
    public Long getScaleUpperBound() {
        return this.ScaleUpperBound;
    }

    /**
     * Set 自动扩缩容最大实例数。
     * @param ScaleUpperBound 自动扩缩容最大实例数。
     */
    public void setScaleUpperBound(Long ScaleUpperBound) {
        this.ScaleUpperBound = ScaleUpperBound;
    }

    /**
     * Get 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则 
     * @return StrategyType 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
     */
    public Long getStrategyType() {
        return this.StrategyType;
    }

    /**
     * Set 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
     * @param StrategyType 扩容规则类型，1为按负载指标扩容规则，2为按时间扩容规则
     */
    public void setStrategyType(Long StrategyType) {
        this.StrategyType = StrategyType;
    }

    /**
     * Get 下次能可扩容时间。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return NextTimeCanScale 下次能可扩容时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getNextTimeCanScale() {
        return this.NextTimeCanScale;
    }

    /**
     * Set 下次能可扩容时间。
注意：此字段可能返回 null，表示取不到有效值。
     * @param NextTimeCanScale 下次能可扩容时间。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setNextTimeCanScale(Long NextTimeCanScale) {
        this.NextTimeCanScale = NextTimeCanScale;
    }

    /**
     * Get 优雅缩容开关
注意：此字段可能返回 null，表示取不到有效值。 
     * @return GraceDownFlag 优雅缩容开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Boolean getGraceDownFlag() {
        return this.GraceDownFlag;
    }

    /**
     * Set 优雅缩容开关
注意：此字段可能返回 null，表示取不到有效值。
     * @param GraceDownFlag 优雅缩容开关
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGraceDownFlag(Boolean GraceDownFlag) {
        this.GraceDownFlag = GraceDownFlag;
    }

    public AutoScaleResourceConf() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public AutoScaleResourceConf(AutoScaleResourceConf source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.ClusterId != null) {
            this.ClusterId = new Long(source.ClusterId);
        }
        if (source.ScaleLowerBound != null) {
            this.ScaleLowerBound = new Long(source.ScaleLowerBound);
        }
        if (source.ScaleUpperBound != null) {
            this.ScaleUpperBound = new Long(source.ScaleUpperBound);
        }
        if (source.StrategyType != null) {
            this.StrategyType = new Long(source.StrategyType);
        }
        if (source.NextTimeCanScale != null) {
            this.NextTimeCanScale = new Long(source.NextTimeCanScale);
        }
        if (source.GraceDownFlag != null) {
            this.GraceDownFlag = new Boolean(source.GraceDownFlag);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "ClusterId", this.ClusterId);
        this.setParamSimple(map, prefix + "ScaleLowerBound", this.ScaleLowerBound);
        this.setParamSimple(map, prefix + "ScaleUpperBound", this.ScaleUpperBound);
        this.setParamSimple(map, prefix + "StrategyType", this.StrategyType);
        this.setParamSimple(map, prefix + "NextTimeCanScale", this.NextTimeCanScale);
        this.setParamSimple(map, prefix + "GraceDownFlag", this.GraceDownFlag);

    }
}

