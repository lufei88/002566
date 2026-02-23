package com.github.catvod.spider.merge.b0;

import com.github.catvod.spider.HBlingDu;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.google.gson.Gson;
import com.google.gson.JsonArray;
import com.google.gson.JsonObject;
import java.io.Serializable;
import java.util.HashMap;
import java.util.Map;
import java.util.concurrent.Callable;

/* loaded from: classes.dex */
public final /* synthetic */ class h implements Callable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f753short = {27717, 27227, 18232, 29203, 23869, 28244, 18371, 2319, 2325, 2385, 2388, 2395, 2392, 2368, 2398, 2368, 20498, 21818, 2312, 2880, 2908, 2908, 2904, 2907, 2834, 2823, 2823, 2892, 2885, 2883, 2909, 2822, 2880, 2884, 2907, 2822, 2887, 2886, 2893, 2823, 2839, 2889, 2891, 2837, 2892, 2885, 2830, 2881, 2892, 2837, 2420, 2386, 2372, 2387, 2316, 2400, 2374, 2372, 2383, 2389, 3046, 3012, 3025, 3010, 3015, 3015, 3018, 2948, 2974, 2949, 2971, 2148, 2169, 2158, 2157, 2146, 2152, 2145, 2082, 2172, 2148, 2172, 3308, 3305, 3302, 3301, 3325, 3299, 3325, 23115, 30537, 794, 797, 771, 26297, 21173, -27050, 885, 879};
    public final /* synthetic */ int a;
    public final /* synthetic */ Object b;
    public final /* synthetic */ Object c;
    public final /* synthetic */ Object d;

    public /* synthetic */ h(int i, Serializable serializable, Object obj, Object obj2) {
        this.a = i;
        this.b = obj;
        this.c = serializable;
        this.d = obj2;
    }

    /* renamed from: ۟۠ۤۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m7521(Object obj, Object obj2, Object obj3) {
        if (C0022.m4497() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۟ۢۧۦۢ, reason: not valid java name and contains not printable characters */
    public static int m7522(Object obj) {
        if (C0060.m9355() > 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۟ۤۨۧۤ, reason: not valid java name and contains not printable characters */
    public static short[] m7523() {
        if (C0007.m1886() > 0) {
            return f753short;
        }
        return null;
    }

    /* renamed from: ۥۦۢۦ, reason: contains not printable characters */
    public static JsonArray m7524(Object obj, Object obj2) {
        if (C0041.m6823() <= 0) {
            return ((JsonObject) obj).getAsJsonArray((String) obj2);
        }
        return null;
    }

    @Override // java.util.concurrent.Callable
    public final Object call() throws com.github.catvod.spider.merge.d0.a {
        switch (C0060.m9292(this)) {
            case 0:
                return C0045.m7556((HBlingDu) C0030.m5438(this), (Map) C0027.m5042(this), (Map) C0020.m4221(this));
            default:
                String str = (String) C0027.m5042(this);
                String str2 = (String) C0020.m4221(this);
                com.github.catvod.spider.merge.U.p pVar = (com.github.catvod.spider.merge.U.p) C0030.m5438(this);
                C0047.m7777(pVar);
                String strM1645 = C0005.m1645(m7523(), 0, 19, 2357);
                try {
                    C0058.m9127(str, C0065.m9775(m7523(), 19, 31, 2856));
                    C0041.m6757(5L, 10L, 30L);
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, str);
                    C0018.m3933(sb, str2);
                    String strM7763 = C0047.m7763(sb);
                    HashMap map = new HashMap();
                    C0053.m8424(map, C0008.m1970(m7523(), 50, 10, 2337), C0041.m6779(m7523(), 60, 11, 2987));
                    String strM5769 = C0032.m5769(strM7763, map);
                    if (C0058.m9127(str, C0003.m1398(m7523(), 71, 11, 2060))) {
                        strM5769 = C0045.m7630(strM5769);
                    }
                    JsonArray jsonArrayM7524 = m7524((JsonObject) m7521((Gson) C0039.m6515(pVar), strM5769, JsonObject.class), C0033.m5852(m7523(), 82, 7, 3208));
                    if (jsonArrayM7524 != null && m7522(jsonArrayM7524) > 5) {
                        return strM5769;
                    }
                    StringBuilder sb2 = new StringBuilder(strM1645);
                    C0036.m6177(sb2, jsonArrayM7524 != null ? m7522(jsonArrayM7524) : 0);
                    throw new com.github.catvod.spider.merge.d0.a(C0047.m7763(sb2));
                } catch (Exception e) {
                    throw new com.github.catvod.spider.merge.d0.a(C0026.m4915(C0053.m8477(m7523(), 89, 10, 847), str), e);
                }
        }
    }
}