package com.github.catvod.spider;

import com.github.catvod.crawler.Spider;
import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.b0.C0045;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.merge.z.C0065;
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
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.google.gson.JsonArray;
import com.google.gson.JsonElement;
import com.google.gson.JsonObject;
import com.google.gson.JsonParser;
import com.google.gson.annotations.SerializedName;
import com.google.gson.reflect.TypeToken;
import java.lang.reflect.Type;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;

/* loaded from: classes.dex */
public class NG extends Spider {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f91short = {3079, 3118, 3124, 3158, 3077, 3106, 3081, 3088, 3114, 3157, 3082, 3100, 3114, 3083, 3112, 3081, 3135, 3121, 3155, 3080, 3076, 3121, 3120, 3091, 3132, 3157, 3082, 3159, 3076, 3087, 3155, 3084, 3076, 3156, 3158, 3163, 2007, 2006, 1989, 2010, 2000, 2006, 1984, 1540, 1547, 1537, 1559, 1546, 1548, 1537, 2986, 2987, 3000, 2983, 2989, 2987, 2947, 2977, 2986, 2987, 2978, 649, 667, 669, 667, 663, 641, 760, 760, 763, 652, 652, 2166, 2167, 2148, 2171, 2161, 2167, 2128, 2144, 2163, 2172, 2166, 1788, 1774, 1768, 1774, 1130, 1131, 1144, 1127, 1133, 1131, 1112, 1131, 1148, 1149, 1127, 1121, 1120, 2253, 1503, 1502, 1485, 1490, 1496, 1502, 1512, 1496, 1481, 1502, 1502, 1493, 3115, 3114, 3117, 3113, 3123, 3112, 3113, 3105, 3113, 2204, 2189, 2189, 2219, 2200, 2191, 2190, 2196, 2194, 2195, 2238, 2194, 2201, 2200, 992, 1009, 1009, 983, 996, 1011, 1010, 1000, 1006, 1007, 975, 992, 1004, 996, 1213, 1186, 1212, 1186, 1205, 2345, 2356, 2352, 2360, 2408, 2412, 2404, 2408, 806, 823, 823, 2926, 2939, 2926, 2916, 2120, 2113, 2054, 2117, 2119, 2130, 2115, 2054, 2115, 2132, 2132, 2121, 2132, 2076, 2054, 1757, 1740, 1738, 1736, 2558, 2547, 738, 684, 701, 676, 739, 701, 677, 701, 738, 701, 703, 674, 699, 676, 681, 680, 738, 699, 674, 681, 658, 673, 676, 702, 697, 2307, 2318, 3217, 3295, 3278, 3287, 3216, 3278, 3286, 3278, 3217, 3278, 3276, 3281, 3272, 3287, 3290, 3291, 3217, 3272, 3281, 3290, 3297, 3290, 3291, 3274, 3295, 3287, 3282, 931, 938, 1005, 937, 936, 953, 940, 932, 929, 1005, 936, 959, 959, 1015, 1005, 1455, 1458, 1462, 1470, 1430, 1458, 1463, 1463, 1458, 1448, 1508, 1438, 1531, 1518, 1535, 1475, 1507, 1435, 1527, 1512, 1531, 1507, 1504, 1514, 1428, 1504, 1504, 1512, 1501, 1534, 1487, 1478, 1516, 1424, 1288, 1298, 1308, 1301, 525, 512, 1388, 1314, 1331, 1322, 1389, 1331, 1323, 1331, 1388, 1331, 1329, 1324, 1333, 1322, 1319, 1318, 1388, 1323, 1324, 1326, 1318, 1308, 1325, 1314, 1333, 674, 685, 673, 681, 619, 634, 636, 638, 356, 3220, 3290, 3275, 3282, 3221, 3275, 3283, 3275, 3220, 3275, 3273, 3284, 3277, 3282, 3295, 3294, 3220, 3277, 3284, 3295, 3300, 3287, 3282, 3272, 3279, 2047, 2038, 1969, 2034, 2032, 2021, 2036, 1969, 2036, 2019, 2019, 2046, 2019, 1963, 1969, 3300, 3320, 3317, 3309, 3252, 3313, 3302, 3302, 3246, 3252, 738, 708, 722, 709, 666, 758, 720, 722, 729, 707, 1487, 1486, 1500, 1463, 1442, 3076, 3099, 3094, 3095, 3101, 3117, 3100, 3091, 3103, 3095, 1529, 1463, 1446, 1471, 1528, 1446, 1470, 1446, 1529, 1446, 1444, 1465, 1440, 1471, 1458, 1459, 1529, 1445, 1459, 1463, 1444, 1461, 1470, 1417, 1444, 1459, 1445, 1443, 1466, 1442, 2041, 2032, 1975, 2020, 2034, 2038, 2021, 2036, 2047, 1975, 2034, 2021, 2021, 2040, 2021, 1965, 1975};
    public final ArrayList a = new ArrayList();
    public final LinkedHashMap b = new LinkedHashMap();
    public final String c = C0009.m2083(C0011.m2805(m506(), 0, 36, 3174));

    public class Dt {

        /* renamed from: short, reason: not valid java name */
        private static final short[] f92short = {527, 532, 525, 525, 527, 532, 525, 525, 375, 375, 375, 1802, 1102};

        @SerializedName("total_count")
        private int a;

        @SerializedName("player_info")
        private List<DtIt> b;

        /* renamed from: ۣۣ۟ۢۦ, reason: not valid java name and contains not printable characters */
        public static short[] m512() {
            if (C0064.m9659() <= 0) {
                return f92short;
            }
            return null;
        }

        /* renamed from: ۟ۥۨۨۤ, reason: not valid java name and contains not printable characters */
        public static List m513(Object obj) {
            if (C0010.m2320() <= 0) {
                return ((Dt) obj).b;
            }
            return null;
        }

        public m toVod() {
            m mVar = new m();
            C0011.m2828(mVar, C0064.m9599(m512(), 0, 8, 609));
            C0005.m1628(mVar, null);
            C0026.m4947(mVar, null);
            C0058.m9109(mVar, null);
            C0019.m4073(mVar, null);
            C0027.m5000(mVar, null);
            StringBuilder sb = new StringBuilder();
            StringBuilder sb2 = new StringBuilder();
            Iterator itM3109 = C0013.m3109(m513(this));
            while (C0012.m2962(itM3109)) {
                DtIt dtIt = (DtIt) C0048.m7949(itM3109);
                C0018.m3933(sb, C0024.m4689(dtIt));
                String strM5362 = C0030.m5362(m512(), 8, 3, 339);
                C0018.m3933(sb, strM5362);
                Iterator itM31092 = C0013.m3109(C0030.m5368(dtIt));
                while (C0012.m2962(itM31092)) {
                    VtInfo vtInfo = (VtInfo) C0048.m7949(itM31092);
                    C0018.m3933(sb2, C0002.m1325(vtInfo));
                    C0018.m3933(sb2, C0052.m8337(m512(), 11, 1, 1838));
                    C0018.m3933(sb2, (String) C0048.m7915(C0054.m8614(vtInfo), 0));
                    C0018.m3933(sb2, C0065.m9775(m512(), 12, 1, 1133));
                }
                C0018.m3933(sb2, strM5362);
            }
            C0054.m8596(mVar, C0047.m7763(sb));
            C0044.m7449(mVar, C0047.m7763(sb2));
            return mVar;
        }
    }

    public class DtIt {
        public int a;
        public String b;
        public String c;

        @SerializedName("url_count")
        private int d;

        @SerializedName("video_info")
        private List<VtInfo> e;

        /* renamed from: ۟ۧۤۡۢ, reason: not valid java name and contains not printable characters */
        public static int m514(Object obj) {
            if (C0023.m4566() <= 0) {
                return ((DtIt) obj).d;
            }
            return 0;
        }

        /* renamed from: ۣۣ۟ۧۧ, reason: not valid java name and contains not printable characters */
        public static List m515(Object obj) {
            if (C0005.m1599() <= 0) {
                return ((DtIt) obj).e;
            }
            return null;
        }

        public String getFrom() {
            return C0063.m9498(this);
        }

        public int getId() {
            return C0031.m5598(this);
        }

        public String getShow() {
            return C0062.m9419(this);
        }

        public int getUrlCount() {
            return m514(this);
        }

        public List<VtInfo> getVideoInfo() {
            return m515(this);
        }

        public void setFrom(String str) {
            this.b = str;
        }

        public void setId(int i) {
            this.a = i;
        }

        public void setShow(String str) {
            this.c = str;
        }

        public void setUrlCount(int i) {
            this.d = i;
        }

        public void setVideoInfo(List<VtInfo> list) {
            this.e = list;
        }
    }

    public class It {
        public m toVod() {
            m mVar = new m();
            C0011.m2828(mVar, C0054.m8599(0));
            C0005.m1628(mVar, null);
            C0019.m4073(mVar, null);
            C0026.m4947(mVar, null);
            return mVar;
        }
    }

    public class PlayRst {
        public String a;
        public Map b;

        public Map<String, String> getHeader() {
            return C0020.m4240(this);
        }

        public String getUrl() {
            return C0014.m3350(this);
        }

        public void setHeader(Map<String, String> map) {
            this.b = map;
        }

        public void setUrl(String str) {
            this.a = str;
        }
    }

    public class Rst<T> {
        public int a;
        public String b;
        public String c;
        public int d;
        public int e;
        public List f;
        public Object g;

        public int getCode() {
            return C0026.m4907(this);
        }

        public T getData() {
            return (T) C0015.m3471(this);
        }

        public String getLimit() {
            return C0032.m5723(this);
        }

        public List<T> getList() {
            return C0022.m4454(this);
        }

        public String getMsg() {
            return C0028.m5169(this);
        }

        public int getPagecount() {
            return C0063.m9596(this);
        }

        public int getTotal() {
            return C0032.m5696(this);
        }

        public boolean isSuccess() {
            return C0026.m4907(this) == 1;
        }

        public void setCode(int i) {
            this.a = i;
        }

        public void setData(T t) {
            this.g = t;
        }

        public void setLimit(String str) {
            this.c = str;
        }

        public void setList(List<T> list) {
            this.f = list;
        }

        public void setMsg(String str) {
            this.b = str;
        }

        public void setPagecount(int i) {
            this.d = i;
        }

        public void setTotal(int i) {
            this.e = i;
        }
    }

    public class SearchRst {
        public List<m> toVodList() {
            new ArrayList();
            throw null;
        }
    }

    public class SearchRstItem {

        @SerializedName("video_name")
        private String a;

        @SerializedName("main_actor")
        private String b;

        /* renamed from: ۠ۡۢۢ, reason: not valid java name and contains not printable characters */
        public static String m516(Object obj) {
            if (C0020.m4210() <= 0) {
                return ((SearchRstItem) obj).a;
            }
            return null;
        }

        /* renamed from: ۨ۟ۧ۟, reason: not valid java name and contains not printable characters */
        public static String m517(Object obj) {
            if (C0059.m9257() <= 0) {
                return ((SearchRstItem) obj).b;
            }
            return null;
        }

        public m toVOd() {
            m mVar = new m();
            C0011.m2828(mVar, C0054.m8599(0));
            C0058.m9109(mVar, null);
            C0026.m4947(mVar, null);
            C0019.m4073(mVar, null);
            C0005.m1628(mVar, m516(this));
            C0058.m9152(mVar, m517(this));
            return mVar;
        }
    }

    public class VtInfo {
        public int a;
        public String b;
        public String c;
        public List d;

        public int getId() {
            return C0051.m8222(this);
        }

        public String getName() {
            return C0033.m5847(this);
        }

        public String getPic() {
            return C0012.m2999(this);
        }

        public List<String> getUrl() {
            return C0010.m2314(this);
        }

        public void setId(int i) {
            this.a = i;
        }

        public void setName(String str) {
            this.b = str;
        }

        public void setPic(String str) {
            this.c = str;
        }

        public void setUrl(List<String> list) {
            this.d = list;
        }
    }

    public static HashMap a() {
        HashMap mapM4127 = C0019.m4127(C0017.m3646(m506(), 36, 7, 1971), C0014.m3332(m506(), 43, 7, 1637), C0062.m9389(m506(), 50, 11, 3022), C0014.m3332(m506(), 61, 11, 712));
        C0053.m8424(mapM4127, C0013.m3106(m506(), 72, 11, 2066), C0041.m6779(m506(), 83, 4, 1725));
        String strM7902 = C0048.m7902(m506(), 87, 13, 1038);
        String strM3646 = C0017.m3646(m506(), 100, 1, 2292);
        C0053.m8424(mapM4127, strM7902, strM3646);
        C0053.m8424(mapM4127, C0002.m1305(m506(), 101, 12, 1467), C0018.m3917(m506(), 113, 9, 3097));
        C0053.m8424(mapM4127, C0017.m3646(m506(), 122, 14, 2301), strM3646);
        C0053.m8424(mapM4127, C0045.m7657(m506(), 136, 14, 897), C0032.m5708(m506(), 150, 5, 1164));
        C0053.m8424(mapM4127, C0005.m1645(m506(), 155, 4, 2397), C0031.m5627(C0009.m2099() / 1000));
        C0053.m8424(mapM4127, C0041.m6779(m506(), 159, 4, 2305), C0007.m1840());
        C0053.m8424(mapM4127, C0017.m3646(m506(), 163, 3, 839), C0010.m2300(m506(), 166, 4, 2839));
        return mapM4127;
    }

    /* renamed from: ۟۟ۤۢۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m501(Object obj, int i) {
        if (C0032.m5686() <= 0) {
            return ((JsonArray) obj).get(i);
        }
        return null;
    }

    /* renamed from: ۟ۢۡ۠ۤ, reason: not valid java name and contains not printable characters */
    public static JsonObject m502(Object obj) {
        if (C0056.m8886() <= 0) {
            return ((JsonElement) obj).getAsJsonObject();
        }
        return null;
    }

    /* renamed from: ۟ۢۢ۠ۡ, reason: not valid java name and contains not printable characters */
    public static JsonElement m503(Object obj, Object obj2) {
        if (C0017.m3633() < 0) {
            return ((JsonObject) obj).get((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۢۢۤۤ, reason: not valid java name and contains not printable characters */
    public static void m504(Object obj) {
        if (C0040.m6582() >= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    /* renamed from: ۟ۢۢۨۨ, reason: not valid java name and contains not printable characters */
    public static int m505(Object obj) {
        if (C0052.m8320() > 0) {
            return ((JsonElement) obj).getAsInt();
        }
        return 0;
    }

    /* renamed from: ۟ۥۨۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m506() {
        if (C0063.m9589() <= 0) {
            return f91short;
        }
        return null;
    }

    /* renamed from: ۡ۠ۧۤ, reason: not valid java name and contains not printable characters */
    public static Type m507(Object obj) {
        if (C0045.m7538() < 0) {
            return ((TypeToken) obj).getType();
        }
        return null;
    }

    /* renamed from: ۢۡۥۥ, reason: not valid java name and contains not printable characters */
    public static JsonElement m508(Object obj) {
        if (C0055.m8740() > 0) {
            return JsonParser.parseString((String) obj);
        }
        return null;
    }

    /* renamed from: ۣ۠ۦۤ, reason: not valid java name and contains not printable characters */
    public static int m509(Object obj) {
        if (C0044.m7508() < 0) {
            return ((JsonArray) obj).size();
        }
        return 0;
    }

    /* renamed from: ۧ۟ۡۧ, reason: not valid java name and contains not printable characters */
    public static String m510(Object obj) {
        if (C0001.m1164() <= 0) {
            return ((JsonElement) obj).getAsString();
        }
        return null;
    }

    /* renamed from: ۧۢ۟ۢ, reason: not valid java name and contains not printable characters */
    public static JsonArray m511(Object obj) {
        if (C0030.m5375() >= 0) {
            return ((JsonElement) obj).getAsJsonArray();
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM5565 = C0031.m5565(m506(), 170, 15, 2086);
        try {
            HashMap map2 = new HashMap(C0025.m4852());
            C0053.m8424(map2, C0002.m1305(m506(), 185, 4, 1709), str2);
            C0053.m8424(map2, C0020.m4199(m506(), 189, 2, 2455), str);
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0041.m6814(this));
            C0018.m3933(sb, C0057.m8978(m506(), 191, 25, 717));
            String strM1444 = C0003.m1444(C0047.m7763(sb), map2, C0014.m3288(this));
            Rst rst = (Rst) C0029.m5275(strM1444, m507(new TypeToken<Rst<It>>() { // from class: com.github.catvod.spider.NG.2
            }));
            ArrayList arrayList = new ArrayList();
            if (rst == null || !C0026.m4904(rst)) {
                StringBuilder sb2 = new StringBuilder(strM5565);
                C0018.m3933(sb2, strM1444);
                m504(C0047.m7763(sb2));
            } else {
                Iterator itM3109 = C0013.m3109(C0055.m8792(rst));
                while (C0012.m2962(itM3109)) {
                    C0004.m1532(arrayList, C0015.m3426((It) C0048.m7949(itM3109)));
                }
            }
            return C0020.m4216(C0011.m2808(C0038.m6456(str2)), C0011.m2808(C0038.m6456(str2) + 1), C0011.m2808(C0009.m2139(arrayList)), C0011.m2808(Integer.MAX_VALUE), arrayList);
        } catch (Exception e) {
            throw new RuntimeException(e);
        }
    }

    public String detailContent(List<String> list) {
        HashMap map = new HashMap(C0025.m4852());
        C0053.m8424(map, C0027.m5062(m506(), 216, 2, 2410), (String) C0048.m7915(list, 0));
        Rst rst = (Rst) C0029.m5275(C0003.m1444(C0028.m5188(new StringBuilder(), C0041.m6814(this), C0064.m9599(m506(), 218, 27, 3262)), map, C0014.m3288(this)), m507(new TypeToken<Rst<Dt>>() { // from class: com.github.catvod.spider.NG.3
        }));
        if (C0026.m4904(rst)) {
            return C0053.m8428(C0051.m8187((Dt) C0015.m3471(rst)));
        }
        StringBuilder sb = new StringBuilder(C0037.m6307(m506(), 245, 15, 973));
        C0018.m3933(sb, C0044.m7488(rst));
        m504(C0047.m7763(sb));
        return C0056.m8917(C0044.m7488(rst));
    }

    public Map<String, String> getHeaders() {
        HashMap map = new HashMap();
        long jM2099 = C0009.m2099();
        C0053.m8424(map, C0018.m3917(m506(), 260, 10, 1499), C0031.m5627(jM2099));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0009.m2083(C0044.m7509(m506(), 270, 24, 1453)));
        C0058.m9141(sb, jM2099);
        C0053.m8424(map, C0036.m6188(m506(), 294, 4, 1403), C0055.m8717(C0047.m7763(sb)));
        return map;
    }

    public String homeContent(boolean z) {
        ArrayList arrayListM4214 = C0020.m4214(this);
        boolean zM1817 = C0007.m1817(arrayListM4214);
        String strM6551 = C0039.m6551(m506(), 298, 2, 612);
        String strM6814 = C0041.m6814(this);
        if (zM1817) {
            JsonArray jsonArrayM511 = m511(m508(C0003.m1444(C0065.m9804(strM6814, C0001.m1189(m506(), 300, 25, 1347)), C0025.m4852(), C0014.m3288(this))));
            for (int i = 0; i < m509(jsonArrayM511); i++) {
                if (i != 0) {
                    JsonObject jsonObjectM502 = m502(m501(jsonArrayM511, i));
                    int iM505 = m505(m503(jsonObjectM502, strM6551));
                    C0004.m1532(arrayListM4214, new b(C0054.m8599(iM505), m510(m503(jsonObjectM502, C0011.m2805(m506(), 325, 4, 716))), null));
                }
            }
        }
        HashMap map = new HashMap(C0025.m4852());
        C0053.m8424(map, C0006.m1774(m506(), 329, 4, 539), C0041.m6779(m506(), 333, 1, 341));
        C0053.m8424(map, strM6551, C0052.m8377((b) C0028.m5167(arrayListM4214, 0)));
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, strM6814);
        C0018.m3933(sb, C0025.m4795(m506(), 334, 25, 3259));
        String strM1444 = C0003.m1444(C0047.m7763(sb), map, C0014.m3288(this));
        Rst rst = (Rst) C0029.m5275(strM1444, m507(new TypeToken<Rst<It>>() { // from class: com.github.catvod.spider.NG.1
        }));
        ArrayList arrayList = new ArrayList();
        if (rst == null || !C0026.m4904(rst)) {
            StringBuilder sb2 = new StringBuilder(C0030.m5362(m506(), 359, 15, 1937));
            C0018.m3933(sb2, strM1444);
            m504(C0047.m7763(sb2));
        } else {
            Iterator itM3109 = C0013.m3109(C0055.m8792(rst));
            while (C0012.m2962(itM3109)) {
                C0004.m1532(arrayList, C0015.m3426((It) C0048.m7949(itM3109)));
            }
        }
        return C0033.m5854(arrayListM4214, arrayList, C0008.m2025(this));
    }

    public String playerContent(String str, String str2, List<String> list) {
        Rst rst = (Rst) C0029.m5275(C0032.m5769(str2, null), m507(new TypeToken<Rst<PlayRst>>() { // from class: com.github.catvod.spider.NG.4
        }));
        if (!C0026.m4904(rst)) {
            StringBuilder sb = new StringBuilder(C0063.m9585(m506(), 374, 10, 3220));
            C0018.m3933(sb, C0044.m7488(rst));
            m504(C0047.m7763(sb));
            return C0056.m8917(C0044.m7488(rst));
        }
        HashMap map = new HashMap();
        Iterator itM5199 = C0029.m5199(C0026.m4887(C0010.m2308((PlayRst) C0059.m9221(rst))));
        while (C0012.m2962(itM5199)) {
            String str3 = (String) C0048.m7949(itM5199);
            if (C0007.m1815(str3, C0064.m9599(m506(), 384, 10, 695))) {
                C0053.m8424(map, str3, (String) C0062.m9431(C0010.m2308((PlayRst) C0059.m9221(rst)), str3));
            }
        }
        g gVar = new g();
        C0017.m3667(gVar, C0007.m1809(C0043.m7335((PlayRst) C0059.m9221(rst)), map));
        return C0033.m5828(gVar);
    }

    public String searchContent(String str, boolean z) {
        HashMap map = new HashMap(C0025.m4852());
        C0053.m8424(map, C0034.m6001(m506(), 399, 10, 3186), C0051.m8202(str, C0057.m8978(m506(), 394, 5, 1434)));
        Rst rst = (Rst) C0029.m5275(C0003.m1444(C0028.m5188(new StringBuilder(), C0041.m6814(this), C0034.m6001(m506(), 409, 30, 1494)), map, C0014.m3288(this)), m507(new TypeToken<Rst<List<SearchRst>>>() { // from class: com.github.catvod.spider.NG.5
        }));
        if (C0026.m4904(rst)) {
            return C0047.m7783(C0004.m1519((SearchRst) C0048.m7915((List) C0059.m9221(rst), 0)));
        }
        StringBuilder sb = new StringBuilder(C0009.m2037(m506(), 439, 17, 1943));
        C0018.m3933(sb, C0044.m7488(rst));
        m504(C0047.m7763(sb));
        return C0056.m8917(C0044.m7488(rst));
    }
}