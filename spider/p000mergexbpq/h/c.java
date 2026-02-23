package com.github.catvod.spider.p000mergexbpq.h;

import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.IOException;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Call;
import okhttp3.FormBody;
import okhttp3.Headers;
import okhttp3.MediaType;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.RequestBody;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
final class c {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f348short = {1759, 1757, 1740, 403, 526, 1550, 2022, 2041, 2021, 2018, 1236, 1221, 1221, 1241, 1244, 1238, 1236, 1217, 1244, 1242, 1243, 1178, 1247, 1222, 1242, 1243, 1166, 1173, 1238, 1245, 1236, 1223, 1222, 1232, 1217, 1160, 1216, 1217, 1235, 1176, 1165, 297, 310, 298, 301};
    private final Map<String, List<String>> a;
    private final Map<String, String> b;
    private final Map<String, String> c;
    private final String d;
    private final String e;
    private Request f;
    private String g;
    private Object h;

    private c(String str, String str2, String str3, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        RequestBody requestBodyM2925;
        this.g = str2;
        this.e = str3;
        this.d = str;
        this.c = map;
        this.b = map2;
        this.a = map3;
        Request.Builder builder = new Request.Builder();
        if (C0007.m1815(str, C0029.m5256(m2931(), 0, 3, 1688)) && map != null) {
            this.g = C0040.m6629(new StringBuilder(), m2921(this), C0015.m3484(m2931(), 3, 1, 428));
            Iterator itM5199 = C0029.m5199(C0026.m4887(map));
            while (C0012.m2962(itM5199)) {
                String str4 = (String) C0048.m7949(itM5199);
                String strM2921 = m2921(this);
                StringBuilder sb = new StringBuilder();
                C0018.m3933(sb, str4);
                C0018.m3933(sb, C0033.m5852(m2931(), 4, 1, 563));
                C0018.m3933(sb, (String) C0062.m9431(m2914(this), str4));
                C0018.m3933(sb, C0004.m1549(m2931(), 5, 1, 1576));
                this.g = C0050.m8125(strM2921, C0047.m7763(sb));
            }
            String strM29212 = m2921(this);
            C0008.m2018();
            if (strM29212 != null && C0004.m1584(strM29212) > 1) {
                strM29212 = C0054.m8636(strM29212, 0, C0004.m1584(strM29212) - 1);
            }
            this.g = strM29212;
        }
        if (C0007.m1815(m2924(this), C0044.m7509(m2931(), 6, 4, 1974))) {
            if (C0043.m7327(m2933(this))) {
                FormBody.Builder builder2 = new FormBody.Builder();
                Map mapM2914 = m2914(this);
                if (mapM2914 != null) {
                    Iterator itM51992 = C0029.m5199(C0026.m4887(mapM2914));
                    while (C0012.m2962(itM51992)) {
                        String str5 = (String) C0048.m7949(itM51992);
                        m2917(builder2, str5, (String) C0062.m9431(m2914(this), str5));
                    }
                }
                requestBodyM2925 = m2925(builder2);
            } else {
                requestBodyM2925 = m2928(m2916(C0065.m9775(m2931(), 10, 31, 1205)), m2933(this));
            }
            m2913(builder, requestBodyM2925);
        }
        Map mapM2927 = m2927(this);
        if (mapM2927 != null) {
            Iterator itM51993 = C0029.m5199(C0026.m4887(mapM2927));
            while (C0012.m2962(itM51993)) {
                String str6 = (String) C0048.m7949(itM51993);
                m2929(builder, str6, (String) C0062.m9431(m2927(this), str6));
            }
        }
        Object objM2915 = m2915(this);
        if (objM2915 != null) {
            m2911(builder, objM2915);
        }
        this.f = m2930(m2926(builder, m2921(this)));
    }

    c(String str, String str2, Map map) {
        this(C0021.m4340(m2931(), 41, 4, 377), str, str2, null, map, null);
    }

    c(String str, String str2, Map<String, String> map, Map<String, String> map2, Map<String, List<String>> map3) {
        this(str, str2, null, map, map2, map3);
    }

    /* renamed from: ۣۣ۟۠ۧ, reason: not valid java name and contains not printable characters */
    public static Call m2910(Object obj, Object obj2) {
        if (C0049.m8038() <= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۡۡۦۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m2911(Object obj, Object obj2) {
        if (C0031.m5628() >= 0) {
            return ((Request.Builder) obj).tag(obj2);
        }
        return null;
    }

    /* renamed from: ۣ۟ۢۤ۠, reason: not valid java name and contains not printable characters */
    public static String m2912(Object obj) {
        if (C0035.m6140() < 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۟ۢۨ۟ۢ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m2913(Object obj, Object obj2) {
        if (C0006.m1726() < 0) {
            return ((Request.Builder) obj).post((RequestBody) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۢۦ, reason: not valid java name and contains not printable characters */
    public static Map m2914(Object obj) {
        if (C0043.m7332() > 0) {
            return ((c) obj).c;
        }
        return null;
    }

    /* renamed from: ۟ۤ۠ۤۨ, reason: not valid java name and contains not printable characters */
    public static Object m2915(Object obj) {
        if (C0021.m4379() >= 0) {
            return ((c) obj).h;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۦۦ, reason: not valid java name and contains not printable characters */
    public static MediaType m2916(Object obj) {
        if (C0036.m6252() >= 0) {
            return MediaType.parse((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۥۣۡۢ, reason: not valid java name and contains not printable characters */
    public static FormBody.Builder m2917(Object obj, Object obj2, Object obj3) {
        if (C0030.m5375() > 0) {
            return ((FormBody.Builder) obj).add((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۧۤ۟ۡ, reason: not valid java name and contains not printable characters */
    public static Headers m2918(Object obj) {
        if (C0013.m3167() > 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۟ۧۥۣۨ, reason: not valid java name and contains not printable characters */
    public static int m2919(Object obj) {
        if (C0004.m1557() <= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۠ۥۣ, reason: not valid java name and contains not printable characters */
    public static Map m2920(Object obj) {
        if (C0060.m9355() >= 0) {
            return ((Headers) obj).toMultimap();
        }
        return null;
    }

    /* renamed from: ۠ۨۦۨ, reason: not valid java name and contains not printable characters */
    public static String m2921(Object obj) {
        if (C0007.m1886() > 0) {
            return ((c) obj).g;
        }
        return null;
    }

    /* renamed from: ۡۥۣۢ, reason: not valid java name and contains not printable characters */
    public static Response m2922(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۢۦۨۤ, reason: not valid java name and contains not printable characters */
    public static Map m2923(Object obj) {
        if (C0013.m3167() >= 0) {
            return ((c) obj).a;
        }
        return null;
    }

    /* renamed from: ۣ۟۟ۤ, reason: not valid java name and contains not printable characters */
    public static String m2924(Object obj) {
        if (C0064.m9659() < 0) {
            return ((c) obj).d;
        }
        return null;
    }

    /* renamed from: ۣ۠۠ۥ, reason: not valid java name and contains not printable characters */
    public static FormBody m2925(Object obj) {
        if (C0027.m5017() >= 0) {
            return ((FormBody.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۣ۠ۡۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m2926(Object obj, Object obj2) {
        if (C0056.m8886() < 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۣۤۥ, reason: not valid java name and contains not printable characters */
    public static Map m2927(Object obj) {
        if (C0022.m4497() > 0) {
            return ((c) obj).b;
        }
        return null;
    }

    /* renamed from: ۣۥۥۧ, reason: not valid java name and contains not printable characters */
    public static RequestBody m2928(Object obj, Object obj2) {
        if (C0053.m8389() >= 0) {
            return RequestBody.create((MediaType) obj, (String) obj2);
        }
        return null;
    }

    /* renamed from: ۣۤۢۧ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m2929(Object obj, Object obj2, Object obj3) {
        if (C0017.m3633() <= 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۦۢۧ۠, reason: contains not printable characters */
    public static Request m2930(Object obj) {
        if (C0020.m4210() < 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۦۤۧۧ, reason: contains not printable characters */
    public static short[] m2931() {
        if (C0064.m9659() < 0) {
            return f348short;
        }
        return null;
    }

    /* renamed from: ۣۧۨۥ, reason: not valid java name and contains not printable characters */
    public static Request m2932(Object obj) {
        if (C0017.m3633() <= 0) {
            return ((c) obj).f;
        }
        return null;
    }

    /* renamed from: ۣۧۨۤ, reason: not valid java name and contains not printable characters */
    public static String m2933(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((c) obj).e;
        }
        return null;
    }

    /* renamed from: ۨۢۤۥ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m2934(Object obj) {
        if (C0003.m1463() < 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    public final d a(OkHttpClient okHttpClient) {
        try {
            Response responseM2922 = m2922(m2910(okHttpClient, m2932(this)));
            Map mapM2923 = m2923(this);
            if (mapM2923 != null) {
                C0004.m1548(mapM2923);
            }
            Map mapM29232 = m2923(this);
            if (mapM29232 != null) {
                C0051.m8198(mapM29232, m2920(m2918(responseM2922)));
            }
            return new d(m2919(responseM2922), m2912(m2934(responseM2922)));
        } catch (IOException unused) {
            return new d();
        }
    }

    public final c b() {
        this.h = null;
        return this;
    }
}