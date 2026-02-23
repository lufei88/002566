package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.crawler.Spider;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.b;
import com.github.catvod.spider.merge.E.c;
import com.github.catvod.spider.merge.E.d;
import com.github.catvod.spider.merge.E.g;
import com.github.catvod.spider.merge.E.h;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.f;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.Q.a;
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
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
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
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.z.C0065;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.thegrizzlylabs.sardineandroid.DavResource;
import com.thegrizzlylabs.sardineandroid.Sardine;
import java.io.InputStream;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.LinkedHashMap;
import java.util.List;
import java.util.Map;
import java.util.TreeMap;

/* loaded from: classes.dex */
public class WebDAV extends Spider {
    public static List c;

    /* renamed from: short, reason: not valid java name */
    private static final short[] f114short = {2524, 1072, 1079, 1065, 731, 588, 603, 600, 603, 588, 603, 588, 1262, 1252, 1278, 1194, 1258, 1250, 1267, 1254, 1251, 1254, 1267, 1254, 1069, 1086, 1073, 1080, 1082, 2166, 2170, 2171, 2171, 2160, 2166, 2145, 2172, 2170, 2171, 2675, 2673, 2673, 2679, 2658, 2662, 2623, 2679, 2684, 2673, 2685, 2678, 2683, 2684, 2677, 1791, 1785, 1775, 1784, 1703, 1771, 1773, 1775, 1764, 1790, 3314, 3299, 3299, 3327, 3322, 3312, 3314, 3303, 3322, 3324, 3325, 3260, 3324, 3312, 3303, 3318, 3303, 3262, 3296, 3303, 3297, 3318, 3314, 3326, 1517, 1912, 1893, 1907, 1906, 1893, 3130, 3127, 3134, 3115, 2748, 2237, 2226, 2238, 2230, 1439, 1421, 1437, 2037, 1039, 1039, 1039, 949, 949, 949, 1212, 2101, -25100, -28727, 21951, 31619, 2596, 2603, 2599, 2607, 20823, 21631, 2105, 2083, 2096, 2095, 17310, 26953, 27186, -26141, 602, 607, 586, 603, 2817, 2828, 2821, 2832, 27421, 22016, -28463, 24324, 10142, 2649, 2635, 2651, 11739, 2383, 2382, 2392, 2376, 2012, 1985, 2007, 2006, 1985, 26670, 21811, 28165, 21683, 633, 619, 619, 2972, 2972, 2958, 1352, 1353, 1359, 1178, 1158, 1158, 1154, 3135, 3135, 3135, 2373, 2334, 2325, 2375, 2317, 2335, 2328, 2334, 2331, 2316, 2396, 2319, 2312, 2326, 2375, 1719, 1719, 1719};
    public ArrayList a;
    public String b;

    public static List a(a aVar, String str, List list) {
        String strM7763 = str;
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0015.m3446(C0018.m3947(aVar), C0011.m2802(aVar), C0007.m1840()));
        if (!C0043.m7277(strM7763, C0011.m2802(aVar))) {
            StringBuilder sb2 = new StringBuilder();
            C0018.m3933(sb2, C0011.m2802(aVar));
            C0018.m3933(sb2, strM7763);
            strM7763 = C0047.m7763(sb2);
        }
        C0018.m3933(sb, strM7763);
        List listM579 = m579(m581(aVar), C0047.m7763(sb));
        C0037.m6314(listM579, 0);
        Iterator itM3109 = C0013.m3109(listM579);
        while (C0012.m2962(itM3109)) {
            DavResource davResource = (DavResource) C0048.m7949(itM3109);
            if (!m580(davResource) && !C0058.m9127(m582(davResource), C0015.m3484(m584(), 0, 1, 2546))) {
                C0005.m1641(itM3109);
            }
            if (!m580(davResource) && !C0021.m4355(list, C0004.m1522(m582(davResource)))) {
                C0005.m1641(itM3109);
            }
        }
        return listM579;
    }

    public static Object[] vod(Map<String, String> map) {
        String str = (String) C0062.m9431(map, C0004.m1549(m584(), 1, 3, 1093));
        String strM5109 = C0028.m5109(m584(), 4, 1, 756);
        String strM8636 = C0058.m9127(str, strM5109) ? C0054.m8636(str, 0, C0059.m9178(str, strM5109)) : str;
        String strM8890 = C0056.m8890(str, C0004.m1584(strM8636));
        List listM4743 = C0024.m4743();
        a aVar = (a) C0048.m7915(listM4743, C0013.m3094(listM4743, new a(strM8636)));
        Integer numM2808 = C0011.m2808(200);
        Sardine sardineM581 = m581(aVar);
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0015.m3446(C0018.m3947(aVar), C0011.m2802(aVar), C0007.m1840()));
        C0018.m3933(sb, strM8890);
        String strM7763 = C0047.m7763(sb);
        TreeMap treeMap = new TreeMap(C0023.m4562());
        List listM1203 = C0001.m1203(new String[]{C0034.m6001(m584(), 5, 7, 574), C0011.m2805(m584(), 12, 12, 1159), C0061.m9361(m584(), 24, 5, 1119), C0061.m9361(m584(), 29, 10, 2069), C0040.m6584(m584(), 39, 15, 2578), C0065.m9775(m584(), 54, 10, 1674)});
        Iterator itM5199 = C0029.m5199(C0026.m4887(map));
        while (C0012.m2962(itM5199)) {
            String str2 = (String) C0048.m7949(itM5199);
            if (C0021.m4355(listM1203, str2)) {
                C0058.m9052(treeMap, str2, (String) C0062.m9431(map, str2));
            }
        }
        return new Object[]{numM2808, C0022.m4403(m584(), 64, 24, 3219), m583(sardineM581, strM7763, treeMap)};
    }

    /* renamed from: ۟۟ۧۨۧ, reason: not valid java name and contains not printable characters */
    public static List m579(Object obj, Object obj2) {
        if (C0024.m4693() <= 0) {
            return ((Sardine) obj).list((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۦۦۢۢ, reason: not valid java name and contains not printable characters */
    public static boolean m580(Object obj) {
        if (C0018.m3956() >= 0) {
            return ((DavResource) obj).isDirectory();
        }
        return false;
    }

    /* renamed from: ۟ۧ۟ۨ, reason: not valid java name and contains not printable characters */
    public static Sardine m581(Object obj) {
        if (C0030.m5375() > 0) {
            return ((a) obj).e();
        }
        return null;
    }

    /* renamed from: ۟ۧۦ۠, reason: not valid java name and contains not printable characters */
    public static String m582(Object obj) {
        if (C0029.m5282() >= 0) {
            return ((DavResource) obj).getName();
        }
        return null;
    }

    /* renamed from: ۢۦۦۣ, reason: not valid java name and contains not printable characters */
    public static InputStream m583(Object obj, Object obj2, Object obj3) {
        if (C0021.m4379() >= 0) {
            return ((Sardine) obj).get((String) obj2, (Map) obj3);
        }
        return null;
    }

    /* renamed from: ۤۥ, reason: not valid java name and contains not printable characters */
    public static short[] m584() {
        if (C0002.m1242() > 0) {
            return f114short;
        }
        return null;
    }

    /* renamed from: ۤۨۡ۠, reason: not valid java name and contains not printable characters */
    public static String m585(Object obj) {
        if (C0045.m7538() < 0) {
            return ((DavResource) obj).getPath();
        }
        return null;
    }

    /* renamed from: ۣۨۨۡ, reason: not valid java name and contains not printable characters */
    public static m m586(Object obj, Object obj2, Object obj3) {
        if (C0002.m1242() >= 0) {
            return ((a) obj).i((DavResource) obj2, (String) obj3);
        }
        return null;
    }

    public String categoryContent(String str, String str2, boolean z, HashMap<String, String> map) {
        String strM7902 = C0048.m7902(m584(), 88, 1, 1474);
        String strM8636 = C0058.m9127(str, strM7902) ? C0054.m8636(str, 0, C0059.m9178(str, strM7902)) : str;
        boolean zM9127 = C0058.m9127(str, strM7902);
        String strM1840 = C0007.m1840();
        String strM8890 = zM9127 ? C0056.m8890(str, C0059.m9178(str, strM7902)) : strM1840;
        String strM8814 = C0055.m8814(m584(), 89, 5, 1815);
        String str3 = C0058.m9098(map, strM8814) ? (String) C0065.m9715(map, strM8814) : strM1840;
        String strM7290 = C0043.m7290(m584(), 94, 4, 3150);
        if (C0058.m9098(map, strM7290)) {
            strM1840 = (String) C0065.m9715(map, strM7290);
        }
        ArrayList arrayList = new ArrayList();
        ArrayList arrayList2 = new ArrayList();
        ArrayList arrayList3 = new ArrayList();
        List listM4743 = C0024.m4743();
        a aVar = (a) C0048.m7915(listM4743, C0013.m3094(listM4743, new a(strM8636)));
        Iterator itM3109 = C0013.m3109(C0015.m3478(aVar, strM8890, C0017.m3692()));
        while (C0012.m2962(itM3109)) {
            DavResource davResource = (DavResource) C0048.m7949(itM3109);
            if (m580(davResource)) {
                C0004.m1532(arrayList, davResource);
            } else {
                C0004.m1532(arrayList2, davResource);
            }
        }
        if (!C0043.m7327(strM1840) && !C0043.m7327(str3)) {
            C0027.m5077(arrayList, new f(1, strM1840, str3));
            C0027.m5077(arrayList2, new f(1, strM1840, str3));
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            C0004.m1532(arrayList3, m586(aVar, (DavResource) C0048.m7949(itM7816), C0052.m8367()));
        }
        Iterator itM78162 = C0047.m7816(arrayList2);
        while (C0012.m2962(itM78162)) {
            C0004.m1532(arrayList3, m586(aVar, (DavResource) C0048.m7949(itM78162), C0054.m8651()));
        }
        g gVar = new g();
        C0045.m7632(gVar, arrayList3);
        C0049.m7974(gVar, 1, 1, 0, 1);
        return C0033.m5828(gVar);
    }

    public String detailContent(List<String> list) {
        String strM1840;
        String strM9106;
        String strM8978;
        String strM7763;
        String str = (String) C0048.m7915(list, 0);
        String strM9389 = C0062.m9389(m584(), 98, 1, 2707);
        String strM8636 = C0058.m9127(str, strM9389) ? C0054.m8636(str, 0, C0059.m9178(str, strM9389)) : str;
        String strM86362 = C0054.m8636(str, 0, C0002.m1279(str, strM9389));
        if (C0058.m9127(strM86362, strM9389)) {
            StringBuilder sb = new StringBuilder();
            C0018.m3933(sb, C0056.m8890(strM86362, C0059.m9178(strM86362, strM9389)));
            C0018.m3933(sb, strM9389);
            strM1840 = C0047.m7763(sb);
        } else {
            strM1840 = C0007.m1840();
        }
        String strM8890 = C0056.m8890(strM86362, C0002.m1279(strM86362, strM9389) + 1);
        List listM4743 = C0024.m4743();
        a aVar = (a) C0048.m7915(listM4743, C0013.m3094(listM4743, new a(strM8636)));
        List listM3478 = C0015.m3478(aVar, strM1840, C0052.m8379(this));
        ArrayList arrayList = new ArrayList();
        Iterator itM3109 = C0013.m3109(listM3478);
        while (C0012.m2962(itM3109)) {
            DavResource davResource = (DavResource) C0048.m7949(itM3109);
            if (C0021.m4355(C0027.m5030(), C0004.m1522(m582(davResource)))) {
                C0004.m1532(arrayList, davResource);
            }
        }
        C0027.m5077(listM3478, new f(1, C0028.m5109(m584(), 99, 4, 2259), C0017.m3646(m584(), 103, 3, 1534)));
        ArrayList arrayList2 = new ArrayList();
        Iterator itM31092 = C0013.m3109(listM3478);
        while (C0012.m2962(itM31092)) {
            DavResource davResource2 = (DavResource) C0048.m7949(itM31092);
            if (C0021.m4355(C0017.m3692(), C0023.m4587(C0004.m1522(m582(davResource2))))) {
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, m582(davResource2));
                C0018.m3933(sb2, C0024.m4740(m584(), 106, 1, 2001));
                C0018.m3933(sb2, C0050.m8079(aVar));
                C0018.m3933(sb2, m585(davResource2));
                StringBuilder sb3 = new StringBuilder();
                Iterator itM7816 = C0047.m7816(arrayList);
                while (true) {
                    boolean zM2962 = C0012.m2962(itM7816);
                    strM9106 = C0058.m9106(m584(), 107, 3, 1137);
                    strM8978 = C0057.m8978(m584(), 110, 3, 1013);
                    if (!zM2962) {
                        break;
                    }
                    DavResource davResource3 = (DavResource) C0048.m7949(itM7816);
                    if (C0007.m1815(C0009.m2056(m582(davResource3)), C0009.m2056(m582(davResource2)))) {
                        C0018.m3933(sb3, strM9106);
                        C0018.m3933(sb3, m582(davResource3));
                        C0018.m3933(sb3, strM8978);
                        C0018.m3933(sb3, C0004.m1522(m582(davResource3)));
                        C0018.m3933(sb3, strM8978);
                        StringBuilder sb4 = new StringBuilder();
                        C0018.m3933(sb4, C0050.m8079(aVar));
                        C0018.m3933(sb4, m585(davResource3));
                        C0018.m3933(sb3, C0047.m7763(sb4));
                    }
                }
                if (C0006.m1693(sb3) > 0) {
                    strM7763 = C0047.m7763(sb3);
                } else {
                    StringBuilder sb5 = new StringBuilder();
                    Iterator itM78162 = C0047.m7816(arrayList);
                    while (C0012.m2962(itM78162)) {
                        DavResource davResource4 = (DavResource) C0048.m7949(itM78162);
                        C0018.m3933(sb5, strM9106);
                        C0018.m3933(sb5, m582(davResource4));
                        C0018.m3933(sb5, strM8978);
                        C0018.m3933(sb5, C0004.m1522(m582(davResource4)));
                        C0018.m3933(sb5, strM8978);
                        StringBuilder sb6 = new StringBuilder();
                        C0018.m3933(sb6, C0050.m8079(aVar));
                        C0018.m3933(sb6, m585(davResource4));
                        C0018.m3933(sb5, C0047.m7763(sb6));
                    }
                    strM7763 = C0047.m7763(sb5);
                }
                C0018.m3933(sb2, strM7763);
                C0004.m1532(arrayList2, C0047.m7763(sb2));
            }
        }
        m mVar = new m();
        C0011.m2828(mVar, strM8890);
        C0005.m1628(mVar, strM8890);
        C0054.m8596(mVar, strM8636);
        C0026.m4947(mVar, C0054.m8651());
        C0044.m7449(mVar, C0036.m6194(C0037.m6307(m584(), 113, 1, 1183), arrayList2));
        return C0053.m8428(mVar);
    }

    public String homeContent(boolean z) {
        ArrayList arrayList = new ArrayList();
        LinkedHashMap linkedHashMap = new LinkedHashMap();
        Iterator itM3109 = C0013.m3109(C0024.m4743());
        while (C0012.m2962(itM3109)) {
            a aVar = (a) C0048.m7949(itM3109);
            C0004.m1532(arrayList, new b(C0050.m8079(aVar), C0050.m8079(aVar), C0050.m8131(m584(), 114, 1, 2052)));
        }
        Iterator itM7816 = C0047.m7816(arrayList);
        while (C0012.m2962(itM7816)) {
            String strM8377 = C0052.m8377((b) C0048.m7949(itM7816));
            ArrayList arrayList2 = new ArrayList();
            String strM6779 = C0041.m6779(m584(), 115, 2, 1508);
            String strM1840 = C0007.m1840();
            C0004.m1532(arrayList2, new d(C0055.m8814(m584(), 137, 4, 2933), C0038.m6452(m584(), 141, 4, 2191), C0001.m1203(new c[]{new c(strM6779, strM1840), new c(C0009.m2037(m584(), 117, 2, 434), C0000.m1077(m584(), 119, 4, 2634)), new c(C0024.m4740(m584(), 123, 2, 2160), C0023.m4536(m584(), 125, 4, 2122)), new c(C0023.m4536(m584(), 129, 4, 3184), C0055.m8814(m584(), 133, 4, 574))})));
            C0004.m1532(arrayList2, new d(C0025.m4795(m584(), 154, 5, 1971), C0013.m3106(m584(), 159, 4, 3004), C0001.m1203(new c[]{new c(strM6779, strM1840), new c(C0023.m4536(m584(), 145, 1, 3224), C0034.m6001(m584(), 146, 3, 2616)), new c(C0020.m4199(m584(), 149, 1, 1756), C0062.m9389(m584(), 150, 4, 2347))})));
            C0037.m6362(linkedHashMap, strM8377, arrayList2);
        }
        return C0015.m3468(arrayList, linkedHashMap);
    }

    public void init(Context context, String str) {
        ArrayList arrayList = new ArrayList(C0001.m1203(new String[]{C0042.m7151(m584(), 163, 3, 536), C0022.m4403(m584(), 166, 3, 3055), C0024.m4740(m584(), 169, 3, 1339)}));
        this.a = arrayList;
        C0034.m6012(arrayList, C0017.m3692());
        this.b = str;
        List listM4743 = C0024.m4743();
        if (listM4743 == null || C0035.m6132(listM4743)) {
            if (C0043.m7277(C0053.m8468(this), C0031.m5565(m584(), 172, 4, 1266))) {
                this.b = C0032.m5769(C0053.m8468(this), null);
            }
            c = C0030.m5402((a) C0033.m5856(C0053.m8468(this), a.class));
        }
    }

    public String playerContent(String str, String str2, List<String> list) {
        String[] strArrM4752 = C0024.m4752(str2, C0012.m2973(m584(), 176, 3, 3137));
        g gVar = new g();
        String str3 = strArrM4752[0];
        StringBuilder sb = new StringBuilder();
        C0018.m3933(sb, C0051.m8217());
        String strM3484 = C0015.m3484(m584(), 179, 15, 2426);
        C0018.m3933(sb, strM3484);
        C0018.m3933(sb, str3);
        C0017.m3667(gVar, C0047.m7763(sb));
        ArrayList arrayList = new ArrayList();
        for (String str4 : strArrM4752) {
            String strM7290 = C0043.m7290(m584(), 194, 3, 1783);
            if (C0058.m9127(str4, strM7290)) {
                String[] strArrM47522 = C0024.m4752(str4, strM7290);
                String str5 = strArrM47522[0];
                String str6 = strArrM47522[1];
                String str7 = strArrM47522[2];
                StringBuilder sb2 = new StringBuilder();
                C0018.m3933(sb2, C0051.m8217());
                C0018.m3933(sb2, strM3484);
                C0018.m3933(sb2, str7);
                String strM7763 = C0047.m7763(sb2);
                h hVar = new h();
                C0020.m4249(hVar, str5);
                C0036.m6229(hVar, str6);
                C0012.m3013(hVar, strM7763);
                C0004.m1532(arrayList, hVar);
            }
        }
        C0025.m4788(gVar, arrayList);
        return C0033.m5828(gVar);
    }
}