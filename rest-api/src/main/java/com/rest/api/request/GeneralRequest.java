package com.rest.api.request;

/* Единый вариант запроса, через который мы передаем
   необходимый набор параметров */
public class GeneralRequest<T> {

    private T parameters;

    public T getParameters() {
        return parameters;
    }
    public void setParameters(T parameters) {
        this.parameters = parameters;
    }

    @Override
    public String toString() {
        final StringBuilder sb = new StringBuilder("GeneralRequest{");
        sb.append("parameters=").append(parameters);
        sb.append('}');
        return sb.toString();
    }
}
