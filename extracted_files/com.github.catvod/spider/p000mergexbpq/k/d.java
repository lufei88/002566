package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.IOException;
import java.util.Iterator;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;

/* loaded from: classes.dex */
final class d {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f358short = {1945, 1947, 1930, 3087, 3088, 3084, 3083, 1955, 1970, 1970, 1966, 1963, 1953, 1955, 1974, 1963, 1965, 1964, 2029, 1960, 1969, 1965, 1964, 2041, 2018, 1953, 1962, 1955, 1968, 1969, 1959, 1974, 2047, 1975, 1974, 1956, 2031, 2042, 1114, 2394, 3025, 1233, 1230, 1234, 1237};
    private String a;
    private Object b;
    private final Map<String, String> c;
    private final Map<String, String> d;
    private final c e;
    private Request f;
    private Request.Builder g;

    private d(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, c cVar) {
        RequestBody requestBodyM3200;
        this.b = null;
        this.a = str2;
        this.c = map;
        this.d = map2;
        this.e = cVar;
        this.g = new Request.Builder();
        if (C0007.m1815(str, C0063.m9585(m3217(), 0, 3, 2014))) {
            if (map != null) {
                this.a = C0040.m6629(new StringBuilder(), m3212(this), C0045.m7657(m3217(), 38, 1, 1125));
                Iterator itM5199 = C0029.m5199(C0026.m4887(map));
                while (C0012.m2962(itM5199)) {
                    String str4 = (String) C0048.m7949(itM5199);
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, m3212(this));
                    C0018.m3933(sb, str4);
                    C0018.m3933(sb, C0002.m1305(m3217(), 39, 1, 2407));
                    this.a = C0040.m6629(sb, (String) C0062.m9431(m3211(this), str4), C0022.m4403(m3217(), 40, 1, 3063));
                }
                this.a = C0054.m8636(m3212(this), 0, C0004.m1584(r2) - 1);
            }
        } else if (C0007.m1815(str, C0062.m9389(m3217(), 3, 4, 3167))) {
            Request.Builder builderM3209 = m3209(this);
            if (C0043.m7327(str3)) {
                FormBody.Builder builder = new FormBody.Builder();
                if (map != null) {
                    Iterator itM51992 = C0029.m5199(C0026.m4887(map));
                    while (C0012.m2962(itM51992)) {
                        String str5 = (String) C0048.m7949(itM51992);
                        m3213(builder, str5, (String) C0062.m9431(m3211(this), str5));
                    }
                }
                requestBodyM3200 = m3200(builder);
            } else {
                requestBodyM3200 = m3214(m3204(C0007.m1842(m3217(), 7, 31, 1986)), str3);
            }
            m3205(builderM3209, requestBodyM3200);
        }
        m3208(m3209(this), m3212(this));
        Object objM3202 = m3202(this);
        if (objM3202 != null) {
            m3206(m3209(this), objM3202);
        }
        Map mapM3216 = m3216(this);
        if (mapM3216 != null) {
            Iterator itM51993 = C0029.m5199(C0026.m4887(mapM3216));
            while (C0012.m2962(itM51993)) {
                String str6 = (String) C0048.m7949(itM51993);
                m3207(m3209(this), str6, (String) C0062.m9431(m3216(this), str6));
            }
        }
        this.f = m3201(m3209(this));
    }

    d(String str, String str2, Map map, c cVar) {
        this(C0025.m4795(m3217(), 41, 4, 1153), str, str2, null, map, cVar);
    }

    d(String str, String str2, Map<String, String> map, Map<String, String> map2, c cVar) {
        this(str, str2, null, map, map2, cVar);
    }

    /* renamed from: ۟۟۟۠۠, reason: not valid java name and contains not printable characters */
    public static void m3197(Object obj, Object obj2, Object obj3) {
        if (C0050.m8121() <= 0) {
            ((c) obj).a((Call) obj2, (Response) obj3);
        }
    }

    /* renamed from: ۟۟ۢۦ, reason: not valid java name and contains not printable characters */
    public static c m3198(Object obj) {
        if (C0048.m7971() > 0) {
            return ((d) obj).e;
        }
        return null;
    }

    /* renamed from: ۟۟ۤۡۨ, reason: not valid java name and contains not printable characters */
    public static void m3199(Object obj, Object obj2, Object obj3) {
        if (C0016.m3596() < 0) {
            ((c) obj).onError((Call) obj2, (Exception) obj3);
        }
    }

    /* renamed from: ۟۟ۥۦۥ, reason: not valid java name and contains not printable characters */
    public static FormBody m3200(Object obj) {
        if (C0011.m2755() >= 0) {
            return ((FormBody.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟۟ۧ۠ۥ, reason: not valid java name and contains not printable characters */
    public static Request m3201(Object obj) {
        if (C0019.m4065() <= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۡ۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static Object m3202(Object obj) {
        if (C0027.m5017() > 0) {
            return ((d) obj).b;
        }
        return null;
    }

    /* renamed from: ۟ۢۥ۠ۧ, reason: not valid java name and contains not printable characters */
    public static Call m3203(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۤ۟ۧ, reason: not valid java name and contains not printable characters */
    public static MediaType m3204(Object obj) {
        if (C0044.m7508() < 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦۨ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m3205(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m3206(Object obj, Object obj2) {
        if (C0039.m6529() < 0) {
            return ((Request.Builder) obj).tag(obj2);
        }
        return null;
    }

    /* renamed from: ۡۦ۟, reason: not valid java name and contains not printable characters */
    public static Request.Builder m3207(Object obj, Object obj2, Object obj3) {
        if (C0038.m6471() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m3208(Object obj, Object obj2) {
        if (C0003.m1463() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۡۧۧۨ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m3209(Object obj) {
        if (C0003.m1463() < 0) {
            return ((d) obj).g;
        }
        return null;
    }

    /* renamed from: ۣۣۤ, reason: not valid java name and contains not printable characters */
    public static Request m3210(Object obj) {
        if (C0048.m7971() > 0) {
            return ((d) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۤۤۢ, reason: not valid java name and contains not printable characters */
    public static Map m3211(Object obj) {
        if (C0003.m1463() < 0) {
            return ((d) obj).c;
        }
        return null;
    }

    /* renamed from: ۤۦۤ۠, reason: not valid java name and contains not printable characters */
    public static String m3212(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((d) obj).a;
        }
        return null;
    }

    /* renamed from: ۤۧۥۦ, reason: not valid java name and contains not printable characters */
    public static FormBody.Builder m3213(Object obj, Object obj2, Object obj3) {
        if (C0031.m5628() >= 0) {
            return ((FormBody.Builder) obj).add((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۣ۠ۡ, reason: contains not printable characters */
    public static RequestBody m3214(Object obj, Object obj2) {
        if (C0048.m7971() > 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۦۦۥۦ, reason: contains not printable characters */
    public static Response m3215(Object obj) {
        if (C0016.m3596() <= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۧۦۣۣ, reason: not valid java name and contains not printable characters */
    public static Map m3216(Object obj) {
        if (C0050.m8121() <= 0) {
            return ((d) obj).d;
        }
        return null;
    }

    /* renamed from: ۨ۟ۦ, reason: not valid java name and contains not printable characters */
    public static short[] m3217() {
        if (C0013.m3167() > 0) {
            return f358short;
        }
        return null;
    }

    final void a(OkHttpClient okHttpClient) {
        Call callM3203 = m3203(okHttpClient, m3210(this));
        try {
            Response responseM3215 = m3215(callM3203);
            c cVarM3198 = m3198(this);
            if (cVarM3198 != null) {
                m3197(cVarM3198, callM3203, responseM3215);
            }
        } catch (IOException e) {
            c cVarM31982 = m3198(this);
            if (cVarM31982 != null) {
                m3199(cVarM31982, callM3203, e);
            }
        }
    }

    public final void b(Object obj) {
        this.b = obj;
    }
}