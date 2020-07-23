package com.labour.lotteryProduct;

import com.labour.entity.LotteryParams;
import com.labour.entity.LotterySource;

public abstract class LotteryProduct {

    //业务参数
    protected String merchantNo;//商户号
    protected String key;//请求秘钥
    protected String publicKey;//请求公钥
    protected String requestUrl;//请求网关
    protected String callbackUrl;
    protected String transamt;    //充值金额，默认以元为单位，一位小数（如10.0）
    protected String orderNo; //订单号

    public void init(LotteryParams params){
        merchantNo = params.getMerchantNo();
        key = params.getKey();
        publicKey = params.getPublicKey();
        requestUrl = params.getRequestUrl();
        callbackUrl = params.getCallbackUrl();
        transamt = params.getTransamt();
        orderNo = params.getOrderNo();
    }

    public abstract LotterySource method();
}
