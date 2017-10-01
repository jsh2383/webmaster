package com.example.owner.join;

import com.android.volley.Response;
import com.android.volley.toolbox.StringRequest;

import java.util.HashMap;
import java.util.Map;

/**
 * Created by Owner on 2017-07-20.
 */

public class RegisterRequest extends StringRequest {

    final static private String URL = "http://tjdgns2383.dothome.co.kr/php/Register.php";
    private Map<String, String> parameters;

    public RegisterRequest(String id, String pw, String username, int phone, int bank, String bankname, Response.Listener<String> listener) {
        super(Method.POST, URL, listener ,null);
        parameters = new HashMap<>();
        parameters.put("id",id);
        parameters.put("pw",pw);
        parameters.put("username",username);
        parameters.put("phone", phone + "");
        parameters.put("bank",bank + "");
        parameters.put("bankname",bankname);



                }
public Map<String, String>getParams() {
                return parameters;
            }
        }
