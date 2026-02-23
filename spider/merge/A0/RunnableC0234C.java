package com.github.catvod.spider.merge.a0;

import android.R;
import android.app.AlertDialog;
import android.widget.EditText;
import android.widget.FrameLayout;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0226b;
import com.github.catvod.spider.merge.W.DialogInterfaceOnClickListenerC0227c;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonObject;
import com.google.gson.JsonPrimitive;
import java.io.IOException;
import java.util.HashMap;
import java.util.concurrent.ScheduledExecutorService;
import okhttp3.Call;
import okhttp3.OkHttpClient;
import okhttp3.Request;
import okhttp3.Response;
import okhttp3.ResponseBody;

/* renamed from: com.github.catvod.spider.merge.a0.C, reason: case insensitive filesystem */
/* loaded from: classes.dex */
public final /* synthetic */ class RunnableC0234C implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f706short = {3015, 3019, 3008, 3009, 2653, 2625, 2625, 2629, 2630, 2575, 2586, 2586, 2650, 2629, 2640, 2651, 2584, 2644, 2629, 2652, 2584, 2641, 2631, 2652, 2627, 2640, 2587, 2624, 2646, 2587, 2646, 2651, 2586, 2650, 2644, 2624, 2625, 2653, 2586, 2646, 2650, 2641, 2640, 2570, 2631, 2640, 2628, 2666, 2652, 2641, 2568, 1222, 1153, 1155, 1155, 1157, 1171, 1171, 1215, 1172, 1167, 1163, 1157, 1166, 1245, 1222, 1153, 1168, 1168, 1215, 1174, 1157, 1170, 1245, 1233, 1230, 1238, 1230, 1240, 1222, 1156, 1157, 1174, 1161, 1155, 1157, 1215, 1161, 1156, 1245, 1186, 1248, 1249, 1266, 1261, 1255, 1249, 1243, 1254, 1270, 1253, 1258, 1248, 1209, 1266, 1261, 1266, 1259, 1186, 1268, 1256, 1253, 1264, 1250, 1259, 1270, 1257, 1209, 1264, 1266, 1186, 1248, 1249, 1266, 1261, 1255, 1249, 1243, 1258, 1253, 1257, 1249, 1209, 1234, 1206, 1206, 1207, 1212, 1221, 1186, 1248, 1249, 1266, 1261, 1255, 1249, 1243, 1257, 1259, 1248, 1249, 1256, 1209, 1234, 1206, 1206, 1207, 1212, 1221, 1186, 1254, 1265, 1261, 1256, 1248, 1243, 1248, 1249, 1266, 1261, 1255, 1249, 1209, 1234, 1206, 1206, 1207, 1212, 1221, 1186, 1254, 1265, 1261, 1256, 1248, 1243, 1268, 1270, 1259, 1248, 1265, 1255, 1264, 1209, 1234, 1206, 1206, 1207, 1212, 1221, 1186, 1248, 1249, 1266, 1261, 1255, 1249, 1243, 1251, 1268, 1265, 1209, 1221, 1248, 1270, 1249, 1258, 1259, 1199, 1185, 1206, 1212, 1232, 1225, 1185, 1206, 1213, 1199, 1202, 1200, 1204, 1186, 1253, 1255, 1264, 1261, 1266, 1261, 1264, 1277, 1243, 1270, 1249, 1255, 1264, 1209, 1185, 1203, 1222, 1185, 1203, 1216, 1186, 1255, 1260, 1253, 1258, 1258, 1249, 1256, 1209, 1233, 1223, 1232, 1234, 1227, 1218, 1218, 1229, 1223, 1229, 1221, 1224, 1235, 1217, 1222, 1186, 1255, 1256, 1261, 1249, 1258, 1264, 1243, 1261, 1248, 1209, 1201, 1253, 1255, 1250, 1212, 1212, 1206, 1248, 1206, 1203, 1254, 1203, 1200, 1201, 1204, 1206, 1254, 1203, 1204, 1200, 1204, 1254, 1204, 1255, 1202, 1201, 1201, 1205, 1213, 1253, 1253, 1203, 1186, 1271, 1255, 1259, 1268, 1249, 1209, 1258, 1249, 1264, 1248, 1261, 1271, 1263, 1186, 1269, 1265, 1249, 1270, 1277, 1243, 1264, 1259, 1263, 1249, 1258, 1209, 3192, 3166, 3144, 3167, 3072, 3180, 3146, 3144, 3139, 3161, 1900, 1870, 1883, 1864, 1869, 1869, 1856, 1806, 1812, 1807, 1809, 1793, 1801, 1901, 1864, 1871, 1876, 1881, 1818, 1793, 1908, 1818, 1793, 1888, 1871, 1861, 1875, 1870, 1864, 1861, 1793, 1808, 1811, 1818, 1793, 1883, 1865, 1804, 1858, 1871, 1818, 1793, 1911, 1811, 1811, 1810, 1817, 1888, 1793, 1891, 1876, 1864, 1869, 1861, 1806, 1911, 1813, 1808, 1814, 1896, 1907, 1800, 1793, 1888, 1873, 1873, 1869, 1860, 1910, 1860, 1859, 1898, 1864, 1877, 1806, 1812, 1810, 1810, 1807, 1808, 1793, 1801, 1898, 1897, 1909, 1900, 1901, 1805, 1793, 1869, 1864, 1866, 1860, 1793, 1894, 1860, 1858, 1866, 1870, 1800, 1793, 1900, 1870, 1859, 1864, 1869, 1860, 1793, 1906, 1856, 1863, 1856, 1875, 1864, 1806, 1812, 1810, 1810, 1807, 1808, 1121, 1076, 1129, 1144, 1143, 1076, 1133, 1140, 2018, 1975, 2026, 2043, 2036, 1975, 2030, 2037, 2033, 2047, 2036, 2695, 2699, 2698, 2704, 2689, 2698, 2704, 2761, 2704, 2717, 2708, 2689, 1238, 1223, 1242, 1238, 1165, 1234, 1230, 1219, 1227, 1228, 1177, 1217, 1226, 1219, 1232, 1233, 1223, 1238, 1183, 1271, 1270, 1252, 1167, 1178, 1666, 1751, 1674, 1691, 1684, 1751, 1689, 1686, 1683, 1695, 1684, 1678, 1751, 1683, 1694, 2377, 2333, 2335, 2330, 2372, 2372, 2382, 2328, 2382, 2379, 2334, 2379, 2376, 2377, 2380, 2382, 2334, 2379, 2380, 2376, 2380, 2334, 2380, 2335, 2378, 2377, 2377, 2381, 2373, 2333, 2333, 2379, 1811, 1796, 1808, 1854, 1800, 1797, 2686, 2684, 2669, 2591, 2582, 2646, 2648, 2636, 2637, 2641, 2582, 2650, 2646, 2653, 2652, 2591, 3165, 3095, 3144, 3080, 3081, 3085, 3087, 3103, 3148, 3083, 3151, 3145, 3095, 3147, 3103, 3147, 3075, 3146, 3086, 3139, 3103, 3148, 3074, 3096, 3139, 3074, 3102, 3138, 3088, 3088, 3090, 3151, 3103, -32573, -31577, 23121, 2912, 2914, 2913, 2935, 2836, 2903, 2907, 2907, 2911, 2909, 2897, 24991, 31733, 25058, -31759, -29177, -29544, 24700, 25783};
    public final /* synthetic */ int a;
    public final /* synthetic */ C0246g b;

    public /* synthetic */ RunnableC0234C(C0246g c0246g, int i) {
        this.a = i;
        this.b = c0246g;
    }

    public /* synthetic */ RunnableC0234C(C0246g c0246g, HashMap map) {
        this.a = 3;
        this.b = c0246g;
    }

    /* renamed from: ۟۟ۤۡۢ, reason: not valid java name and contains not printable characters */
    public static String m6869(Object obj) {
        if (C0022.m4497() >= 0) {
            return ((ResponseBody) obj).string();
        }
        return null;
    }

    /* renamed from: ۣ۟۠۟ۢ, reason: not valid java name and contains not printable characters */
    public static Response m6870(Object obj) {
        if (C0035.m6140() < 0) {
            return ((Call) obj).execute();
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۨۨ, reason: not valid java name and contains not printable characters */
    public static String m6871(Object obj) {
        if (C0048.m7971() > 0) {
            return ((JsonPrimitive) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۠ۨۧۡ, reason: not valid java name and contains not printable characters */
    public static ResponseBody m6872(Object obj) {
        if (C0009.m2047() > 0) {
            return ((Response) obj).body();
        }
        return null;
    }

    /* renamed from: ۣۥۣۡ, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6873(Object obj, Object obj2, Object obj3) {
        if (C0037.m6350() < 0) {
            return ((Request.Builder) obj).addHeader((String) obj2, (String) obj3);
        }
        return null;
    }

    /* renamed from: ۣۨ۠۟, reason: not valid java name and contains not printable characters */
    public static Request.Builder m6874(Object obj, Object obj2) {
        if (C0031.m5628() >= 0) {
            return ((Request.Builder) obj).url((String) obj2);
        }
        return null;
    }

    /* renamed from: ۤۤۦۢ, reason: not valid java name and contains not printable characters */
    public static Request m6875(Object obj, Object obj2, Object obj3, Object obj4, Object obj5) {
        if (C0027.m5017() > 0) {
            return com.github.catvod.spider.merge.B0.a.v((Request.Builder) obj, (String) obj2, (String) obj3, (String) obj4, (String) obj5);
        }
        return null;
    }

    /* renamed from: ۥ۠۠ۦ, reason: contains not printable characters */
    public static Call m6876(Object obj, Object obj2) {
        if (C0009.m2047() >= 0) {
            return ((OkHttpClient) obj).newCall((Request) obj2);
        }
        return null;
    }

    /* renamed from: ۦۢۨۢ, reason: contains not printable characters */
    public static short[] m6877() {
        if (C0018.m3956() > 0) {
            return f706short;
        }
        return null;
    }

    /* renamed from: ۦۥۤ, reason: contains not printable characters */
    public static Request.Builder m6878(Object obj) {
        if (C0026.m4977() <= 0) {
            return ((Request.Builder) obj).get();
        }
        return null;
    }

    /* renamed from: ۣۧۢۤ, reason: not valid java name and contains not printable characters */
    public static JsonPrimitive m6879(Object obj, Object obj2) {
        if (C0014.m3353() < 0) {
            return ((JsonObject) obj).getAsJsonPrimitive((String) obj2);
        }
        return null;
    }

    /* renamed from: ۨۤۥۧ, reason: not valid java name and contains not printable characters */
    public static Object m6880(Object obj, Object obj2, Object obj3) {
        if (C0033.m5872() >= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        switch (C0045.m7638(this)) {
            case 0:
                C0246g c0246gM9228 = C0059.m9228(this);
                C0047.m7777(c0246gM9228);
                try {
                    int iM3103 = C0013.m3103(16);
                    FrameLayout.LayoutParams layoutParams = new FrameLayout.LayoutParams(-1, -2);
                    FrameLayout frameLayout = new FrameLayout(C0031.m5652());
                    C0012.m2963(layoutParams, iM3103, iM3103, iM3103, iM3103);
                    EditText editText = new EditText(C0031.m5652());
                    C0041.m6790(frameLayout, editText, layoutParams);
                    c0246gM9228.d = C0019.m4124(C0049.m8029(C0030.m5442(C0020.m4201(C0047.m7848(C0036.m6223(new AlertDialog.Builder(C0022.m4453()), C0004.m1549(m6877(), 633, 14, 2868)), frameLayout), C0024.m4740(m6877(), 647, 8, 1012), new DialogInterfaceOnClickListenerC0226b(2, c0246gM9228)), R.string.cancel, null), R.string.ok, new DialogInterfaceOnClickListenerC0227c(c0246gM9228, editText, 4)));
                    return;
                } catch (Exception unused) {
                    return;
                }
            case 1:
                C0054.m8579(C0059.m9228(this));
                return;
            case 2:
                C0246g c0246gM92282 = C0059.m9228(this);
                C0047.m7777(c0246gM92282);
                try {
                    C0016.m3575(new RunnableC0235D(c0246gM92282, C0022.m4467(c0246gM92282), 1));
                    return;
                } catch (IOException e) {
                    throw new RuntimeException(e);
                }
            case 3:
                C0246g c0246gM92283 = C0059.m9228(this);
                C0047.m7777(c0246gM92283);
                c0246gM92283.j = C0031.m5627(C0009.m2099());
                StringBuilder sb = new StringBuilder(C0009.m2037(m6877(), 584, 16, 2617));
                C0018.m3933(sb, (String) C0022.m4433(c0246gM92283));
                C0018.m3933(sb, C0061.m9361(m6877(), 600, 33, 3195));
                c0246gM92283.i = C0060.m9288(C0047.m7763(sb));
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, (String) C0052.m8378(c0246gM92283));
                C0018.m3933(sb2, (String) C0022.m4433(c0246gM92283));
                c0246gM92283.g = C0016.m3576(C0047.m7763(sb2));
                ScheduledExecutorService scheduledExecutorServiceM3101 = C0013.m3101(1);
                c0246gM92283.c = scheduledExecutorServiceM3101;
                C0060.m9344(scheduledExecutorServiceM3101, new RunnableC0234C(c0246gM92283, 4), 1L, 3L, C0050.m8151());
                return;
            default:
                C0246g c0246gM92284 = C0059.m9228(this);
                C0047.m7777(c0246gM92284);
                String strM9585 = C0063.m9585(m6877(), 0, 4, 2980);
                OkHttpClient okHttpClient = new OkHttpClient();
                Request.Builder builder = new Request.Builder();
                StringBuilder sb3 = new StringBuilder(C0015.m3484(m6877(), 4, 47, 2613));
                C0018.m3933(sb3, (String) C0044.m7441(c0246gM92284));
                C0018.m3933(sb3, C0052.m8337(m6877(), 51, 39, 1248));
                C0018.m3933(sb3, (String) C0052.m8378(c0246gM92284));
                C0018.m3933(sb3, C0054.m8574(m6877(), 90, 256, 1156));
                C0018.m3933(sb3, (String) C0014.m3390(c0246gM92284));
                try {
                    String strM6869 = m6869(m6872(m6870(m6876(okHttpClient, m6875(m6873(m6873(m6873(m6878(m6874(builder, C0047.m7763(sb3))), C0060.m9352(m6877(), 346, 10, 3117), C0033.m5852(m6877(), 356, 120, 1825)), C0022.m4403(m6877(), 476, 8, 1049), (String) C0022.m4433(c0246gM92284)), C0018.m3917(m6877(), 484, 11, 1946), (String) C0028.m5117(c0246gM92284)), C0036.m6188(m6877(), 495, 12, 2788), C0008.m1970(m6877(), 507, 24, 1186), C0016.m3525(m6877(), 531, 15, 1786), C0048.m7902(m6877(), 546, 32, 2428))))));
                    C0012.m2969(C0035.m6087(), strM6869);
                    if (C0058.m9127(strM6869, strM9585)) {
                        C0035.m6144(c0246gM92284, m6871(m6879((JsonObject) m6880(new Gson(), strM6869, JsonObject.class), strM9585)));
                        return;
                    } else {
                        c0246gM92284.g = m6871(m6879((JsonObject) m6880(new Gson(), strM6869, JsonObject.class), C0052.m8337(m6877(), 578, 6, 1889)));
                        return;
                    }
                } catch (IOException e2) {
                    throw new RuntimeException(e2);
                }
        }
    }
}