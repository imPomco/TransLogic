package com.yeungjin.translogic.request.employee;

import com.android.volley.Response;
import com.yeungjin.translogic.request.Request;

public class GetGroupRequest extends Request {
    public GetGroupRequest(long number, Response.Listener<String> listener) {
        super("GetGroup", listener);

        parameters.put("number", String.valueOf(number));
    }
}