package com.github.catvod.spider.merge.B0;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.F0.C0145b;
import com.github.catvod.spider.merge.F0.C0148e;
import com.github.catvod.spider.merge.F0.T;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.e1.b;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.g0.AbstractC0308c;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import java.util.ArrayList;
import java.util.BitSet;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;
import java.util.Map;
import okhttp3.Request;
import org.json.JSONObject;

/* loaded from: classes.dex */
public abstract /* synthetic */ class a {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f379short = {2770, 2531, 2531, 2531, 1954, 1931, 1944, 1931, 1922, 1998, 1973, 1294, 1301, 1292, 1292, 1274, 1276, 1263, 1261, 1259, 2145, 2144, 2151, 2160, 2146, 1733, 1730, 1738, 1731, 1516, 1530, 1513, 1525, 2546, 2533, 2533, 2552, 2533, 926, 995, 941, 940, 951, 995, 945, 934, 928, 940, 932, 941, 938, 953, 934, 935, 1005, 1404};

    public static /* synthetic */ String A(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0005.m1645(m3628(), 0, 1, 2814));
            }
        }
        return C0047.m7763(sb);
    }

    public static String B(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, String str3) {
        C0047.m7743(jSONObject2, str2, C0001.m1212(jSONObject, str));
        return C0001.m1212(jSONObject, str3);
    }

    public static /* synthetic */ String C(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0046.m7718(m3628(), 1, 3, 2503));
            }
        }
        return C0047.m7763(sb);
    }

    public static boolean a(b bVar, int i) {
        char c;
        if (i == 1) {
            c = '(';
        } else if (i == 2) {
            c = 30;
        } else if (i == 3) {
            c = 20;
        } else if (i == 4) {
            c = '\n';
        } else {
            if (i != 5) {
                throw null;
            }
            c = 0;
        }
        if (c == 0) {
            return C0053.m8470(bVar);
        }
        if (c == '\n') {
            return C0049.m8050(bVar);
        }
        if (c == 20) {
            return C0015.m3434(bVar);
        }
        if (c == 30) {
            return C0032.m5721(bVar);
        }
        if (c == '(') {
            return C0057.m8957(bVar);
        }
        StringBuilder sb = new StringBuilder(C0039.m6551(m3628(), 4, 7, 2030));
        C0018.m3933(sb, i != 1 ? i != 2 ? i != 3 ? i != 4 ? i != 5 ? C0038.m6452(m3628(), 11, 4, 1376) : C0062.m9389(m3628(), 15, 5, 1198) : C0035.m6131(m3628(), 20, 5, 2085) : C0026.m4951(m3628(), 25, 4, 1676) : C0020.m4199(m3628(), 29, 4, 1467) : C0061.m9361(m3628(), 33, 5, 2487));
        C0018.m3933(sb, C0057.m8978(m3628(), 38, 17, 963));
        throw new IllegalArgumentException(C0047.m7763(sb));
    }

    public static ArrayList b(C0148e c0148e) {
        T t = new T();
        Iterator itM7816 = C0047.m7816(C0065.m9781(c0148e));
        while (C0012.m2962(itM7816)) {
            C0145b c0145b = (C0145b) C0048.m7949(itM7816);
            BitSet bitSet = (BitSet) C0014.m3292(t, c0145b);
            if (bitSet == null) {
                bitSet = new BitSet();
                C0029.m5299(t, c0145b, bitSet);
            }
            C0049.m8060(bitSet, C0012.m3044(c0145b));
        }
        return (ArrayList) C0057.m8971(t);
    }

    public static g c(int i, String str) {
        g gVar = new g();
        C0017.m3667(gVar, str);
        C0006.m1720(gVar, i);
        return gVar;
    }

    public static Integer d(int i, String str) {
        return C0011.m2808(C0038.m6456(str) + i);
    }

    public static Integer e(String str, int i, int i2) {
        return C0011.m2808((C0038.m6456(str) + i) * i2);
    }

    public static Object f(Object obj, Map.Entry entry, HashMap map, Object obj2) {
        C0047.m7777(obj);
        Object objM6540 = C0039.m6540(entry);
        C0047.m7777(objM6540);
        return C0053.m8424(map, obj2, objM6540);
    }

    public static Object g(String str, Class cls) {
        return m3630(new Gson(), str, cls);
    }

    public static String h(Object obj, String str) {
        StringBuilder sb = new StringBuilder(str);
        C0016.m3605(sb, obj);
        return C0047.m7763(sb);
    }

    public static String i(String str, long j) {
        StringBuilder sb = new StringBuilder(str);
        C0058.m9141(sb, j);
        return C0047.m7763(sb);
    }

    public static String j(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        return C0047.m7763(sb);
    }

    public static String k(String str, String str2, String str3) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        return C0047.m7763(sb);
    }

    public static String l(String str, String str2, String str3, String str4) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        C0018.m3933(sb, str4);
        return C0047.m7763(sb);
    }

    public static String m(String str, Map map, ArrayList arrayList) {
        return m3626(arrayList, m3624(C0032.m5769(str, map)));
    }

    public static String n(StringBuilder sb, String str, String str2, String str3) {
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        return C0047.m7763(sb);
    }

    public static /* synthetic */ String o(ArrayList arrayList) {
        StringBuilder sb = new StringBuilder();
        Iterator itM7816 = C0047.m7816(arrayList);
        if (C0012.m2962(itM7816)) {
            while (true) {
                C0056.m8896(sb, (CharSequence) C0048.m7949(itM7816));
                if (!C0012.m2962(itM7816)) {
                    break;
                }
                C0056.m8896(sb, C0008.m1970(m3628(), 55, 1, 1375));
            }
        }
        return C0047.m7763(sb);
    }

    public static String p(JSONObject jSONObject, String str, JSONObject jSONObject2, String str2, String str3) {
        C0047.m7743(jSONObject2, str2, C0051.m8200(jSONObject, str));
        return C0051.m8200(jSONObject, str3);
    }

    public static StringBuilder q(String str, String str2) {
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        return sb;
    }

    public static StringBuilder r(String str, String str2, String str3, String str4, String str5) {
        StringBuilder sb = new StringBuilder(str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        C0018.m3933(sb, str4);
        C0018.m3933(sb, str5);
        return sb;
    }

    public static HashMap s(String str, String str2) {
        HashMap map = new HashMap();
        C0053.m8424(map, str, str2);
        return map;
    }

    public static HashMap t(String str, String str2, String str3, String str4) {
        HashMap map = new HashMap();
        C0053.m8424(map, str, str2);
        C0053.m8424(map, str3, str4);
        return map;
    }

    public static List u(Object obj, ArrayList arrayList, Object obj2, ArrayList arrayList2) {
        C0047.m7777(obj);
        C0004.m1532(arrayList, obj2);
        return C0029.m5209(arrayList2);
    }

    public static Request v(Request.Builder builder, String str, String str2, String str3, String str4) {
        return m3627(m3629(m3629(builder, str, str2), str3, str4));
    }

    public static void w(Exception exc, StringBuilder sb) {
        C0018.m3933(sb, C0036.m6261(exc));
        m3625(C0047.m7763(sb));
    }

    public static void x(String str, String str2, String str3, String str4, ArrayList arrayList) {
        C0004.m1532(arrayList, new m(str, str2, str3, str4));
    }

    public static void y(String str, String str2, String str3, ArrayList arrayList) {
        C0004.m1532(arrayList, new m(str, str2, str3));
    }

    public static void z(StringBuilder sb, String str, String str2, String str3, String str4) {
        C0018.m3933(sb, str);
        C0018.m3933(sb, str2);
        C0018.m3933(sb, str3);
        C0018.m3933(sb, str4);
    }

    /* renamed from: ۟۟ۢۦۨ, reason: not valid java name and contains not printable characters */
    public static JsonElement m3624(Object obj) {
        if (C0062.m9429() >= 0) {
            return AbstractC0308c.g((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۧۤۦۨ, reason: not valid java name and contains not printable characters */
    public static void m3625(Object obj) {
        if (C0034.m6048() < 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۟ۧۥ۟ۧ, reason: not valid java name and contains not printable characters */
    public static String m3626(Object obj, Object obj2) {
        if (C0051.m8216() <= 0) {
            return g.n((ArrayList) obj, (JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۧ۠, reason: not valid java name and contains not printable characters */
    public static Request m3627(Object obj) {
        if (C0002.m1242() > 0) {
            return ((Request.Builder) obj).build();
        }
        return null;
    }

    /* renamed from: ۠۠ۡۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3628() {
        if (C0059.m9257() < 0) {
            return f379short;
        }
        return null;
    }

    /* renamed from: ۢۤۥۥ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m3629(Object obj, Object obj2, Object obj3) {
        if (C0031.m5628() > 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۢۧ۠ۢ, reason: not valid java name and contains not printable characters */
    public static Object m3630(Object obj, Object obj2, Object obj3) {
        if (C0055.m8740() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }
}