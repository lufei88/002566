package com.github.catvod.spider.merge.a1;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.InputStream;
import java.util.HashMap;
import java.util.Iterator;
import java.util.Map;
import java.util.Set;
import okhttp3.Headers;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* loaded from: classes.dex */
public abstract class j {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f742short = {2586, 2620, 2602, 2621, 2658, 2574, 2600, 2602, 2593, 2619, 2354, 2320, 2309, 2326, 2323, 2323, 2334, 2384, 2378, 2385, 2383, 2399, 2391, 2344, 2326, 2321, 2331, 2320, 2312, 2316, 2399, 2353, 2347, 2399, 2382, 2383, 2385, 2383, 2372, 2399, 2344, 2326, 2321, 2377, 2379, 2372, 2399, 2311, 2377, 2379, 2390, 2399, 2366, 2319, 2319, 2323, 2330, 2344, 2330, 2333, 2356, 2326, 2315, 2384, 2378, 2380, 2376, 2385, 2380, 2377, 2399, 2391, 2356, 2359, 2347, 2354, 2355, 2387, 2399, 2323, 2326, 2324, 2330, 2399, 2360, 2330, 2332, 2324, 2320, 2390, 2399, 2364, 2327, 2317, 2320, 2322, 2330, 2384, 2382, 2380, 2377, 2385, 2383, 2385, 2383, 2385, 2383, 2399, 2348, 2334, 2329, 2334, 2317, 2326, 2384, 2378, 2380, 2376, 2385, 2380, 2377, 1600, 1644, 1645, 1655, 1638, 1645, 1655, 1582, 1623, 1658, 1651, 1638, 2609, 2589, 2588, 2566, 2583, 2588, 2566, 2655, 2614, 2587, 2561, 2562, 2589, 2561, 2587, 2566, 2587, 2589, 2588, 388, 479, 468, 390, 502, 392, 462, 387, 491, 457, 468, 451, 450, 413, 462, 457, 471, 390, 414, 456, 413, 467, 478, 474, 479, 478, 457, 390, 414, 456};

    public static Object[] a(String str, Map map) {
        C0006.m1755(map, C0006.m1774(m7261(), 0, 10, 2639), C0016.m3525(m7261(), 10, 111, 2431));
        Response responseM7260 = m7260(str, map);
        String strM7263 = m7263(m7259(responseM7260), C0035.m6131(m7261(), 121, 12, 1539));
        String strM72632 = m7263(m7259(responseM7260), C0033.m5852(m7261(), 133, 19, 2674));
        if (strM72632 != null) {
            strM7263 = C0041.m6752(strM72632);
        }
        HashMap map2 = new HashMap();
        Iterator itM5199 = C0029.m5199(m7262(m7259(responseM7260)));
        while (C0012.m2962(itM5199)) {
            String str2 = (String) C0048.m7949(itM5199);
            C0053.m8424(map2, str2, m7263(m7259(responseM7260), str2));
        }
        return new Object[]{C0011.m2808(m7258(responseM7260)), strM7263, m7256(m7257(responseM7260)), map2};
    }

    public static String b(String str, Map map) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        C0018.m3933(sb, C0041.m6779(m7261(), 152, 30, 443));
        return C0002.m1327(C0047.m7763(sb), new Object[]{C0050.m8153(C0012.m3018(str, C0002.m1270())), C0050.m8153(C0012.m3018(C0041.m6815(map), C0002.m1270()))});
    }

    /* renamed from: ۟۠۟ۥۡ, reason: not valid java name and contains not printable characters */
    public static InputStream m7256(Object obj) {
        if (C0009.m2047() >= 0) {
            return ((ResponseBody) obj).byteStream();
        }
        return null;
    }

    /* renamed from: ۟ۢۨۦۤ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m7257(Object obj) {
        if (C0034.m6048() <= 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۟ۤۨۢۥ, reason: not valid java name and contains not printable characters */
    public static int m7258(Object obj) {
        if (C0059.m9257() <= 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    /* renamed from: ۟ۦۣۢۥ, reason: not valid java name and contains not printable characters */
    public static Headers m7259(Object obj) {
        if (C0000.m1116() <= 0) {
            return ((Response) obj).headers();
        }
        return null;
    }

    /* renamed from: ۠۟ۥۧ, reason: not valid java name and contains not printable characters */
    public static Response m7260(Object obj, Object obj2) {
        if (C0008.m1975() > 0) {
            return com.github.catvod.spider.merge.Z.c.g((String) obj, (Map) obj2);
        }
        return null;
    }

    /* renamed from: ۡ۠, reason: not valid java name and contains not printable characters */
    public static short[] m7261() {
        if (C0005.m1599() < 0) {
            return f742short;
        }
        return null;
    }

    /* renamed from: ۤ۠۟ۤ, reason: not valid java name and contains not printable characters */
    public static Set m7262(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((Headers) obj).names();
        }
        return null;
    }

    /* renamed from: ۨۥۣۧ, reason: not valid java name and contains not printable characters */
    public static String m7263(Object obj, Object obj2) {
        if (C0036.m6252() >= 0) {
            return ((Headers) obj).get((String) obj2);
        }
        return null;
    }
}