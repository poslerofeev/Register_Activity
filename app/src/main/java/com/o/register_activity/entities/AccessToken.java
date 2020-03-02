package com.o.register_activity.entities;

import com.squareup.moshi.Json;

public class AccessToken {

    @Json(name = "token_type")
    String token_type;

    @Json(name = "expires_in")
    String expires_in;

    @Json(name = "access_token")
    String access_token;

    @Json(name = "refresh_token")
    String refresh_token;

}
