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

public class CategoryRule extends AbstractModel{

    /**
    * 分类id
    */
    @SerializedName("CategoryId")
    @Expose
    private Long CategoryId;

    /**
    * 规则id
    */
    @SerializedName("RuleId")
    @Expose
    private Long RuleId;

    /**
    * 规则名称
    */
    @SerializedName("RuleName")
    @Expose
    private String RuleName;

    /**
    * 级别id
    */
    @SerializedName("LevelId")
    @Expose
    private Long LevelId;

    /**
    * 级别名称
    */
    @SerializedName("LevelName")
    @Expose
    private String LevelName;

    /**
    * 分类规则绑定关系id
    */
    @SerializedName("Id")
    @Expose
    private Long Id;

    /**
    * 别名ID
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasRuleId")
    @Expose
    private Long AliasRuleId;

    /**
    * 别名规则名称
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("AliasRuleName")
    @Expose
    private String AliasRuleName;

    /**
     * Get 分类id 
     * @return CategoryId 分类id
     */
    public Long getCategoryId() {
        return this.CategoryId;
    }

    /**
     * Set 分类id
     * @param CategoryId 分类id
     */
    public void setCategoryId(Long CategoryId) {
        this.CategoryId = CategoryId;
    }

    /**
     * Get 规则id 
     * @return RuleId 规则id
     */
    public Long getRuleId() {
        return this.RuleId;
    }

    /**
     * Set 规则id
     * @param RuleId 规则id
     */
    public void setRuleId(Long RuleId) {
        this.RuleId = RuleId;
    }

    /**
     * Get 规则名称 
     * @return RuleName 规则名称
     */
    public String getRuleName() {
        return this.RuleName;
    }

    /**
     * Set 规则名称
     * @param RuleName 规则名称
     */
    public void setRuleName(String RuleName) {
        this.RuleName = RuleName;
    }

    /**
     * Get 级别id 
     * @return LevelId 级别id
     */
    public Long getLevelId() {
        return this.LevelId;
    }

    /**
     * Set 级别id
     * @param LevelId 级别id
     */
    public void setLevelId(Long LevelId) {
        this.LevelId = LevelId;
    }

    /**
     * Get 级别名称 
     * @return LevelName 级别名称
     */
    public String getLevelName() {
        return this.LevelName;
    }

    /**
     * Set 级别名称
     * @param LevelName 级别名称
     */
    public void setLevelName(String LevelName) {
        this.LevelName = LevelName;
    }

    /**
     * Get 分类规则绑定关系id 
     * @return Id 分类规则绑定关系id
     */
    public Long getId() {
        return this.Id;
    }

    /**
     * Set 分类规则绑定关系id
     * @param Id 分类规则绑定关系id
     */
    public void setId(Long Id) {
        this.Id = Id;
    }

    /**
     * Get 别名ID
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasRuleId 别名ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getAliasRuleId() {
        return this.AliasRuleId;
    }

    /**
     * Set 别名ID
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasRuleId 别名ID
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasRuleId(Long AliasRuleId) {
        this.AliasRuleId = AliasRuleId;
    }

    /**
     * Get 别名规则名称
注意：此字段可能返回 null，表示取不到有效值。 
     * @return AliasRuleName 别名规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getAliasRuleName() {
        return this.AliasRuleName;
    }

    /**
     * Set 别名规则名称
注意：此字段可能返回 null，表示取不到有效值。
     * @param AliasRuleName 别名规则名称
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setAliasRuleName(String AliasRuleName) {
        this.AliasRuleName = AliasRuleName;
    }

    public CategoryRule() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public CategoryRule(CategoryRule source) {
        if (source.CategoryId != null) {
            this.CategoryId = new Long(source.CategoryId);
        }
        if (source.RuleId != null) {
            this.RuleId = new Long(source.RuleId);
        }
        if (source.RuleName != null) {
            this.RuleName = new String(source.RuleName);
        }
        if (source.LevelId != null) {
            this.LevelId = new Long(source.LevelId);
        }
        if (source.LevelName != null) {
            this.LevelName = new String(source.LevelName);
        }
        if (source.Id != null) {
            this.Id = new Long(source.Id);
        }
        if (source.AliasRuleId != null) {
            this.AliasRuleId = new Long(source.AliasRuleId);
        }
        if (source.AliasRuleName != null) {
            this.AliasRuleName = new String(source.AliasRuleName);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "CategoryId", this.CategoryId);
        this.setParamSimple(map, prefix + "RuleId", this.RuleId);
        this.setParamSimple(map, prefix + "RuleName", this.RuleName);
        this.setParamSimple(map, prefix + "LevelId", this.LevelId);
        this.setParamSimple(map, prefix + "LevelName", this.LevelName);
        this.setParamSimple(map, prefix + "Id", this.Id);
        this.setParamSimple(map, prefix + "AliasRuleId", this.AliasRuleId);
        this.setParamSimple(map, prefix + "AliasRuleName", this.AliasRuleName);

    }
}

