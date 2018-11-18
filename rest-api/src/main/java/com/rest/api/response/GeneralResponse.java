package com.rest.api.response;

/* Единый вариант (стандарт) для оформления тела ответа
*
* code    - код ответа (200, 400, 401, 403, 405, 500)
* payload = тело ответа которое может изменится в зависимоти от выполненого запроса
* */
public class GeneralResponse<T> {

    private Integer code;
    private T payload;

    public GeneralResponse() {}
    public GeneralResponse(Integer code, T payload) {
        this.code = code;
        this.payload = payload;
    }

    public Integer getCode() {
        return code;
    }
    public void setCode(Integer code) {
        this.code = code;
    }
    public T getPayload() {
        return payload;
    }
    public void setPayload(T payload) {
        this.payload = payload;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeneralResponse{");
        sb.append("code='").append(code).append('\'');
        sb.append(", payload=").append(payload);
        sb.append('}');
        return sb.toString();
    }
}
