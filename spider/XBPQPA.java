package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.N.C0023;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.S0.C0029;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.W.C0034;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0037;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.a0.C0042;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.o0.C0056;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.t.C0061;
import com.github.catvod.spider.merge.v.C0062;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.S.C0005;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c.d;
import com.github.catvod.spider.p000mergexbpq.c.e;
import com.github.catvod.spider.p000mergexbpq.c.g;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.h.b;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.j.C0013;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.io.File;
import java.util.ArrayList;
import java.util.Iterator;
import java.util.List;
import okhttp3.Response;

/* loaded from: classes.dex */
public class XBPQPA extends XBPQAli {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f121short = {1933, 1922, 1927, 1934, 2001, 1988, 1988, 1175, 1163, 1163, 1167, 1221, 1232, 1232, 1700, 1721, 1789, 2074, 2076, 2049, 1017, 1016, 1022, 3266, 3280, 3280, 1469, 2970, 2944, 2962, 2963, 3060, 3048, 3048, 3052, 3055, 2982, 2995, 2995, 3052, 3061, 3071, 2994, 3054, 3057, 3070, 2994, 3070, 3064, 3055, 3048, 3069, 3048, 3061, 3071, 2994, 3071, 3059, 3057, 2995, 3070, 3062, 3060, 2995, 2989, 3064, 2988, 3070, 2988, 2990, 3064, 2988, 3066, 2985, 2987, 3066, 2988, 3069, 2984, 2990, 2990, 2988, 2989, 3066, 2981, 2990, 3071, 3069, 3070, 3069, 2985, 2989, 2988, 2987, 3065, 3064, 2994, 3062, 3052, 3065, 3067, 22247, 24704, -28941, 24704, 29703, -27123, 30193, -29477, 1859, 1871, 1865, 1856, 1867, 1882, 548, 548, 548, 24816, 24931, 1145, 2044, 2032, 2038, 2047, 2036, 2021, 897, 916, 1752, 1759, 1744, 1759, 1776, 1758, 1705, 1707, 1774, 1762, 1764, 1773, 1766, 1783, 1721, 1759, 1724, 1787, 1783, 1726, 1782, 1777, 1773, 1721, 1761, 1783, 1770, 1771, 1721, 1752, 1715, 1710, 1722, 1762, 1710, 1765, 1730, 1710, 1733, 1758, 1784, 1719, 1715, 1790, 1706, 1752, 1759, 1744, 1759, 1776, 1758, 1705, 1698, 1726, 1726, 1722, 1721, 1776, 1765, 1765, 1725, 1725, 1725, 1764, 1707, 1702, 1699, 1715, 1727, 1700, 1710, 1720, 1699, 1724, 1711, 1764, 1705, 1701, 1703, 1765, 1721, 1765, 3325, 3297, 3297, 3301, 3302, 3247, 3258, 3258, 3298, 3298, 3298, 3259, 3316, 3321, 3324, 3301, 3316, 3323, 3259, 3318, 3322, 3320, 3258, 3302, 3258, 1078, 1078, 1078, 1135, 1056, 1069, 1064, 1073, 1056, 1071, 1135, 1058, 1070, 1068, 2953, 2953, 2953, 3024, 2975, 2962, 2967, 2951, 2955, 2960, 2970, 2956, 2967, 2952, 2971, 3024, 2973, 2961, 2963, 415, 408, 407, 408, 439, 409, 494, 492, 428, 432, 432, 436, 439, 510, 491, 491, 435, 435, 435, 408, 490, 421, 424, 429, 445, 433, 426, 416, 438, 429, 434, 417, 408, 490, 423, 427, 425, 491, 439, 491, 408, 407, 447, 501, 501, 441, 493, 415, 408, 407, 408, 439, 409, 494, 2657, 2668, 2665, 2681, 2677, 2670, 2660, 2674, 2665, 2678, 2661, 2717, 2699, 2705, 2704, 2705, 2694, 2689, 2762, 2695, 2699, 2697, 30035, -29575, 24339, 26996, -31915, 27942};

    private List<e> a(String str) {
        ArrayList arrayList = new ArrayList();
        String strM1398 = C0003.m1398(m738(), 0, 7, 2027);
        if (C0043.m7277(str, strM1398)) {
            File file = new File(C0015.m3446(str, strM1398, C0007.m1840()));
            if (C0029.m5255(file) != null) {
                File[] fileArrM1265 = C0002.m1265(C0029.m5255(file));
                C0047.m7777(fileArrM1265);
                for (File file2 : fileArrM1265) {
                    String strM1576 = C0004.m1576(C0038.m6412(file2));
                    if (C0044.m7429(strM1576)) {
                        e eVar = new e();
                        C0043.m7311(eVar, C0027.m5016(C0038.m6412(file2)));
                        e eVarM2800 = C0011.m2800(eVar, strM1576);
                        StringBuilder sbM7166 = C0042.m7166(strM1398);
                        C0018.m3933(sbM7166, C0022.m4399(file2));
                        C0062.m9445(eVarM2800, C0047.m7763(sbM7166));
                        C0004.m1532(arrayList, eVarM2800);
                    }
                }
            }
        }
        if (C0043.m7277(str, C0040.m6584(m738(), 7, 7, 1279))) {
            try {
                List listM1203 = C0001.m1203(new String[]{C0023.m4536(m738(), 14, 3, 1737), C0036.m6188(m738(), 17, 3, 2167)});
                List listM12032 = C0001.m1203(new String[]{C0058.m9106(m738(), 20, 3, 906), C0051.m8259(m738(), 23, 3, 3235)});
                if (C0021.m4355(listM1203, C0004.m1576(str))) {
                    Iterator itM3109 = C0013.m3109(listM12032);
                    while (C0012.m2962(itM3109)) {
                        String str2 = (String) C0048.m7949(itM3109);
                        String strM8125 = C0050.m8125(C0050.m8125(C0027.m5016(str), C0020.m4199(m738(), 26, 1, 1427)), str2);
                        if (m740(m735(strM8125)) == 200) {
                            String strM2746 = C0011.m2746(C0022.m4422(strM8125));
                            e eVar2 = new e();
                            C0043.m7311(eVar2, strM2746);
                            e eVarM28002 = C0011.m2800(eVar2, str2);
                            C0062.m9445(eVarM28002, strM8125);
                            C0004.m1532(arrayList, eVarM28002);
                        }
                    }
                }
            } catch (Exception e) {
                C0049.m7975(e);
            }
        }
        return arrayList;
    }

    private g b(String str) {
        List listM1203;
        g gVar = new g();
        C0053.m8442(gVar, str);
        C0016.m3521(gVar, str);
        C0001.m1206(gVar, C0004.m1549(m738(), 27, 4, 3010));
        C0014.m3326(gVar, C0051.m8259(m738(), 31, 70, 2972));
        boolean zM4429 = C0022.m4429(str);
        String strM7509 = C0044.m7509(m738(), 101, 2, 802);
        String strM4199 = C0020.m4199(m738(), 103, 2, 1808);
        if (zM4429) {
            listM1203 = C0001.m1203(new String[]{strM4199, strM7509, C0007.m1842(m738(), 105, 2, 755)});
        } else {
            boolean zM1526 = C0004.m1526(str);
            String strM3106 = C0013.m3106(m738(), 107, 2, 773);
            listM1203 = (zM1526 || C0043.m7277(str, C0033.m5852(m738(), 109, 6, 1838))) ? C0001.m1203(new String[]{strM3106, strM7509, strM4199}) : C0001.m1203(new String[]{strM7509, strM4199, strM3106});
        }
        String strM8477 = C0053.m8477(m738(), 115, 3, 512);
        C0053.m8473(gVar, C0036.m6194(strM8477, listM1203));
        String strM8814 = C0055.m8814(m738(), 118, 3, 1117);
        C0005.m1672(gVar, C0036.m6194(strM8477, C0001.m1203(new String[]{C0001.m1153(strM8814, str), C0001.m1153(strM8814, str), C0001.m1153(strM8814, str)})));
        return gVar;
    }

    /* renamed from: ۟ۢۤۧۢ, reason: not valid java name and contains not printable characters */
    public static Response m735(Object obj) {
        if (C0042.m7147() < 0) {
            return b.a((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۢۧ۟۠, reason: not valid java name and contains not printable characters */
    public static String m736(Object obj) {
        if (C0037.m6350() <= 0) {
            return Youtube.fetch((String) obj);
        }
        return null;
    }

    /* renamed from: ۟ۦ۟ۦۨ, reason: not valid java name and contains not printable characters */
    public static g m737(Object obj, Object obj2) {
        if (C0057.m9017() >= 0) {
            return ((XBPQPA) obj).b((String) obj2);
        }
        return null;
    }

    /* renamed from: ۟ۧۢۦۢ, reason: not valid java name and contains not printable characters */
    public static short[] m738() {
        if (C0027.m5017() >= 0) {
            return f121short;
        }
        return null;
    }

    /* renamed from: ۡۥ۟ۡ, reason: not valid java name and contains not printable characters */
    public static List m739(Object obj, Object obj2) {
        if (C0028.m5152() < 0) {
            return ((XBPQPA) obj).a((String) obj2);
        }
        return null;
    }

    /* renamed from: ۦ۟۠ۤ, reason: contains not printable characters */
    public static int m740(Object obj) {
        if (C0030.m5375() > 0) {
            return ((Response) obj).code();
        }
        return 0;
    }

    @Override // com.github.catvod.spider.XBPQAli
    public String detailContent(List<String> list) {
        try {
            String strM9640 = C0064.m9640((String) C0048.m7915(list, 0));
            boolean zM9127 = C0058.m9127(strM9640, C0011.m2805(m738(), 121, 6, 1937));
            String strM1077 = C0000.m1077(m738(), 127, 2, 933);
            if (zM9127) {
                strM9640 = C0025.m4800(strM9640, C0015.m3484(m738(), 129, 52, 1667), strM1077);
            }
            if (C0058.m9127(strM9640, C0057.m8978(m738(), 181, 30, 1738)) || C0058.m9127(strM9640, C0047.m7833(m738(), 211, 25, 3221))) {
                strM9640 = C0025.m4800(C0015.m3446(strM9640, C0061.m9361(m738(), 236, 14, 1089), C0056.m8911(m738(), 250, 19, 3070)), C0003.m1398(m738(), 269, 54, 452), strM1077);
            }
            return C0058.m9127(strM9640, C0056.m8911(m738(), 323, 11, 2560)) ? super.detailContent(list) : C0030.m5373(m737(this, strM9640));
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }

    @Override // com.github.catvod.spider.XBPQAli
    public void init(Context context, String str) {
        super.init(context, str);
    }

    @Override // com.github.catvod.spider.XBPQAli
    public String playerContent(String str, String str2, List<String> list) {
        try {
            if (C0058.m9127(str2, C0000.m1077(m738(), 334, 11, 2788))) {
                d dVar = new d();
                C0034.m5966(dVar, m736(str2));
                return C0016.m3607(dVar);
            }
            if (C0007.m1815(str, C0012.m2973(m738(), 345, 2, 935))) {
                d dVar2 = new d();
                C0034.m5966(dVar2, str2);
                C0005.m1656(dVar2, m739(this, str2));
                return C0016.m3607(dVar2);
            }
            if (C0007.m1815(str, C0001.m1189(m738(), 347, 2, 2774))) {
                d dVar3 = new d();
                C0025.m4859(dVar3);
                C0034.m5966(dVar3, str2);
                return C0016.m3607(dVar3);
            }
            if (!C0007.m1815(str, C0064.m9599(m738(), 349, 2, 2742))) {
                return super.playerContent(str, str2, list);
            }
            d dVar4 = new d();
            C0025.m4859(dVar4);
            C0031.m5611(dVar4);
            C0034.m5966(dVar4, str2);
            return C0016.m3607(dVar4);
        } catch (Exception unused) {
            return C0007.m1840();
        }
    }
}