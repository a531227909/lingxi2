package com.labour.entity;

public class LabourParams {

    private static final long serialVersionUID = 1L;

    //业务参数
    public String merchantNo;//商户号
    public String key;//请求秘钥
    public String publicKey;//请求公钥
    public String requestUrl;//请求网关
    public String callbackUrl;
    public String transamt;    //充值金额，默认以元为单位，一位小数（如10.0）
    public String orderNo; //订单号

    public String getMerchantNo() {
        return merchantNo;
    }

    public void setMerchantNo(String merchantNo) {
        this.merchantNo = merchantNo;
    }

    public String getKey() {
        return key;
    }

    public void setKey(String key) {
        this.key = key;
    }

    public String getPublicKey() {
        return publicKey;
    }

    public void setPublicKey(String publicKey) {
        this.publicKey = publicKey;
    }

    public String getRequestUrl() {
        return requestUrl;
    }

    public void setRequestUrl(String requestUrl) {
        this.requestUrl = requestUrl;
    }

    public String getCallbackUrl() {
        return callbackUrl;
    }

    public void setCallbackUrl(String callbackUrl) {
        this.callbackUrl = callbackUrl;
    }

    public String getTransamt() {
        return transamt;
    }

    public void setTransamt(String transamt) {
        this.transamt = transamt;
    }

    public String getOrderNo() {
        return orderNo;
    }

    public void setOrderNo(String orderNo) {
        this.orderNo = orderNo;
    }

    @Override
    public String toString() {
        return "LabourParams{" +
                "merchantNo='" + merchantNo + '\'' +
                ", key='" + key + '\'' +
                ", publicKey='" + publicKey + '\'' +
                ", requestUrl='" + requestUrl + '\'' +
                ", callbackUrl='" + callbackUrl + '\'' +
                ", transamt='" + transamt + '\'' +
                ", orderNo='" + orderNo + '\'' +
                '}';
    }
}
