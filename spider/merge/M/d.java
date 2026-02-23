package com.github.catvod.spider.merge.M;

import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.annotations.SerializedName;
import java.util.List;

/* loaded from: classes.dex */
public class d {

    @SerializedName("name")
    private String a;

    @SerializedName("videos")
    private List<h> b;

    /* renamed from: ۣ۟۟ۡۨ, reason: not valid java name and contains not printable characters */
    public static String m4515(Object obj) {
        if (C0044.m7508() < 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۢۡ, reason: not valid java name and contains not printable characters */
    public static List m4516(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((d) obj).b;
        }
        return null;
    }

    public final String a() {
        return C0043.m7327(m4515(this)) ? C0007.m1840() : m4515(this);
    }

    public final List b() {
        List listM4516 = m4516(this);
        return listM4516 == null ? C0008.m1961() : listM4516;
    }
}