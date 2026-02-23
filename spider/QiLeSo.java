package com.github.catvod.spider;

import com.github.catvod.crawler.SpiderDebug;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.P0.C0024;
import com.github.catvod.spider.merge.T0.C0030;
import com.github.catvod.spider.merge.T0.h;
import com.github.catvod.spider.merge.T0.m;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0038;
import com.github.catvod.spider.merge.Z0.C0041;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d0.C0048;
import com.github.catvod.spider.merge.d1.C0049;
import com.github.catvod.spider.merge.f.C0051;
import com.github.catvod.spider.merge.f0.C0052;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.p.C0057;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.merge.r0.C0060;
import com.github.catvod.spider.merge.y0.C0064;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.c0.C0010;
import com.github.catvod.spider.p000mergexbpq.i.C0012;
import com.github.catvod.spider.p000mergexbpq.r.C0014;
import com.github.catvod.spider.p000mergexbpq.x.C0015;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.HashMap;
import java.util.Iterator;
import java.util.List;

/* loaded from: classes.dex */
public class QiLeSo extends Cloud {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f101short = {2635, 2643, 2646, 2655, 2633, 2645, 2586, 2654, 2655, 2638, 2651, 2643, 2646, 2586, 2651, 2632, 2653, 2633, 2560, 1154, 1188, 1202, 1189, 1274, 1174, 1200, 1202, 1209, 1187, 2602, 2568, 2589, 2574, 2571, 2571, 2566, 2632, 2642, 2633, 2647, 2631, 2639, 2608, 2574, 2569, 2563, 2568, 2576, 2580, 2631, 2601, 2611, 2631, 2646, 2647, 2633, 2647, 2652, 2631, 2608, 2574, 2569, 2641, 2643, 2652, 2631, 2591, 2641, 2643, 2638, 2631, 2598, 2583, 2583, 2571, 2562, 2608, 2562, 2565, 2604, 2574, 2579, 2632, 2642, 2644, 2640, 2633, 2644, 2641, 2631, 2639, 2604, 2607, 2611, 2602, 2603, 2635, 2631, 2571, 2574, 2572, 2562, 2631, 2592, 2562, 2564, 2572, 2568, 2638, 2631, 2596, 2575, 2581, 2568, 2570, 2562, 2632, 2646, 2645, 2645, 2633, 2647, 2633, 2647, 2633, 2647, 2631, 2612, 2566, 2561, 2566, 2581, 2574, 2632, 2642, 2644, 2640, 2633, 2644, 2641, 1606, 1543, 1546, 1537, 1564, 1605, 1627, 1605, 1537, 1548, 1555, 1605, 1627, 1605, 1537, 1548, 1555, 1611, 1553, 1549, 1559, 1536, 1540, 1537, 1608, 1543, 1546, 1537, 1564, 1605, 1627, 1605, 1537, 1548, 1555, 1611, 1553, 1549, 1559, 1536, 1540, 1537, 1608, 1542, 1546, 1547, 1553, 1536, 1547, 1553, 1611, 1544, 1536, 1558, 1558, 1540, 1538, 1536, 1611, 1543, 1559, 1536, 1540, 1550, 1608, 1540, 1545, 1545, 1605, 1627, 1605, 1557, 1605, 1627, 1605, 1540, 2417, 2409, 2412, 2405, 2419, 2415, 2336, 2404, 2405, 2420, 2401, 2409, 2412, 2336, 2419, 2408, 2401, 2418, 2405, 2421, 2418, 2412, 2362, 2378, 2384, 2375, 2372, 1431, 1423, 1418, 1411, 1429, 1417, 1478, 1410, 1411, 1426, 1415, 1423, 1418, 1500, 1059, 1087, 1087, 1083, 1080, 1137, 1124, 1124, 1084, 1084, 1084, 1125, 1082, 1058, 1063, 1070, 1080, 1060, 1125, 1064, 1060, 1062, 1124, 1140, 1080, 1142, 463, 489, 511, 488, 439, 475, 509, 511, 500, 494, 276, 310, 291, 304, 309, 309, 312, 374, 364, 375, 361, 377, 369, 270, 304, 311, 317, 310, 302, 298, 377, 279, 269, 377, 360, 361, 375, 361, 354, 377, 270, 304, 311, 367, 365, 354, 377, 289, 367, 365, 368, 377, 280, 297, 297, 309, 316, 270, 316, 315, 274, 304, 301, 374, 364, 362, 366, 375, 362, 367, 377, 369, 274, 273, 269, 276, 277, 373, 377, 309, 304, 306, 316, 377, 286, 316, 314, 306, 310, 368, 377, 282, 305, 299, 310, 308, 316, 374, 360, 363, 363, 375, 361, 375, 361, 375, 361, 377, 266, 312, 319, 312, 299, 304, 374, 364, 362, 366, 375, 362, 367, 2721, 2804, 2797, 2735, 2797, 2792, 2802, 2805, 2732, 2790, 2803, 2798, 2804, 2801, 2721, 2751, 2721, 2797, 2792, 2735, 2797, 2792, 2802, 2805, 2732, 2790, 2803, 2798, 2804, 2801, 2732, 2792, 2805, 2788, 2796, 2721, 2751, 2721, 2789, 2792, 2807, 2735, 2802, 2804, 2787, 2795, 2788, 2786, 2805, 2721, 2751, 2721, 2793, 2739, 2721, 2751, 2721, 2784, 2950, 2972, 2955, 2952, 2230, 2222, 2219, 2210, 2228, 2216, 2279, 2228, 2210, 2214, 2229, 2212, 2223, 2180, 2216, 2217, 2227, 2210, 2217, 2227, 2301};

    /* renamed from: ۟ۡۧۡۧ, reason: not valid java name and contains not printable characters */
    public static short[] m538() {
        if (C0024.m4693() <= 0) {
            return f101short;
        }
        return null;
    }

    /* renamed from: ۢۡ۠ۢ, reason: not valid java name and contains not printable characters */
    public static void m539(Object obj) {
        if (C0049.m8038() <= 0) {
            SpiderDebug.log((String) obj);
        }
    }

    @Override // com.github.catvod.spider.Cloud
    public String detailContent(List<String> list) {
        StringBuilder sb = new StringBuilder(C0052.m8337(m538(), 0, 19, 2618));
        C0018.m3933(sb, C0041.m6815(list));
        m539(C0047.m7763(sb));
        String str = (String) C0048.m7915(list, 0);
        HashMap map = new HashMap();
        C0053.m8424(map, C0057.m8978(m538(), 19, 10, 1239), C0015.m3484(m538(), 29, 111, 2663));
        m mVarM6243 = C0036.m6243(C0016.m3577(C0032.m5769(str, map)), C0043.m7290(m538(), 140, 76, 1637));
        StringBuilder sb2 = new StringBuilder(C0060.m9352(m538(), 216, 23, 2304));
        String strM7509 = C0044.m7509(m538(), 239, 4, 2338);
        C0018.m3933(sb2, C0010.m2339(mVarM6243, strM7509));
        m539(C0047.m7763(sb2));
        Object[] objArr = {C0010.m2339(mVarM6243, strM7509)};
        ArrayList arrayList = new ArrayList(1);
        Object obj = objArr[0];
        String strDetailContent = super.detailContent(C0059.m9195(obj, arrayList, obj, arrayList));
        StringBuilder sb3 = new StringBuilder(C0024.m4740(m538(), 243, 14, 1510));
        C0018.m3933(sb3, strDetailContent);
        m539(C0047.m7763(sb3));
        return strDetailContent;
    }

    public String searchContent(String str, boolean z) {
        StringBuilder sb = new StringBuilder(C0014.m3332(m538(), 257, 26, 1099));
        C0018.m3933(sb, C0051.m8202(str, C0038.m6425(C0002.m1270())));
        String strM7763 = C0047.m7763(sb);
        HashMap map = new HashMap();
        C0053.m8424(map, C0058.m9106(m538(), 283, 10, 410), C0030.m5362(m538(), 293, 111, 345));
        h hVarM3577 = C0016.m3577(C0032.m5769(strM7763, map));
        ArrayList arrayList = new ArrayList();
        Iterator itM7807 = C0047.m7807(C0030.m5333(hVarM3577, C0016.m3525(m538(), 404, 58, 2689)));
        while (C0012.m2962(itM7807)) {
            m mVar = (m) C0048.m7949(itM7807);
            C0032.m5685(C0010.m2339(mVar, C0017.m3646(m538(), 462, 4, 3054)), C0064.m9669(mVar), C0007.m1840(), arrayList);
        }
        StringBuilder sb2 = new StringBuilder(C0004.m1549(m538(), 466, 21, 2247));
        C0018.m3933(sb2, C0047.m7783(arrayList));
        m539(C0047.m7763(sb2));
        return C0047.m7783(arrayList);
    }
}