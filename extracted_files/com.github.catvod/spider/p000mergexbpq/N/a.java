package com.github.catvod.spider.p000mergexbpq.N;

import android.graphics.Bitmap;
import com.github.catvod.spider.merge-xbpq.r.c;
import com.github.catvod.spider.merge-xbpq.s.b;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.h;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.r.EnumC0143b;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import java.io.BufferedReader;
import java.io.ByteArrayInputStream;
import java.io.StringReader;
import java.util.ArrayList;
import java.util.EnumMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONException;
import org.json.JSONObject;

/* loaded from: classes.dex */
public final class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f140short = {1059, 1058, 1072, 1115, 1102, 782, 822, 816, 823, 867, 801, 806, 867, 805, 802, 815, 816, 806, 2622, 2566, 2560, 2567, 2643, 2577, 2582, 2643, 2567, 2561, 2566, 2582, 1526, 1529, 1525, 1533, 1231, 1224, 1238, 1225, 2611, 2598, 2619, 2593, 2596, 3243, 3232, 3241, 3238, 3238, 3245, 3236, 3259, 2842, 2902, 2905, 2884, 2162, 2052, 2162, 2052, 544, 561, 556, 544, 635, 548, 568, 565, 573, 570, 623, 628, 567, 572, 565, 550, 551, 561, 544, 617, 545, 544, 562, 633, 620, 486, 487, 501, 414, 395, 1288, 1327, 1321, 1330, 1333, 1340, 1403, 1334, 1326, 1320, 1327, 1403, 1333, 1332, 1327, 1403, 1337, 1342, 1403, 1342, 1334, 1323, 1327, 1314, 2763, 2790, 2798, 2785, 2791, 2800, 2724, 2793, 2801, 2807, 2800, 2724, 2794, 2795, 2800, 2724, 2790, 2785, 2724, 2794, 2801, 2792, 2792, 2037, 2553, 2493, 2495, 2484, 2472, 2495, 2553, 2420, 1882, 1862, 1862, 1858, 1214, 1208, 1215, 1212, 570, 572, 549, 568, 25320, 22468, 31494};

    public static void a(String str) {
        throw new IllegalArgumentException(str);
    }

    public static int b(int i, int i2) {
        int i3 = i ^ (i2 * 4);
        int i4 = (i3 ^ (i3 >>> 16)) * (-2048144789);
        int i5 = (i4 ^ (i4 >>> 13)) * (-1028477387);
        return i5 ^ (i5 >>> 16);
    }

    public static Bitmap c(String str) {
        try {
            EnumMap enumMap = new EnumMap(EnumC0143b.class);
            C0024.m4657(enumMap, C0020.m4205(), C0053.m8477(m783(), 0, 5, 1142));
            C0024.m4657(enumMap, C0026.m4938(), C0011.m2808(2));
            b bVarM787 = m787(new com.github.catvod.spider.merge-xbpq.A0.a(), str, m788(), C0002.m1249(240), C0002.m1249(240), enumMap);
            int iM786 = m786(bVarM787);
            int iM785 = m785(bVarM787);
            int[] iArr = new int[iM786 * iM785];
            for (int i = 0; i < iM785; i++) {
                int i2 = i * iM786;
                for (int i3 = 0; i3 < iM786; i3++) {
                    iArr[i2 + i3] = m784(bVarM787, i3, i) ? -16777216 : -1;
                }
            }
            Bitmap bitmapM7554 = C0045.m7554(iM786, iM785, C0052.m8383());
            C0018.m3926(bitmapM7554, iArr, 0, iM786, 0, 0, iM786, iM785);
            return bitmapM7554;
        } catch (Exception e) {
            C0049.m7975(e);
            return null;
        }
    }

    public static void e(boolean z) {
        if (z) {
            throw new IllegalArgumentException(C0029.m5256(m783(), 5, 13, 835));
        }
    }

    public static void f(boolean z) {
        if (!z) {
            throw new IllegalArgumentException(C0053.m8477(m783(), 18, 12, 2675));
        }
    }

    public static String g(LinkedHashMap linkedHashMap) {
        JSONArray jSONArray = new JSONArray();
        Iterator itM5199 = C0029.m5199(C0014.m3352(linkedHashMap));
        while (C0012.m2962(itM5199)) {
            String str = (String) C0048.m7949(itM5199);
            JSONArray jSONArray2 = new JSONArray();
            LinkedHashMap linkedHashMap2 = (LinkedHashMap) C0038.m6401(linkedHashMap, str);
            if (!C0029.m5267(linkedHashMap2)) {
                Iterator itM51992 = C0029.m5199(C0014.m3352(linkedHashMap2));
                while (C0012.m2962(itM51992)) {
                    String str2 = (String) C0048.m7949(itM51992);
                    ArrayList arrayList = (ArrayList) C0038.m6401(linkedHashMap2, str2);
                    if (!C0007.m1817(arrayList)) {
                        JSONArray jSONArray3 = new JSONArray();
                        for (int i = 0; i < C0009.m2139(arrayList); i++) {
                            C0044.m7459(jSONArray3, C0028.m5167(arrayList, i));
                        }
                        JSONObject jSONObject = new JSONObject();
                        try {
                            C0047.m7743(jSONObject, C0031.m5565(m783(), 30, 4, 1432), str2);
                            C0047.m7743(jSONObject, C0056.m8911(m783(), 34, 4, 1210), jSONArray3);
                        } catch (JSONException unused) {
                        }
                        C0044.m7459(jSONArray2, jSONObject);
                    }
                }
                JSONObject jSONObject2 = new JSONObject();
                try {
                    C0047.m7743(jSONObject2, C0015.m3484(m783(), 38, 5, 2644), str);
                    C0047.m7743(jSONObject2, C0002.m1305(m783(), 43, 8, 3272), jSONArray2);
                } catch (JSONException unused2) {
                }
                C0044.m7459(jSONArray, jSONObject2);
            }
        }
        return C0041.m6770(jSONArray);
    }

    public static Object[] h(String str) {
        try {
            LinkedHashMap linkedHashMap = new LinkedHashMap();
            boolean zM9127 = C0058.m9127(str, C0003.m1398(m783(), 51, 4, 2868));
            String strM7473 = C0044.m7473(str, null);
            if (zM9127) {
                C0038.m6416(linkedHashMap, new String(C0034.m5997(C0024.m4752(strM7473, C0031.m5565(m783(), 55, 4, 2094))[1], 0)));
            } else {
                C0038.m6416(linkedHashMap, strM7473);
            }
            return new Object[]{C0011.m2808(200), C0060.m9352(m783(), 59, 25, 596), new ByteArrayInputStream(C0021.m4347(C0018.m3903(linkedHashMap), C0034.m6001(m783(), 84, 5, 435)))};
        } catch (Throwable th) {
            C0049.m7975(th);
            return null;
        }
    }

    public static void i(String str) {
        if (str == null || C0004.m1584(str) == 0) {
            throw new IllegalArgumentException(C0032.m5708(m783(), 89, 24, 1371));
        }
    }

    public static void j(String str, String str2) {
        if (str == null || C0004.m1584(str) == 0) {
            throw new IllegalArgumentException(str2);
        }
    }

    public static void k(Object obj) {
        if (obj == null) {
            throw new IllegalArgumentException(C0051.m8259(m783(), 113, 23, 2692));
        }
    }

    public static h l(String str) {
        return C0014.m3367(str);
    }

    public static void m(LinkedHashMap linkedHashMap, String str) {
        ArrayList arrayList;
        try {
            BufferedReader bufferedReader = new BufferedReader(new StringReader(str));
            LinkedHashMap linkedHashMap2 = new LinkedHashMap();
            LinkedHashMap linkedHashMap3 = linkedHashMap2;
            for (String strM4438 = C0022.m4438(bufferedReader); strM4438 != null; strM4438 = C0022.m4438(bufferedReader)) {
                if (!C0057.m8953(C0064.m9640(strM4438))) {
                    String[] strArrM4752 = C0024.m4752(strM4438, C0056.m8911(m783(), 136, 1, 2009));
                    if (strArrM4752.length >= 2) {
                        if (C0058.m9127(strM4438, C0008.m1970(m783(), 137, 7, 2522))) {
                            String strM9640 = C0064.m9640(strArrM4752[0]);
                            if (C0037.m6315(linkedHashMap, strM9640)) {
                                linkedHashMap3 = (LinkedHashMap) C0038.m6401(linkedHashMap, strM9640);
                            } else {
                                linkedHashMap3 = new LinkedHashMap();
                                C0037.m6362(linkedHashMap, strM9640, linkedHashMap3);
                            }
                        } else {
                            String strM96402 = C0064.m9640(strArrM4752[0]);
                            for (String str2 : C0024.m4752(C0064.m9640(strArrM4752[1]), C0055.m8814(m783(), 144, 1, 2391))) {
                                String strM96403 = C0064.m9640(str2);
                                if (!C0057.m8953(strM96403) && (C0043.m7277(strM96403, C0048.m7902(m783(), 145, 4, 1842)) || C0043.m7277(strM96403, C0064.m9599(m783(), 149, 4, 1228)) || C0043.m7277(strM96403, C0030.m5362(m783(), 153, 4, 584)))) {
                                    if (C0037.m6315(linkedHashMap3, strM96402)) {
                                        arrayList = (ArrayList) C0038.m6401(linkedHashMap3, strM96402);
                                    } else {
                                        arrayList = new ArrayList();
                                        C0037.m6362(linkedHashMap3, strM96402, arrayList);
                                    }
                                    if (!C0041.m6838(arrayList, strM96403)) {
                                        C0004.m1532(arrayList, strM96403);
                                    }
                                }
                            }
                        }
                    }
                }
            }
            C0057.m8961(bufferedReader);
            if (C0029.m5267(linkedHashMap2)) {
                return;
            }
            C0037.m6362(linkedHashMap, C0001.m1189(m783(), 157, 3, 1474), linkedHashMap2);
        } catch (Throwable unused) {
        }
    }

    public static int o(int i, int i2) {
        int i3 = i2 * (-862048943);
        int i4 = i ^ (((i3 >>> 17) | (i3 << 15)) * 461845907);
        return (((i4 >>> 19) | (i4 << 13)) * 5) - 430675100;
    }

    public static int p(int i, Object obj) {
        return C0013.m3160(i, obj != null ? C0050.m8087(obj) : 0);
    }

    /* renamed from: ۟ۡۥۥ, reason: not valid java name and contains not printable characters */
    public static short[] m783() {
        if (C0012.m3024() >= 0) {
            return f140short;
        }
        return null;
    }

    /* renamed from: ۟ۢۥ۠ۡ, reason: not valid java name and contains not printable characters */
    public static boolean m784(Object obj, int i, int i2) {
        if (C0053.m8389() > 0) {
            return ((b) obj).a(i, i2);
        }
        return false;
    }

    /* renamed from: ۟ۦۣۧ۠, reason: not valid java name and contains not printable characters */
    public static int m785(Object obj) {
        if (C0018.m3956() > 0) {
            return ((b) obj).b();
        }
        return 0;
    }

    /* renamed from: ۟ۧۤۧۡ, reason: not valid java name and contains not printable characters */
    public static int m786(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((b) obj).c();
        }
        return 0;
    }

    /* renamed from: ۥ۟ۥۢ, reason: contains not printable characters */
    public static b m787(Object obj, Object obj2, Object obj3, int i, int i2, Object obj4) {
        if (C0055.m8740() >= 0) {
            return ((c) obj).a((String) obj2, (com.github.catvod.spider.merge-xbpq.r.a) obj3, i, i2, (Map) obj4);
        }
        return null;
    }

    /* renamed from: ۥۢ۠ۢ, reason: contains not printable characters */
    public static com.github.catvod.spider.merge-xbpq.r.a m788() {
        if (C0064.m9659() < 0) {
            return com.github.catvod.spider.merge-xbpq.r.a.l;
        }
        return null;
    }

    public boolean d() {
        throw null;
    }

    public Object n() {
        throw null;
    }
}