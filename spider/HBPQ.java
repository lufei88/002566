package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import com.google.gson.Gson;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.List;
import java.util.Map;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class HBPQ extends Spider {
    public static Class d;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f31short = {2267, 2264, 2262, 2259, 2279, 2270, 2260, 2991, 2989, 3000, 2985, 2987, 2979, 3006, 2997, 2959, 2979, 2978, 3000, 2985, 2978, 3000, 1093, 1088, 1114, 1117, 837, 860, 855, 876, 858, 855, 1097, 1104, 1115, 1120, 1105, 1118, 1106, 1114, 440, 417, 426, 401, 446, 423, 429, 1493, 1484, 1479, 1532, 1489, 1478, 1486, 1474, 1489, 1480, 1488, 1942, 1942, 1942, 1832, 1311, 1383, 1311, 1383, 1311, 1383, 1283, 1306, 1297, 1322, 1307, 1300, 1304, 1296, 1266, 1267, 1250, 1271, 1279, 1274, 1237, 1273, 1272, 1250, 1267, 1272, 1250, 3086, 3083, 3089, 3094, 1728, 1753, 1746, 1769, 1734, 1754, 1751, 1743, 1769, 1744, 1732, 1753, 1755, 2319, 2326, 2333, 2342, 2313, 2325, 2328, 2304, 2342, 2316, 2315, 2325, 1212, 1220, 2954, 1528, 1528, 1528, 2930, 2923, 2912, 2907, 2934, 2913, 2921, 2917, 2934, 2927, 2935, 271, 278, 285, 294, 282, 278, 279, 269, 284, 279, 269, 484, 509, 502, 461, 491, 503, 499, 480, 280, 257, 266, 305, 266, 263, 284, 267, 269, 282, 257, 284, 388, 413, 406, 429, 403, 401, 390, 413, 384, 1641, 1648, 1659, 1600, 1647, 1654, 1660, 1988, 2013, 2006, 2029, 2003, 1984, 2007, 2003, 1619, 1620, 1622, 1630, 1656, 1620, 1621, 1615, 1630, 1621, 1615, 2776, 2783, 2781, 2773, 2790, 2777, 2772, 2773, 2783, 2803, 2783, 2782, 2756, 2773, 2782, 2756, 2179, 2191, 2189, 2254, 2183, 2185, 2196, 2184, 2197, 2178, 2254, 2179, 2177, 2196, 2198, 2191, 2180, 2254, 2195, 2192, 2185, 2180, 2181, 2194, 2254, 2232, 2210, 2224, 2225, 3032, 3039, 3032, 3013, 388, 392, 394, 457, 384, 398, 403, 399, 402, 389, 457, 388, 390, 403, 401, 392, 387, 457, 404, 407, 398, 387, 386, 405, 457, 447, 421, 439, 438, 3179, 3180, 3179, 3190, 2187, 2187, 2187, 1055, 1027, 1038, 1046, 1034, 1053, 1068, 1024, 1025, 1051, 1034, 1025, 1051, 1952, 1957, 1962, 1961, 1957, 1967, 1969, 1996, 2010, 2014, 1997, 2012, 2007, 2044, 2000, 2001, 1995, 2010, 2001, 1995, 1682, 1668, 1664, 1683, 1666, 1673, 1698, 1678, 1679, 1685, 1668, 1679, 1685};
    public Object a = null;
    public Context b;
    public String c;

    public static Object[] loadPic(Map<String, String> map) {
        return (Object[]) C0052.m8352(C0065.m9803(C0041.m6741(), C0035.m6131(m207(), 0, 7, 2231), new Class[]{Map.class}), null, new Object[]{map});
    }

    /* renamed from: ۟۟ۡ۠ۧ, reason: not valid java name and contains not printable characters */
    public static short[] m207() {
        if (C0014.m3353() <= 0) {
            return f31short;
        }
        return null;
    }

    /* renamed from: ۟ۥ۟ۥۥ, reason: not valid java name and contains not printable characters */
    public static Object m208(Object obj, Object obj2, Object obj3) {
        if (C0000.m1116() <= 0) {
            return ((Gson) obj).fromJson((String) obj2, (Class) obj3);
        }
        return null;
    }

    /* renamed from: ۣۣۡۨ, reason: not valid java name and contains not printable characters */
    public static String m209(Object obj, Object obj2) {
        if (C0047.m7837() >= 0) {
            return ((Gson) obj).toJson((JsonElement) obj2);
        }
        return null;
    }

    /* renamed from: ۥۦۤۥ, reason: contains not printable characters */
    public static void m210(Object obj, Object obj2, Object obj3) {
        if (C0026.m4977() <= 0) {
            ((JsonObject) obj).addProperty((String) obj2, (String) obj3);
        }
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        try {
            C0003.m1445(this, C0006.m1754(this), C0001.m1160(this));
            ArrayList arrayList = new ArrayList();
            JSONArray jSONArrayM4333 = C0021.m4333(new JSONObject(C0037.m6312(C0052.m8352(C0065.m9803(C0041.m6741(), C0045.m7657(m207(), 7, 15, 3020), new Class[]{String.class, String.class, C0011.m2810(), HashMap.class}), C0029.m5291(this), new Object[]{str, str2, C0028.m5186(z), map}))), C0004.m1549(m207(), 22, 4, 1065));
            for (int i = 0; i < C0053.m8396(jSONArrayM4333); i++) {
                JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
                C0004.m1532(arrayList, new m(C0001.m1212(jSONObjectM3923, C0033.m5852(m207(), 26, 6, 819)), C0001.m1212(jSONObjectM3923, C0019.m4107(m207(), 32, 8, 1087)), C0001.m1212(jSONObjectM3923, C0050.m8131(m207(), 40, 7, 462)), C0001.m1212(jSONObjectM3923, C0019.m4107(m207(), 47, 11, 1443))));
            }
            return C0047.m7783(arrayList);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String detailContent(List<String> list) {
        m mVar;
        char c = 0;
        String strM2037 = C0009.m2037(m207(), 58, 3, 1970);
        String strM9775 = C0065.m9775(m207(), 61, 1, 1803);
        String strM1305 = C0002.m1305(m207(), 62, 6, 1347);
        String strM8814 = C0055.m8814(m207(), 68, 8, 1397);
        try {
            mVar = new m();
        } catch (Exception unused) {
        }
        try {
            JSONObject jSONObjectM3923 = C0018.m3923(C0021.m4333(new JSONObject(C0037.m6312(C0052.m8352(C0065.m9803(C0041.m6741(), C0002.m1305(m207(), 76, 13, 1174), new Class[]{List.class}), C0029.m5291(this), new Object[]{list}))), C0056.m8911(m207(), 89, 4, 3170)), 0);
            C0055.m8715(C0035.m6110(), C0001.m1212(jSONObjectM3923, strM8814));
            ArrayList arrayList = new ArrayList();
            new ArrayList();
            ArrayList arrayList2 = new ArrayList();
            String[] strArrM4752 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0028.m5109(m207(), 93, 13, 1718)), strM1305);
            String[] strArrM47522 = C0024.m4752(C0001.m1212(jSONObjectM3923, C0038.m6452(m207(), 106, 12, 2425)), strM1305);
            for (String str : strArrM4752) {
                C0004.m1532(arrayList, str);
            }
            int i = 0;
            while (i < strArrM47522.length) {
                String[] strArrM47523 = C0024.m4752(strArrM47522[i], strM9775);
                ArrayList arrayList3 = new ArrayList();
                int i2 = 0;
                while (i2 < strArrM47523.length) {
                    String[] strArrM47524 = C0024.m4752(strArrM47523[i2], C0021.m4340(m207(), 118, 2, 1248));
                    StringBuilder sb = new StringBuilder();
                    C0018.m3933(sb, strArrM47524[c]);
                    C0018.m3933(sb, C0050.m8131(m207(), 120, 1, 2990));
                    C0018.m3933(sb, strArrM47524[1]);
                    C0018.m3933(sb, C0038.m6452(m207(), 121, 3, 1502));
                    c = 0;
                    C0018.m3933(sb, strArrM47524[0]);
                    C0004.m1532(arrayList3, C0047.m7763(sb));
                    i2++;
                    strArrM47522 = strArrM47522;
                }
                C0004.m1532(arrayList2, C0036.m6194(strM9775, arrayList3));
                i++;
                strArrM47522 = strArrM47522;
            }
            C0005.m1628(mVar, C0001.m1212(jSONObjectM3923, strM8814));
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0036.m6189());
            C0018.m3933(sb2, C0001.m1212(jSONObjectM3923, C0008.m1970(m207(), 124, 11, 2820)));
            C0019.m4073(mVar, C0047.m7763(sb2));
            StringBuilder sb3 = new StringBuilder();
            C0018.m3933(sb3, C0055.m8703());
            C0018.m3933(sb3, C0001.m1212(jSONObjectM3923, C0017.m3646(m207(), 135, 11, 377)));
            C0027.m5000(mVar, C0047.m7763(sb3));
            C0022.m4432(mVar, C0001.m1212(jSONObjectM3923, C0001.m1189(m207(), 146, 8, 402)));
            C0058.m9152(mVar, C0001.m1212(jSONObjectM3923, C0016.m3525(m207(), 154, 12, 366)));
            C0058.m9159(mVar, C0001.m1212(jSONObjectM3923, C0054.m8574(m207(), 166, 9, 498)));
            C0026.m4947(mVar, C0001.m1212(jSONObjectM3923, C0004.m1549(m207(), 175, 7, 1567)));
            C0017.m3671(mVar, C0001.m1212(jSONObjectM3923, C0010.m2300(m207(), 182, 8, 1970)));
            C0054.m8596(mVar, C0036.m6194(strM2037, arrayList));
            C0044.m7449(mVar, C0036.m6194(strM2037, arrayList2));
            return C0053.m8428(mVar);
        } catch (Exception unused2) {
            return C0007.m1840();
        }
    }

    public String homeContent(boolean z) {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0041.m6741(), C0051.m8259(m207(), 190, 11, 1595), new Class[]{C0011.m2810()}), C0029.m5291(this), new Object[]{C0028.m5186(z)}));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String homeVideoContent() {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0041.m6741(), C0041.m6779(m207(), 201, 16, 2736), null), C0029.m5291(this), null));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public void init(Context context) {
        Class clsM3417 = C0015.m3417(C0045.m7605(C0047.m7777(this)), C0057.m8978(m207(), 217, 29, 2272));
        d = clsM3417;
        this.a = C0016.m3522(C0005.m1638(clsM3417, null), null);
        C0052.m8352(C0065.m9803(C0041.m6741(), C0025.m4795(m207(), 246, 4, 2993), new Class[]{Context.class}), C0029.m5291(this), new Object[]{context});
    }

    public void init(Context context, String str) {
        this.b = context;
        this.c = str;
        Class clsM3417 = C0015.m3417(C0045.m7605(C0047.m7777(this)), C0001.m1189(m207(), 250, 29, 487));
        d = clsM3417;
        this.a = C0016.m3522(C0005.m1638(clsM3417, null), null);
        C0052.m8352(C0065.m9803(C0041.m6741(), C0015.m3484(m207(), 279, 4, 3074), new Class[]{Context.class, String.class}), C0029.m5291(this), new Object[]{context, str});
    }

    public String playerContent(String str, String str2, List<String> list) {
        try {
            C0036.m6219();
            String[] strArrM4752 = C0024.m4752(str2, C0064.m9599(m207(), 283, 3, 2221));
            String str3 = null;
            String str4 = (strArrM4752.length <= 0 || C0057.m8953(strArrM4752[0])) ? null : strArrM4752[0];
            if (strArrM4752.length > 1 && !C0057.m8953(strArrM4752[1])) {
                str3 = strArrM4752[1];
            }
            String strM2827 = C0011.m2827(str4, C0002.m1316(C0035.m6110()), str3);
            Object objM8352 = C0052.m8352(C0065.m9803(C0041.m6741(), C0024.m4740(m207(), 286, 13, 1135), new Class[]{String.class, String.class, List.class}), C0029.m5291(this), new Object[]{str, str4, list});
            Gson gson = new Gson();
            JsonObject jsonObject = (JsonObject) m208(gson, C0037.m6312(objM8352), JsonObject.class);
            m210(jsonObject, C0028.m5109(m207(), 299, 7, 1988), strM2827);
            return m209(gson, jsonObject);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String searchContent(String str, boolean z) {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0041.m6741(), C0000.m1077(m207(), 306, 13, 1983), new Class[]{String.class, C0011.m2810()}), C0029.m5291(this), new Object[]{str, C0028.m5186(z)}));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    public String searchContent(String str, boolean z, String str2) {
        try {
            return C0037.m6312(C0052.m8352(C0065.m9803(C0041.m6741(), C0058.m9106(m207(), 319, 13, 1761), new Class[]{String.class, C0011.m2810(), String.class}), C0029.m5291(this), new Object[]{str, C0028.m5186(z), str2}));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }
}