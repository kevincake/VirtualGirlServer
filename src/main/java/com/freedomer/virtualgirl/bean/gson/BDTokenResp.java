package com.freedomer.virtualgirl.bean.gson;

/**
 * @atuhor:eavawu
 * @time:15/08/2017
 * @todo:bd token返回
 */
public class BDTokenResp {

    /**
     * access_token : 24.e34c8876e656716a1d5e2371eaff541c.2592000.1505352251.282335-9882815
     * session_key : 9mzdXvahygrd0Jmh9KerZgLA5o2dBzeggVJl4ve0drKdAZxV+QDda6+qLBKyyS1rVVoP4wlONqYOksZ8jitJm7w3YQNE
     * scope : public brain_all_scope wise_adapt lebo_resource_base lightservice_public hetu_basic lightcms_map_poi kaidian_kaidian wangrantest_test wangrantest_test1 bnstest_test1 bnstest_test2 vis-classify_flower
     * refresh_token : 25.b884e0b0e399dc7ef73238de75f40797.315360000.1818120251.282335-9882815
     * session_secret : 8b1aeb5cf2d6bc45764a47e760df7e7f
     * expires_in : 2592000
     */

    private String access_token;
    private String session_key;
    private String scope;
    private String refresh_token;
    private String session_secret;
    private int expires_in;

    public String getAccess_token() {
        return access_token;
    }

    public void setAccess_token(String access_token) {
        this.access_token = access_token;
    }

    public String getSession_key() {
        return session_key;
    }

    public void setSession_key(String session_key) {
        this.session_key = session_key;
    }

    public String getScope() {
        return scope;
    }

    public void setScope(String scope) {
        this.scope = scope;
    }

    public String getRefresh_token() {
        return refresh_token;
    }

    public void setRefresh_token(String refresh_token) {
        this.refresh_token = refresh_token;
    }

    public String getSession_secret() {
        return session_secret;
    }

    public void setSession_secret(String session_secret) {
        this.session_secret = session_secret;
    }

    public int getExpires_in() {
        return expires_in;
    }

    public void setExpires_in(int expires_in) {
        this.expires_in = expires_in;
    }

    @Override
    public String toString() {
        return "BDTokenResp{" +
                "access_token='" + access_token + '\'' +
                ", session_key='" + session_key + '\'' +
                ", scope='" + scope + '\'' +
                ", refresh_token='" + refresh_token + '\'' +
                ", session_secret='" + session_secret + '\'' +
                ", expires_in=" + expires_in +
                '}';
    }
}
