package com.github.catvod.spider.merge.S;

import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;

/* loaded from: classes.dex */
public class a {

    @SerializedName("user")
    private b a;

    /* renamed from: ۣ۟ۨ۠, reason: not valid java name and contains not printable characters */
    public static String m4982(Object obj, Object obj2) {
        if (C0011.m2755() > 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    public final String toString() {
        return m4982(new Gson(), this);
    }
}