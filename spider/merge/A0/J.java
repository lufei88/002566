package com.github.catvod.spider.merge.a0;

import com.github.catvod.spider.merge.F0.C0018;
import com.github.catvod.spider.merge.I0.C0020;
import com.github.catvod.spider.merge.J0.C0021;
import com.github.catvod.spider.merge.K0.C0022;
import com.github.catvod.spider.merge.Q0.C0025;
import com.github.catvod.spider.merge.S.C0027;
import com.github.catvod.spider.merge.Y.C0035;
import com.github.catvod.spider.merge.Y.C0036;
import com.github.catvod.spider.merge.Z.C0040;
import com.github.catvod.spider.merge.d.C0047;
import com.github.catvod.spider.merge.d1.C0050;
import com.github.catvod.spider.merge.i0.C0055;
import com.github.catvod.spider.merge.q.C0058;
import com.github.catvod.spider.merge.r0.C0059;
import com.github.catvod.spider.p000mergexbpq.Q.C0001;
import com.github.catvod.spider.p000mergexbpq.a0.C0007;

/* loaded from: classes.dex */
public final /* synthetic */ class J implements Runnable {

    /* renamed from: short, reason: not valid java name */
    private static final short[] f710short = {2209, 2276, 2283, 2286, 2274, 2281, 2291, 2264, 2286, 2275, 2234, 2228, 2239, 2230, 2209, 2290, 2276, 2264, 2277, 2286, 2301, 2264, 2292, 2291, 2293, 2234, 2260, 2210, 2228, 2246, 2276, 2290, 2292, 2291, 2280, 2282, 2210, 2224, 2244, 2244, 2210, 2228, 2246, 2291, 2286, 2291, 2283, 2274, 2277, 2278, 2293, 2264, 2273, 2286, 2303, 824, 803, 807, 809, 802, 426, 438, 438, 434, 433, 504, 493, 493, 433, 439, 492, 439, 417, 492, 417, 428, 493, 499, 413, 428, 498, 408, 385, 436, 509, 439, 417, 413, 434, 419, 432, 419, 431, 413, 433, 438, 432, 511, 422, 433, 422, 428, 420, 432, 434, 420, 416, 427, 436, 423, 433, 433, 417, 434, 421, 427, 431, 427, 416, 438, 416, 431, 428, 427, 424, 416, 430, 419, 439, 434, 439, 438, 429, 421, 434, 427, 428, 438, 428, 437, 425, 438, 434, 432, 417, 426, 431, 438, 484, 438, 429, 425, 423, 428, 511, 696, 696, 663, 658, 660};
    public final /* synthetic */ int a;
    public final /* synthetic */ M b;
    public final /* synthetic */ String c;

    public /* synthetic */ J(M m, String str, int i) {
        this.a = i;
        this.b = m;
        this.c = str;
    }

    /* renamed from: ۟ۡۦۥۧ, reason: not valid java name and contains not printable characters */
    public static short[] m6903() {
        if (C0050.m8121() <= 0) {
            return f710short;
        }
        return null;
    }

    @Override // java.lang.Runnable
    public final void run() {
        RunnableC0241b runnableC0241b;
        M mM8728 = C0055.m8728(this);
        String strM9218 = C0059.m9218(this);
        int i = 6;
        int iM1890 = C0007.m1890(this);
        C0047.m7777(mM8728);
        switch (iM1890) {
            case 0:
                try {
                    if (C0040.m6623(new CharSequence[]{strM9218}) && C0058.m9127(strM9218, C0021.m4340(m6903(), 155, 5, 743))) {
                        mM8728.a = strM9218;
                        C0035.m6119(mM8728);
                        return;
                    }
                    return;
                } catch (Exception unused) {
                    return;
                }
            default:
                String strM5062 = C0027.m5062(m6903(), 0, 55, 2183);
                String strM6188 = C0036.m6188(m6903(), 55, 5, 844);
                String strM1189 = C0001.m1189(m6903(), 60, 95, 450);
                try {
                    try {
                        StringBuilder sb = new StringBuilder(strM1189);
                        C0018.m3933(sb, strM9218);
                        C0018.m3933(sb, strM5062);
                        C0022.m4493(mM8728, C0047.m7763(sb));
                        runnableC0241b = new RunnableC0241b(mM8728, C0020.m4251(strM6188, strM9218), i);
                    } catch (Throwable th) {
                        C0025.m4829(new RunnableC0241b(mM8728, C0020.m4251(strM6188, strM9218), i));
                        throw th;
                    }
                } catch (Exception unused2) {
                    StringBuilder sb2 = new StringBuilder(strM1189);
                    C0018.m3933(sb2, strM9218);
                    C0018.m3933(sb2, strM5062);
                    C0022.m4493(mM8728, C0047.m7763(sb2));
                    runnableC0241b = new RunnableC0241b(mM8728, C0020.m4251(strM6188, strM9218), i);
                }
                C0025.m4829(runnableC0241b);
                return;
        }
    }
}