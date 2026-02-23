package com.github.catvod.spider.merge.Z;

import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.IOException;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import java.util.concurrent.ConcurrentHashMap;
import java.util.concurrent.TimeUnit;
import javax.net.ssl.HostnameVerifier;
import javax.net.ssl.SSLSession;
import javax.net.ssl.SSLSocketFactory;
import javax.net.ssl.X509TrustManager;
import okhttp3.Call;
import okhttp3.Dns;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public final class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f689short = {2347, 517, 2388, 680, 676, 677, 677, 686, 680, 703, 2136, 2127, 2123, 2126, 2052, 2049, 2074, 2055, 2070, 1345, 1346, 1358, 1356, 1369, 1348, 1346, 1347, 2391, 2420, 2424, 2426, 2415, 2418, 2420, 2421, 1016, 1001, 1001, 1013, 1008, 1018, 1016, 1005, 1008, 1014, 1015, 950, 1011, 1002, 1014, 1015, 930, 953, 1018, 1009, 1016, 1003, 1002, 1020, 1005, 932, 1004, 1005, 1023, 948, 929, 1358, 1375, 1375, 1347, 1350, 1356, 1358, 1371, 1350, 1344, 1345, 1280, 1349, 1372, 1344, 1345, 1300, 1295, 1356, 1351, 1358, 1373, 1372, 1354, 1371, 1298, 1370, 1371, 1353, 1282, 1303, 2921, 2917, 2916, 2916, 2927, 2921, 2942, 1679, 1688, 1692, 1689, 725, 720, 715, 726, 711, 3048, 680, 692, 692, 688, 1918, 1855};
    public static final ThreadLocal c = new ThreadLocal();
    public final ConcurrentHashMap b = new ConcurrentHashMap();
    public final OkHttpClient a = m6294(m6287());

    public static void a() {
        ThreadLocal threadLocalM8861 = C0056.m8861();
        if (((Map) C0017.m3710(threadLocalM8861)) != null) {
            C0040.m6664(C0033.m5881(C0059.m9220()), C0004.m1568(C0064.m9620(C0031.m5631())));
            C0062.m9382(threadLocalM8861);
        }
    }

    public static d b(String str, Map map, Map map2) {
        d dVar;
        String strM5862 = str;
        try {
            Request.Builder builder = new Request.Builder();
            if (map != null) {
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, strM5862);
                C0018.m3933(sb, C0033.m5852(m6290(), 0, 1, 2324));
                String strM7763 = C0047.m7763(sb);
                Iterator itM5199 = C0029.m5199(C0026.m4887(map));
                while (C0012.m2962(itM5199)) {
                    String str2 = (String) C0048.m7949(itM5199);
                    StringBuilder sb2 = new StringBuilder();
                    C0018.m3933(sb2, str2);
                    C0018.m3933(sb2, C0002.m1305(m6290(), 1, 1, 568));
                    C0018.m3933(sb2, (String) C0062.m9431(map, str2));
                    C0018.m3933(sb2, C0063.m9585(m6290(), 2, 1, 2418));
                    strM7763 = C0050.m8125(strM7763, C0047.m7763(sb2));
                }
                strM5862 = C0033.m5862(strM7763);
            }
            if (map2 != null) {
                Iterator itM51992 = C0029.m5199(C0026.m4887(map2));
                while (C0012.m2962(itM51992)) {
                    String str3 = (String) C0048.m7949(itM51992);
                    m6283(builder, str3, (String) C0062.m9431(map2, str3));
                }
            }
            try {
                Response responseM6284 = m6284(m6278(m6272(), m6273(m6293(builder, strM5862))));
                dVar = new d(m6288(responseM6284), m6280(m6285(responseM6284)), m6268(m6274(responseM6284)));
            } catch (IOException unused) {
                dVar = new d();
            }
            return dVar;
        } finally {
            C0032.m5762();
        }
    }

    public static OkHttpClient.Builder c() {
        Dns dnsM6291;
        OkHttpClient.Builder builder = new OkHttpClient.Builder();
        try {
            dnsM6291 = m6295();
            C0047.m7777(dnsM6291);
        } catch (Throwable unused) {
            dnsM6291 = m6291();
        }
        OkHttpClient.Builder builderM6269 = m6269(builder, dnsM6291);
        TimeUnit timeUnitM8151 = C0050.m8151();
        return m6279(m6277(m6270(m6282(m6286(builderM6269, 30L, timeUnitM8151), 30L, timeUnitM8151), 30L, timeUnitM8151), new HostnameVerifier() { // from class: com.github.catvod.spider.merge.Z.a
            @Override // javax.net.ssl.HostnameVerifier
            public final boolean verify(String str, SSLSession sSLSession) {
                C0056.m8861();
                return true;
            }
        }), new f(), C0049.m8002());
    }

    public static OkHttpClient d() {
        Map map = (Map) C0017.m3710(C0056.m8861());
        if (map == null) {
            return C0033.m5890(C0059.m9220());
        }
        long jM9620 = C0064.m9620(C0031.m5631());
        OkHttpClient okHttpClient = (OkHttpClient) C0030.m5374(C0033.m5881(C0059.m9220()), C0004.m1568(jM9620));
        if (okHttpClient == null) {
            synchronized (C0033.m5881(C0059.m9220())) {
                try {
                    okHttpClient = (OkHttpClient) C0030.m5374(C0033.m5881(C0059.m9220()), C0004.m1568(jM9620));
                    if (okHttpClient == null) {
                        OkHttpClient.Builder builderM6287 = m6287();
                        long jM5649 = C0031.m5649((Long) C0062.m9431(map, C0004.m1549(m6290(), 3, 7, 715)));
                        TimeUnit timeUnitM8151 = C0050.m8151();
                        m6286(builderM6287, jM5649, timeUnitM8151);
                        m6282(builderM6287, C0031.m5649((Long) C0062.m9431(map, C0000.m1077(m6290(), 10, 4, 2090))), timeUnitM8151);
                        m6270(builderM6287, C0031.m5649((Long) C0062.m9431(map, C0040.m6584(m6290(), 14, 5, 2163))), timeUnitM8151);
                        OkHttpClient okHttpClientM6294 = m6294(builderM6287);
                        C0023.m4551(C0033.m5881(C0059.m9220()), C0004.m1568(jM9620), okHttpClientM6294);
                        okHttpClient = okHttpClientM6294;
                    }
                } finally {
                }
            }
        }
        return okHttpClient;
    }

    public static String e(String str, HashMap map) {
        Object objM7915;
        try {
            Map mapM6268 = m6268(m6274(m6284(m6278(m6294(m6281(m6297(m6276(m6272()), false), false)), m6273(m6292(m6293(new Request.Builder(), str), m6298(map)))))));
            String str2 = null;
            if (mapM6268 != null) {
                String strM6307 = C0037.m6307(m6290(), 19, 8, 1325);
                if (C0024.m4748(mapM6268, strM6307)) {
                    objM7915 = C0048.m7915((List) C0062.m9431(mapM6268, strM6307), 0);
                } else {
                    String strM8814 = C0055.m8814(m6290(), 27, 8, 2331);
                    if (C0024.m4748(mapM6268, strM8814)) {
                        objM7915 = C0048.m7915((List) C0062.m9431(mapM6268, strM8814), 0);
                    }
                }
                str2 = (String) objM7915;
            }
            return str2;
        } finally {
            C0032.m5762();
        }
    }

    public static Response f(String str) {
        try {
            return m6284(m6278(m6272(), m6273(m6293(new Request.Builder(), str))));
        } finally {
            C0032.m5762();
        }
    }

    public static Response g(String str, Map map) {
        try {
            return m6284(m6278(m6272(), m6273(m6292(m6293(new Request.Builder(), str), m6298(map)))));
        } finally {
            C0032.m5762();
        }
    }

    public static d h(String str, String str2, HashMap map) {
        d dVar;
        try {
            Request.Builder builder = new Request.Builder();
            m6296(builder, !C0043.m7327(str2) ? m6299(m6289(C0010.m2300(m6290(), 35, 31, 921)), str2) : m6271(new FormBody.Builder()));
            if (map != null) {
                Iterator itM5199 = C0029.m5199(C0026.m4887(map));
                while (C0012.m2962(itM5199)) {
                    String str3 = (String) C0048.m7949(itM5199);
                    m6283(builder, str3, (String) C0062.m9431(map, str3));
                }
            }
            try {
                Response responseM6284 = m6284(m6278(m6272(), m6273(m6293(builder, str))));
                dVar = new d(m6288(responseM6284), m6280(m6285(responseM6284)), m6268(m6274(responseM6284)));
            } catch (IOException unused) {
                dVar = new d();
            }
            return dVar;
        } finally {
            C0032.m5762();
        }
    }

    public static d i(String str, Map map, Map map2) {
        RequestBody requestBodyM6271;
        d dVar;
        try {
            Request.Builder builder = new Request.Builder();
            if (C0043.m7327(null)) {
                FormBody.Builder builder2 = new FormBody.Builder();
                if (map != null) {
                    Iterator itM5199 = C0029.m5199(C0026.m4887(map));
                    while (C0012.m2962(itM5199)) {
                        String str2 = (String) C0048.m7949(itM5199);
                        m6275(builder2, str2, (String) C0062.m9431(map, str2));
                    }
                }
                requestBodyM6271 = m6271(builder2);
            } else {
                requestBodyM6271 = m6299(m6289(C0007.m1842(m6290(), 66, 31, 1327)), null);
            }
            m6296(builder, requestBodyM6271);
            if (map2 != null) {
                Iterator itM51992 = C0029.m5199(C0026.m4887(map2));
                while (C0012.m2962(itM51992)) {
                    String str3 = (String) C0048.m7949(itM51992);
                    m6283(builder, str3, (String) C0062.m9431(map2, str3));
                }
            }
            try {
                Response responseM6284 = m6284(m6278(m6272(), m6273(m6293(builder, str))));
                dVar = new d(m6288(responseM6284), m6280(m6285(responseM6284)), m6268(m6274(responseM6284)));
            } catch (IOException unused) {
                dVar = new d();
            }
            return dVar;
        } finally {
            C0032.m5762();
        }
    }

    public static void j(long j, long j2, long j3) {
        HashMap map = new HashMap();
        C0053.m8424(map, C0026.m4951(m6290(), 97, 7, 2826), C0004.m1568(j));
        C0053.m8424(map, C0015.m3484(m6290(), 104, 4, 1789), C0004.m1568(j2));
        C0053.m8424(map, C0050.m8131(m6290(), 108, 5, 674), C0004.m1568(j3));
        C0042.m7194(C0056.m8861(), map);
    }

    public static String k(String str, HashMap map, Map map2) {
        String strM1840;
        d dVar;
        String strM9585 = C0063.m9585(m6290(), 113, 1, 3031);
        try {
            if (C0043.m7277(str, C0030.m5362(m6290(), 114, 4, 704))) {
                Request.Builder builder = new Request.Builder();
                String strM8125 = C0050.m8125(str, strM9585);
                Iterator itM5199 = C0029.m5199(C0000.m1121(map));
                while (C0012.m2962(itM5199)) {
                    String str2 = (String) C0048.m7949(itM5199);
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, str2);
                    C0018.m3933(sb, C0034.m6001(m6290(), 118, 1, 1859));
                    C0018.m3933(sb, (String) C0065.m9715(map, str2));
                    C0018.m3933(sb, C0020.m4199(m6290(), 119, 1, 1817));
                    strM8125 = C0050.m8125(strM8125, C0047.m7763(sb));
                }
                String strM5862 = C0033.m5862(strM8125);
                if (map2 != null) {
                    Iterator itM51992 = C0029.m5199(C0026.m4887(map2));
                    while (C0012.m2962(itM51992)) {
                        String str3 = (String) C0048.m7949(itM51992);
                        m6283(builder, str3, (String) C0062.m9431(map2, str3));
                    }
                }
                try {
                    Response responseM6284 = m6284(m6278(m6272(), m6273(m6293(builder, strM5862))));
                    dVar = new d(m6288(responseM6284), m6280(m6285(responseM6284)), m6268(m6274(responseM6284)));
                } catch (IOException unused) {
                    dVar = new d();
                }
                strM1840 = C0008.m2029(dVar);
            } else {
                strM1840 = C0007.m1840();
            }
            C0032.m5762();
            return strM1840;
        } catch (Throwable th) {
            C0032.m5762();
            throw th;
        }
    }

    public static String l(String str, Map map) {
        return C0003.m1444(str, new HashMap(), map);
    }

    /* renamed from: ۣ۟۟ۨۧ, reason: not valid java name and contains not printable characters */
    public static Map m6268(Object obj) {
        if (C0041.m6823() <= 0) {
            return ((Headers) obj).toMultimap();
        }
        return null;
    }

    /* renamed from: ۟۟ۤۦۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6269(Object obj, Object obj2) {
        if (C0008.m1975() >= 0) {
            return ((OkHttpClient.Builder) obj).dns((Dns) obj2);
        }
        return null;
    }

    /* renamed from: ۟۟ۨ۠ۨ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6270(Object obj, long j, Object obj2) {
        if (C0017.m3633() <= 0) {
            return ((OkHttpClient.Builder) obj).writeTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟۠ۡ۠, reason: not valid java name and contains not printable characters */
    public static FormBody m6271(Object obj) {
        if (C0049.m8038() <= 0) {
            return ((FormBody.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۟ۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient m6272() {
        if (C0055.m8740() >= 0) {
            return d();
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۦ۟, reason: not valid java name and contains not printable characters */
    public static Request m6273(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۦۡ, reason: not valid java name and contains not printable characters */
    public static Headers m6274(Object obj) {
        if (C0050.m8121() < 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۟ۡ۠ۧ۠, reason: not valid java name and contains not printable characters */
    public static FormBody.Builder m6275(Object obj, Object obj2, Object obj3) {
        if (C0019.m4065() <= 0) {
            return ((FormBody.Builder) obj).add((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣ۟ۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6276(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((OkHttpClient) obj).newBuilder();
        }
        return null;
    }

    /* renamed from: ۟ۡۧۤۡ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6277(Object obj, Object obj2) {
        if (C0031.m5628() > 0) {
            return ((OkHttpClient.Builder) obj).hostnameVerifier((HostnameVerifier) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣ۟ۢ۠, reason: not valid java name and contains not printable characters */
    public static Call m6278(Object obj, Object obj2) {
        if (C0060.m9355() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۥۦۦ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6279(Object obj, Object obj2, Object obj3) {
        if (C0051.m8216() < 0) {
            return ((OkHttpClient.Builder) obj).sslSocketFactory((SSLSocketFactory) obj2, (X509TrustManager) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۤ۟, reason: not valid java name and contains not printable characters */
    public static String m6280(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۟ۤ۟ۧۧ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6281(Object obj, boolean z) {
        if (C0044.m7508() < 0) {
            return ((OkHttpClient.Builder) obj).followSslRedirects(z);
        }
        return null;
    }

    /* renamed from: ۟ۥۦ۟ۦ, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6282(Object obj, long j, Object obj2) {
        if (C0026.m4977() < 0) {
            return ((OkHttpClient.Builder) obj).readTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥۧۥۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6283(Object obj, Object obj2, Object obj3) {
        if (C0050.m8121() <= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۦۣ۟ۧ, reason: not valid java name and contains not printable characters */
    public static Response m6284(Object obj) {
        if (C0005.m1599() <= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۟ۧ۠ۤۢ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m6285(Object obj) {
        if (C0050.m8121() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۡ۟ۨ۟, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6286(Object obj, long j, Object obj2) {
        if (C0050.m8121() <= 0) {
            return ((OkHttpClient.Builder) obj).connectTimeout(j, (TimeUnit) obj2);
        }
        return null;
    }

    /* renamed from: ۡۡ۠۠, reason: not valid java name and contains not printable characters */
    public static OkHttpClient.Builder m6287() {
        if (C0034.m6048() <= 0) {
            return c();
        }
        return null;
    }

    /* renamed from: ۣۡۡۡ, reason: not valid java name and contains not printable characters */
    public static int m6288(Object obj) {
        if (C0039.m6529() <= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۡۥۧۦ, reason: not valid java name and contains not printable characters */
    public static MediaType m6289(Object obj) {
        if (C0034.m6048() < 0) {
            return MediaType.get((String) obj);
        }
        return null;
    }

    /* renamed from: ۡۧۥ۟, reason: not valid java name and contains not printable characters */
    public static short[] m6290() {
        if (C0054.m8557() < 0) {
            return f689short;
        }
        return null;
    }

    /* renamed from: ۤۦۣۢ, reason: not valid java name and contains not printable characters */
    public static Dns m6291() {
        if (C0015.m3433() >= 0) {
            return Dns.SYSTEM;
        }
        return null;
    }

    /* renamed from: ۥۣ۠ۡ, reason: contains not printable characters */
    public static Request.Builder m6292(Object obj, Object obj2) {
        if (C0001.m1164() < 0) {
            return ((Request.Builder) obj).headers((Headers) obj2);
        }
        return null;
    }

    /* renamed from: ۥۡۧۧ, reason: contains not printable characters */
    public static Request.Builder m6293(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۥۤۢۧ, reason: contains not printable characters */
    public static OkHttpClient m6294(Object obj) {
        if (C0044.m7508() < 0) {
            return ((OkHttpClient.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۥۦۨ, reason: contains not printable characters */
    public static Dns m6295() {
        if (C0019.m4065() < 0) {
            return Spider.safeDns();
        }
        return null;
    }

    /* renamed from: ۦۤۧۥ, reason: contains not printable characters */
    public static Request.Builder m6296(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۦۤۨۡ, reason: contains not printable characters */
    public static OkHttpClient.Builder m6297(Object obj, boolean z) {
        if (C0040.m6582() >= 0) {
            return ((OkHttpClient.Builder) obj).followRedirects(z);
        }
        return null;
    }

    /* renamed from: ۨۢۨۤ, reason: not valid java name and contains not printable characters */
    public static Headers m6298(Object obj) {
        if (C0013.m3167() >= 0) {
            return Headers.of((Map) obj);
        }
        return null;
    }

    /* renamed from: ۨۨۧ۟, reason: not valid java name and contains not printable characters */
    public static RequestBody m6299(Object obj, Object obj2) {
        if (C0045.m7538() <= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }
}