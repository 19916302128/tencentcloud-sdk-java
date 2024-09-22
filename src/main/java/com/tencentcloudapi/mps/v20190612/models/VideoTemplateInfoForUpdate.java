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
package com.tencentcloudapi.mps.v20190612.models;

import com.tencentcloudapi.common.AbstractModel;
import com.tencentcloudapi.common.SSEResponseModel;
import com.google.gson.annotations.SerializedName;
import com.google.gson.annotations.Expose;
import java.util.HashMap;

public class VideoTemplateInfoForUpdate extends AbstractModel {

    /**
    * 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>
注意：目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Codec")
    @Expose
    private String Codec;

    /**
    * 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Fps")
    @Expose
    private Long Fps;

    /**
    * 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Bitrate")
    @Expose
    private Long Bitrate;

    /**
    * 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ResolutionAdaptive")
    @Expose
    private String ResolutionAdaptive;

    /**
    * 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Width")
    @Expose
    private Long Width;

    /**
    * 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Height")
    @Expose
    private Long Height;

    /**
    * 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Gop")
    @Expose
    private Long Gop;

    /**
    * 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FillType")
    @Expose
    private String FillType;

    /**
    * 视频恒定码率控制因子。取值范围为[0, 51]，填0表示禁用该参数。 
如果没有特殊需求，不建议指定该参数。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Vcrf")
    @Expose
    private Long Vcrf;

    /**
    * 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("ContentAdaptStream")
    @Expose
    private Long ContentAdaptStream;

    /**
    * hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("SegmentType")
    @Expose
    private Long SegmentType;

    /**
    * 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("FpsDenominator")
    @Expose
    private Long FpsDenominator;

    /**
    * 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：左右视角</li>
<li>top_bottom：上下视角</li>
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
    */
    @SerializedName("Stereo3dType")
    @Expose
    private String Stereo3dType;

    /**
     * Get 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>
注意：目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Codec 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>
注意：目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getCodec() {
        return this.Codec;
    }

    /**
     * Set 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>
注意：目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Codec 视频流的编码格式，可选值：
<li>h264：H.264 编码</li>
<li>h265：H.265 编码</li>
<li>h266：H.266 编码</li>
<li>av1：AOMedia Video 1 编码</li>
<li>vp8：VP8 编码</li>
<li>vp9：VP9 编码</li>
<li>mpeg2：MPEG2 编码</li>
<li>dnxhd：DNxHD 编码</li>
<li>mv-hevc：MV-HEVC 编码</li>
注意：目前 H.265 编码必须指定分辨率，并且需要在 640*480 以内。

注意：av1 编码容器目前只支持 mp4 ，webm，mkv。
注意：H.266 编码容器目前只支持 mp4 ，hls，ts，mov。
注意：VP8、VP9编码容器目前只支持webm，mkv。
注意：MPEG2、dnxhd 编码容器目前只支持mxf。
注意：MV-HEVC编码容器目前只支持mp4，hls，mov。其中hls格式只支持mp4分片格式。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setCodec(String Codec) {
        this.Codec = Codec;
    }

    /**
     * Get 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Fps 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFps() {
        return this.Fps;
    }

    /**
     * Set 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Fps 视频帧率，取值范围：
当FpsDenominator的值为空时，范围：[0, 120]，单位：Hz；
当FpsDenominator的值不为空时，Fps/FpsDenominator的范围：[0,120]
当取值为 0，表示帧率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFps(Long Fps) {
        this.Fps = Fps;
    }

    /**
     * Get 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getBitrate() {
        return this.Bitrate;
    }

    /**
     * Set 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Bitrate 视频流的码率，取值范围：0 和 [128, 100000]，单位：kbps。
当取值为 0，表示视频码率和原始视频保持一致。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setBitrate(Long Bitrate) {
        this.Bitrate = Bitrate;
    }

    /**
     * Get 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getResolutionAdaptive() {
        return this.ResolutionAdaptive;
    }

    /**
     * Set 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ResolutionAdaptive 分辨率自适应，可选值：
<li>open：开启，此时，Width 代表视频的长边，Height 表示视频的短边；</li>
<li>close：关闭，此时，Width 代表视频的宽度，Height 表示视频的高度。</li>
注意：自适应模式时，Width不能小于Height。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setResolutionAdaptive(String ResolutionAdaptive) {
        this.ResolutionAdaptive = ResolutionAdaptive;
    }

    /**
     * Get 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getWidth() {
        return this.Width;
    }

    /**
     * Set 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param Width 视频流宽度（或长边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
<li>当 Width、Height 均为 0，则分辨率同源；</li>
<li>当 Width 为 0，Height 非 0，则 Width 按比例缩放；</li>
<li>当 Width 非 0，Height 为 0，则 Height 按比例缩放；</li>
<li>当 Width、Height 均非 0，则分辨率按用户指定。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setWidth(Long Width) {
        this.Width = Width;
    }

    /**
     * Get 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getHeight() {
        return this.Height;
    }

    /**
     * Set 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Height 视频流高度（或短边）的最大值，取值范围：0 和 [128, 4096]，单位：px。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setHeight(Long Height) {
        this.Height = Height;
    }

    /**
     * Get 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Gop 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getGop() {
        return this.Gop;
    }

    /**
     * Set 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Gop 关键帧 I 帧之间的间隔，取值范围：0 和 [1, 100000]，单位：帧数。当填 0 时，系统将自动设置 gop 长度。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setGop(Long Gop) {
        this.Gop = Gop;
    }

    /**
     * Get 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getFillType() {
        return this.FillType;
    }

    /**
     * Set 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
注意：此字段可能返回 null，表示取不到有效值。
     * @param FillType 填充方式，当视频流配置宽高参数与原始视频的宽高比不一致时，对转码的处理方式，即为“填充”。可选填充方式：
 <li> stretch：拉伸，对每一帧进行拉伸，填满整个画面，可能导致转码后的视频被“压扁“或者“拉长“；</li>
<li>black：留黑，保持视频宽高比不变，边缘剩余部分使用黑色填充。</li>
<li>white：留白，保持视频宽高比不变，边缘剩余部分使用白色填充。</li>
<li>gauss：高斯模糊，保持视频宽高比不变，边缘剩余部分使用高斯模糊填充。</li>
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFillType(String FillType) {
        this.FillType = FillType;
    }

    /**
     * Get 视频恒定码率控制因子。取值范围为[0, 51]，填0表示禁用该参数。 
如果没有特殊需求，不建议指定该参数。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Vcrf 视频恒定码率控制因子。取值范围为[0, 51]，填0表示禁用该参数。 
如果没有特殊需求，不建议指定该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getVcrf() {
        return this.Vcrf;
    }

    /**
     * Set 视频恒定码率控制因子。取值范围为[0, 51]，填0表示禁用该参数。 
如果没有特殊需求，不建议指定该参数。
注意：此字段可能返回 null，表示取不到有效值。
     * @param Vcrf 视频恒定码率控制因子。取值范围为[0, 51]，填0表示禁用该参数。 
如果没有特殊需求，不建议指定该参数。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setVcrf(Long Vcrf) {
        this.Vcrf = Vcrf;
    }

    /**
     * Get 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。 
     * @return ContentAdaptStream 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getContentAdaptStream() {
        return this.ContentAdaptStream;
    }

    /**
     * Set 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
     * @param ContentAdaptStream 内容自适应编码。可选值：
<li>0：不开启</li>
<li>1：开启</li>
默认值: 0.   当开启该参数时，将会自适应生成多个不同分辨率，不同码率的码流， 其中VideoTemplate的宽和高为多个码流中的最大分辨率，VideoTemplate中的码率为多个码流中的最高码率， VideoTemplate中的vcrf为多个码流中的最高质量。 当不设置分辨率、码率和vcrf时， ContentAdaptStream 参数生成的最高分辨率为视频源的分辨率，视频质量为接近vmaf95分。 若要开启该参数或了解计费细节, 请联系您的腾讯云商务。
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setContentAdaptStream(Long ContentAdaptStream) {
        this.ContentAdaptStream = ContentAdaptStream;
    }

    /**
     * Get hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return SegmentType hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getSegmentType() {
        return this.SegmentType;
    }

    /**
     * Set hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：此字段可能返回 null，表示取不到有效值。
     * @param SegmentType hls 分片类型，可选值：
<li>0：HLS+TS 切片</li>
<li>2：HLS+TS byte range</li>
<li>7：HLS+MP4 切片</li>
<li>5：HLS+MP4 byte range</li>
默认值：0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setSegmentType(Long SegmentType) {
        this.SegmentType = SegmentType;
    }

    /**
     * Get 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。 
     * @return FpsDenominator 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public Long getFpsDenominator() {
        return this.FpsDenominator;
    }

    /**
     * Set 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
     * @param FpsDenominator 帧率分母部分
注意：值必须大于0
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setFpsDenominator(Long FpsDenominator) {
        this.FpsDenominator = FpsDenominator;
    }

    /**
     * Get 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：左右视角</li>
<li>top_bottom：上下视角</li>
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。 
     * @return Stereo3dType 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：左右视角</li>
<li>top_bottom：上下视角</li>
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
     */
    public String getStereo3dType() {
        return this.Stereo3dType;
    }

    /**
     * Set 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：左右视角</li>
<li>top_bottom：上下视角</li>
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
     * @param Stereo3dType 3D视频拼接方式，仅mv-hevc，3D视频生效，可选值：
<li>side_by_side：左右视角</li>
<li>top_bottom：上下视角</li>
默认值:side_by_side
注意：此字段可能返回 null，表示取不到有效值。
     */
    public void setStereo3dType(String Stereo3dType) {
        this.Stereo3dType = Stereo3dType;
    }

    public VideoTemplateInfoForUpdate() {
    }

    /**
     * NOTE: Any ambiguous key set via .set("AnyKey", "value") will be a shallow copy,
     *       and any explicit key, i.e Foo, set via .setFoo("value") will be a deep copy.
     */
    public VideoTemplateInfoForUpdate(VideoTemplateInfoForUpdate source) {
        if (source.Codec != null) {
            this.Codec = new String(source.Codec);
        }
        if (source.Fps != null) {
            this.Fps = new Long(source.Fps);
        }
        if (source.Bitrate != null) {
            this.Bitrate = new Long(source.Bitrate);
        }
        if (source.ResolutionAdaptive != null) {
            this.ResolutionAdaptive = new String(source.ResolutionAdaptive);
        }
        if (source.Width != null) {
            this.Width = new Long(source.Width);
        }
        if (source.Height != null) {
            this.Height = new Long(source.Height);
        }
        if (source.Gop != null) {
            this.Gop = new Long(source.Gop);
        }
        if (source.FillType != null) {
            this.FillType = new String(source.FillType);
        }
        if (source.Vcrf != null) {
            this.Vcrf = new Long(source.Vcrf);
        }
        if (source.ContentAdaptStream != null) {
            this.ContentAdaptStream = new Long(source.ContentAdaptStream);
        }
        if (source.SegmentType != null) {
            this.SegmentType = new Long(source.SegmentType);
        }
        if (source.FpsDenominator != null) {
            this.FpsDenominator = new Long(source.FpsDenominator);
        }
        if (source.Stereo3dType != null) {
            this.Stereo3dType = new String(source.Stereo3dType);
        }
    }


    /**
     * Internal implementation, normal users should not use it.
     */
    public void toMap(HashMap<String, String> map, String prefix) {
        this.setParamSimple(map, prefix + "Codec", this.Codec);
        this.setParamSimple(map, prefix + "Fps", this.Fps);
        this.setParamSimple(map, prefix + "Bitrate", this.Bitrate);
        this.setParamSimple(map, prefix + "ResolutionAdaptive", this.ResolutionAdaptive);
        this.setParamSimple(map, prefix + "Width", this.Width);
        this.setParamSimple(map, prefix + "Height", this.Height);
        this.setParamSimple(map, prefix + "Gop", this.Gop);
        this.setParamSimple(map, prefix + "FillType", this.FillType);
        this.setParamSimple(map, prefix + "Vcrf", this.Vcrf);
        this.setParamSimple(map, prefix + "ContentAdaptStream", this.ContentAdaptStream);
        this.setParamSimple(map, prefix + "SegmentType", this.SegmentType);
        this.setParamSimple(map, prefix + "FpsDenominator", this.FpsDenominator);
        this.setParamSimple(map, prefix + "Stereo3dType", this.Stereo3dType);

    }
}

