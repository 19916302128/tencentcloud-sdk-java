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

public class ESTaskResultDetail extends AbstractModel{

    /**
    * id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 任务id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("TaskId")
    @Expose
    private Long TaskId;

    /**
    * 字段名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FieldName")
    @Expose
    private String FieldName;

    /**
    * 规则id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 分类id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 分类名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryName")
    @Expose
    private String CategoryName;

    /**
    * 多级分类的路径
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("CategoryArr")
    @Expose
    private String [] CategoryArr;

    /**
    * 分级id
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 分级名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
     * Get id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set id
注意：此字段可能返回 null，表示取不到有效值。
     * @param Id id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 任务id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getTaskId() {
        return this.TaskId;
    }

    /**
     * Set 任务id
注意：此字段可能返回 null，表示取不到有效值。
     * @param TaskId 任务id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setTaskId(Long TaskId) {
        this.TaskId = TaskId;
    }

    /**
     * Get 字段名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FieldName 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFieldName() {
        return this.FieldName;
    }

    /**
     * Set 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param FieldName 字段名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFieldName(String FieldName) {
        this.FieldName = FieldName;
    }

    /**
     * Get 规则id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleId 规则id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param RuleName 规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 分类id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryId 分类id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类id
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryId 分类id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 分类名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryName 分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCategoryName() {
        return this.CategoryName;
    }

    /**
     * Set 分类名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryName 分类名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryName(String CategoryName) {
        this.CategoryName = CategoryName;
    }

    /**
     * Get 多级分类的路径
注意：此字段可能返回 null，表示取不到有效值。 
     * @return CategoryArr 多级分类的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String [] getCategoryArr() {
        return this.CategoryArr;
    }

    /**
     * Set 多级分类的路径
注意：此字段可能返回 null，表示取不到有效值。
     * @param CategoryArr 多级分类的路径
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCategoryArr(String [] CategoryArr) {
        this.CategoryArr = CategoryArr;
    }

    /**
     * Get 分级id
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelId 分级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 分级id
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelId 分级id
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 分级名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return LevelName 分级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 分级名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param LevelName 分级名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    public ESTaskResultDetail() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ESTaskResultDetail(ESTaskResultDetail source) {
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.TaskId != null) {
            this.TaskId = new Long(source.TaskId);
        }
        if (source.FieldName != null) {
            this.FieldName = new String(source.FieldName);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.CategoryName != null) {
            this.CategoryName = new String(source.CategoryName);
        }
        if (source.CategoryArr != null) {
            this.CategoryArr = new String[source.CategoryArr.length];
            for (int i = 0; i < source.CategoryArr.length; i++) {
                this.CategoryArr[i] = new String(source.CategoryArr[i]);
            }
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "TaskId", this.TaskId);
        this.setParamSimple(map, prefix + "FieldName", this.FieldName);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "CategoryName", this.CategoryName);
        this.setParamArraySimple(map, prefix + "CategoryArr.", this.CategoryArr);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);

    }
}

