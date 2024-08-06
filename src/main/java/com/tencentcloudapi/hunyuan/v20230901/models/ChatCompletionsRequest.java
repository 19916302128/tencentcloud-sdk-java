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
package com.tencentcloudapi.hunyuan.v20230901.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class ChatCompletionsRequest extends AbstractModel {

    /**
    * 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
    */
    @SerializedName("Model")
    @Expose
    private String Model;

    /**
    * 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant、 tool。
其中，system 角色可选，如存在则必须位于列表的最开始。user（tool） 和 assistant 需交替出现（一问一答），以 user 提问开始，user（tool）提问结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不能超过模型输入长度上限（可参考 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 文档），超过则会截断最前面的内容，只保留尾部内容。
    */
    @SerializedName("Messages")
    @Expose
    private Message [] Messages;

    /**
    * 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
    */
    @SerializedName("Stream")
    @Expose
    private Boolean Stream;

    /**
    * 流式输出审核开关。
说明：
1. 当使用流式输出（Stream 字段值为 true）时，该字段生效。
2. 输出审核有流式和同步两种模式，**流式模式首包响应更快**。未传值时默认为流式模式（true）。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 FinishReason 值为 sensitive。
4. 如果值为 false，则不使用流式输出审核，需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
    */
    @SerializedName("StreamModeration")
    @Expose
    private Boolean StreamModeration;

    /**
    * 说明：
1. 影响输出文本的多样性，取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
    */
    @SerializedName("TopP")
    @Expose
    private Float TopP;

    /**
    * 说明：
1. 影响模型输出多样性，取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
    */
    @SerializedName("Temperature")
    @Expose
    private Float Temperature;

    /**
    * 功能增强（如搜索）开关。
说明：
1. hunyuan-lite 无功能增强（如搜索）能力，该参数对 hunyuan-lite 版本不生效。
2. 未传值时默认打开开关。
3. 关闭时将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延尤为明显）。但在少数场景里，回复效果可能会下降。
4. 安全审核能力不属于功能增强范围，不受此字段影响。
    */
    @SerializedName("EnableEnhancement")
    @Expose
    private Boolean EnableEnhancement;

    /**
    * 可调用的工具列表，仅对 hunyuan-functioncall 模型生效。
    */
    @SerializedName("Tools")
    @Expose
    private Tool [] Tools;

    /**
    * 工具使用选项，可选值包括 none、auto、custom。
说明：
1. 仅对 hunyuan-functioncall 模型生效。
2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。
3. 未设置时，默认值为auto
    */
    @SerializedName("ToolChoice")
    @Expose
    private String ToolChoice;

    /**
    * 强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填
    */
    @SerializedName("CustomTool")
    @Expose
    private Tool CustomTool;

    /**
    * 默认是false，在值为true且命中搜索时，接口会返回SearchInfo
    */
    @SerializedName("SearchInfo")
    @Expose
    private Boolean SearchInfo;

    /**
    * 搜索引文角标开关。
说明：
1. 配合EnableEnhancement和SearchInfo参数使用。打开后，回答中命中搜索的结果会在片段后增加角标标志，对应SearchInfo列表中的链接。
2. false：开关关闭，true：开关打开。
3. 未传值时默认开关关闭（false）。
    */
    @SerializedName("Citation")
    @Expose
    private Boolean Citation;

    /**
     * Get 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。 
     * @return Model 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     */
    public String getModel() {
        return this.Model;
    }

    /**
     * Set 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     * @param Model 模型名称，可选值包括 hunyuan-lite、hunyuan-standard、hunyuan-standard-256K、hunyuan-pro、 hunyuan-code、 hunyuan-role、 hunyuan-functioncall、 hunyuan-vision。
各模型介绍请阅读 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 中的说明。

注意：
不同的模型计费不同，请根据 [购买指南](https://cloud.tencent.com/document/product/1729/97731) 按需调用。
     */
    public void setModel(String Model) {
        this.Model = Model;
    }

    /**
     * Get 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant、 tool。
其中，system 角色可选，如存在则必须位于列表的最开始。user（tool） 和 assistant 需交替出现（一问一答），以 user 提问开始，user（tool）提问结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不能超过模型输入长度上限（可参考 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 文档），超过则会截断最前面的内容，只保留尾部内容。 
     * @return Messages 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant、 tool。
其中，system 角色可选，如存在则必须位于列表的最开始。user（tool） 和 assistant 需交替出现（一问一答），以 user 提问开始，user（tool）提问结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不能超过模型输入长度上限（可参考 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 文档），超过则会截断最前面的内容，只保留尾部内容。
     */
    public Message [] getMessages() {
        return this.Messages;
    }

    /**
     * Set 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant、 tool。
其中，system 角色可选，如存在则必须位于列表的最开始。user（tool） 和 assistant 需交替出现（一问一答），以 user 提问开始，user（tool）提问结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不能超过模型输入长度上限（可参考 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 文档），超过则会截断最前面的内容，只保留尾部内容。
     * @param Messages 聊天上下文信息。
说明：
1. 长度最多为 40，按对话时间从旧到新在数组中排列。
2. Message.Role 可选值：system、user、assistant、 tool。
其中，system 角色可选，如存在则必须位于列表的最开始。user（tool） 和 assistant 需交替出现（一问一答），以 user 提问开始，user（tool）提问结束，且 Content 不能为空。Role 的顺序示例：[system（可选） user assistant user assistant user ...]。
3. Messages 中 Content 总长度不能超过模型输入长度上限（可参考 [产品概述](https://cloud.tencent.com/document/product/1729/104753) 文档），超过则会截断最前面的内容，只保留尾部内容。
     */
    public void setMessages(Message [] Messages) {
        this.Messages = Messages;
    }

    /**
     * Get 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。 
     * @return Stream 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
     */
    public Boolean getStream() {
        return this.Stream;
    }

    /**
     * Set 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
     * @param Stream 流式调用开关。
说明：
1. 未传值时默认为非流式调用（false）。
2. 流式调用时以 SSE 协议增量返回结果（返回值取 Choices[n].Delta 中的值，需要拼接增量数据才能获得完整结果）。
3. 非流式调用时：
调用方式与普通 HTTP 请求无异。
接口响应耗时较长，**如需更低时延建议设置为 true**。
只返回一次最终结果（返回值取 Choices[n].Message 中的值）。

注意：
通过 SDK 调用时，流式和非流式调用需用**不同的方式**获取返回值，具体参考 SDK 中的注释或示例（在各语言 SDK 代码仓库的 examples/hunyuan/v20230901/ 目录中）。
     */
    public void setStream(Boolean Stream) {
        this.Stream = Stream;
    }

    /**
     * Get 流式输出审核开关。
说明：
1. 当使用流式输出（Stream 字段值为 true）时，该字段生效。
2. 输出审核有流式和同步两种模式，**流式模式首包响应更快**。未传值时默认为流式模式（true）。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 FinishReason 值为 sensitive。
4. 如果值为 false，则不使用流式输出审核，需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。 
     * @return StreamModeration 流式输出审核开关。
说明：
1. 当使用流式输出（Stream 字段值为 true）时，该字段生效。
2. 输出审核有流式和同步两种模式，**流式模式首包响应更快**。未传值时默认为流式模式（true）。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 FinishReason 值为 sensitive。
4. 如果值为 false，则不使用流式输出审核，需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
     */
    public Boolean getStreamModeration() {
        return this.StreamModeration;
    }

    /**
     * Set 流式输出审核开关。
说明：
1. 当使用流式输出（Stream 字段值为 true）时，该字段生效。
2. 输出审核有流式和同步两种模式，**流式模式首包响应更快**。未传值时默认为流式模式（true）。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 FinishReason 值为 sensitive。
4. 如果值为 false，则不使用流式输出审核，需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
     * @param StreamModeration 流式输出审核开关。
说明：
1. 当使用流式输出（Stream 字段值为 true）时，该字段生效。
2. 输出审核有流式和同步两种模式，**流式模式首包响应更快**。未传值时默认为流式模式（true）。
3. 如果值为 true，将对输出内容进行分段审核，审核通过的内容流式输出返回。如果出现审核不过，响应中的 FinishReason 值为 sensitive。
4. 如果值为 false，则不使用流式输出审核，需要审核完所有输出内容后再返回结果。

注意：
当选择流式输出审核时，可能会出现部分内容已输出，但中间某一段响应中的 FinishReason 值为 sensitive，此时说明安全审核未通过。如果业务场景有实时文字上屏的需求，需要自行撤回已上屏的内容，并建议自定义替换为一条提示语，如 “这个问题我不方便回答，不如我们换个话题试试”，以保障终端体验。
     */
    public void setStreamModeration(Boolean StreamModeration) {
        this.StreamModeration = StreamModeration;
    }

    /**
     * Get 说明：
1. 影响输出文本的多样性，取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。 
     * @return TopP 说明：
1. 影响输出文本的多样性，取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
     */
    public Float getTopP() {
        return this.TopP;
    }

    /**
     * Set 说明：
1. 影响输出文本的多样性，取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
     * @param TopP 说明：
1. 影响输出文本的多样性，取值区间为 [0.0, 1.0]。取值越大，生成文本的多样性越强。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
     */
    public void setTopP(Float TopP) {
        this.TopP = TopP;
    }

    /**
     * Get 说明：
1. 影响模型输出多样性，取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。 
     * @return Temperature 说明：
1. 影响模型输出多样性，取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
     */
    public Float getTemperature() {
        return this.Temperature;
    }

    /**
     * Set 说明：
1. 影响模型输出多样性，取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
     * @param Temperature 说明：
1. 影响模型输出多样性，取值区间为 [0.0, 2.0]。较高的数值会使输出更加多样化和不可预测，而较低的数值会使其更加集中和确定。
2. 模型已有默认参数，不传值时使用各模型推荐值，不推荐用户修改。
     */
    public void setTemperature(Float Temperature) {
        this.Temperature = Temperature;
    }

    /**
     * Get 功能增强（如搜索）开关。
说明：
1. hunyuan-lite 无功能增强（如搜索）能力，该参数对 hunyuan-lite 版本不生效。
2. 未传值时默认打开开关。
3. 关闭时将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延尤为明显）。但在少数场景里，回复效果可能会下降。
4. 安全审核能力不属于功能增强范围，不受此字段影响。 
     * @return EnableEnhancement 功能增强（如搜索）开关。
说明：
1. hunyuan-lite 无功能增强（如搜索）能力，该参数对 hunyuan-lite 版本不生效。
2. 未传值时默认打开开关。
3. 关闭时将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延尤为明显）。但在少数场景里，回复效果可能会下降。
4. 安全审核能力不属于功能增强范围，不受此字段影响。
     */
    public Boolean getEnableEnhancement() {
        return this.EnableEnhancement;
    }

    /**
     * Set 功能增强（如搜索）开关。
说明：
1. hunyuan-lite 无功能增强（如搜索）能力，该参数对 hunyuan-lite 版本不生效。
2. 未传值时默认打开开关。
3. 关闭时将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延尤为明显）。但在少数场景里，回复效果可能会下降。
4. 安全审核能力不属于功能增强范围，不受此字段影响。
     * @param EnableEnhancement 功能增强（如搜索）开关。
说明：
1. hunyuan-lite 无功能增强（如搜索）能力，该参数对 hunyuan-lite 版本不生效。
2. 未传值时默认打开开关。
3. 关闭时将直接由主模型生成回复内容，可以降低响应时延（对于流式输出时的首字时延尤为明显）。但在少数场景里，回复效果可能会下降。
4. 安全审核能力不属于功能增强范围，不受此字段影响。
     */
    public void setEnableEnhancement(Boolean EnableEnhancement) {
        this.EnableEnhancement = EnableEnhancement;
    }

    /**
     * Get 可调用的工具列表，仅对 hunyuan-functioncall 模型生效。 
     * @return Tools 可调用的工具列表，仅对 hunyuan-functioncall 模型生效。
     */
    public Tool [] getTools() {
        return this.Tools;
    }

    /**
     * Set 可调用的工具列表，仅对 hunyuan-functioncall 模型生效。
     * @param Tools 可调用的工具列表，仅对 hunyuan-functioncall 模型生效。
     */
    public void setTools(Tool [] Tools) {
        this.Tools = Tools;
    }

    /**
     * Get 工具使用选项，可选值包括 none、auto、custom。
说明：
1. 仅对 hunyuan-functioncall 模型生效。
2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。
3. 未设置时，默认值为auto 
     * @return ToolChoice 工具使用选项，可选值包括 none、auto、custom。
说明：
1. 仅对 hunyuan-functioncall 模型生效。
2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。
3. 未设置时，默认值为auto
     */
    public String getToolChoice() {
        return this.ToolChoice;
    }

    /**
     * Set 工具使用选项，可选值包括 none、auto、custom。
说明：
1. 仅对 hunyuan-functioncall 模型生效。
2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。
3. 未设置时，默认值为auto
     * @param ToolChoice 工具使用选项，可选值包括 none、auto、custom。
说明：
1. 仅对 hunyuan-functioncall 模型生效。
2. none：不调用工具；auto：模型自行选择生成回复或调用工具；custom：强制模型调用指定的工具。
3. 未设置时，默认值为auto
     */
    public void setToolChoice(String ToolChoice) {
        this.ToolChoice = ToolChoice;
    }

    /**
     * Get 强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填 
     * @return CustomTool 强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填
     */
    public Tool getCustomTool() {
        return this.CustomTool;
    }

    /**
     * Set 强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填
     * @param CustomTool 强制模型调用指定的工具，当参数ToolChoice为custom时，此参数为必填
     */
    public void setCustomTool(Tool CustomTool) {
        this.CustomTool = CustomTool;
    }

    /**
     * Get 默认是false，在值为true且命中搜索时，接口会返回SearchInfo 
     * @return SearchInfo 默认是false，在值为true且命中搜索时，接口会返回SearchInfo
     */
    public Boolean getSearchInfo() {
        return this.SearchInfo;
    }

    /**
     * Set 默认是false，在值为true且命中搜索时，接口会返回SearchInfo
     * @param SearchInfo 默认是false，在值为true且命中搜索时，接口会返回SearchInfo
     */
    public void setSearchInfo(Boolean SearchInfo) {
        this.SearchInfo = SearchInfo;
    }

    /**
     * Get 搜索引文角标开关。
说明：
1. 配合EnableEnhancement和SearchInfo参数使用。打开后，回答中命中搜索的结果会在片段后增加角标标志，对应SearchInfo列表中的链接。
2. false：开关关闭，true：开关打开。
3. 未传值时默认开关关闭（false）。 
     * @return Citation 搜索引文角标开关。
说明：
1. 配合EnableEnhancement和SearchInfo参数使用。打开后，回答中命中搜索的结果会在片段后增加角标标志，对应SearchInfo列表中的链接。
2. false：开关关闭，true：开关打开。
3. 未传值时默认开关关闭（false）。
     */
    public Boolean getCitation() {
        return this.Citation;
    }

    /**
     * Set 搜索引文角标开关。
说明：
1. 配合EnableEnhancement和SearchInfo参数使用。打开后，回答中命中搜索的结果会在片段后增加角标标志，对应SearchInfo列表中的链接。
2. false：开关关闭，true：开关打开。
3. 未传值时默认开关关闭（false）。
     * @param Citation 搜索引文角标开关。
说明：
1. 配合EnableEnhancement和SearchInfo参数使用。打开后，回答中命中搜索的结果会在片段后增加角标标志，对应SearchInfo列表中的链接。
2. false：开关关闭，true：开关打开。
3. 未传值时默认开关关闭（false）。
     */
    public void setCitation(Boolean Citation) {
        this.Citation = Citation;
    }

    public ChatCompletionsRequest() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public ChatCompletionsRequest(ChatCompletionsRequest source) {
        if (source.Model != null) {
            this.Model = new String(source.Model);
        }
        if (source.Messages != null) {
            this.Messages = new Message[source.Messages.length];
            for (int i = 0; i < source.Messages.length; i++) {
                this.Messages[i] = new Message(source.Messages[i]);
            }
        }
        if (source.Stream != null) {
            this.Stream = new Boolean(source.Stream);
        }
        if (source.StreamModeration != null) {
            this.StreamModeration = new Boolean(source.StreamModeration);
        }
        if (source.TopP != null) {
            this.TopP = new Float(source.TopP);
        }
        if (source.Temperature != null) {
            this.Temperature = new Float(source.Temperature);
        }
        if (source.EnableEnhancement != null) {
            this.EnableEnhancement = new Boolean(source.EnableEnhancement);
        }
        if (source.Tools != null) {
            this.Tools = new Tool[source.Tools.length];
            for (int i = 0; i < source.Tools.length; i++) {
                this.Tools[i] = new Tool(source.Tools[i]);
            }
        }
        if (source.ToolChoice != null) {
            this.ToolChoice = new String(source.ToolChoice);
        }
        if (source.CustomTool != null) {
            this.CustomTool = new Tool(source.CustomTool);
        }
        if (source.SearchInfo != null) {
            this.SearchInfo = new Boolean(source.SearchInfo);
        }
        if (source.Citation != null) {
            this.Citation = new Boolean(source.Citation);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Model", this.Model);
        this.setParamArrayObj(map, prefix + "Messages.", this.Messages);
        this.setParamSimple(map, prefix + "Stream", this.Stream);
        this.setParamSimple(map, prefix + "StreamModeration", this.StreamModeration);
        this.setParamSimple(map, prefix + "TopP", this.TopP);
        this.setParamSimple(map, prefix + "Temperature", this.Temperature);
        this.setParamSimple(map, prefix + "EnableEnhancement", this.EnableEnhancement);
        this.setParamArrayObj(map, prefix + "Tools.", this.Tools);
        this.setParamSimple(map, prefix + "ToolChoice", this.ToolChoice);
        this.setParamObj(map, prefix + "CustomTool.", this.CustomTool);
        this.setParamSimple(map, prefix + "SearchInfo", this.SearchInfo);
        this.setParamSimple(map, prefix + "Citation", this.Citation);

    }
}

