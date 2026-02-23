package com.github.catvod.spider;

import android.content.Context;
import com.github.catvod.spider.merge.C.C0017;
import com.github.catvod.spider.merge.E.m;
import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.G.C0019;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0026;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.S0.C0028;
import com.github.catvod.spider.merge.V.C0031;
import com.github.catvod.spider.merge.V.C0032;
import com.github.catvod.spider.merge.V.C0033;
import com.github.catvod.spider.merge.Z.C0039;
import com.github.catvod.spider.merge.a1.C0043;
import com.github.catvod.spider.merge.b.C0044;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.f1.C0053;
import com.github.catvod.spider.merge.h.C0054;
import com.github.catvod.spider.merge.x0.C0063;
import com.github.catvod.spider.p000mergexbpq.Q.C0000;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.Q.C0002;
import com.github.catvod.spider.p000mergexbpq.R.C0003;
import com.github.catvod.spider.p000mergexbpq.S.C0004;
import com.github.catvod.spider.p000mergexbpq.a0.C0006;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;
import com.github.catvod.spider.p000mergexbpq.b0.C0008;
import com.github.catvod.spider.p000mergexbpq.c.C0009;
import com.github.catvod.spider.p000mergexbpq.e0.C0011;
import com.github.catvod.spider.p000mergexbpq.x.C0016;
import java.util.ArrayList;
import java.util.Date;
import java.util.HashMap;
import org.json.JSONArray;
import org.json.JSONObject;

/* loaded from: classes.dex */
public class XiaoZhiTiao extends Ali {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f130short = {694, 692, 675, 702, 696, 697, 1516, 1530, 1534, 1517, 1532, 1527, 2495, 2475, 2486, 2484, 1883, 1865, 1870, 2248, 2246, 2266, 2260, 2252, 2257, 2247, 313, 283, 270, 285, 280, 280, 277, 347, 321, 346, 324, 340, 348, 291, 285, 282, 272, 283, 259, 263, 340, 314, 288, 340, 325, 324, 346, 324, 335, 340, 291, 285, 282, 322, 320, 335, 340, 268, 322, 320, 349, 340, 309, 260, 260, 280, 273, 291, 273, 278, 319, 285, 256, 347, 321, 327, 323, 346, 327, 322, 340, 348, 319, 316, 288, 313, 312, 344, 340, 280, 285, 287, 273, 340, 307, 273, 279, 287, 283, 349, 340, 311, 284, 262, 283, 281, 273, 347, 325, 326, 326, 346, 324, 346, 324, 346, 324, 340, 295, 277, 274, 277, 262, 285, 347, 321, 327, 323, 346, 327, 322, 1109, 1139, 1125, 1138, 1069, 1089, 1127, 1125, 1134, 1140, 500, 506, 487, 496, 498, 501, 502, 445, 509, 502, 487, 1022, 985, 965, 962, 947, 950, 931, 950, 2894, 2888, 2910, 2910, 2904, 2894, 2894, 839, 859, 859, 863, 860, 789, 768, 768, 840, 838, 859, 844, 846, 841, 842, 769, 833, 842, 859, 768, 859, 832, 832, 835, 768, 846, 835, 838, 863, 846, 863, 842, 861, 768, 2875, 2873, 2856, 2819, 2856, 2867, 2871, 2873, 2866, 1185, 1210, 1214, 1200, 1211, 585, 580, 577, 579, 589, 593, 598, 587, 598, 590, 583, 518, 535, 512, 516, 529, 524, 520, 512, 3313, 3309, 3309, 3305, 3306, 3235, 3254, 3254, 3310, 3310, 3310, 3255, 3320, 3317, 3312, 3296, 3308, 3319, 3325, 3307, 3312, 3311, 3324, 3255, 3322, 3318, 3316, 3254, 3306, 3254};
    public String b;
    public Date c;

    /* renamed from: ۦ۟۟ۥ, reason: contains not printable characters */
    public static short[] m767() {
        if (C0033.m5872() >= 0) {
            return f130short;
        }
        return null;
    }

    @Override // com.github.catvod.spider.Ali
    public void init(Context context, String str) {
        super.init(context, str);
        this.c = new Date();
    }

    public String searchContent(String str, boolean z) {
        String strM3917 = C0018.m3917(m767(), 0, 6, 727);
        String strM4107 = C0019.m4107(m767(), 6, 6, 1439);
        String strM2805 = C0011.m2805(m767(), 12, 4, 2521);
        String strM3525 = C0016.m3525(m767(), 16, 3, 1836);
        HashMap mapM4127 = C0019.m4127(strM3917, strM4107, strM2805, strM3525);
        C0053.m8424(mapM4127, C0020.m4199(m767(), 19, 7, 2211), str);
        boolean zM7327 = C0043.m7327(C0018.m3894(this));
        String strM5062 = C0027.m5062(m767(), 26, 111, 372);
        String strM6551 = C0039.m6551(m767(), 137, 10, 1024);
        String strM7509 = C0044.m7509(m767(), 147, 11, 403);
        String strM5708 = C0032.m5708(m767(), 158, 4, 950);
        String strM65512 = C0039.m6551(m767(), 162, 4, 983);
        String strM9585 = C0063.m9585(m767(), 166, 7, 2877);
        String strM4340 = C0021.m4340(m767(), 173, 34, 815);
        if (zM7327 || C0021.m4365(new Date(), C0028.m5146(this)) > 0) {
            JSONObject jSONObject = new JSONObject(C0008.m2029(C0003.m1396(strM4340, C0019.m4127(strM3917, C0031.m5565(m767(), 207, 9, 2908), strM2805, strM3525), C0019.m4127(strM5708, strM7509, strM6551, strM5062))));
            if (C0022.m4416(jSONObject, strM9585)) {
                this.b = C0001.m1212(jSONObject, strM65512);
                this.c = new Date(C0009.m2099() + 86400000);
            }
        }
        C0053.m8424(mapM4127, C0027.m5062(m767(), 216, 5, 1237), C0018.m3894(this));
        JSONObject jSONObject2 = new JSONObject(C0008.m2029(C0003.m1396(strM4340, mapM4127, C0019.m4127(strM5708, strM7509, strM6551, strM5062))));
        boolean zM1716 = C0006.m1716(jSONObject2, strM9585);
        String strM1840 = C0007.m1840();
        if (!zM1716) {
            return strM1840;
        }
        ArrayList arrayList = new ArrayList();
        JSONArray jSONArrayM4333 = C0021.m4333(jSONObject2, strM65512);
        int iM8396 = C0053.m8396(jSONArrayM4333);
        for (int i = 0; i < iM8396; i++) {
            JSONObject jSONObjectM3923 = C0018.m3923(jSONArrayM4333, i);
            String strM1212 = C0001.m1212(jSONObjectM3923, C0017.m3646(m767(), 221, 6, 552));
            String strM12122 = C0001.m1212(jSONObjectM3923, C0002.m1305(m767(), 227, 5, 546));
            String strM12123 = C0001.m1212(jSONObjectM3923, C0000.m1077(m767(), 232, 8, 613));
            C0004.m1532(arrayList, new m(C0026.m4915(C0006.m1774(m767(), 240, 30, 3225), strM1212), strM12122, strM1840, C0043.m7327(strM12123) ? strM1840 : C0054.m8636(strM12123, 0, 10)));
        }
        return C0047.m7783(arrayList);
    }
}