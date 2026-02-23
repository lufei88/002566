package com.github.catvod.spider.merge.E;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.c1.C0046;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.Gson;
import com.google.gson.GsonBuilder;
import com.google.gson.JsonElement;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.LinkedHashMap;
import java.util.List;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class g {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f387short = {3022, 3039, 3039, 3011, 3014, 3020, 3022, 3035, 3014, 3008, 3009, 2944, 3019, 3022, 3036, 3015, 2948, 3031, 3010, 3011, 2314, 2331, 2331, 2311, 2306, 2312, 2314, 2335, 2306, 2308, 2309, 2372, 2323, 2374, 2310, 2331, 2318, 2316, 2366, 2361, 2343, 1051, 1034, 1034, 1046, 1043, 1049, 1051, 1038, 1043, 1045, 1044, 1109, 1045, 1049, 1038, 1055, 1038, 1111, 1033, 1038, 1032, 1055, 1051, 1047, 416, 483, 445, 507, 438, 2745, 1548, 1618, 1556, 1625, 1598, 1541, 1540, 1549, 1536, 1541, 499, 495, 495, 491, 417, 436, 436, 426, 425, 428, 437, 427, 437, 427, 437, 426, 417, 418, 418, 418, 428, 436, 502, 424, 494, 419, 420, 494, 489, 503, 422, 1541, 1600, 1618, 1619, 2350, 2345, 2353, 2339, 1051, 571, 561, 20972, 22746, 32382, 3081, 3074, 3073, 3087, 3092, 3122, 3099, 3076, 3102, 3076, 3074, 3075, 2193, 2254, 2454, 2448, 2453, 2432, 2455, 1480, 1481, 1479, 1480, 1377, 1378, 1402, 3122, 3118, 3118, 3114, 3168, 3189, 3189, 2930, 2926, 2926, 2922, 2921, 2848, 2869, 2869, 2970, 2975, 2980, 3043, 3046, 2969, 3055, 3000, 2975, 2980, 3043, 3046, 2969, 3055, 3040, 3000};

    @SerializedName("class")
    private List<b> a;

    @SerializedName("list")
    private List<m> b;

    @SerializedName("filters")
    private LinkedHashMap<String, List<d>> c;

    @SerializedName("header")
    private String d;

    @SerializedName("format")
    private String e;

    @SerializedName("danmaku")
    private String f;

    @SerializedName("click")
    private String g;

    @SerializedName("js")
    private String h;

    @SerializedName("msg")
    private String i;

    @SerializedName("url")
    private Object j;

    @SerializedName("subs")
    private List<h> k;

    @SerializedName("parse")
    private int l;

    @SerializedName("jx")
    private int m;

    @SerializedName("page")
    private Integer n;

    @SerializedName("pagecount")
    private Integer o;

    @SerializedName("limit")
    private Integer p;

    @SerializedName("total")
    private Integer q;

    @SerializedName("script")
    private String r;

    public static String c(String str) {
        g gVar = new g();
        gVar.b = C0008.m1961();
        gVar.i = str;
        return C0033.m5828(gVar);
    }

    public static String g(String str) {
        g gVar = new g();
        gVar.i = str;
        return C0033.m5828(gVar);
    }

    public static String l(m mVar) {
        C0055.m8715(C0035.m6110(), C0033.m5819(mVar));
        g gVar = new g();
        gVar.b = C0001.m1203(new m[]{mVar});
        return C0033.m5828(gVar);
    }

    public static String m(Integer num, Integer num2, Integer num3, Integer num4, ArrayList arrayList) {
        List<m> listM1369 = C0003.m1369(arrayList);
        g gVar = new g();
        C0049.m7974(gVar, C0024.m4690(num), C0024.m4690(num2), C0024.m4690(num3), C0024.m4690(num4));
        gVar.b = listM1369;
        return C0033.m5828(gVar);
    }

    public static String n(ArrayList arrayList, JsonElement jsonElement) {
        g gVar = new g();
        gVar.a = arrayList;
        if (jsonElement != null) {
            gVar.c = (LinkedHashMap) m3768(new Gson(), m3764(jsonElement), m3767(new f()));
        }
        return C0033.m5828(gVar);
    }

    public static String o(ArrayList arrayList, ArrayList arrayList2, JsonElement jsonElement) {
        List<m> listM1369 = C0003.m1369(arrayList2);
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = listM1369;
        if (jsonElement != null) {
            gVar.c = (LinkedHashMap) m3768(new Gson(), m3764(jsonElement), m3767(new f()));
        }
        return C0033.m5828(gVar);
    }

    public static String p(ArrayList arrayList, ArrayList arrayList2, LinkedHashMap linkedHashMap) {
        List<m> listM1369 = C0003.m1369(arrayList2);
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = listM1369;
        gVar.c = linkedHashMap;
        return C0033.m5828(gVar);
    }

    public static String q(ArrayList arrayList, ArrayList arrayList2, JSONObject jSONObject) {
        List<m> listM1369 = C0003.m1369(arrayList2);
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = listM1369;
        if (jSONObject != null) {
            gVar.c = (LinkedHashMap) m3768(new Gson(), C0004.m1539(jSONObject), m3767(new e()));
        }
        return C0033.m5828(gVar);
    }

    public static String r(ArrayList arrayList, LinkedHashMap linkedHashMap) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.c = linkedHashMap;
        return C0033.m5828(gVar);
    }

    public static String s(ArrayList arrayList, List list) {
        List<m> listM1369 = C0003.m1369(list);
        g gVar = new g();
        gVar.a = arrayList;
        gVar.b = listM1369;
        return C0033.m5828(gVar);
    }

    public static String t(ArrayList arrayList, JSONObject jSONObject) {
        g gVar = new g();
        gVar.a = arrayList;
        gVar.c = (LinkedHashMap) m3768(new Gson(), C0004.m1539(jSONObject), m3767(new e()));
        return C0033.m5828(gVar);
    }

    public static String u(List list) {
        List<m> listM1369 = C0003.m1369(list);
        g gVar = new g();
        gVar.b = listM1369;
        return C0033.m5828(gVar);
    }

    /* renamed from: ۟ۡ۟۠ۤ, reason: not valid java name and contains not printable characters */
    public static GsonBuilder m3762(Object obj) {
        if (C0052.m8320() > 0) {
            return ((GsonBuilder) obj).disableHtmlEscaping();
        }
        return null;
    }

    /* renamed from: ۟ۢۥ۟ۦ, reason: not valid java name and contains not printable characters */
    public static String m3763(Object obj, Object obj2) {
        if (C0003.m1463() < 0) {
            return ((Gson) obj).toJson(obj2);
        }
        return null;
    }

    /* renamed from: ۟ۥ۠ۤۡ, reason: not valid java name and contains not printable characters */
    public static String m3764(Object obj) {
        if (C0032.m5686() < 0) {
            return ((JsonElement) obj).toString();
        }
        return null;
    }

    /* renamed from: ۣ۠ۧۡ, reason: not valid java name and contains not printable characters */
    public static GsonBuilder m3765(Object obj) {
        if (C0051.m8216() < 0) {
            return ((Gson) obj).newBuilder();
        }
        return null;
    }

    /* renamed from: ۥۣۨۧ, reason: contains not printable characters */
    public static Gson m3766(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((GsonBuilder) obj).create();
        }
        return null;
    }

    /* renamed from: ۦۨۢ, reason: contains not printable characters */
    public static Type m3767(Object obj) {
        if (C0044.m7508() <= 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* renamed from: ۧۤۨۥ, reason: not valid java name and contains not printable characters */
    public static Object m3768(Object obj, Object obj2, Object obj3) {
        if (C0012.m3024() > 0) {
            return ((Gson) obj).fromJson((String) obj2, (Type) obj3);
        }
        return null;
    }

    /* renamed from: ۨۥۤ, reason: not valid java name and contains not printable characters */
    public static short[] m3769() {
        if (C0037.m6350() < 0) {
            return f387short;
        }
        return null;
    }

    public final void a(String str) {
        this.f = str;
    }

    public final void b() {
        this.e = C0042.m7151(m3769(), 0, 20, 2991);
    }

    public final void d(HashMap map) {
        if (C0012.m2970(map)) {
            return;
        }
        this.d = m3763(new Gson(), map);
    }

    public final void e() {
        this.m = 1;
    }

    public final void f() {
        this.e = C0055.m8814(m3769(), 20, 21, 2411);
    }

    public final void h() {
        this.e = C0001.m1189(m3769(), 41, 24, 1146);
    }

    public final void i(int i, int i2, int i3, int i4) {
        int i5 = i4;
        int i6 = i3;
        int i7 = i2;
        int i8 = i;
        if (i8 <= 0) {
            i8 = Integer.MAX_VALUE;
        }
        this.n = C0011.m2808(i8);
        if (i6 <= 0) {
            i6 = Integer.MAX_VALUE;
        }
        this.p = C0011.m2808(i6);
        if (i5 <= 0) {
            i5 = Integer.MAX_VALUE;
        }
        this.q = C0011.m2808(i5);
        if (i7 <= 0) {
            i7 = Integer.MAX_VALUE;
        }
        this.o = C0011.m2808(i7);
    }

    public final void j() {
        this.l = 1;
    }

    public final void k(int i) {
        this.l = i;
    }

    public final String toString() {
        return m3763(m3766(m3762(m3765(new Gson()))), this);
    }

    public final void v(List list) {
        this.k = list;
    }

    public final void w(String str) {
        String strM8125 = str;
        if (C0060.m9349(strM8125, C0021.m4340(m3769(), 65, 5, 398)) && !C0058.m9127(strM8125, C0055.m8814(m3769(), 70, 1, 2694)) && C0046.m7671(C0051.m8259(m3769(), 71, 10, 1633))) {
            strM8125 = C0050.m8125(C0030.m5362(m3769(), 81, 31, 411), strM8125);
        }
        this.j = C0012.m2995(C0035.m6110(), C0015.m3446(strM8125, C0048.m7902(m3769(), 112, 4, 1594), C0007.m1840()));
    }

    /* JADX WARN: Removed duplicated region for block: B:21:0x014f  */
    /* JADX WARN: Removed duplicated region for block: B:22:0x0153  */
    /*
        Code decompiled incorrectly, please refer to instructions dump.
        To view partially-correct code enable 'Show inconsistent code' option in preferences
    */
    public final void x(java.util.ArrayList r62) {
        /*
            Method dump skipped, instructions count: 473
            To view this dump change 'Code comments level' option to 'DEBUG'
        */
        throw new UnsupportedOperationException("Method not decompiled: com.github.catvod.spider.merge.E.g.x(java.util.ArrayList):void");
    }

    public final void y(ArrayList arrayList) {
        this.b = arrayList;
    }
}