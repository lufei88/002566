package com.github.catvod.spider.p000mergexbpq.h;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.List;
import java.util.Map;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.Headers;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;

/* loaded from: classes.dex */
public final class b {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f347short = {1742, 1756, 1755, 1752, 1785, 1747, 1742, 2487, 2472, 2484, 2483, 961, 990, 962, 965, 2439, 2456, 2436, 2435, 1421, 1425, 1425, 1429, 1430, 1503, 1482, 1482, 1429, 1412, 1430, 1430, 1429, 1418, 1431, 1425, 1483, 1412, 1417, 1420, 1436, 1424, 1419, 1409, 1431, 1420, 1427, 1408, 1483, 1414, 1418, 1416, 1482, 1419, 1408, 1426, 1417, 1418, 1410, 1420, 1419, 1482, 1428, 1431, 1414, 1418, 1409, 1408, 1482, 1428, 1424, 1408, 1431, 1436, 1483, 1409, 1418, 1498, 1412, 1429, 1429, 1451, 1412, 1416, 1408, 1496, 1412, 1417, 1420, 1436, 1424, 1419, 1466, 1409, 1431, 1420, 1427, 1408, 1475, 1411, 1431, 1418, 1416, 1462, 1420, 1425, 1408, 1496, 1488, 1495, 1475, 1466, 1415, 1437, 1480, 1427, 1496, 1495, 1483, 1495, 1483, 1494, 2448, 2450, 2435};
    private final OkHttpClient a;

    public b() {
        Dns dnsM2887;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsM2887 = (Dns) C0052.m8352(C0065.m9803(Spider.class, C0050.m8131(m2898(), 0, 7, 1725), new Class[0]), null, new Object[0]);
        } catch (Exception unused) {
            dnsM2887 = m2887();
        }
        OkHttpClient.Builder builderM2907 = m2907(builder, dnsM2887);
        TimeUnit timeUnitM8151 = C0050.m8151();
        OkHttpClient.Builder builderM2902 = m2902(m2904(m2891(builderM2907, 30L, timeUnitM8151), 30L, timeUnitM8151), 30L, timeUnitM8151);
        C0042.m7114();
        OkHttpClient okHttpClientM2903 = m2903(m2890(m2900(builderM2902, C0030.m5331()), new g(), C0042.m7114()));
        this.a = okHttpClientM2903;
        m2903(m2905(m2895(m2901(okHttpClientM2903), false), false));
    }

    public static Response a(String str) {
        return m2906(m2896(m2908(m2892()), m2894(m2893(new Request.Builder(), str))));
    }

    public static Response b(String str, Map<String, String> map) {
        return m2906(m2896(m2908(m2892()), m2894(m2889(m2893(new Request.Builder(), str), m2888(map)))));
    }

    public static String c(String str, Map<String, String> map, Map<String, String> map2) {
        return m2899(m2908(m2892()), C0025.m4795(m2898(), 7, 4, 2535), str, map, map2, null);
    }

    public static String d(String str, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        return m2899(m2908(m2892()), C0034.m6001(m2898(), 11, 4, 913), str, map, map2, map3);
    }

    public static String e(Map map) {
        return m2899(m2908(m2892()), C0000.m1077(m2898(), 15, 4, 2519), C0022.m4403(m2898(), 19, 102, 1509), map, null, null);
    }

    public static d f(String str, String str2, Map<String, String> map) {
        return m2909(new c(str, str2, map), m2908(m2892()));
    }

    public static String g(String str, Map<String, String> map) {
        return C0006.m1699(str, map, null);
    }

    public static String h(String str, Map<String, String> map, Map<String, List<String>> map2) {
        return m2899(m2908(m2892()), C0042.m7151(m2898(), 121, 3, 2519), str, null, map, map2);
    }

    public static String i(OkHttpClient okHttpClient, String str, String str2, Map map, Map map2, Map map3) {
        c cVar = new c(str, str2, map, map2, map3);
        m2897(cVar);
        return C0051.m8249(m2909(cVar, okHttpClient));
    }

    /* renamed from: ۟۟ۤۦۦ, reason: not valid java name and contains not printable characters */
    public static Dns m2887() {
        if (C0049.m8038() < 0) {
            return Dns.SYSTEM;
        }
        return null;
    }

    /* renamed from: ۟۠۟۠ۦ, reason: not valid java name and contains not printable characters */
    public static Headers m2888(Object obj) {
        if (C0063.m9589() <= 0) {
            return Headers.of((Map) obj);
        }
        return null;
    }

    /* renamed from: ۟۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m2889(Object obj, Object obj2) {
        if (C0034.m6048() < 0) {
            return ((Request.Builder) obj).headers((Headers) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۨۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m2890(Object obj, Object obj2, Object obj3) {
        if (C0060.m9355() >= 0) {
            return ((OkHttpClient.Builder) obj).sslSocketFactory((SSLSocketFactory) obj2, (X509TrustManager) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡۧۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m2891(Object obj, long j, Object obj2) {
        if (C0027.m5017() > 0) {
            return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟۠۟, reason: not valid java name and contains not printable characters */
    public static b m2892() {
        if (C0041.m6823() <= 0) {
            return a.a;
        }
        return null;
    }

    /* renamed from: ۣ۟ۤۡ۟, reason: not valid java name and contains not printable characters */
    public static Request.Builder m2893(Object obj, Object obj2) {
        if (C0015.m3433() > 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤۢۦۢ, reason: not valid java name and contains not printable characters */
    public static Request m2894(Object obj) {
        if (C0012.m3024() >= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۤۧۡۤ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m2895(Object obj, boolean z) {
        if (C0059.m9257() <= 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static Call m2896(Object obj, Object obj2) {
        if (C0016.m3596() < 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۥ۟, reason: not valid java name and contains not printable characters */
    public static c m2897(Object obj) {
        if (C0045.m7538() <= 0) {
            return ((c) obj).b();
        }
        return null;
    }

    /* renamed from: ۟ۦۧۧۨ, reason: not valid java name and contains not printable characters */
    public static short[] m2898() {
        if (C0033.m5872() > 0) {
            return f347short;
        }
        return null;
    }

    /* renamed from: ۡ۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2899(Object obj, Object obj2, Object obj3, Object obj4, Object obj5, Object obj6) {
        if (C0013.m3167() > 0) {
            return i((OkHttpClient) obj, (String) obj2, (String) obj3, (Map) obj4, (Map) obj5, (Map) obj6);
        }
        return null;
    }

    /* renamed from: ۡۤ۠۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m2900(Object obj, Object obj2) {
        if (C0013.m3167() >= 0) {
            return ((OkHttpClient.Builder) obj).hostnameVerifier((HostnameVerifier) obj2);
        }
        return null;
    }

    /* renamed from: ۡۦۣۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m2901(Object obj) {
        if (C0023.m4566() < 0) {
            return ((OkHttpClient) obj).newBuilder();
        }
        return null;
    }

    /* renamed from: ۣۣۢۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m2902(Object obj, long j, Object obj2) {
        if (C0013.m3167() > 0) {
            return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m2903(Object obj) {
        if (C0046.m7701() >= 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۥ۠ۤۥ, reason: contains not printable characters */
    public static OkHttpClient.Builder m2904(Object obj, long j, Object obj2) {
        if (C0003.m1463() <= 0) {
            return ((OkHttpClient.Builder) obj).writeTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۥۤۢۤ, reason: contains not printable characters */
    public static OkHttpClient.Builder m2905(Object obj, boolean z) {
        if (C0012.m3024() > 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۥۥۥۧ, reason: contains not printable characters */
    public static Response m2906(Object obj) {
        if (C0020.m4210() <= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۦ۠۟ۨ, reason: contains not printable characters */
    public static OkHttpClient.Builder m2907(Object obj, Object obj2) {
        if (C0034.m6048() < 0) {
            return ((OkHttpClient.Builder) obj).dns((Dns) obj2);
        }
        return null;
    }

    /* renamed from: ۨۢۥۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m2908(Object obj) {
        if (C0031.m5628() > 0) {
            return ((b) obj).a;
        }
        return null;
    }

    /* renamed from: ۨۧۦۤ, reason: not valid java name and contains not printable characters */
    public static d m2909(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return ((c) obj).a((OkHttpClient) obj2);
        }
        return null;
    }
}