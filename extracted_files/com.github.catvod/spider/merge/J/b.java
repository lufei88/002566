package com.github.catvod.spider.merge.J;

import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    @SerializedName("name")
    private String a;

    @SerializedName("list")
    private List<c> b;

    public static List a(String str) {
        return (List) m4289(new Gson(), str, m4290(new a()));
    }

    /* renamed from: ۟ۢۡۨۤ, reason: not valid java name and contains not printable characters */
    public static Object m4289(Object obj, Object obj2, Object obj3) {
        if (C0032.m5686() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۠۠, reason: not valid java name and contains not printable characters */
    public static Type m4290(Object obj) {
        if (C0051.m8216() <= 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* renamed from: ۢ۟ۢ۟, reason: not valid java name and contains not printable characters */
    public static List m4291(Object obj) {
        if (C0031.m5628() > 0) {
            return ((b) obj).b;
        }
        return null;
    }

    /* renamed from: ۦ۟۟ۥ, reason: contains not printable characters */
    public static String m4292(Object obj) {
        if (C0035.m6140() <= 0) {
            return ((b) obj).a;
        }
        return null;
    }

    public final List b() {
        List listM4291 = m4291(this);
        return listM4291 == null ? C0008.m1961() : listM4291;
    }

    public final String c() {
        return C0043.m7327(m4292(this)) ? C0007.m1840() : m4292(this);
    }
}