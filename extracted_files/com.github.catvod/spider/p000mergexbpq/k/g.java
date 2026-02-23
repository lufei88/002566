package com.github.catvod.spider.p000mergexbpq.k;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Cookie;
import okhttp3.CookieJar;
import okhttp3.Dispatcher;
import okhttp3.OkHttpClient;
import okhttp3.Request;

/* loaded from: classes.dex */
public final class g {
    private static OkHttpClient b;
    private static OkHttpClient c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f359short = {1853, 1810, 1831, 1854, 1826, 1827, 1810, 1853, 1836, 1855, 1854, 1832, 2635, 2633, 2648, 262, 261, 265, 267, 286, 259, 261, 260, 1926, 1957, 1961, 1963, 1982, 1955, 1957, 1956, 1518, 1521, 1517, 1514, 1419, 1417, 1432};
    private static final Object a = new Object();
    public static HashMap<String, List<Cookie>> d = new HashMap<>();

    public static void a() {
        String strM2805;
        OkHttpClient okHttpClientM3230 = m3230();
        if (okHttpClientM3230 != null) {
            Iterator itM3109 = C0013.m3109(m3241(m3233(okHttpClientM3230)));
            while (true) {
                boolean zM2962 = C0012.m2962(itM3109);
                strM2805 = C0011.m2805(m3238(), 0, 12, 1869);
                if (!zM2962) {
                    break;
                }
                Call call = (Call) C0048.m7949(itM3109);
                if (C0058.m9103(strM2805, m3227(m3243(call)))) {
                    m3237(call);
                }
            }
            Iterator itM31092 = C0013.m3109(m3248(m3233(okHttpClientM3230)));
            while (C0012.m2962(itM31092)) {
                Call call2 = (Call) C0048.m7949(itM31092);
                if (C0058.m9103(strM2805, m3227(m3243(call2)))) {
                    m3237(call2);
                }
            }
        }
    }

    public static OkHttpClient b() {
        OkHttpClient okHttpClientM3239;
        synchronized (m3235()) {
            if (m3239() == null) {
                OkHttpClient.Builder builderM3226 = m3226(new OkHttpClient.Builder(), new e());
                TimeUnit timeUnitM8151 = C0050.m8151();
                OkHttpClient.Builder builderM3240 = m3240(m3231(m3236(m3244(builderM3226, 15L, timeUnitM8151), 15L, timeUnitM8151), 15L, timeUnitM8151), true);
                X509TrustManager x509TrustManagerM1990 = C0008.m1990();
                b = m3232(m3234(builderM3240, new i(x509TrustManagerM1990), x509TrustManagerM1990));
            }
            okHttpClientM3239 = m3239();
        }
        return okHttpClientM3239;
    }

    public static void c(OkHttpClient okHttpClient, String str, Map map, c cVar) {
        m3245(new d(C0017.m3646(m3238(), 12, 3, 2572), str, null, map, cVar), okHttpClient);
    }

    public static String d(Map<String, List<String>> map) {
        String strM8007 = C0049.m8007(m3238(), 15, 8, 362);
        if (!C0024.m4748(map, strM8007)) {
            strM8007 = C0047.m7833(m3238(), 23, 8, 1994);
            if (!C0024.m4748(map, strM8007)) {
                return null;
            }
        }
        return (String) C0048.m7915((List) C0062.m9431(map, strM8007), 0);
    }

    public static void e(OkHttpClient okHttpClient, String str, Map<String, String> map, Map<String, String> map2, c cVar) {
        m3245(new d(C0042.m7151(m3238(), 31, 4, 1470), str, map, map2, cVar), okHttpClient);
    }

    public static void f(OkHttpClient okHttpClient, String str, String str2, Map<String, String> map, c cVar) {
        m3245(new d(str, str2, map, cVar), okHttpClient);
    }

    public static String g(String str, Map<String, String> map) {
        return m3242(m3230(), str, null, map, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m3242(m3230(), str, null, map, map2);
    }

    public static String i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2) {
        f fVar = new f(map2);
        d dVar = new d(C0027.m5062(m3238(), 35, 3, 1484), str, null, map, fVar);
        m3229(dVar, str2);
        m3245(dVar, okHttpClient);
        return (String) C0020.m4219(fVar);
    }

    public static String j(String str, Map<String, String> map, Map<String, List<String>> map2) {
        OkHttpClient okHttpClientM3247;
        synchronized (m3235()) {
            if (m3247() == null) {
                OkHttpClient.Builder builder = new OkHttpClient.Builder();
                TimeUnit timeUnitM8151 = C0050.m8151();
                OkHttpClient.Builder builderM3240 = m3240(m3228(m3246(m3231(m3236(m3244(builder, 15L, timeUnitM8151), 15L, timeUnitM8151), 15L, timeUnitM8151), false), false), true);
                X509TrustManager x509TrustManagerM1990 = C0008.m1990();
                c = m3232(m3234(builderM3240, new i(x509TrustManagerM1990), x509TrustManagerM1990));
            }
            okHttpClientM3247 = m3247();
        }
        return m3242(okHttpClientM3247, str, null, map, map2);
    }

    /* renamed from: ۣ۟۟۟ۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3226(Object obj, Object obj2) {
        if (C0010.m2320() <= 0) {
            return ((OkHttpClient.Builder) obj).cookieJar((CookieJar) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟۠۟ۨ, reason: not valid java name and contains not printable characters */
    public static Object m3227(Object obj) {
        if (C0057.m9017() >= 0) {
            return ((Request) obj).tag();
        }
        return null;
    }

    /* renamed from: ۟۟ۡۤۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3228(Object obj, boolean z) {
        if (C0046.m7701() >= 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۟۠ۢۢ, reason: not valid java name and contains not printable characters */
    public static void m3229(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            ((d) obj).b(obj2);
        }
    }

    /* renamed from: ۣ۟۠ۧ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m3230() {
        if (C0027.m5017() >= 0) {
            return b();
        }
        return null;
    }

    /* renamed from: ۣ۟ۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3231(Object obj, long j, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۥۥۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m3232(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۦۧ, reason: not valid java name and contains not printable characters */
    public static Dispatcher m3233(Object obj) {
        if (C0063.m9589() < 0) {
            return ((OkHttpClient) obj).dispatcher();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3234(Object obj, Object obj2, Object obj3) {
        if (C0047.m7837() >= 0) {
            return ((OkHttpClient.Builder) obj).sslSocketFactory((SSLSocketFactory) obj2, (X509TrustManager) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤۡۢ۟, reason: not valid java name and contains not printable characters */
    public static Object m3235() {
        if (C0037.m6350() < 0) {
            return a;
        }
        return null;
    }

    /* renamed from: ۟ۥۣۤۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3236(Object obj, long j, Object obj2) {
        if (C0006.m1726() <= 0) {
            return ((OkHttpClient.Builder) obj).writeTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۡۤۦ, reason: not valid java name and contains not printable characters */
    public static void m3237(Object obj) {
        if (C0010.m2320() < 0) {
            ((Call) obj).cancel();
        }
    }

    /* renamed from: ۠۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static short[] m3238() {
        if (C0023.m4566() <= 0) {
            return f359short;
        }
        return null;
    }

    /* renamed from: ۠ۤۥ۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m3239() {
        if (C0042.m7147() < 0) {
            return b;
        }
        return null;
    }

    /* renamed from: ۠ۥ۠ۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3240(Object obj, boolean z) {
        if (C0048.m7971() > 0) {
            return ((OkHttpClient.Builder) obj).retryOnConnectionFailure(z);
        }
        return null;
    }

    /* renamed from: ۠ۧۤۤ, reason: not valid java name and contains not printable characters */
    public static List m3241(Object obj) {
        if (C0000.m1116() < 0) {
            return ((Dispatcher) obj).queuedCalls();
        }
        return null;
    }

    /* renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static String m3242(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0058.m9131() < 0) {
            return i((OkHttpClient) obj, (String) obj2, (String) obj3, (Map) obj4, (Map) obj5);
        }
        return null;
    }

    /* renamed from: ۣۡۤ۠, reason: not valid java name and contains not printable characters */
    public static Request m3243(Object obj) {
        if (C0046.m7701() > 0) {
            return ((Call) obj).request();
        }
        return null;
    }

    /* renamed from: ۣۨۥ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3244(Object obj, long j, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۤ۠ۨۦ, reason: not valid java name and contains not printable characters */
    public static void m3245(Object obj, Object obj2) {
        if (C0063.m9589() < 0) {
            ((d) obj).a((OkHttpClient) obj2);
        }
    }

    /* renamed from: ۣۣۤۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m3246(Object obj, boolean z) {
        if (C0024.m4693() < 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۦ۟ۥۦ, reason: contains not printable characters */
    public static OkHttpClient m3247() {
        if (C0059.m9257() <= 0) {
            return c;
        }
        return null;
    }

    /* renamed from: ۧۨۨۨ, reason: not valid java name and contains not printable characters */
    public static List m3248(Object obj) {
        if (C0043.m7332() >= 0) {
            return ((Dispatcher) obj).runningCalls();
        }
        return null;
    }
}