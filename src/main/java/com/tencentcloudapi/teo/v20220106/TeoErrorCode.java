package com.tencentcloudapi.teo.v20220106;
public enum TeoErrorCode {
    // 内部错误。
     INTERNALERROR("InternalError"),
     
    // 后台处理出错。
     INTERNALERROR_BACKENDERROR("InternalError.BackendError"),
     
    // 获取配置失败。
     INTERNALERROR_DOMAINCONFIG("InternalError.DomainConfig"),
     
    // 上传链接生成失败。
     INTERNALERROR_FAILEDTOGENERATEURL("InternalError.FailedToGenerateUrl"),
     
    // 配额系统处理失败。
     INTERNALERROR_QUOTASYSTEM("InternalError.QuotaSystem"),
     
    // 域名不存在或不属于该账号。
     INVALIDPARAMETER_DOMAINNOTFOUND("InvalidParameter.DomainNotFound"),
     
    // 参数错误。
     INVALIDPARAMETER_PARAMETERERROR("InvalidParameter.ParameterError"),
     
    // 资源存在错误。
     INVALIDPARAMETER_TARGET("InvalidParameter.Target"),
     
    // 任务无法生成。
     INVALIDPARAMETER_TASKNOTGENERATED("InvalidParameter.TaskNotGenerated"),
     
    // 文件上传链接存在问题。
     INVALIDPARAMETER_UPLOADURL("InvalidParameter.UploadUrl"),
     
    // 本次提交的资源数超过上限。
     LIMITEXCEEDED_BATCHQUOTA("LimitExceeded.BatchQuota"),
     
    // 当天提交的资源数超过上限。
     LIMITEXCEEDED_DAILYQUOTA("LimitExceeded.DailyQuota"),
     
    // 资源不可用。
     RESOURCEUNAVAILABLE("ResourceUnavailable"),
     
    // Cam 未授权。
     UNAUTHORIZEDOPERATION_CAMUNAUTHORIZED("UnauthorizedOperation.CamUnauthorized"),
     
    // 鉴权错误。
     UNAUTHORIZEDOPERATION_DOMAINEMPTY("UnauthorizedOperation.DomainEmpty"),
     
    // 子账户没有操作权限，请添加权限后继续操作。
     UNAUTHORIZEDOPERATION_NOPERMISSION("UnauthorizedOperation.NoPermission");
     
    private String value;
    private TeoErrorCode (String value){
        this.value = value;
    }
    /**
     * @return errorcode value
     */
    public String getValue() {
        return value;
    }
}

