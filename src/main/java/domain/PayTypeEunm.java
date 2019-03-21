package domain;

/**
 * Created by 张瑞 on 2019/3/18.
 * 枚举
 */
public enum PayTypeEunm {
    WeCharPay("微信支付",1),
    AliPay("支付宝支付",2),
    JdPay("京东支付",3);
    public String key;
    public int value;
    PayTypeEunm(String key, int value){
        this.key =key;
        this.value = value;
    }

    public String getKey() {
        return key;
    }

    public int getValue() {
        return value;
    }
}
