package org.jay.api.utils.common;

import lombok.Data;
import lombok.ToString;
import org.jay.api.utils.exception.BaseErrorInfoInterface;
import org.jay.api.utils.exception.ExceptionEnum;

@Data
@ToString
public class R {

    /**
     * 响应代码
     */
    private String code;

    /**
     * 响应消息
     */
    private String message;

    /**
     * 响应结果
     */
    private Object result;

    public R() {}

    public R(BaseErrorInfoInterface errorInfo) {
        this.code = errorInfo.getResultCode();
        this.message = errorInfo.getResultMsg();
    }

    /**
     * 成功
     *
     * @return
     */
    public static R success() {
        return success(null);
    }

    /**
     * 成功
     * @param data
     * @return
     */
    public static R success(Object data) {
        R rb = new R();
        rb.setCode(ExceptionEnum.SUCCESS.getResultCode());
        rb.setMessage(ExceptionEnum.SUCCESS.getResultMsg());
        rb.setResult(data);
        return rb;
    }

    /**
     * 失败
     */
    public static R error(BaseErrorInfoInterface errorInfo) {
        R rb = new R();
        rb.setCode(errorInfo.getResultCode());
        rb.setMessage(errorInfo.getResultMsg());
        rb.setResult(null);
        return rb;
    }

    /**
     * 失败
     */
    public static R error(String code, String message) {
        R rb = new R();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }
    public static R error(String code, String message,Object date) {
        R rb = new R();
        rb.setCode(code);
        rb.setMessage(message);
        rb.setResult(date);
        return rb;
    }

    /**
     * 失败
     */
    public static R error( String message) {
        R rb = new R();
        rb.setCode("-1");
        rb.setMessage(message);
        rb.setResult(null);
        return rb;
    }




}
