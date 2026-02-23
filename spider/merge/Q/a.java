package com.github.catvod.spider.merge.Q;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.google.gson.annotations.SerializedName;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import com.thegrizzlylabs.sardineandroid.impl.OkHttpSardine;
import java.util.ArrayList;
import java.util.List;

/* loaded from: classes.dex */
public class a {

    @SerializedName("drives")
    private List<a> a;

    @SerializedName("name")
    private String b;

    @SerializedName("server")
    private String c;

    @SerializedName("user")
    private String d;

    @SerializedName("pass")
    private String e;

    @SerializedName("path")
    private String f;

    @SerializedName("webdav")
    private Sardine g;

    public a(String str) {
        this.b = str;
    }

    /* renamed from: ۣ۟۟ۢۧ, reason: not valid java name and contains not printable characters */
    public static boolean m4756(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((DavResource) obj).isDirectory();
        }
        return false;
    }

    /* renamed from: ۟۟ۢۧۥ, reason: not valid java name and contains not printable characters */
    public static void m4757(Object obj, Object obj2, Object obj3) {
        if (C0028.m5152() <= 0) {
            ((Sardine) obj).setCredentials((String) obj2, (String) obj3);
        }
    }

    /* renamed from: ۟ۡۤۦۢ, reason: not valid java name and contains not printable characters */
    public static String m4758(Object obj) {
        if (C0037.m6350() < 0) {
            return ((DavResource) obj).getName();
        }
        return null;
    }

    /* renamed from: ۟ۢ۟ۢۨ, reason: not valid java name and contains not printable characters */
    public static String m4759(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((a) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۦۤ, reason: not valid java name and contains not printable characters */
    public static List m4760(Object obj) {
        if (C0038.m6471() > 0) {
            return ((a) obj).a;
        }
        return null;
    }

    /* renamed from: ۟ۦۣۡۤ, reason: not valid java name and contains not printable characters */
    public static String m4761(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((DavResource) obj).getPath();
        }
        return null;
    }

    /* renamed from: ۣ۠ۥۡ, reason: not valid java name and contains not printable characters */
    public static String m4762(Object obj) {
        if (C0017.m3633() < 0) {
            return ((a) obj).e;
        }
        return null;
    }

    /* renamed from: ۡۤ۠ۢ, reason: not valid java name and contains not printable characters */
    public static String m4763(Object obj) {
        if (C0064.m9659() <= 0) {
            return ((a) obj).c;
        }
        return null;
    }

    /* renamed from: ۢۧ۠, reason: not valid java name and contains not printable characters */
    public static Sardine m4764(Object obj) {
        if (C0002.m1242() > 0) {
            return ((a) obj).g;
        }
        return null;
    }

    /* renamed from: ۣۡۦۡ, reason: not valid java name and contains not printable characters */
    public static String m4765(Object obj) {
        if (C0041.m6823() < 0) {
            return ((a) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۤ۠ۨ, reason: not valid java name and contains not printable characters */
    public static String m4766(Object obj) {
        if (C0051.m8216() < 0) {
            return ((a) obj).d;
        }
        return null;
    }

    /* renamed from: ۤۢۡ۠, reason: not valid java name and contains not printable characters */
    public static Long m4767(Object obj) {
        if (C0007.m1886() > 0) {
            return ((DavResource) obj).getContentLength();
        }
        return null;
    }

    public final List a() {
        List listM4760 = m4760(this);
        return listM4760 == null ? new ArrayList() : listM4760;
    }

    public final String b() {
        return C0043.m7327(m4759(this)) ? C0007.m1840() : m4759(this);
    }

    public final String c() {
        return C0043.m7327(m4765(this)) ? C0007.m1840() : m4765(this);
    }

    public final String d() {
        return C0043.m7327(m4763(this)) ? C0007.m1840() : m4763(this);
    }

    public final Sardine e() {
        if (m4764(this) == null) {
            OkHttpSardine okHttpSardine = new OkHttpSardine();
            this.g = okHttpSardine;
            boolean zM7327 = C0043.m7327(m4766(this));
            String strM1840 = C0007.m1840();
            m4757(okHttpSardine, zM7327 ? strM1840 : m4766(this), C0043.m7327(m4762(this)) ? strM1840 : m4762(this));
            String strM4025 = C0019.m4025(C0022.m4422(C0018.m3947(this)));
            if (!C0043.m7327(strM4025)) {
                strM1840 = strM4025;
            }
            this.f = strM1840;
        }
        return m4764(this);
    }

    public final boolean equals(Object obj) {
        if (this == obj) {
            return true;
        }
        if (obj instanceof a) {
            return C0007.m1815(C0050.m8079(this), C0050.m8079((a) obj));
        }
        return false;
    }

    public final void f(String str) {
        this.e = str;
    }

    public final void g(String str) {
        this.c = str;
    }

    public final void h(String str) {
        this.d = str;
    }

    public final m i(DavResource davResource, String str) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0050.m8079(this));
        C0018.m3933(sb, m4761(davResource));
        return new m(C0047.m7763(sb), m4758(davResource), str, C0051.m8193(C0031.m5649(m4767(davResource))), m4756(davResource));
    }
}