package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.google.gson.Gson;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.List;

/* loaded from: classes.dex */
public class b {

    @SerializedName("name")
    private String a;

    @SerializedName(alternate = {"picurl"}, value = "img")
    private String b;

    @SerializedName("id")
    private String c;

    @SerializedName("countStr")
    private String d;

    @SerializedName("url")
    private String e;

    @SerializedName("cards")
    private List<b> f;

    public static List a(String str) {
        return (List) m4505(new Gson(), str, m4506(new a()));
    }

    /* renamed from: ۟۠ۦۢ, reason: not valid java name and contains not printable characters */
    public static String m4504(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((b) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤۡۡ, reason: not valid java name and contains not printable characters */
    public static Object m4505(Object obj, Object obj2, Object obj3) {
        if (C0018.m3956() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۦۥۤ, reason: not valid java name and contains not printable characters */
    public static Type m4506(Object obj) {
        if (C0014.m3353() < 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* renamed from: ۢۢۦۣ, reason: not valid java name and contains not printable characters */
    public static List m4507(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((b) obj).f;
        }
        return null;
    }

    /* renamed from: ۤۨ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4508(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((b) obj).d;
        }
        return null;
    }

    /* renamed from: ۦۤۢ۠, reason: contains not printable characters */
    public static String m4509(Object obj) {
        if (C0019.m4065() < 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۢ۟ۥ, reason: not valid java name and contains not printable characters */
    public static String m4510(Object obj) {
        if (C0052.m8320() > 0) {
            return ((b) obj).b;
        }
        return null;
    }

    public final List b() {
        List listM4507 = m4507(this);
        return listM4507 == null ? C0008.m1961() : listM4507;
    }

    public final String c() {
        return C0043.m7327(m4509(this)) ? C0007.m1840() : m4509(this);
    }

    public final m d() {
        boolean zM7327 = C0043.m7327(m4504(this));
        String strM1840 = C0007.m1840();
        String strM4504 = zM7327 ? strM1840 : m4504(this);
        String strM9065 = C0058.m9065(this);
        String strM4510 = C0043.m7327(m4510(this)) ? strM1840 : m4510(this);
        if (!C0043.m7327(m4508(this))) {
            strM1840 = m4508(this);
        }
        return new m(strM4504, strM9065, strM4510, strM1840);
    }
}